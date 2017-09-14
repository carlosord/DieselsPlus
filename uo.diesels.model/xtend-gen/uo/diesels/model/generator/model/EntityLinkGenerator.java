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
import uo.diesels.model.generator.model.EntityLinkKeyGenerator;
import uo.diesels.model.generator.model.EntitySrcGenerator;
import uo.diesels.model.generator.model.util.ModelEntity;
import uo.diesels.model.generator.model.util.ModelMethod;
import uo.diesels.model.generator.model.util.ModelVariableDefinition;
import uo.diesels.model.generator.model.util.classes.RelationClass;
import uo.diesels.model.generator.model.util.classes.variables.ModelTypeCollectionVariableClass;
import uo.diesels.model.generator.model.util.classes.variables.SimpleTypeCollectionVariableClass;
import uo.diesels.model.generator.model.util.elements.AssociativeEntityClass;
import uo.diesels.model.generator.model.util.elements.SimpleLinkClass;
import uo.diesels.model.generator.model.util.elements.ValueTypeClass;
import uo.diesels.model.generator.model.util.util.JPAAnnotations;
import uo.diesels.model.generator.model.util.util.ModelUtils;
import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.generator.util.PackageConstants;
import uo.diesels.model.generator.util.PathConstants;
import uo.diesels.model.generator.util.StringUtils;
import uo.diesels.model.modelDsl.AssociativeEntity;
import uo.diesels.model.modelDsl.SimpleLink;
import uo.diesels.model.modelDsl.ValueType;

@SuppressWarnings("all")
public class EntityLinkGenerator {
  private Resource resource;
  
  private IFileSystemAccess fsa;
  
  private String project;
  
  public EntityLinkGenerator(final Resource resource, final IFileSystemAccess fsa, final String project) {
    this.resource = resource;
    this.fsa = fsa;
    this.project = project;
  }
  
