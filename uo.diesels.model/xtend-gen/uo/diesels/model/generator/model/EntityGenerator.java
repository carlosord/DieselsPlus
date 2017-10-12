package uo.diesels.model.generator.model;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import uo.diesels.model.generator.common.util.TypeCodeTransformation;
import uo.diesels.model.generator.model.EntitySrcGenerator;
import uo.diesels.model.generator.model.util.ModelEntity;
import uo.diesels.model.generator.model.util.ModelMethod;
import uo.diesels.model.generator.model.util.ModelVariableDefinition;
import uo.diesels.model.generator.model.util.classes.RelationClass;
import uo.diesels.model.generator.model.util.classes.variables.ModelTypeCollectionVariableClass;
import uo.diesels.model.generator.model.util.classes.variables.SimpleTypeCollectionVariableClass;
import uo.diesels.model.generator.model.util.elements.AssociativeEntityClass;
import uo.diesels.model.generator.model.util.elements.SimpleEntityClass;
import uo.diesels.model.generator.model.util.elements.SimpleLinkClass;
import uo.diesels.model.generator.model.util.elements.ValueTypeClass;
import uo.diesels.model.generator.model.util.util.JPAAnnotations;
import uo.diesels.model.generator.model.util.util.ModelUtils;
import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.generator.util.PackageConstants;
import uo.diesels.model.generator.util.PathConstants;
import uo.diesels.model.generator.util.StringUtils;
import uo.diesels.model.modelDsl.AssociativeEntity;
import uo.diesels.model.modelDsl.Link;
import uo.diesels.model.modelDsl.SimpleEntity;
import uo.diesels.model.modelDsl.SimpleLink;
import uo.diesels.model.modelDsl.ValueType;

@SuppressWarnings("all")
public class EntityGenerator {
  private Resource resource;
  
  private IFileSystemAccess fsa;
  
  private String project;
  
  public EntityGenerator(final Resource resource, final IFileSystemAccess fsa, final String project) {
    this.resource = resource;
    this.fsa = fsa;
    this.project = project;
  }
  
  public void compile() {
    TreeIterator<EObject> _allContents = this.resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<SimpleEntity> _filter = Iterables.<SimpleEntity>filter(_iterable, SimpleEntity.class);
    for (final SimpleEntity ent : _filter) {
      {
        String _name = ent.getName();
        boolean _isSuperclassEntity = this.isSuperclassEntity(_name);
        SimpleEntityClass e = new SimpleEntityClass(ent, _isSuperclassEntity);
        StringBuilder sb = new StringBuilder();
        CharSequence _compileText = this.compileText(e);
        sb.append(_compileText);
        String _className = e.getClassName();
        String entityPath = String.format(PathConstants.MODEL_MODEL_PATH, this.project, _className);
        String _string = sb.toString();
        this.fsa.generateFile(entityPath, _string);
        boolean _isImplementable = e.isImplementable();
        if (_isImplementable) {
          EntitySrcGenerator src = new EntitySrcGenerator(this.resource, this.fsa, this.project, e);
          src.compile();
        }
      }
    }
  }
  