  public void compile() {
    TreeIterator<EObject> _allContents = this.resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<AssociativeEntity> _filter = Iterables.<AssociativeEntity>filter(_iterable, AssociativeEntity.class);
    for (final AssociativeEntity associativeEntity : _filter) {
      {
        AssociativeEntityClass e = new AssociativeEntityClass(associativeEntity);
        StringBuilder sb = new StringBuilder();
        CharSequence _compileText = this.compileText(e);
        sb.append(_compileText);
        String _className = e.getClassName();
        String entityPath = String.format(PathConstants.MODEL_MODEL_PATH, this.project, _className);
        EntityLinkKeyGenerator entityLinkKeyGenerator = new EntityLinkKeyGenerator(this.resource, this.fsa, this.project, associativeEntity);
        entityLinkKeyGenerator.compile();
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
  
  public CharSequence compileText(final AssociativeEntityClass e) {
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
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _createSerialVersionDeclaration = this.createSerialVersionDeclaration();
      _builder.append(_createSerialVersionDeclaration, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      CharSequence _createAssociativeMaintenanceAttributeDeclarations = this.createAssociativeMaintenanceAttributeDeclarations(e);
      _builder.append(_createAssociativeMaintenanceAttributeDeclarations, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      CharSequence _createAttributteDeclarations = this.createAttributteDeclarations(e);
      _builder.append(_createAttributteDeclarations, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
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
        boolean _isAbstractEntity = e.isAbstractEntity();
        boolean _not = (!_isAbstractEntity);
        if (_not) {
          _builder.append("\t");
          CharSequence _createDefaultConstructor = this.createDefaultConstructor(e);
          _builder.append(_createDefaultConstructor, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      CharSequence _createGettersSetters = this.createGettersSetters(e);
      _builder.append(_createGettersSetters, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _createHashCodeEquals = this.createHashCodeEquals(e);
      _builder.append(_createHashCodeEquals, "\t");
      _builder.newLineIfNotEmpty();
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
      CharSequence _createEntityLinkMaintenanceRelations = this.createEntityLinkMaintenanceRelations(e);
      _builder.append(_createEntityLinkMaintenanceRelations, "\t");
      _builder.newLineIfNotEmpty();
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
  
  public CharSequence createImportsDeclarations(final AssociativeEntityClass e) {
    CharSequence _xblockexpression = null;
    {
      String _remplaceSlashToDot = StringUtils.remplaceSlashToDot(this.project);
      Set<String> _imports = e.getImports(_remplaceSlashToDot);
      HashSet<String> imports = new HashSet<String>(_imports);
      List<ModelVariableDefinition> _attributes = e.getAttributes();
      for (final ModelVariableDefinition v : _attributes) {
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
                String _get_5 = _get_4[1];
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
                String _get_13 = _get_12[1];
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
                  String _get_21 = _get_20[1];
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
              String _get_5 = _get_4[1];
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
              String _get_9 = _get_8[1];
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
              String _get_13 = _get_12[1];
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
  
  public CharSequence createClassDeclaration(final AssociativeEntityClass e) {
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
  
  public CharSequence createAssociativeMaintenanceAttributeDeclarations(final AssociativeEntityClass e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<RelationClass> _relations = e.getRelations();
      for(final RelationClass r : _relations) {
        JPAAnnotations _instance = JPAAnnotations.getInstance();
        Map<String, String[]> _annotations = _instance.getAnnotations();
        String[] _get = _annotations.get("id");
        String _get_1 = _get[0];
        _builder.append(_get_1, "");
        _builder.newLineIfNotEmpty();
        {
          String _multiplicity = r.getMultiplicity();
          boolean _contains = _multiplicity.contains("one");
          if (_contains) {
            JPAAnnotations _instance_1 = JPAAnnotations.getInstance();
            Map<String, String[]> _annotations_1 = _instance_1.getAnnotations();
            String[] _get_2 = _annotations_1.get("onetoone");
            String _get_3 = _get_2[0];
            boolean _isOptional = r.isOptional();
            String _format = String.format(_get_3, Boolean.valueOf(_isOptional));
            _builder.append(_format, "");
            _builder.newLineIfNotEmpty();
          } else {
            JPAAnnotations _instance_2 = JPAAnnotations.getInstance();
            Map<String, String[]> _annotations_2 = _instance_2.getAnnotations();
            String[] _get_4 = _annotations_2.get("manytoone");
            String _get_5 = _get_4[0];
            boolean _isOptional_1 = r.isOptional();
            String _format_1 = String.format(_get_5, Boolean.valueOf(_isOptional_1));
            _builder.append(_format_1, "");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("private ");
        ModelEntity _type = r.getType();
        String _entityName = _type.getEntityName();
        _builder.append(_entityName, "");
        _builder.append(" ");
        String _name = r.getName();
        _builder.append(_name, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence createAttributteDeclarations(final AssociativeEntityClass e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<ModelVariableDefinition> _attributes = e.getAttributes();
      for(final ModelVariableDefinition v : _attributes) {
        String _annotations = v.getAnnotations();
        _builder.append(_annotations, "");
        _builder.append("\t\t");
        _builder.newLineIfNotEmpty();
        {
          Object _variableTypeClass = v.getVariableTypeClass();
          if ((_variableTypeClass instanceof ValueType)) {
            {
              List<ModelVariableDefinition> _attributes_1 = e.getAttributes();
              boolean _containsOtherValueTypeLike = ModelUtils.containsOtherValueTypeLike(_attributes_1, v);
              if (_containsOtherValueTypeLike) {
                JPAAnnotations _instance = JPAAnnotations.getInstance();
                Map<String, String[]> _annotations_1 = _instance.getAnnotations();
                String[] _get = _annotations_1.get("attributeOverrides");
                String _get_1 = _get[0];
                _builder.append(_get_1, "");
                _builder.append("( {");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                Object _variableTypeClass_1 = v.getVariableTypeClass();
                ValueTypeClass _valueTypeClass = new ValueTypeClass(((ValueType) _variableTypeClass_1));
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
                    Object _variableTypeClass_2 = v.getVariableTypeClass();
                    ValueTypeClass _valueTypeClass_1 = new ValueTypeClass(((ValueType) _variableTypeClass_2));
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
        String _isCollectionVariable = v.isCollectionVariable();
        _builder.append(_isCollectionVariable, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence createMaintenanceAttributteDeclarations(final AssociativeEntityClass e) {
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
                    String _get_1 = _get[0];
                    boolean _isOptional = r2.isOptional();
                    String _format = String.format(_get_1, Boolean.valueOf(_isOptional));
                    _builder.append(_format, "");
                    _builder.newLineIfNotEmpty();
                    _builder.append("private ");
                    ModelEntity _type = r2.getType();
                    String _entityName = _type.getEntityName();
                    _builder.append(_entityName, "");
                    _builder.append(" ");
                    String _name = r2.getName();
                    _builder.append(_name, "");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                  } else {
                    JPAAnnotations _instance_1 = JPAAnnotations.getInstance();
                    Map<String, String[]> _annotations_1 = _instance_1.getAnnotations();
                    String[] _get_2 = _annotations_1.get("onetomany");
                    String _get_3 = _get_2[0];
                    String _name_1 = r1.getName();
                    String _format_1 = String.format(_get_3, _name_1);
                    _builder.append(_format_1, "");
                    _builder.newLineIfNotEmpty();
                    _builder.append("private Set<");
                    ModelEntity _type_1 = r2.getType();
                    String _entityName_1 = _type_1.getEntityName();
                    _builder.append(_entityName_1, "");
                    _builder.append("> ");
                    String _name_2 = r2.getName();
                    _builder.append(_name_2, "");
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
                    String _name_3 = r2.getName();
                    _builder.append(_name_3, "");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                  } else {
                    JPAAnnotations _instance_3 = JPAAnnotations.getInstance();
                    Map<String, String[]> _annotations_3 = _instance_3.getAnnotations();
                    String[] _get_6 = _annotations_3.get("manytomany");
                    String _get_7 = _get_6[1];
                    String _name_4 = r1.getName();
                    String _format_3 = String.format(_get_7, _name_4);
                    _builder.append(_format_3, "");
                    _builder.newLineIfNotEmpty();
                    _builder.append("private Set<");
                    ModelEntity _type_3 = r2.getType();
                    String _entityName_3 = _type_3.getEntityName();
                    _builder.append(_entityName_3, "");
                    _builder.append("> ");
                    String _name_5 = r2.getName();
                    _builder.append(_name_5, "");
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
                    String _name_6 = r1.getName();
                    _builder.append(_name_6, "");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                  } else {
                    JPAAnnotations _instance_5 = JPAAnnotations.getInstance();
                    Map<String, String[]> _annotations_5 = _instance_5.getAnnotations();
                    String[] _get_10 = _annotations_5.get("onetomany");
                    String _get_11 = _get_10[0];
                    String _name_7 = r2.getName();
                    String _format_5 = String.format(_get_11, _name_7);
                    _builder.append(_format_5, "");
                    _builder.newLineIfNotEmpty();
                    _builder.append("private Set<");
                    ModelEntity _type_5 = r1.getType();
                    String _entityName_5 = _type_5.getEntityName();
                    _builder.append(_entityName_5, "");
                    _builder.append("> ");
                    String _name_8 = r1.getName();
                    _builder.append(_name_8, "");
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
                    String _name_9 = r1.getName();
                    _builder.append(_name_9, "");
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
                    String _name_10 = r1.getName();
                    _builder.append(_name_10, "");
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
                            String _name_11 = otherRel.getName();
                            _builder.append(_name_11, "");
                            _builder.append(";");
                            _builder.newLineIfNotEmpty();
                          } else {
                            JPAAnnotations _instance_9 = JPAAnnotations.getInstance();
                            Map<String, String[]> _annotations_9 = _instance_9.getAnnotations();
                            String[] _get_18 = _annotations_9.get("onetomany");
                            String _get_19 = _get_18[0];
                            String _name_12 = thisRel.getName();
                            String _format_8 = String.format(_get_19, _name_12);
                            _builder.append(_format_8, "");
                            _builder.newLineIfNotEmpty();
                            _builder.append("private Set<");
                            ModelEntity _type_9 = otherRel.getType();
                            String _entityName_9 = _type_9.getEntityName();
                            _builder.append(_entityName_9, "");
                            _builder.append("> ");
                            String _name_13 = otherRel.getName();
                            _builder.append(_name_13, "");
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
                            String _name_14 = otherRel.getName();
                            _builder.append(_name_14, "");
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
                                String _name_15 = thisRel.getName();
                                String _format_10 = String.format(_get_24, _name_15);
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
                            String _name_16 = otherRel.getName();
                            _builder.append(_name_16, "");
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
                String _name_17 = r2_1.getName();
                _builder.append(_name_17, "");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              } else {
                JPAAnnotations _instance_14 = JPAAnnotations.getInstance();
                Map<String, String[]> _annotations_14 = _instance_14.getAnnotations();
                String[] _get_29 = _annotations_14.get("onetomany");
                String _get_30 = _get_29[0];
                String _name_18 = r1_1.getName();
                String _format_12 = String.format(_get_30, _name_18);
                _builder.append(_format_12, "");
                _builder.newLineIfNotEmpty();
                _builder.append("private Set<");
                ModelEntity _type_13 = r2_1.getType();
                String _entityName_13 = _type_13.getEntityName();
                _builder.append(_entityName_13, "");
                _builder.append("> ");
                String _name_19 = r2_1.getName();
                _builder.append(_name_19, "");
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
                String _name_20 = r1_1.getName();
                _builder.append(_name_20, "");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              } else {
                JPAAnnotations _instance_16 = JPAAnnotations.getInstance();
                Map<String, String[]> _annotations_16 = _instance_16.getAnnotations();
                String[] _get_33 = _annotations_16.get("onetomany");
                String _get_34 = _get_33[0];
                String _name_21 = r2_1.getName();
                String _format_14 = String.format(_get_34, _name_21);
                _builder.append(_format_14, "");
                _builder.newLineIfNotEmpty();
                _builder.append("private Set<");
                ModelEntity _type_15 = r1_1.getType();
                String _entityName_15 = _type_15.getEntityName();
                _builder.append(_entityName_15, "");
                _builder.append("> ");
                String _name_22 = r1_1.getName();
                _builder.append(_name_22, "");
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
                    String _lowerFirst = StringUtils.toLowerFirst(className);
                    _builder.append(_lowerFirst, "");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                  } else {
                    JPAAnnotations _instance_18 = JPAAnnotations.getInstance();
                    Map<String, String[]> _annotations_18 = _instance_18.getAnnotations();
                    String[] _get_37 = _annotations_18.get("onetomany");
                    String _get_38 = _get_37[0];
                    String _name_23 = thisRel_1.getName();
                    String _format_16 = String.format(_get_38, _name_23);
                    _builder.append(_format_16, "");
                    _builder.newLineIfNotEmpty();
                    _builder.append("private Set<");
                    _builder.append(className, "");
                    _builder.append("> ");
                    String _lowerFirst_1 = StringUtils.toLowerFirst(className);
                    _builder.append(_lowerFirst_1, "");
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
  
  public CharSequence createEmptyConstructor(final AssociativeEntityClass e) {
    StringConcatenation _builder = new StringConcatenation();
    String _className = e.getClassName();
    _builder.append(_className, "");
    _builder.append("() {}");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createDefaultConstructor(final AssociativeEntityClass e) {
    CharSequence _xblockexpression = null;
    {
      List<RelationClass> _relations = e.getRelations();
      RelationClass r1 = _relations.get(0);
      List<RelationClass> _relations_1 = e.getRelations();
      RelationClass r2 = _relations_1.get(1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public ");
      String _name = e.getName();
      _builder.append(_name, "");
      _builder.append("(");
      ModelEntity _type = r1.getType();
      String _entityName = _type.getEntityName();
      _builder.append(_entityName, "");
      _builder.append(" ");
      String _name_1 = r1.getName();
      _builder.append(_name_1, "");
      _builder.append(", ");
      ModelEntity _type_1 = r2.getType();
      String _entityName_1 = _type_1.getEntityName();
      _builder.append(_entityName_1, "");
      _builder.append(" ");
      String _name_2 = r2.getName();
      _builder.append(_name_2, "");
      _builder.append(") {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("Associations.");
      String _name_3 = e.getName();
      _builder.append(_name_3, "\t");
      _builder.append("Link.link(");
      String _name_4 = r1.getName();
      _builder.append(_name_4, "\t");
      _builder.append(", ");
      String _name_5 = r2.getName();
      _builder.append(_name_5, "\t");
      _builder.append(", this);");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence createGettersSetters(final AssociativeEntityClass e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<ModelVariableDefinition> _attributes = e.getAttributes();
      for(final ModelVariableDefinition v : _attributes) {
        {
          if (((!(v instanceof ModelTypeCollectionVariableClass)) && (!(v instanceof SimpleTypeCollectionVariableClass)))) {
            _builder.append("public ");
            TypeCodeTransformation _instance = TypeCodeTransformation.getInstance();
            Map<String, String> _types = _instance.getTypes();
            String _variableType = v.getVariableType();
            String _get = _types.get(_variableType);
            _builder.append(_get, "");
            _builder.append(" get");
            String _variableName = v.getVariableName();
            String _upperFirst = StringUtils.toUpperFirst(_variableName);
            _builder.append(_upperFirst, "");
            _builder.append("() {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("return this.");
            String _variableName_1 = v.getVariableName();
            _builder.append(_variableName_1, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.newLine();
            _builder.append("public void set");
            String _variableName_2 = v.getVariableName();
            String _upperFirst_1 = StringUtils.toUpperFirst(_variableName_2);
            _builder.append(_upperFirst_1, "");
            _builder.append("(");
            TypeCodeTransformation _instance_1 = TypeCodeTransformation.getInstance();
            Map<String, String> _types_1 = _instance_1.getTypes();
            String _variableType_1 = v.getVariableType();
            String _get_1 = _types_1.get(_variableType_1);
            _builder.append(_get_1, "");
            _builder.append(" ");
            String _variableName_3 = v.getVariableName();
            _builder.append(_variableName_3, "");
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("this.");
            String _variableName_4 = v.getVariableName();
            _builder.append(_variableName_4, "\t");
            _builder.append(" = ");
            String _variableName_5 = v.getVariableName();
            _builder.append(_variableName_5, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
          } else {
            String _variableType_2 = v.getVariableType();
            String paramType = ModelUtils.getCollectionType(_variableType_2);
            _builder.newLineIfNotEmpty();
            String _variableType_3 = v.getVariableType();
            String _collectionType = ModelUtils.getCollectionType(_variableType_3);
            String param = StringUtils.toLowerFirst(_collectionType);
            _builder.newLineIfNotEmpty();
            _builder.append("public void add");
            String _variableName_6 = v.getVariableName();
            String _upperFirst_2 = StringUtils.toUpperFirst(_variableName_6);
            _builder.append(_upperFirst_2, "");
            _builder.append("(");
            _builder.append(paramType, "");
            _builder.append(" ");
            _builder.append(param, "");
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("this.");
            String _variableName_7 = v.getVariableName();
            _builder.append(_variableName_7, "\t");
            _builder.append(".add(");
            _builder.append(param, "\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
            _builder.append("public void remove");
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
            _builder.append(".remove(");
            _builder.append(param, "\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
            _builder.append("public ");
            String _variableType_4 = v.getVariableType();
            String _collection = ModelUtils.getCollection(_variableType_4);
            _builder.append(_collection, "");
            _builder.append("<");
            _builder.append(paramType, "");
            _builder.append("> get");
            String _variableName_10 = v.getVariableName();
            String _upperFirst_4 = StringUtils.toUpperFirst(_variableName_10);
            _builder.append(_upperFirst_4, "");
            _builder.append("() {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("return ");
            String _variableType_5 = v.getVariableType();
            String _collectionInitialize = ModelUtils.getCollectionInitialize(_variableType_5);
            _builder.append(_collectionInitialize, "\t");
            _builder.append("(");
            String _variableName_11 = v.getVariableName();
            _builder.append(_variableName_11, "\t");
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
  
  public CharSequence createHashCodeEquals(final AssociativeEntityClass e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public int hashCode() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return Objects.hash(");
    {
      List<RelationClass> _relations = e.getRelations();
      for(final RelationClass r : _relations) {
        String _name = r.getName();
        _builder.append(_name, "\t");
        {
          List<RelationClass> _relations_1 = e.getRelations();
          List<RelationClass> _relations_2 = e.getRelations();
          int _size = _relations_2.size();
          int _minus = (_size - 1);
          RelationClass _get = _relations_1.get(_minus);
          boolean _equals = r.equals(_get);
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
      List<RelationClass> _relations_3 = e.getRelations();
      for(final RelationClass r_1 : _relations_3) {
        String _name_1 = r_1.getName();
        _builder.append(_name_1, "\t");
        _builder.append(", other.");
        String _name_2 = r_1.getName();
        _builder.append(_name_2, "\t");
        {
          List<RelationClass> _relations_4 = e.getRelations();
          List<RelationClass> _relations_5 = e.getRelations();
          int _size_1 = _relations_5.size();
          int _minus_1 = (_size_1 - 1);
          RelationClass _get_1 = _relations_4.get(_minus_1);
          boolean _equals_1 = r_1.equals(_get_1);
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
  
  public CharSequence createToString(final AssociativeEntityClass e) {
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
      List<RelationClass> _relations = e.getRelations();
      for(final RelationClass r : _relations) {
        String _name = r.getName();
        _builder.append(_name, "\t");
        _builder.append("=\" + ");
        String _name_1 = r.getName();
        _builder.append(_name_1, "\t");
        _builder.append(" + \"");
        {
          if (((!r.equals(e.getRelations().get((e.getRelations().size() - 1)))) || (!e.getAttributes().isEmpty()))) {
            _builder.append(", ");
          }
        }
      }
    }
    {
      List<ModelVariableDefinition> _attributes = e.getAttributes();
      for(final ModelVariableDefinition v : _attributes) {
        String _variableName = v.getVariableName();
        _builder.append(_variableName, "\t");
        _builder.append("=\" + ");
        String _variableName_1 = v.getVariableName();
        _builder.append(_variableName_1, "\t");
        _builder.append(" + \"");
        {
          List<ModelVariableDefinition> _attributes_1 = e.getAttributes();
          List<ModelVariableDefinition> _attributes_2 = e.getAttributes();
          int _size = _attributes_2.size();
          int _minus = (_size - 1);
          ModelVariableDefinition _get = _attributes_1.get(_minus);
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
    _builder.append("}\t\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createMethods(final AssociativeEntityClass e) {
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
  
  public CharSequence createEntityLinkMaintenanceRelations(final AssociativeEntityClass e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<RelationClass> _relations = e.getRelations();
      for(final RelationClass r : _relations) {
        _builder.append("void _set");
        String _name = r.getName();
        String _upperFirst = StringUtils.toUpperFirst(_name);
        _builder.append(_upperFirst, "");
        _builder.append("(");
        ModelEntity _type = r.getType();
        String _entityName = _type.getEntityName();
        String _upperFirst_1 = StringUtils.toUpperFirst(_entityName);
        _builder.append(_upperFirst_1, "");
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
        String _upperFirst_2 = StringUtils.toUpperFirst(_entityName_1);
        _builder.append(_upperFirst_2, "");
        _builder.append(" get");
        String _name_4 = r.getName();
        String _upperFirst_3 = StringUtils.toUpperFirst(_name_4);
        _builder.append(_upperFirst_3, "");
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
  
  public CharSequence createAssociativeMaintenanceRelations(final List<AssociativeEntityClass> associativeEntities, final AssociativeEntityClass e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final AssociativeEntityClass l : associativeEntities) {
        List<RelationClass> _relations = l.getRelations();
        RelationClass _otherRelationFromLink = ModelUtils.getOtherRelationFromLink(_relations, e);
        String otherRel = _otherRelationFromLink.getMultiplicity();
        _builder.newLineIfNotEmpty();
        String className = l.getName();
        _builder.newLineIfNotEmpty();
        {
          boolean _contains = otherRel.contains("one");
          if (_contains) {
            _builder.append("void _set");
            _builder.append(className, "");
            _builder.append("(");
            _builder.append(className, "");
            _builder.append(" ");
            String _lowerFirst = StringUtils.toLowerFirst(className);
            _builder.append(_lowerFirst, "");
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("this.");
            String _lowerFirst_1 = StringUtils.toLowerFirst(className);
            _builder.append(_lowerFirst_1, "\t");
            _builder.append(" = ");
            String _lowerFirst_2 = StringUtils.toLowerFirst(className);
            _builder.append(_lowerFirst_2, "\t");
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
            String _lowerFirst_3 = StringUtils.toLowerFirst(className);
            _builder.append(_lowerFirst_3, "\t");
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
            String _lowerFirst_4 = StringUtils.toLowerFirst(className);
            _builder.append(_lowerFirst_4, "\t");
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
            String _lowerFirst_5 = StringUtils.toLowerFirst(className);
            _builder.append(_lowerFirst_5, "\t");
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
}