  public CharSequence compileText(final SimpleEntityClass e) {
    CharSequence _xblockexpression = null;
    {
      ArrayList<RelationClass> oneRelations = new ArrayList<RelationClass>();
      ArrayList<RelationClass> manyRelations = new ArrayList<RelationClass>();
      ArrayList<AssociativeEntityClass> associativeEntities = new ArrayList<AssociativeEntityClass>();
      TreeIterator<EObject> _allContents = this.resource.getAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
      Iterable<SimpleLink> _filter = Iterables.<SimpleLink>filter(_iterable, SimpleLink.class);
      for (final SimpleLink link : _filter) {
        {
          SimpleLinkClass l = new SimpleLinkClass(link);
          List<RelationClass> _relations = l.getRelations();
          RelationClass _containsEntity = ModelUtils.containsEntity(_relations, e);
          boolean _notEquals = (!Objects.equal(_containsEntity, null));
          if (_notEquals) {
            List<RelationClass> _relations_1 = l.getRelations();
            RelationClass r = ModelUtils.getOtherRelationFromLink(_relations_1, e);
            boolean _equals = Objects.equal(r, null);
            if (_equals) {
              List<RelationClass> _relations_2 = l.getRelations();
              for (final RelationClass rel : _relations_2) {
                String _multiplicity = rel.getMultiplicity();
                boolean _contains = _multiplicity.contains("one");
                if (_contains) {
                  oneRelations.add(rel);
                } else {
                  manyRelations.add(rel);
                }
              }
            }
            if (((!Objects.equal(r, null)) && r.isNavigable())) {
              String _multiplicity_1 = r.getMultiplicity();
              boolean _contains_1 = _multiplicity_1.contains("one");
              if (_contains_1) {
                oneRelations.add(r);
              } else {
                manyRelations.add(r);
              }
            }
          }
        }
      }
      TreeIterator<EObject> _allContents_1 = this.resource.getAllContents();
      Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_allContents_1);
      Iterable<AssociativeEntity> _filter_1 = Iterables.<AssociativeEntity>filter(_iterable_1, AssociativeEntity.class);
      for (final AssociativeEntity associativeEntity : _filter_1) {
        {
          AssociativeEntityClass l = new AssociativeEntityClass(associativeEntity);
          List<RelationClass> _relations = l.getRelations();
          RelationClass thisRel = ModelUtils.containsEntity(_relations, e);
          boolean _notEquals = (!Objects.equal(thisRel, null));
          if (_notEquals) {
            boolean _isNavigable = thisRel.isNavigable();
            if (_isNavigable) {
              associativeEntities.add(l);
            }
          }
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _createPackageDeclaration = this.createPackageDeclaration();
      _builder.append(_createPackageDeclaration, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      CharSequence _createImportsDeclarations = this.createImportsDeclarations(e);
      _builder.append(_createImportsDeclarations, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      CharSequence _createClassDeclaration = this.createClassDeclaration(e);
      _builder.append(_createClassDeclaration, "");
      _builder.append("\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _createSerialVersionDeclaration = this.createSerialVersionDeclaration();
      _builder.append(_createSerialVersionDeclaration, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      CharSequence _createAttributteDeclarations = this.createAttributteDeclarations(e);
      _builder.append(_createAttributteDeclarations, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _createMaintenanceAttributteDeclarations = this.createMaintenanceAttributteDeclarations(e);
      _builder.append(_createMaintenanceAttributteDeclarations, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      CharSequence _createEmptyConstructor = this.createEmptyConstructor(e);
      _builder.append(_createEmptyConstructor, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      {
        if (((!e.isAbstractClass()) && (!e.getIdVariables().isEmpty()))) {
          _builder.append("\t");
          CharSequence _createDefaultConstructor = this.createDefaultConstructor(e);
          _builder.append(_createDefaultConstructor, "\t");
          _builder.newLineIfNotEmpty();
        } else {
          {
            List<ModelVariableDefinition> _idVariablesWithoutLink = e.getIdVariablesWithoutLink();
            boolean _isEmpty = _idVariablesWithoutLink.isEmpty();
            boolean _not = (!_isEmpty);
            if (_not) {
              _builder.append("\t");
              CharSequence _createDefaultConstructorForAbstracClass = this.createDefaultConstructorForAbstracClass(e);
              _builder.append(_createDefaultConstructorForAbstracClass, "\t");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.append("\t");
      CharSequence _createGettersSetters = this.createGettersSetters(e);
      _builder.append(_createGettersSetters, "\t");
      _builder.newLineIfNotEmpty();
      {
        List<ModelVariableDefinition> _idVariables = e.getIdVariables();
        boolean _isEmpty_1 = _idVariables.isEmpty();
        boolean _not_1 = (!_isEmpty_1);
        if (_not_1) {
          _builder.append("\t");
          CharSequence _createHashCodeEquals = this.createHashCodeEquals(e);
          _builder.append(_createHashCodeEquals, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      CharSequence _createToString = this.createToString(e);
      _builder.append(_createToString, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _createMethods = this.createMethods(e);
      _builder.append(_createMethods, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      CharSequence _createMaintenanceOneRelations = this.createMaintenanceOneRelations(oneRelations);
      _builder.append(_createMaintenanceOneRelations, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _createMaintenanceManyRelations = this.createMaintenanceManyRelations(manyRelations);
      _builder.append(_createMaintenanceManyRelations, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _createAssociativeMaintenanceRelations = this.createAssociativeMaintenanceRelations(associativeEntities, e);
      _builder.append(_createAssociativeMaintenanceRelations, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence createPackageDeclaration() {
    StringConcatenation _builder = new StringConcatenation();
    String _remplaceSlashToDot = StringUtils.remplaceSlashToDot(this.project);
    String _format = String.format(PackageConstants.MODEL_PACKAGE, _remplaceSlashToDot);
    _builder.append(_format, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createImportsDeclarations(final SimpleEntityClass e) {
    CharSequence _xblockexpression = null;
    {
      String _remplaceSlashToDot = StringUtils.remplaceSlashToDot(this.project);
      Set<String> _imports = e.getImports(_remplaceSlashToDot);
      HashSet<String> imports = new HashSet<String>(_imports);
      ArrayList<ModelVariableDefinition> attributes = new ArrayList<ModelVariableDefinition>();
      List<ModelVariableDefinition> _primaryKey = e.getPrimaryKey();
      attributes.addAll(_primaryKey);
      List<ModelVariableDefinition> _attributes = e.getAttributes();
      attributes.addAll(_attributes);
      for (final ModelVariableDefinition v : attributes) {
        Object _variableTypeClass = v.getVariableTypeClass();
        if ((_variableTypeClass instanceof ValueType)) {
          if ((ModelUtils.containsOtherValueTypeLike(e.getAttributes(), v) || v.isNullable())) {
            JPAAnnotations _instance = JPAAnnotations.getInstance();
            Map<String, String[]> _annotations = _instance.getAnnotations();
            String[] _get = _annotations.get("attributeOverrides");
            String _get_1 = _get[1];
            imports.add(_get_1);
            JPAAnnotations _instance_1 = JPAAnnotations.getInstance();
            Map<String, String[]> _annotations_1 = _instance_1.getAnnotations();
            String[] _get_2 = _annotations_1.get("attributeOverride");
            String _get_3 = _get_2[1];
            imports.add(_get_3);
          }
        }
      }
      TreeIterator<EObject> _allContents = this.resource.getAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
      Iterable<SimpleLink> _filter = Iterables.<SimpleLink>filter(_iterable, SimpleLink.class);
      for (final SimpleLink link : _filter) {
        {
          SimpleLinkClass l = new SimpleLinkClass(link);
          if ((ModelUtils.isReflexiveRelation(l.getRelations(), e) && (!Objects.equal(ModelUtils.containsEntity(l.getRelations(), e), null)))) {
            List<RelationClass> _relations = l.getRelations();
            RelationClass r1 = _relations.get(0);
            List<RelationClass> _relations_1 = l.getRelations();
            RelationClass r2 = _relations_1.get(1);
            String _multiplicity = r1.getMultiplicity();
            boolean _contains = _multiplicity.contains("one");
            if (_contains) {
              String _multiplicity_1 = r2.getMultiplicity();
              boolean _contains_1 = _multiplicity_1.contains("one");
              if (_contains_1) {
                JPAAnnotations _instance_2 = JPAAnnotations.getInstance();
                Map<String, String[]> _annotations_2 = _instance_2.getAnnotations();
                String[] _get_4 = _annotations_2.get("onetoone");
                String _get_5 = _get_4[2];
                imports.add(_get_5);
              } else {
                JPAAnnotations _instance_3 = JPAAnnotations.getInstance();
                Map<String, String[]> _annotations_3 = _instance_3.getAnnotations();
                String[] _get_6 = _annotations_3.get("onetomany");
                String _get_7 = _get_6[1];
                imports.add(_get_7);
                imports.add(ImportConstants.SET_IMPORT);
                imports.add(ImportConstants.HASHSET_IMPORT);
              }
            } else {
              String _multiplicity_2 = r2.getMultiplicity();
              boolean _contains_2 = _multiplicity_2.contains("one");
              if (_contains_2) {
                JPAAnnotations _instance_4 = JPAAnnotations.getInstance();
                Map<String, String[]> _annotations_4 = _instance_4.getAnnotations();
                String[] _get_8 = _annotations_4.get("manytoone");
                String _get_9 = _get_8[1];
                imports.add(_get_9);
              } else {
                JPAAnnotations _instance_5 = JPAAnnotations.getInstance();
                Map<String, String[]> _annotations_5 = _instance_5.getAnnotations();
                String[] _get_10 = _annotations_5.get("manytomany");
                String _get_11 = _get_10[2];
                imports.add(_get_11);
                imports.add(ImportConstants.SET_IMPORT);
                imports.add(ImportConstants.HASHSET_IMPORT);
              }
            }
            String _multiplicity_3 = r2.getMultiplicity();
            boolean _contains_3 = _multiplicity_3.contains("one");
            if (_contains_3) {
              String _multiplicity_4 = r1.getMultiplicity();
              boolean _contains_4 = _multiplicity_4.contains("one");
              if (_contains_4) {
                JPAAnnotations _instance_6 = JPAAnnotations.getInstance();
                Map<String, String[]> _annotations_6 = _instance_6.getAnnotations();
                String[] _get_12 = _annotations_6.get("onetoone");
                String _get_13 = _get_12[2];
                imports.add(_get_13);
              } else {
                JPAAnnotations _instance_7 = JPAAnnotations.getInstance();
                Map<String, String[]> _annotations_7 = _instance_7.getAnnotations();
                String[] _get_14 = _annotations_7.get("onetomany");
                String _get_15 = _get_14[1];
                imports.add(_get_15);
                imports.add(ImportConstants.SET_IMPORT);
                imports.add(ImportConstants.HASHSET_IMPORT);
              }
            } else {
              String _multiplicity_5 = r1.getMultiplicity();
              boolean _contains_5 = _multiplicity_5.contains("one");
              if (_contains_5) {
                JPAAnnotations _instance_8 = JPAAnnotations.getInstance();
                Map<String, String[]> _annotations_8 = _instance_8.getAnnotations();
                String[] _get_16 = _annotations_8.get("manytoone");
                String _get_17 = _get_16[1];
                imports.add(_get_17);
              } else {
                JPAAnnotations _instance_9 = JPAAnnotations.getInstance();
                Map<String, String[]> _annotations_9 = _instance_9.getAnnotations();
                String[] _get_18 = _annotations_9.get("manytomany");
                String _get_19 = _get_18[2];
                imports.add(_get_19);
                imports.add(ImportConstants.SET_IMPORT);
                imports.add(ImportConstants.HASHSET_IMPORT);
              }
            }
          } else {
            List<RelationClass> _relations_2 = l.getRelations();
            RelationClass thisRel = ModelUtils.containsEntity(_relations_2, e);
            List<RelationClass> _relations_3 = l.getRelations();
            RelationClass otherRel = ModelUtils.getOtherRelationFromLink(_relations_3, e);
            if ((((!Objects.equal(thisRel, null)) && (!Objects.equal(otherRel, null))) && otherRel.isNavigable())) {
              String _multiplicity_6 = thisRel.getMultiplicity();
              boolean _contains_6 = _multiplicity_6.contains("one");
              if (_contains_6) {
                String _multiplicity_7 = otherRel.getMultiplicity();
                boolean _contains_7 = _multiplicity_7.contains("one");
                if (_contains_7) {
                  JPAAnnotations _instance_10 = JPAAnnotations.getInstance();
                  Map<String, String[]> _annotations_10 = _instance_10.getAnnotations();
                  String[] _get_20 = _annotations_10.get("onetoone");
                  String _get_21 = _get_20[2];
                  imports.add(_get_21);
                } else {
                  JPAAnnotations _instance_11 = JPAAnnotations.getInstance();
                  Map<String, String[]> _annotations_11 = _instance_11.getAnnotations();
                  String[] _get_22 = _annotations_11.get("onetomany");
                  String _get_23 = _get_22[1];
                  imports.add(_get_23);
                  imports.add(ImportConstants.SET_IMPORT);
                  imports.add(ImportConstants.HASHSET_IMPORT);
                }
              } else {
                String _multiplicity_8 = otherRel.getMultiplicity();
                boolean _contains_8 = _multiplicity_8.contains("one");
                if (_contains_8) {
                  JPAAnnotations _instance_12 = JPAAnnotations.getInstance();
                  Map<String, String[]> _annotations_12 = _instance_12.getAnnotations();
                  String[] _get_24 = _annotations_12.get("manytoone");
                  String _get_25 = _get_24[1];
                  imports.add(_get_25);
                } else {
                  JPAAnnotations _instance_13 = JPAAnnotations.getInstance();
                  Map<String, String[]> _annotations_13 = _instance_13.getAnnotations();
                  String[] _get_26 = _annotations_13.get("manytomany");
                  String _get_27 = _get_26[2];
                  imports.add(_get_27);
                  imports.add(ImportConstants.SET_IMPORT);
                  imports.add(ImportConstants.HASHSET_IMPORT);
                }
              }
            }
          }
        }
      }
      TreeIterator<EObject> _allContents_1 = this.resource.getAllContents();
      Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_allContents_1);
      Iterable<AssociativeEntity> _filter_1 = Iterables.<AssociativeEntity>filter(_iterable_1, AssociativeEntity.class);
      for (final AssociativeEntity associativeEntity : _filter_1) {
        {
          AssociativeEntityClass l = new AssociativeEntityClass(associativeEntity);
          if ((ModelUtils.isReflexiveRelation(l.getRelations(), e) && (!Objects.equal(ModelUtils.containsEntity(l.getRelations(), e), null)))) {
            List<RelationClass> _relations = l.getRelations();
            RelationClass r1 = _relations.get(0);
            List<RelationClass> _relations_1 = l.getRelations();
            RelationClass r2 = _relations_1.get(1);
            String _multiplicity = r2.getMultiplicity();
            boolean _contains = _multiplicity.contains("one");
            if (_contains) {
              JPAAnnotations _instance_2 = JPAAnnotations.getInstance();
              Map<String, String[]> _annotations_2 = _instance_2.getAnnotations();
              String[] _get_4 = _annotations_2.get("onetoone");
              String _get_5 = _get_4[2];
              imports.add(_get_5);
            } else {
              JPAAnnotations _instance_3 = JPAAnnotations.getInstance();
              Map<String, String[]> _annotations_3 = _instance_3.getAnnotations();
              String[] _get_6 = _annotations_3.get("onetomany");
              String _get_7 = _get_6[1];
              imports.add(_get_7);
              imports.add(ImportConstants.SET_IMPORT);
              imports.add(ImportConstants.HASHSET_IMPORT);
            }
            String _multiplicity_1 = r1.getMultiplicity();
            boolean _contains_1 = _multiplicity_1.contains("one");
            if (_contains_1) {
              JPAAnnotations _instance_4 = JPAAnnotations.getInstance();
              Map<String, String[]> _annotations_4 = _instance_4.getAnnotations();
              String[] _get_8 = _annotations_4.get("onetoone");
              String _get_9 = _get_8[2];
              imports.add(_get_9);
            } else {
              JPAAnnotations _instance_5 = JPAAnnotations.getInstance();
              Map<String, String[]> _annotations_5 = _instance_5.getAnnotations();
              String[] _get_10 = _annotations_5.get("onetomany");
              String _get_11 = _get_10[1];
              imports.add(_get_11);
              imports.add(ImportConstants.SET_IMPORT);
              imports.add(ImportConstants.HASHSET_IMPORT);
            }
          } else {
            List<RelationClass> _relations_2 = l.getRelations();
            RelationClass otherRel = ModelUtils.getOtherRelationFromLink(_relations_2, e);
            String _multiplicity_2 = otherRel.getMultiplicity();
            boolean _contains_2 = _multiplicity_2.contains("one");
            if (_contains_2) {
              JPAAnnotations _instance_6 = JPAAnnotations.getInstance();
              Map<String, String[]> _annotations_6 = _instance_6.getAnnotations();
              String[] _get_12 = _annotations_6.get("onetoone");
              String _get_13 = _get_12[2];
              imports.add(_get_13);
            } else {
              JPAAnnotations _instance_7 = JPAAnnotations.getInstance();
              Map<String, String[]> _annotations_7 = _instance_7.getAnnotations();
              String[] _get_14 = _annotations_7.get("onetomany");
              String _get_15 = _get_14[1];
              imports.add(_get_15);
              imports.add(ImportConstants.SET_IMPORT);
              imports.add(ImportConstants.HASHSET_IMPORT);
            }
          }
        }
      }
      List<ModelVariableDefinition> _idVariables = e.getIdVariables();
      for (final ModelVariableDefinition v_1 : _idVariables) {
        String _remplaceSlashToDot_1 = StringUtils.remplaceSlashToDot(this.project);
        Set<String> _variableImports = v_1.getVariableImports(_remplaceSlashToDot_1);
        imports.addAll(_variableImports);
      }
      List<ModelVariableDefinition> _primaryKey_1 = e.getPrimaryKey();
      for (final ModelVariableDefinition v_2 : _primaryKey_1) {
        if (((v_2.getVariableTypeClass() instanceof Link) && (!Objects.equal(e.getSuperClass(), null)))) {
          Object _variableTypeClass_1 = v_2.getVariableTypeClass();
          if ((_variableTypeClass_1 instanceof AssociativeEntity)) {
            Object _variableTypeClass_2 = v_2.getVariableTypeClass();
            AssociativeEntityClass _associativeEntityClass = new AssociativeEntityClass(((AssociativeEntity) _variableTypeClass_2));
            List<RelationClass> l = _associativeEntityClass.getRelations();
            SimpleEntityClass _superClass = e.getSuperClass();
            RelationClass _containsEntityOrSuperClass = ModelUtils.containsEntityOrSuperClass(l, _superClass);
            boolean _notEquals = (!Objects.equal(_containsEntityOrSuperClass, null));
            if (_notEquals) {
              JPAAnnotations _instance_2 = JPAAnnotations.getInstance();
              Map<String, String[]> _annotations_2 = _instance_2.getAnnotations();
              String[] _get_4 = _annotations_2.get("manytoone");
              String _get_5 = _get_4[1];
              imports.add(_get_5);
            }
          } else {
            Object _variableTypeClass_3 = v_2.getVariableTypeClass();
            SimpleLinkClass _simpleLinkClass = new SimpleLinkClass(((SimpleLink) _variableTypeClass_3));
            List<RelationClass> l_1 = _simpleLinkClass.getRelations();
            SimpleEntityClass _superClass_1 = e.getSuperClass();
            RelationClass _containsEntityOrSuperClass_1 = ModelUtils.containsEntityOrSuperClass(l_1, _superClass_1);
            boolean _notEquals_1 = (!Objects.equal(_containsEntityOrSuperClass_1, null));
            if (_notEquals_1) {
              JPAAnnotations _instance_3 = JPAAnnotations.getInstance();
              Map<String, String[]> _annotations_3 = _instance_3.getAnnotations();
              String[] _get_6 = _annotations_3.get("manytoone");
              String _get_7 = _get_6[1];
              imports.add(_get_7);
            }
          }
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      {
        for(final String i : imports) {
          _builder.append(i, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence createClassDeclaration(final SimpleEntityClass e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Generated(");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("value = \"DieselsCodeGenerator\",");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("comments = \"Generated business service class\",");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("date = \"");
    Date _date = new Date();
    String _string = _date.toString();
    _builder.append(_string, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append(")");
    _builder.newLine();
    String _annotations = e.getAnnotations();
    _builder.append(_annotations, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public");
    {
      boolean _isAbstractEntity = e.isAbstractEntity();
      if (_isAbstractEntity) {
        _builder.append(" abstract");
      }
    }
    _builder.append(" class ");
    String _className = e.getClassName();
    _builder.append(_className, "");
    _builder.append(" extends ");
    {
      SimpleEntityClass _superClass = e.getSuperClass();
      boolean _notEquals = (!Objects.equal(_superClass, null));
      if (_notEquals) {
        SimpleEntityClass _superClass_1 = e.getSuperClass();
        String _name = _superClass_1.getName();
        _builder.append(_name, "");
      } else {
        _builder.append("BaseEntity");
      }
    }
    _builder.append(" implements Serializable {");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createSerialVersionDeclaration() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private static final long serialVersionUID = 1L;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createAttributteDeclarations(final SimpleEntityClass e) {
    CharSequence _xblockexpression = null;
    {
      ArrayList<ModelVariableDefinition> allVariables = new ArrayList<ModelVariableDefinition>();
      List<ModelVariableDefinition> _attributes = e.getAttributes();
      allVariables.addAll(_attributes);
      List<ModelVariableDefinition> _primaryKey = e.getPrimaryKey();
      allVariables.addAll(_primaryKey);
      StringConcatenation _builder = new StringConcatenation();
      {
        List<ModelVariableDefinition> _primaryKey_1 = e.getPrimaryKey();
        for(final ModelVariableDefinition v : _primaryKey_1) {
          String _annotations = v.getAnnotations();
          _builder.append(_annotations, "");
          _builder.newLineIfNotEmpty();
          {
            Object _variableTypeClass = v.getVariableTypeClass();
            boolean _not = (!(_variableTypeClass instanceof Link));
            if (_not) {
              {
                Object _variableTypeClass_1 = v.getVariableTypeClass();
                if ((_variableTypeClass_1 instanceof ValueType)) {
                  {
                    boolean _containsOtherValueTypeLike = ModelUtils.containsOtherValueTypeLike(allVariables, v);
                    if (_containsOtherValueTypeLike) {
                      JPAAnnotations _instance = JPAAnnotations.getInstance();
                      Map<String, String[]> _annotations_1 = _instance.getAnnotations();
                      String[] _get = _annotations_1.get("attributeOverrides");
                      String _get_1 = _get[0];
                      _builder.append(_get_1, "");
                      _builder.append("( {");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      Object _variableTypeClass_2 = v.getVariableTypeClass();
                      ValueTypeClass _valueTypeClass = new ValueTypeClass(((ValueType) _variableTypeClass_2));
                      String _variableName = v.getVariableName();
                      String _plus = (_variableName + "_");
                      boolean _isNullable = v.isNullable();
                      String _putAttributeOverrideAnnotation = ModelUtils.putAttributeOverrideAnnotation(_valueTypeClass, "", _plus, _isNullable, false);
                      String _removeLastChar = StringUtils.removeLastChar(_putAttributeOverrideAnnotation);
                      _builder.append(_removeLastChar, "\t");
                      _builder.newLineIfNotEmpty();
                      _builder.append("} )");
                      _builder.newLine();
                    } else {
                      {
                        boolean _isNullable_1 = v.isNullable();
                        if (_isNullable_1) {
                          JPAAnnotations _instance_1 = JPAAnnotations.getInstance();
                          Map<String, String[]> _annotations_2 = _instance_1.getAnnotations();
                          String[] _get_2 = _annotations_2.get("attributeOverrides");
                          String _get_3 = _get_2[0];
                          _builder.append(_get_3, "");
                          _builder.append("( {");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t");
                          Object _variableTypeClass_3 = v.getVariableTypeClass();
                          ValueTypeClass _valueTypeClass_1 = new ValueTypeClass(((ValueType) _variableTypeClass_3));
                          String _putAttributeOverrideAnnotation_1 = ModelUtils.putAttributeOverrideAnnotation(_valueTypeClass_1, "", "", true, true);
                          String _removeLastChar_1 = StringUtils.removeLastChar(_putAttributeOverrideAnnotation_1);
                          _builder.append(_removeLastChar_1, "\t");
                          _builder.newLineIfNotEmpty();
                          _builder.append("} )");
                          _builder.newLine();
                        }
                      }
                    }
                  }
                }
              }
              _builder.append("private ");
              TypeCodeTransformation _instance_2 = TypeCodeTransformation.getInstance();
              Map<String, String> _types = _instance_2.getTypes();
              String _variableType = v.getVariableType();
              String _get_4 = _types.get(_variableType);
              _builder.append(_get_4, "");
              _builder.append(" ");
              String _variableName_1 = v.getVariableName();
              _builder.append(_variableName_1, "");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      {
        List<ModelVariableDefinition> _attributes_1 = e.getAttributes();
        for(final ModelVariableDefinition v_1 : _attributes_1) {
          String _annotations_3 = v_1.getAnnotations();
          _builder.append(_annotations_3, "");
          _builder.newLineIfNotEmpty();
          {
            Object _variableTypeClass_4 = v_1.getVariableTypeClass();
            if ((_variableTypeClass_4 instanceof ValueType)) {
              {
                boolean _containsOtherValueTypeLike_1 = ModelUtils.containsOtherValueTypeLike(allVariables, v_1);
                if (_containsOtherValueTypeLike_1) {
                  JPAAnnotations _instance_3 = JPAAnnotations.getInstance();
                  Map<String, String[]> _annotations_4 = _instance_3.getAnnotations();
                  String[] _get_5 = _annotations_4.get("attributeOverrides");
                  String _get_6 = _get_5[0];
                  _builder.append(_get_6, "");
                  _builder.append("( {");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  Object _variableTypeClass_5 = v_1.getVariableTypeClass();
                  ValueTypeClass _valueTypeClass_2 = new ValueTypeClass(((ValueType) _variableTypeClass_5));
                  String _variableName_2 = v_1.getVariableName();
                  String _plus_1 = (_variableName_2 + "_");
                  boolean _isNullable_2 = v_1.isNullable();
                  String _putAttributeOverrideAnnotation_2 = ModelUtils.putAttributeOverrideAnnotation(_valueTypeClass_2, "", _plus_1, _isNullable_2, false);
                  String _removeLastChar_2 = StringUtils.removeLastChar(_putAttributeOverrideAnnotation_2);
                  _builder.append(_removeLastChar_2, "\t");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("} )");
                  _builder.newLine();
                } else {
                  {
                    boolean _isNullable_3 = v_1.isNullable();
                    if (_isNullable_3) {
                      JPAAnnotations _instance_4 = JPAAnnotations.getInstance();
                      Map<String, String[]> _annotations_5 = _instance_4.getAnnotations();
                      String[] _get_7 = _annotations_5.get("attributeOverrides");
                      String _get_8 = _get_7[0];
                      _builder.append(_get_8, "");
                      _builder.append("( {");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      Object _variableTypeClass_6 = v_1.getVariableTypeClass();
                      ValueTypeClass _valueTypeClass_3 = new ValueTypeClass(((ValueType) _variableTypeClass_6));
                      String _putAttributeOverrideAnnotation_3 = ModelUtils.putAttributeOverrideAnnotation(_valueTypeClass_3, "", "", true, true);
                      String _removeLastChar_3 = StringUtils.removeLastChar(_putAttributeOverrideAnnotation_3);
                      _builder.append(_removeLastChar_3, "\t");
                      _builder.newLineIfNotEmpty();
                      _builder.append("} )");
                      _builder.newLine();
                    }
                  }
                }
              }
            }
          }
          _builder.append("private ");
          TypeCodeTransformation _instance_5 = TypeCodeTransformation.getInstance();
          Map<String, String> _types_1 = _instance_5.getTypes();
          String _variableType_1 = v_1.getVariableType();
          String _get_9 = _types_1.get(_variableType_1);
          _builder.append(_get_9, "");
          _builder.append(" ");
          String _variableName_3 = v_1.getVariableName();
          _builder.append(_variableName_3, "");
          String _isCollectionVariable = v_1.isCollectionVariable();
          _builder.append(_isCollectionVariable, "");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        List<ModelVariableDefinition> _primaryKey_2 = e.getPrimaryKey();
        for(final ModelVariableDefinition v_2 : _primaryKey_2) {
          {
            if (((v_2.getVariableTypeClass() instanceof Link) && (!Objects.equal(e.getSuperClass(), null)))) {
              {
                Object _variableTypeClass_7 = v_2.getVariableTypeClass();
                if ((_variableTypeClass_7 instanceof AssociativeEntity)) {
                  Object _variableTypeClass_8 = v_2.getVariableTypeClass();
                  AssociativeEntityClass _associativeEntityClass = new AssociativeEntityClass(((AssociativeEntity) _variableTypeClass_8));
                  List<RelationClass> l = _associativeEntityClass.getRelations();
                  _builder.newLineIfNotEmpty();
                  SimpleEntityClass _superClass = e.getSuperClass();
                  RelationClass rel = ModelUtils.containsEntityOrSuperClass(l, _superClass);
                  _builder.newLineIfNotEmpty();
                  {
                    boolean _notEquals = (!Objects.equal(rel, null));
                    if (_notEquals) {
                      _builder.append("// Extra column for unique constraint over an inherited attribute");
                      _builder.newLine();
                      _builder.append("@ManyToOne (optional = false) private ");
                      String _variableType_2 = v_2.getVariableType();
                      _builder.append(_variableType_2, "");
                      _builder.append(" ");
                      String _variableName_4 = v_2.getVariableName();
                      _builder.append(_variableName_4, "");
                      _builder.append("_unique_constraint;");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                } else {
                  Object _variableTypeClass_9 = v_2.getVariableTypeClass();
                  SimpleLinkClass _simpleLinkClass = new SimpleLinkClass(((SimpleLink) _variableTypeClass_9));
                  List<RelationClass> l_1 = _simpleLinkClass.getRelations();
                  _builder.newLineIfNotEmpty();
                  SimpleEntityClass _superClass_1 = e.getSuperClass();
                  RelationClass rel_1 = ModelUtils.containsEntityOrSuperClass(l_1, _superClass_1);
                  _builder.newLineIfNotEmpty();
                  {
                    boolean _notEquals_1 = (!Objects.equal(rel_1, null));
                    if (_notEquals_1) {
                      ModelEntity _type = rel_1.getType();
                      RelationClass otherRel = ModelUtils.getOtherRelationFromLink(l_1, _type);
                      _builder.newLineIfNotEmpty();
                      _builder.append("// Extra column for unique constraint over an inherited attribute");
                      _builder.newLine();
                      _builder.append("@ManyToOne (optional = false) private ");
                      ModelEntity _type_1 = otherRel.getType();
                      String _className = _type_1.getClassName();
                      _builder.append(_className, "");
                      _builder.append(" ");
                      String _variableName_5 = v_2.getVariableName();
                      _builder.append(_variableName_5, "");
                      _builder.append("_unique_constraint;");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
            }
          }
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence createMaintenanceAttributteDeclarations(final SimpleEntityClass e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      TreeIterator<EObject> _allContents = this.resource.getAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
      Iterable<SimpleLink> _filter = Iterables.<SimpleLink>filter(_iterable, SimpleLink.class);
      for(final SimpleLink link : _filter) {
        SimpleLinkClass l = new SimpleLinkClass(link);
        _builder.newLineIfNotEmpty();
        {
          if ((ModelUtils.isReflexiveRelation(l.getRelations(), e) && (!Objects.equal(ModelUtils.containsEntity(l.getRelations(), e), null)))) {
            List<RelationClass> _relations = l.getRelations();
            RelationClass r1 = _relations.get(0);
            _builder.newLineIfNotEmpty();
            List<RelationClass> _relations_1 = l.getRelations();
            RelationClass r2 = _relations_1.get(1);
            _builder.newLineIfNotEmpty();
            {
              String _multiplicity = r1.getMultiplicity();
              boolean _contains = _multiplicity.contains("one");
              if (_contains) {
                {
                  String _multiplicity_1 = r2.getMultiplicity();
                  boolean _contains_1 = _multiplicity_1.contains("one");
                  if (_contains_1) {
                    JPAAnnotations _instance = JPAAnnotations.getInstance();
                    Map<String, String[]> _annotations = _instance.getAnnotations();
                    String[] _get = _annotations.get("onetoone");
                    String _get_1 = _get[1];
                    String _name = r1.getName();
                    boolean _isOptional = r2.isOptional();
                    String _format = String.format(_get_1, _name, Boolean.valueOf(_isOptional));
                    _builder.append(_format, "");
                    _builder.newLineIfNotEmpty();
                    _builder.append("private ");
                    ModelEntity _type = r2.getType();
                    String _entityName = _type.getEntityName();
                    _builder.append(_entityName, "");
                    _builder.append(" ");
                    String _name_1 = r2.getName();
                    _builder.append(_name_1, "");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                  } else {
                    JPAAnnotations _instance_1 = JPAAnnotations.getInstance();
                    Map<String, String[]> _annotations_1 = _instance_1.getAnnotations();
                    String[] _get_2 = _annotations_1.get("onetomany");
                    String _get_3 = _get_2[0];
                    String _name_2 = r1.getName();
                    String _format_1 = String.format(_get_3, _name_2);
                    _builder.append(_format_1, "");
                    _builder.newLineIfNotEmpty();
                    _builder.append("private Set<");
                    ModelEntity _type_1 = r2.getType();
                    String _entityName_1 = _type_1.getEntityName();
                    _builder.append(_entityName_1, "");
                    _builder.append("> ");
                    String _name_3 = r2.getName();
                    _builder.append(_name_3, "");
                    _builder.append(" = new HashSet<>();");
                    _builder.newLineIfNotEmpty();
                  }
                }
              } else {
                {
                  String _multiplicity_2 = r2.getMultiplicity();
                  boolean _contains_2 = _multiplicity_2.contains("one");
                  if (_contains_2) {
                    JPAAnnotations _instance_2 = JPAAnnotations.getInstance();
                    Map<String, String[]> _annotations_2 = _instance_2.getAnnotations();
                    String[] _get_4 = _annotations_2.get("manytoone");
                    String _get_5 = _get_4[0];
                    boolean _isOptional_1 = r2.isOptional();
                    String _format_2 = String.format(_get_5, Boolean.valueOf(_isOptional_1));
                    _builder.append(_format_2, "");
                    _builder.newLineIfNotEmpty();
                    _builder.append("private ");
                    ModelEntity _type_2 = r2.getType();
                    String _entityName_2 = _type_2.getEntityName();
                    _builder.append(_entityName_2, "");
                    _builder.append(" ");
                    String _name_4 = r2.getName();
                    _builder.append(_name_4, "");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                  } else {
                    JPAAnnotations _instance_3 = JPAAnnotations.getInstance();
                    Map<String, String[]> _annotations_3 = _instance_3.getAnnotations();
                    String[] _get_6 = _annotations_3.get("manytomany");
                    String _get_7 = _get_6[1];
                    String _name_5 = r1.getName();
                    String _format_3 = String.format(_get_7, _name_5);
                    _builder.append(_format_3, "");
                    _builder.newLineIfNotEmpty();
                    _builder.append("private Set<");
                    ModelEntity _type_3 = r2.getType();
                    String _entityName_3 = _type_3.getEntityName();
                    _builder.append(_entityName_3, "");
                    _builder.append("> ");
                    String _name_6 = r2.getName();
                    _builder.append(_name_6, "");
                    _builder.append(" = new HashSet<>();");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
            {
              String _multiplicity_3 = r2.getMultiplicity();
              boolean _contains_3 = _multiplicity_3.contains("one");
              if (_contains_3) {
                {
                  String _multiplicity_4 = r1.getMultiplicity();
                  boolean _contains_4 = _multiplicity_4.contains("one");
                  if (_contains_4) {
                    JPAAnnotations _instance_4 = JPAAnnotations.getInstance();
                    Map<String, String[]> _annotations_4 = _instance_4.getAnnotations();
                    String[] _get_8 = _annotations_4.get("onetoone");
                    String _get_9 = _get_8[0];
                    boolean _isOptional_2 = r1.isOptional();
                    String _format_4 = String.format(_get_9, Boolean.valueOf(_isOptional_2));
                    _builder.append(_format_4, "");
                    _builder.newLineIfNotEmpty();
                    _builder.append("private ");
                    ModelEntity _type_4 = r1.getType();
                    String _entityName_4 = _type_4.getEntityName();
                    _builder.append(_entityName_4, "");
                    _builder.append(" ");
                    String _name_7 = r1.getName();
                    _builder.append(_name_7, "");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                  } else {
                    JPAAnnotations _instance_5 = JPAAnnotations.getInstance();
                    Map<String, String[]> _annotations_5 = _instance_5.getAnnotations();
                    String[] _get_10 = _annotations_5.get("onetomany");
                    String _get_11 = _get_10[0];
                    String _name_8 = r2.getName();
                    String _format_5 = String.format(_get_11, _name_8);
                    _builder.append(_format_5, "");
                    _builder.newLineIfNotEmpty();
                    _builder.append("private Set<");
                    ModelEntity _type_5 = r1.getType();
                    String _entityName_5 = _type_5.getEntityName();
                    _builder.append(_entityName_5, "");
                    _builder.append("> ");
                    String _name_9 = r1.getName();
                    _builder.append(_name_9, "");
                    _builder.append(" = new HashSet<>();");
                    _builder.newLineIfNotEmpty();
                  }
                }
              } else {
                {
                  String _multiplicity_5 = r1.getMultiplicity();
                  boolean _contains_5 = _multiplicity_5.contains("one");
                  if (_contains_5) {
                    JPAAnnotations _instance_6 = JPAAnnotations.getInstance();
                    Map<String, String[]> _annotations_6 = _instance_6.getAnnotations();
                    String[] _get_12 = _annotations_6.get("manytoone");
                    String _get_13 = _get_12[0];
                    boolean _isOptional_3 = r1.isOptional();
                    String _format_6 = String.format(_get_13, Boolean.valueOf(_isOptional_3));
                    _builder.append(_format_6, "");
                    _builder.newLineIfNotEmpty();
                    _builder.append("private ");
                    ModelEntity _type_6 = r1.getType();
                    String _entityName_6 = _type_6.getEntityName();
                    _builder.append(_entityName_6, "");
                    _builder.append(" ");
                    String _name_10 = r1.getName();
                    _builder.append(_name_10, "");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                  } else {
                    JPAAnnotations _instance_7 = JPAAnnotations.getInstance();
                    Map<String, String[]> _annotations_7 = _instance_7.getAnnotations();
                    String[] _get_14 = _annotations_7.get("manytomany");
                    String _get_15 = _get_14[0];
                    _builder.append(_get_15, "");
                    _builder.newLineIfNotEmpty();
                    _builder.append("private Set<");
                    ModelEntity _type_7 = r1.getType();
                    String _entityName_7 = _type_7.getEntityName();
                    _builder.append(_entityName_7, "");
                    _builder.append("> ");
                    String _name_11 = r1.getName();
                    _builder.append(_name_11, "");
                    _builder.append(" = new HashSet<>();");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          } else {
            List<RelationClass> _relations_2 = l.getRelations();
            RelationClass thisRel = ModelUtils.containsEntity(_relations_2, e);
            _builder.newLineIfNotEmpty();
            {
              boolean _notEquals = (!Objects.equal(thisRel, null));
              if (_notEquals) {
                List<RelationClass> _relations_3 = l.getRelations();
                RelationClass otherRel = ModelUtils.getOtherRelationFromLink(_relations_3, e);
                _builder.newLineIfNotEmpty();
                {
                  boolean _isNavigable = otherRel.isNavigable();
                  if (_isNavigable) {
                    {
                      String _multiplicity_6 = thisRel.getMultiplicity();
                      boolean _contains_6 = _multiplicity_6.contains("one");
                      if (_contains_6) {
                        {
                          String _multiplicity_7 = otherRel.getMultiplicity();
                          boolean _contains_7 = _multiplicity_7.contains("one");
                          if (_contains_7) {
                            JPAAnnotations _instance_8 = JPAAnnotations.getInstance();
                            Map<String, String[]> _annotations_8 = _instance_8.getAnnotations();
                            String[] _get_16 = _annotations_8.get("onetoone");
                            String _get_17 = _get_16[0];
                            boolean _isOptional_4 = otherRel.isOptional();
                            String _format_7 = String.format(_get_17, Boolean.valueOf(_isOptional_4));
                            _builder.append(_format_7, "");
                            _builder.newLineIfNotEmpty();
                            _builder.append("private ");
                            ModelEntity _type_8 = otherRel.getType();
                            String _entityName_8 = _type_8.getEntityName();
                            _builder.append(_entityName_8, "");
                            _builder.append(" ");
                            String _name_12 = otherRel.getName();
                            _builder.append(_name_12, "");
                            _builder.append(";");
                            _builder.newLineIfNotEmpty();
                          } else {
                            JPAAnnotations _instance_9 = JPAAnnotations.getInstance();
                            Map<String, String[]> _annotations_9 = _instance_9.getAnnotations();
                            String[] _get_18 = _annotations_9.get("onetomany");
                            String _get_19 = _get_18[0];
                            String _name_13 = thisRel.getName();
                            String _format_8 = String.format(_get_19, _name_13);
                            _builder.append(_format_8, "");
                            _builder.newLineIfNotEmpty();
                            _builder.append("private Set<");
                            ModelEntity _type_9 = otherRel.getType();
                            String _entityName_9 = _type_9.getEntityName();
                            _builder.append(_entityName_9, "");
                            _builder.append("> ");
                            String _name_14 = otherRel.getName();
                            _builder.append(_name_14, "");
                            _builder.append(" = new HashSet<>();");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      } else {
                        {
                          String _multiplicity_8 = otherRel.getMultiplicity();
                          boolean _contains_8 = _multiplicity_8.contains("one");
                          if (_contains_8) {
                            JPAAnnotations _instance_10 = JPAAnnotations.getInstance();
                            Map<String, String[]> _annotations_10 = _instance_10.getAnnotations();
                            String[] _get_20 = _annotations_10.get("manytoone");
                            String _get_21 = _get_20[0];
                            boolean _isOptional_5 = otherRel.isOptional();
                            String _format_9 = String.format(_get_21, Boolean.valueOf(_isOptional_5));
                            _builder.append(_format_9, "");
                            _builder.newLineIfNotEmpty();
                            _builder.append("private ");
                            ModelEntity _type_10 = otherRel.getType();
                            String _entityName_10 = _type_10.getEntityName();
                            _builder.append(_entityName_10, "");
                            _builder.append(" ");
                            String _name_15 = otherRel.getName();
                            _builder.append(_name_15, "");
                            _builder.append(";");
                            _builder.newLineIfNotEmpty();
                          } else {
                            {
                              List<RelationClass> _relations_4 = l.getRelations();
                              RelationClass _get_22 = _relations_4.get(0);
                              boolean _equals = thisRel.equals(_get_22);
                              if (_equals) {
                                JPAAnnotations _instance_11 = JPAAnnotations.getInstance();
                                Map<String, String[]> _annotations_11 = _instance_11.getAnnotations();
                                String[] _get_23 = _annotations_11.get("manytomany");
                                String _get_24 = _get_23[1];
                                String _name_16 = thisRel.getName();
                                String _format_10 = String.format(_get_24, _name_16);
                                _builder.append(_format_10, "");
                                _builder.newLineIfNotEmpty();
                              } else {
                                JPAAnnotations _instance_12 = JPAAnnotations.getInstance();
                                Map<String, String[]> _annotations_12 = _instance_12.getAnnotations();
                                String[] _get_25 = _annotations_12.get("manytomany");
                                String _get_26 = _get_25[0];
                                _builder.append(_get_26, "");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                            _builder.append("private Set<");
                            ModelEntity _type_11 = otherRel.getType();
                            String _entityName_11 = _type_11.getEntityName();
                            _builder.append(_entityName_11, "");
                            _builder.append("> ");
                            String _name_17 = otherRel.getName();
                            _builder.append(_name_17, "");
                            _builder.append(" = new HashSet<>();");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    {
      TreeIterator<EObject> _allContents_1 = this.resource.getAllContents();
      Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_allContents_1);
      Iterable<AssociativeEntity> _filter_1 = Iterables.<AssociativeEntity>filter(_iterable_1, AssociativeEntity.class);
      for(final AssociativeEntity associativeEntity : _filter_1) {
        AssociativeEntityClass l_1 = new AssociativeEntityClass(associativeEntity);
        _builder.newLineIfNotEmpty();
        {
          if ((ModelUtils.isReflexiveRelation(l_1.getRelations(), e) && (!Objects.equal(ModelUtils.containsEntity(l_1.getRelations(), e), null)))) {
            List<RelationClass> _relations_5 = l_1.getRelations();
            RelationClass r1_1 = _relations_5.get(0);
            _builder.newLineIfNotEmpty();
            List<RelationClass> _relations_6 = l_1.getRelations();
            RelationClass r2_1 = _relations_6.get(1);
            _builder.newLineIfNotEmpty();
            {
              String _multiplicity_9 = r2_1.getMultiplicity();
              boolean _contains_9 = _multiplicity_9.contains("one");
              if (_contains_9) {
                JPAAnnotations _instance_13 = JPAAnnotations.getInstance();
                Map<String, String[]> _annotations_13 = _instance_13.getAnnotations();
                String[] _get_27 = _annotations_13.get("onetoone");
                String _get_28 = _get_27[0];
                boolean _isOptional_6 = r2_1.isOptional();
                String _format_11 = String.format(_get_28, Boolean.valueOf(_isOptional_6));
                _builder.append(_format_11, "");
                _builder.newLineIfNotEmpty();
                _builder.append("private ");
                ModelEntity _type_12 = r2_1.getType();
                String _entityName_12 = _type_12.getEntityName();
                _builder.append(_entityName_12, "");
                _builder.append(" ");
                String _name_18 = r2_1.getName();
                _builder.append(_name_18, "");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              } else {
                JPAAnnotations _instance_14 = JPAAnnotations.getInstance();
                Map<String, String[]> _annotations_14 = _instance_14.getAnnotations();
                String[] _get_29 = _annotations_14.get("onetomany");
                String _get_30 = _get_29[0];
                String _name_19 = r1_1.getName();
                String _format_12 = String.format(_get_30, _name_19);
                _builder.append(_format_12, "");
                _builder.newLineIfNotEmpty();
                _builder.append("private Set<");
                ModelEntity _type_13 = r2_1.getType();
                String _entityName_13 = _type_13.getEntityName();
                _builder.append(_entityName_13, "");
                _builder.append("> ");
                String _name_20 = r2_1.getName();
                _builder.append(_name_20, "");
                _builder.append(" = new HashSet<>();");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              String _multiplicity_10 = r1_1.getMultiplicity();
              boolean _contains_10 = _multiplicity_10.contains("one");
              if (_contains_10) {
                JPAAnnotations _instance_15 = JPAAnnotations.getInstance();
                Map<String, String[]> _annotations_15 = _instance_15.getAnnotations();
                String[] _get_31 = _annotations_15.get("onetoone");
                String _get_32 = _get_31[0];
                boolean _isOptional_7 = r1_1.isOptional();
                String _format_13 = String.format(_get_32, Boolean.valueOf(_isOptional_7));
                _builder.append(_format_13, "");
                _builder.newLineIfNotEmpty();
                _builder.append("private ");
                ModelEntity _type_14 = r1_1.getType();
                String _entityName_14 = _type_14.getEntityName();
                _builder.append(_entityName_14, "");
                _builder.append(" ");
                String _name_21 = r1_1.getName();
                _builder.append(_name_21, "");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              } else {
                JPAAnnotations _instance_16 = JPAAnnotations.getInstance();
                Map<String, String[]> _annotations_16 = _instance_16.getAnnotations();
                String[] _get_33 = _annotations_16.get("onetomany");
                String _get_34 = _get_33[0];
                String _name_22 = r2_1.getName();
                String _format_14 = String.format(_get_34, _name_22);
                _builder.append(_format_14, "");
                _builder.newLineIfNotEmpty();
                _builder.append("private Set<");
                ModelEntity _type_15 = r1_1.getType();
                String _entityName_15 = _type_15.getEntityName();
                _builder.append(_entityName_15, "");
                _builder.append("> ");
                String _name_23 = r1_1.getName();
                _builder.append(_name_23, "");
                _builder.append(" = new HashSet<>();");
                _builder.newLineIfNotEmpty();
              }
            }
          } else {
            List<RelationClass> _relations_7 = l_1.getRelations();
            RelationClass thisRel_1 = ModelUtils.containsEntity(_relations_7, e);
            _builder.newLineIfNotEmpty();
            String className = l_1.getName();
            _builder.newLineIfNotEmpty();
            {
              boolean _notEquals_1 = (!Objects.equal(thisRel_1, null));
              if (_notEquals_1) {
                List<RelationClass> _relations_8 = l_1.getRelations();
                RelationClass otherRel_1 = ModelUtils.getOtherRelationFromLink(_relations_8, e);
                _builder.newLineIfNotEmpty();
                {
                  String _multiplicity_11 = otherRel_1.getMultiplicity();
                  boolean _contains_11 = _multiplicity_11.contains("one");
                  if (_contains_11) {
                    JPAAnnotations _instance_17 = JPAAnnotations.getInstance();
                    Map<String, String[]> _annotations_17 = _instance_17.getAnnotations();
                    String[] _get_35 = _annotations_17.get("onetoone");
                    String _get_36 = _get_35[0];
                    boolean _isOptional_8 = otherRel_1.isOptional();
                    String _format_15 = String.format(_get_36, Boolean.valueOf(_isOptional_8));
                    _builder.append(_format_15, "");
                    _builder.newLineIfNotEmpty();
                    _builder.append("private ");
                    _builder.append(className, "");
                    _builder.append(" ");
                    String _name_24 = otherRel_1.getName();
                    _builder.append(_name_24, "");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                  } else {
                    JPAAnnotations _instance_18 = JPAAnnotations.getInstance();
                    Map<String, String[]> _annotations_18 = _instance_18.getAnnotations();
                    String[] _get_37 = _annotations_18.get("onetomany");
                    String _get_38 = _get_37[0];
                    String _name_25 = thisRel_1.getName();
                    String _format_16 = String.format(_get_38, _name_25);
                    _builder.append(_format_16, "");
                    _builder.newLineIfNotEmpty();
                    _builder.append("private Set<");
                    _builder.append(className, "");
                    _builder.append("> ");
                    String _name_26 = otherRel_1.getName();
                    _builder.append(_name_26, "");
                    _builder.append(" = new HashSet<>();");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence createEmptyConstructor(final SimpleEntityClass e) {
    StringConcatenation _builder = new StringConcatenation();
    String _className = e.getClassName();
    _builder.append(_className, "");
    _builder.append("() {}");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createDefaultConstructor(final SimpleEntityClass e) {
    CharSequence _xblockexpression = null;
    {
      ArrayList<ModelVariableDefinition> superClassIds = new ArrayList<ModelVariableDefinition>();
      SimpleEntityClass _superClass = e.getSuperClass();
      boolean _notEquals = (!Objects.equal(_superClass, null));
      if (_notEquals) {
        List<ModelVariableDefinition> _idsFromSuperclass = ModelUtils.getIdsFromSuperclass(e);
        superClassIds.addAll(_idsFromSuperclass);
      }
      List<ModelVariableDefinition> allIds = e.getIdVariables();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public ");
      String _className = e.getClassName();
      _builder.append(_className, "");
      _builder.append("(");
      {
        for(final ModelVariableDefinition v : allIds) {
          {
            Object _variableTypeClass = v.getVariableTypeClass();
            if ((_variableTypeClass instanceof SimpleLink)) {
              String _variableType = v.getVariableType();
              String _variableName = v.getVariableName();
              RelationClass a = this.getTypeFromRelationName(_variableType, _variableName);
              ModelEntity _type = a.getType();
              String _entityName = _type.getEntityName();
              _builder.append(_entityName, "");
              _builder.append(" ");
              String _name = a.getName();
              _builder.append(_name, "");
            } else {
              TypeCodeTransformation _instance = TypeCodeTransformation.getInstance();
              Map<String, String> _types = _instance.getTypes();
              String _variableType_1 = v.getVariableType();
              String _get = _types.get(_variableType_1);
              _builder.append(_get, "");
              _builder.append(" ");
              String _variableName_1 = v.getVariableName();
              _builder.append(_variableName_1, "");
            }
          }
          {
            int _size = allIds.size();
            int _minus = (_size - 1);
            ModelVariableDefinition _get_1 = allIds.get(_minus);
            boolean _equals = v.equals(_get_1);
            boolean _not = (!_equals);
            if (_not) {
              _builder.append(", ");
            }
          }
        }
      }
      _builder.append(") {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("super(");
      {
        for(final ModelVariableDefinition i : superClassIds) {
          String _variableName_2 = i.getVariableName();
          _builder.append(_variableName_2, "\t");
          {
            int _size_1 = superClassIds.size();
            int _minus_1 = (_size_1 - 1);
            ModelVariableDefinition _get_2 = superClassIds.get(_minus_1);
            boolean _equals_1 = i.equals(_get_2);
            boolean _not_1 = (!_equals_1);
            if (_not_1) {
              _builder.append(", ");
            }
          }
        }
      }
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      {
        List<ModelVariableDefinition> _primaryKey = e.getPrimaryKey();
        for(final ModelVariableDefinition v_1 : _primaryKey) {
          {
            if (((v_1.getVariableTypeClass() instanceof Link) && (!Objects.equal(e.getSuperClass(), null)))) {
              {
                Object _variableTypeClass_1 = v_1.getVariableTypeClass();
                if ((_variableTypeClass_1 instanceof AssociativeEntity)) {
                  Object _variableTypeClass_2 = v_1.getVariableTypeClass();
                  AssociativeEntityClass _associativeEntityClass = new AssociativeEntityClass(((AssociativeEntity) _variableTypeClass_2));
                  List<RelationClass> l = _associativeEntityClass.getRelations();
                  _builder.newLineIfNotEmpty();
                  {
                    SimpleEntityClass _superClass_1 = e.getSuperClass();
                    RelationClass _containsEntityOrSuperClass = ModelUtils.containsEntityOrSuperClass(l, _superClass_1);
                    boolean _notEquals_1 = (!Objects.equal(_containsEntityOrSuperClass, null));
                    if (_notEquals_1) {
                      _builder.append("this.");
                      String _variableName_3 = v_1.getVariableName();
                      _builder.append(_variableName_3, "");
                      _builder.append("_unique_constraint = ");
                      String _variableName_4 = v_1.getVariableName();
                      _builder.append(_variableName_4, "");
                      _builder.append(";");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                } else {
                  Object _variableTypeClass_3 = v_1.getVariableTypeClass();
                  SimpleLinkClass _simpleLinkClass = new SimpleLinkClass(((SimpleLink) _variableTypeClass_3));
                  List<RelationClass> l_1 = _simpleLinkClass.getRelations();
                  _builder.newLineIfNotEmpty();
                  {
                    SimpleEntityClass _superClass_2 = e.getSuperClass();
                    RelationClass _containsEntityOrSuperClass_1 = ModelUtils.containsEntityOrSuperClass(l_1, _superClass_2);
                    boolean _notEquals_2 = (!Objects.equal(_containsEntityOrSuperClass_1, null));
                    if (_notEquals_2) {
                      _builder.append("this.");
                      String _variableName_5 = v_1.getVariableName();
                      _builder.append(_variableName_5, "");
                      _builder.append("_unique_constraint = ");
                      String _variableName_6 = v_1.getVariableName();
                      _builder.append(_variableName_6, "");
                      _builder.append(";");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
            }
          }
        }
      }
      {
        List<ModelVariableDefinition> _primaryKey_1 = e.getPrimaryKey();
        for(final ModelVariableDefinition v_2 : _primaryKey_1) {
          {
            Object _variableTypeClass_4 = v_2.getVariableTypeClass();
            if ((_variableTypeClass_4 instanceof SimpleLink)) {
              _builder.append("\t");
              Object _variableTypeClass_5 = v_2.getVariableTypeClass();
              SimpleLinkClass l_2 = new SimpleLinkClass(((SimpleLink) _variableTypeClass_5));
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              List<RelationClass> _relations = l_2.getRelations();
              RelationClass thisRel = ModelUtils.containsEntityOrSuperClass(_relations, e);
              _builder.newLineIfNotEmpty();
              {
                boolean _notEquals_3 = (!Objects.equal(thisRel, null));
                if (_notEquals_3) {
                  {
                    List<RelationClass> _relations_1 = l_2.getRelations();
                    RelationClass _get_3 = _relations_1.get(0);
                    boolean _equals_2 = thisRel.equals(_get_3);
                    if (_equals_2) {
                      _builder.append("\t");
                      _builder.append("Associations.");
                      String _name_1 = l_2.getName();
                      _builder.append(_name_1, "\t");
                      _builder.append(".link(this, ");
                      String _variableName_7 = v_2.getVariableName();
                      _builder.append(_variableName_7, "\t");
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                    } else {
                      _builder.append("\t");
                      _builder.append("Associations.");
                      String _name_2 = l_2.getName();
                      _builder.append(_name_2, "\t");
                      _builder.append(".link(");
                      String _variableName_8 = v_2.getVariableName();
                      _builder.append(_variableName_8, "\t");
                      _builder.append(", this);");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
            } else {
              {
                Object _variableTypeClass_6 = v_2.getVariableTypeClass();
                boolean _not_2 = (!(_variableTypeClass_6 instanceof AssociativeEntity));
                if (_not_2) {
                  _builder.append("\t");
                  _builder.append("this.");
                  String _variableName_9 = v_2.getVariableName();
                  _builder.append(_variableName_9, "\t");
                  _builder.append(" = ");
                  String _variableName_10 = v_2.getVariableName();
                  _builder.append(_variableName_10, "\t");
                  _builder.append(";");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence createDefaultConstructorForAbstracClass(final SimpleEntityClass e) {
    CharSequence _xblockexpression = null;
    {
      ArrayList<ModelVariableDefinition> superClassIds = new ArrayList<ModelVariableDefinition>();
      SimpleEntityClass _superClass = e.getSuperClass();
      boolean _notEquals = (!Objects.equal(_superClass, null));
      if (_notEquals) {
        List<ModelVariableDefinition> _idsFromSuperclass = ModelUtils.getIdsFromSuperclass(e);
        superClassIds.addAll(_idsFromSuperclass);
      }
      List<ModelVariableDefinition> allIds = e.getIdVariablesWithoutLink();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public ");
      String _className = e.getClassName();
      _builder.append(_className, "");
      _builder.append("(");
      {
        for(final ModelVariableDefinition v : allIds) {
          {
            Object _variableTypeClass = v.getVariableTypeClass();
            if ((_variableTypeClass instanceof SimpleLink)) {
              String _variableType = v.getVariableType();
              String _variableName = v.getVariableName();
              RelationClass a = this.getTypeFromRelationName(_variableType, _variableName);
              ModelEntity _type = a.getType();
              String _entityName = _type.getEntityName();
              _builder.append(_entityName, "");
              _builder.append(" ");
              String _name = a.getName();
              _builder.append(_name, "");
            } else {
              String _variableType_1 = v.getVariableType();
              _builder.append(_variableType_1, "");
              _builder.append(" ");
              String _variableName_1 = v.getVariableName();
              _builder.append(_variableName_1, "");
            }
          }
          {
            int _size = allIds.size();
            int _minus = (_size - 1);
            ModelVariableDefinition _get = allIds.get(_minus);
            boolean _equals = v.equals(_get);
            boolean _not = (!_equals);
            if (_not) {
              _builder.append(", ");
            }
          }
        }
      }
      _builder.append(") {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("super(");
      {
        for(final ModelVariableDefinition i : superClassIds) {
          String _variableName_2 = i.getVariableName();
          _builder.append(_variableName_2, "\t");
          {
            int _size_1 = superClassIds.size();
            int _minus_1 = (_size_1 - 1);
            ModelVariableDefinition _get_1 = superClassIds.get(_minus_1);
            boolean _equals_1 = i.equals(_get_1);
            boolean _not_1 = (!_equals_1);
            if (_not_1) {
              _builder.append(", ");
            }
          }
        }
      }
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      {
        List<ModelVariableDefinition> _primaryKey = e.getPrimaryKey();
        for(final ModelVariableDefinition v_1 : _primaryKey) {
          {
            if (((!(v_1.getVariableTypeClass() instanceof SimpleLink)) && (!(v_1.getVariableTypeClass() instanceof AssociativeEntity)))) {
              _builder.append("\t");
              _builder.append("this.");
              String _variableName_3 = v_1.getVariableName();
              _builder.append(_variableName_3, "\t");
              _builder.append(" = ");
              String _variableName_4 = v_1.getVariableName();
              _builder.append(_variableName_4, "\t");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence createGettersSetters(final SimpleEntityClass e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<ModelVariableDefinition> _primaryKey = e.getPrimaryKey();
      for(final ModelVariableDefinition p : _primaryKey) {
        {
          Object _variableTypeClass = p.getVariableTypeClass();
          boolean _not = (!(_variableTypeClass instanceof Link));
          if (_not) {
            _builder.append("public ");
            TypeCodeTransformation _instance = TypeCodeTransformation.getInstance();
            Map<String, String> _types = _instance.getTypes();
            String _variableType = p.getVariableType();
            String _get = _types.get(_variableType);
            _builder.append(_get, "");
            _builder.append(" get");
            String _variableName = p.getVariableName();
            String _upperFirst = StringUtils.toUpperFirst(_variableName);
            _builder.append(_upperFirst, "");
            _builder.append("() {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("return this.");
            String _variableName_1 = p.getVariableName();
            _builder.append(_variableName_1, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
          }
        }
      }
    }
    {
      List<ModelVariableDefinition> _attributes = e.getAttributes();
      for(final ModelVariableDefinition v : _attributes) {
        {
          if (((!(v instanceof ModelTypeCollectionVariableClass)) && (!(v instanceof SimpleTypeCollectionVariableClass)))) {
            _builder.append("public ");
            TypeCodeTransformation _instance_1 = TypeCodeTransformation.getInstance();
            Map<String, String> _types_1 = _instance_1.getTypes();
            String _variableType_1 = v.getVariableType();
            String _get_1 = _types_1.get(_variableType_1);
            _builder.append(_get_1, "");
            _builder.append(" get");
            String _variableName_2 = v.getVariableName();
            String _upperFirst_1 = StringUtils.toUpperFirst(_variableName_2);
            _builder.append(_upperFirst_1, "");
            _builder.append("() {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("return this.");
            String _variableName_3 = v.getVariableName();
            _builder.append(_variableName_3, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.newLine();
            _builder.append("public void set");
            String _variableName_4 = v.getVariableName();
            String _upperFirst_2 = StringUtils.toUpperFirst(_variableName_4);
            _builder.append(_upperFirst_2, "");
            _builder.append("(");
            TypeCodeTransformation _instance_2 = TypeCodeTransformation.getInstance();
            Map<String, String> _types_2 = _instance_2.getTypes();
            String _variableType_2 = v.getVariableType();
            String _get_2 = _types_2.get(_variableType_2);
            _builder.append(_get_2, "");
            _builder.append(" ");
            String _variableName_5 = v.getVariableName();
            _builder.append(_variableName_5, "");
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("this.");
            String _variableName_6 = v.getVariableName();
            _builder.append(_variableName_6, "\t");
            _builder.append(" = ");
            String _variableName_7 = v.getVariableName();
            _builder.append(_variableName_7, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
          } else {
            String _variableType_3 = v.getVariableType();
            String paramType = ModelUtils.getCollectionType(_variableType_3);
            _builder.newLineIfNotEmpty();
            String _variableType_4 = v.getVariableType();
            String _collectionType = ModelUtils.getCollectionType(_variableType_4);
            String param = StringUtils.toLowerFirst(_collectionType);
            _builder.newLineIfNotEmpty();
            _builder.append("public void add");
            String _variableName_8 = v.getVariableName();
            String _upperFirst_3 = StringUtils.toUpperFirst(_variableName_8);
            _builder.append(_upperFirst_3, "");
            _builder.append("(");
            _builder.append(paramType, "");
            _builder.append(" ");
            _builder.append(param, "");
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("this.");
            String _variableName_9 = v.getVariableName();
            _builder.append(_variableName_9, "\t");
            _builder.append(".add(");
            _builder.append(param, "\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
            _builder.append("public void remove");
            String _variableName_10 = v.getVariableName();
            String _upperFirst_4 = StringUtils.toUpperFirst(_variableName_10);
            _builder.append(_upperFirst_4, "");
            _builder.append("(");
            _builder.append(paramType, "");
            _builder.append(" ");
            _builder.append(param, "");
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("this.");
            String _variableName_11 = v.getVariableName();
            _builder.append(_variableName_11, "\t");
            _builder.append(".remove(");
            _builder.append(param, "\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
            _builder.append("public ");
            String _variableType_5 = v.getVariableType();
            String _collection = ModelUtils.getCollection(_variableType_5);
            _builder.append(_collection, "");
            _builder.append("<");
            _builder.append(paramType, "");
            _builder.append("> get");
            String _variableName_12 = v.getVariableName();
            String _upperFirst_5 = StringUtils.toUpperFirst(_variableName_12);
            _builder.append(_upperFirst_5, "");
            _builder.append("() {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("return ");
            String _variableType_6 = v.getVariableType();
            String _collectionInitialize = ModelUtils.getCollectionInitialize(_variableType_6);
            _builder.append(_collectionInitialize, "\t");
            _builder.append("(");
            String _variableName_13 = v.getVariableName();
            _builder.append(_variableName_13, "\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence createHashCodeEquals(final SimpleEntityClass e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public int hashCode() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return Objects.hash(");
    {
      List<ModelVariableDefinition> _idVariables = e.getIdVariables();
      for(final ModelVariableDefinition i : _idVariables) {
        _builder.append("this.get");
        String _variableName = i.getVariableName();
        String _upperFirst = StringUtils.toUpperFirst(_variableName);
        _builder.append(_upperFirst, "\t");
        _builder.append("()");
        {
          List<ModelVariableDefinition> _idVariables_1 = e.getIdVariables();
          List<ModelVariableDefinition> _idVariables_2 = e.getIdVariables();
          int _size = _idVariables_2.size();
          int _minus = (_size - 1);
          ModelVariableDefinition _get = _idVariables_1.get(_minus);
          boolean _equals = i.equals(_get);
          boolean _not = (!_equals);
          if (_not) {
            _builder.append(", ");
          }
        }
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public boolean equals(Object obj) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (this == obj)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (obj == null)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (getClass() != obj.getClass())");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("\t");
    String _className = e.getClassName();
    _builder.append(_className, "\t");
    _builder.append(" other = (");
    String _className_1 = e.getClassName();
    _builder.append(_className_1, "\t");
    _builder.append(") obj;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return Objects.equals(");
    {
      List<ModelVariableDefinition> _idVariables_3 = e.getIdVariables();
      for(final ModelVariableDefinition i_1 : _idVariables_3) {
        _builder.append("this.get");
        String _variableName_1 = i_1.getVariableName();
        String _upperFirst_1 = StringUtils.toUpperFirst(_variableName_1);
        _builder.append(_upperFirst_1, "\t");
        _builder.append("(), other.get");
        String _variableName_2 = i_1.getVariableName();
        String _upperFirst_2 = StringUtils.toUpperFirst(_variableName_2);
        _builder.append(_upperFirst_2, "\t");
        _builder.append("()");
        {
          List<ModelVariableDefinition> _idVariables_4 = e.getIdVariables();
          List<ModelVariableDefinition> _idVariables_5 = e.getIdVariables();
          int _size_1 = _idVariables_5.size();
          int _minus_1 = (_size_1 - 1);
          ModelVariableDefinition _get_1 = _idVariables_4.get(_minus_1);
          boolean _equals_1 = i_1.equals(_get_1);
          boolean _not_1 = (!_equals_1);
          if (_not_1) {
            _builder.append(") && Objects.equals(");
          }
        }
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createToString(final SimpleEntityClass e) {
    CharSequence _xblockexpression = null;
    {
      ArrayList<ModelVariableDefinition> vars = new ArrayList<ModelVariableDefinition>();
      List<ModelVariableDefinition> _primaryKey = e.getPrimaryKey();
      vars.addAll(_primaryKey);
      List<ModelVariableDefinition> _attributes = e.getAttributes();
      vars.addAll(_attributes);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("public String toString() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return \"");
      String _className = e.getClassName();
      _builder.append(_className, "\t");
      _builder.append(" [");
      {
        for(final ModelVariableDefinition v : vars) {
          String _variableName = v.getVariableName();
          _builder.append(_variableName, "\t");
          _builder.append("=\" + this.get");
          String _variableName_1 = v.getVariableName();
          String _upperFirst = StringUtils.toUpperFirst(_variableName_1);
          _builder.append(_upperFirst, "\t");
          _builder.append("() + \"");
          {
            int _size = vars.size();
            int _minus = (_size - 1);
            ModelVariableDefinition _get = vars.get(_minus);
            boolean _equals = v.equals(_get);
            boolean _not = (!_equals);
            if (_not) {
              _builder.append(", ");
            }
          }
        }
      }
      _builder.append("]\";");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence createMethods(final SimpleEntityClass e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<ModelMethod> _methods = e.getMethods();
      for(final ModelMethod m : _methods) {
        _builder.append("public abstract ");
        TypeCodeTransformation _instance = TypeCodeTransformation.getInstance();
        Map<String, String> _types = _instance.getTypes();
        String _methodReturnType = m.getMethodReturnType();
        String _get = _types.get(_methodReturnType);
        _builder.append(_get, "");
        _builder.append(" ");
        String _methodName = m.getMethodName();
        _builder.append(_methodName, "");
        _builder.append("(");
        {
          List<ModelVariableDefinition> _methodParameters = m.getMethodParameters();
          for(final ModelVariableDefinition p : _methodParameters) {
            TypeCodeTransformation _instance_1 = TypeCodeTransformation.getInstance();
            Map<String, String> _types_1 = _instance_1.getTypes();
            String _variableType = p.getVariableType();
            String _get_1 = _types_1.get(_variableType);
            _builder.append(_get_1, "");
            _builder.append(" ");
            String _variableName = p.getVariableName();
            _builder.append(_variableName, "");
            {
              List<ModelVariableDefinition> _methodParameters_1 = m.getMethodParameters();
              List<ModelVariableDefinition> _methodParameters_2 = m.getMethodParameters();
              int _size = _methodParameters_2.size();
              int _minus = (_size - 1);
              ModelVariableDefinition _get_2 = _methodParameters_1.get(_minus);
              boolean _equals = p.equals(_get_2);
              boolean _not = (!_equals);
              if (_not) {
                _builder.append(", ");
              }
            }
          }
        }
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence createMaintenanceOneRelations(final List<RelationClass> oneRelations) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final RelationClass r : oneRelations) {
        _builder.append("void _set");
        String _name = r.getName();
        String _upperFirst = StringUtils.toUpperFirst(_name);
        _builder.append(_upperFirst, "");
        _builder.append("(");
        ModelEntity _type = r.getType();
        String _entityName = _type.getEntityName();
        _builder.append(_entityName, "");
        _builder.append(" ");
        String _name_1 = r.getName();
        _builder.append(_name_1, "");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("this.");
        String _name_2 = r.getName();
        _builder.append(_name_2, "\t");
        _builder.append(" = ");
        String _name_3 = r.getName();
        _builder.append(_name_3, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("public ");
        ModelEntity _type_1 = r.getType();
        String _entityName_1 = _type_1.getEntityName();
        _builder.append(_entityName_1, "");
        _builder.append(" get");
        String _name_4 = r.getName();
        String _upperFirst_1 = StringUtils.toUpperFirst(_name_4);
        _builder.append(_upperFirst_1, "");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return this.");
        String _name_5 = r.getName();
        _builder.append(_name_5, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence createMaintenanceManyRelations(final List<RelationClass> manyRelations) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final RelationClass r : manyRelations) {
        _builder.append("Set<");
        ModelEntity _type = r.getType();
        String _entityName = _type.getEntityName();
        _builder.append(_entityName, "");
        _builder.append("> _get");
        String _name = r.getName();
        String _upperFirst = StringUtils.toUpperFirst(_name);
        _builder.append(_upperFirst, "");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return this.");
        String _name_1 = r.getName();
        _builder.append(_name_1, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("public Set<");
        ModelEntity _type_1 = r.getType();
        String _entityName_1 = _type_1.getEntityName();
        _builder.append(_entityName_1, "");
        _builder.append("> get");
        String _name_2 = r.getName();
        String _upperFirst_1 = StringUtils.toUpperFirst(_name_2);
        _builder.append(_upperFirst_1, "");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return new HashSet<>(");
        String _name_3 = r.getName();
        _builder.append(_name_3, "\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence createAssociativeMaintenanceRelations(final List<AssociativeEntityClass> associativeEntities, final SimpleEntityClass e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final AssociativeEntityClass l : associativeEntities) {
        List<RelationClass> _relations = l.getRelations();
        RelationClass otherRel = ModelUtils.getOtherRelationFromLink(_relations, e);
        _builder.newLineIfNotEmpty();
        String className = l.getName();
        _builder.newLineIfNotEmpty();
        {
          String _multiplicity = otherRel.getMultiplicity();
          boolean _contains = _multiplicity.contains("one");
          if (_contains) {
            _builder.append("void _set");
            _builder.append(className, "");
            _builder.append("(");
            _builder.append(className, "");
            _builder.append(" ");
            String _name = otherRel.getName();
            _builder.append(_name, "");
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("this.");
            String _name_1 = otherRel.getName();
            _builder.append(_name_1, "\t");
            _builder.append(" = ");
            String _name_2 = otherRel.getName();
            _builder.append(_name_2, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
            _builder.append("public ");
            _builder.append(className, "");
            _builder.append(" get");
            _builder.append(className, "");
            _builder.append("() {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("return this.");
            String _name_3 = otherRel.getName();
            _builder.append(_name_3, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
          } else {
            _builder.append("Set<");
            _builder.append(className, "");
            _builder.append("> _get");
            _builder.append(className, "");
            _builder.append("() {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("return this.");
            String _name_4 = otherRel.getName();
            _builder.append(_name_4, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
            _builder.append("public Set<");
            _builder.append(className, "");
            _builder.append("> get");
            _builder.append(className, "");
            _builder.append("() {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("return new HashSet<>(");
            String _name_5 = otherRel.getName();
            _builder.append(_name_5, "\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
          }
        }
      }
    }
    return _builder;
  }
  
  /**
   * Métodos de apoyo
   */
  public RelationClass getTypeFromRelationName(final String linkName, final String relationName) {
    TreeIterator<EObject> _allContents = this.resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<SimpleLink> _filter = Iterables.<SimpleLink>filter(_iterable, SimpleLink.class);
    for (final SimpleLink l : _filter) {
      {
        SimpleLinkClass link = new SimpleLinkClass(l);
        String _name = link.getName();
        boolean _equals = _name.equals(linkName);
        if (_equals) {
          List<RelationClass> _relations = link.getRelations();
          for (final RelationClass r : _relations) {
            String _name_1 = r.getName();
            boolean _equals_1 = _name_1.equals(relationName);
            if (_equals_1) {
              return r;
            }
          }
        }
      }
    }
    return null;
  }
  
  public boolean isSuperclassEntity(final String entity) {
    TreeIterator<EObject> _allContents = this.resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<SimpleEntity> _filter = Iterables.<SimpleEntity>filter(_iterable, SimpleEntity.class);
    for (final SimpleEntity e : _filter) {
      if (((!Objects.equal(e.getSuperClass(), null)) && e.getSuperClass().getName().equals(entity))) {
        return true;
      }
    }
    return false;
  }
}
