package uo.diesels.model.generator.model;

import com.google.common.collect.Iterables;
import java.util.Date;
import java.util.List;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import uo.diesels.model.generator.model.util.ModelEntity;
import uo.diesels.model.generator.model.util.classes.RelationClass;
import uo.diesels.model.generator.model.util.elements.AssociativeEntityClass;
import uo.diesels.model.generator.model.util.elements.SimpleLinkClass;
import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.generator.util.PackageConstants;
import uo.diesels.model.generator.util.PathConstants;
import uo.diesels.model.generator.util.StringUtils;
import uo.diesels.model.modelDsl.AssociativeEntity;
import uo.diesels.model.modelDsl.SimpleLink;

@SuppressWarnings("all")
public class AssociationsGenerator {
  private Resource resource;
  
  private IFileSystemAccess fsa;
  
  private String project;
  
  public AssociationsGenerator(final Resource resource, final IFileSystemAccess fsa, final String project) {
    this.resource = resource;
    this.fsa = fsa;
    this.project = project;
  }
  
  public void compile() {
    StringBuilder sb = new StringBuilder();
    CharSequence _createPackageDeclaration = this.createPackageDeclaration();
    sb.append(_createPackageDeclaration);
    String _newLine = StringUtils.newLine();
    sb.append(_newLine);
    CharSequence _createImportDeclarations = this.createImportDeclarations();
    sb.append(_createImportDeclarations);
    String _newLine_1 = StringUtils.newLine();
    sb.append(_newLine_1);
    CharSequence _createClassDeclaration = this.createClassDeclaration();
    sb.append(_createClassDeclaration);
    String _newLine_2 = StringUtils.newLine();
    sb.append(_newLine_2);
    TreeIterator<EObject> _allContents = this.resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<SimpleLink> _filter = Iterables.<SimpleLink>filter(_iterable, SimpleLink.class);
    for (final SimpleLink link : _filter) {
      {
        SimpleLinkClass l = new SimpleLinkClass(link);
        CharSequence _createBinaryRelation = this.createBinaryRelation(l);
        String _plus = ("\t" + _createBinaryRelation);
        sb.append(_plus);
      }
    }
    TreeIterator<EObject> _allContents_1 = this.resource.getAllContents();
    Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_allContents_1);
    Iterable<AssociativeEntity> _filter_1 = Iterables.<AssociativeEntity>filter(_iterable_1, AssociativeEntity.class);
    for (final AssociativeEntity associativeEntity : _filter_1) {
      {
        AssociativeEntityClass e = new AssociativeEntityClass(associativeEntity);
        CharSequence _createAssociativeBinaryRelation = this.createAssociativeBinaryRelation(e);
        String _plus = ("\t" + _createAssociativeBinaryRelation);
        sb.append(_plus);
      }
    }
    sb.append("}");
    String associationsPath = String.format(PathConstants.MODEL_ASSOCIATIONS_CLASS_PATH, this.project);
    String _string = sb.toString();
    this.fsa.generateFile(associationsPath, _string);
  }
  
  public CharSequence createPackageDeclaration() {
    StringConcatenation _builder = new StringConcatenation();
    String _remplaceSlashToDot = StringUtils.remplaceSlashToDot(this.project);
    String _format = String.format(PackageConstants.MODEL_PACKAGE, _remplaceSlashToDot);
    _builder.append(_format, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createImportDeclarations() {
    StringConcatenation _builder = new StringConcatenation();
    String _format = String.format(ImportConstants.GENERATED_ANNOTATION_IMPORT);
    _builder.append(_format, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createClassDeclaration() {
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
    _builder.append("public class Associations {");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createBinaryRelation(final SimpleLinkClass e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public static class ");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    List<RelationClass> _relations = e.getRelations();
    CharSequence _createBinaryLinkMethod = this.createBinaryLinkMethod(_relations);
    _builder.append(_createBinaryLinkMethod, "\t    ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t    ");
    List<RelationClass> _relations_1 = e.getRelations();
    CharSequence _createBinaryUnlinkMethod = this.createBinaryUnlinkMethod(_relations_1);
    _builder.append(_createBinaryUnlinkMethod, "\t    ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createBinaryLinkMethod(final List<RelationClass> relations) {
    CharSequence _xblockexpression = null;
    {
      RelationClass r1 = relations.get(0);
      RelationClass r2 = relations.get(1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public static void link(");
      {
        for(final RelationClass r : relations) {
          ModelEntity _type = r.getType();
          String _entityName = _type.getEntityName();
          _builder.append(_entityName, "");
          _builder.append(" ");
          String _name = r.getName();
          _builder.append(_name, "");
          {
            int _size = relations.size();
            int _minus = (_size - 1);
            RelationClass _get = relations.get(_minus);
            boolean _equals = r.equals(_get);
            boolean _not = (!_equals);
            if (_not) {
              _builder.append(", ");
            }
          }
        }
      }
      _builder.append(") {");
      _builder.newLineIfNotEmpty();
      {
        boolean _isNavigable = r1.isNavigable();
        if (_isNavigable) {
          {
            String _multiplicity = r1.getMultiplicity();
            boolean _contains = _multiplicity.contains("one");
            if (_contains) {
              _builder.append("\t");
              String _name_1 = r2.getName();
              _builder.append(_name_1, "\t");
              _builder.append("._set");
              String _name_2 = r1.getName();
              String _upperFirst = StringUtils.toUpperFirst(_name_2);
              _builder.append(_upperFirst, "\t");
              _builder.append("(");
              String _name_3 = r1.getName();
              String _lowerFirst = StringUtils.toLowerFirst(_name_3);
              _builder.append(_lowerFirst, "\t");
              _builder.append(");\t\t\t\t\t");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("\t");
              String _name_4 = r2.getName();
              _builder.append(_name_4, "\t");
              _builder.append("._get");
              String _name_5 = r1.getName();
              String _upperFirst_1 = StringUtils.toUpperFirst(_name_5);
              _builder.append(_upperFirst_1, "\t");
              _builder.append("().add(");
              String _name_6 = r1.getName();
              String _lowerFirst_1 = StringUtils.toLowerFirst(_name_6);
              _builder.append(_lowerFirst_1, "\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      {
        boolean _isNavigable_1 = r2.isNavigable();
        if (_isNavigable_1) {
          {
            String _multiplicity_1 = r2.getMultiplicity();
            boolean _contains_1 = _multiplicity_1.contains("one");
            if (_contains_1) {
              _builder.append("\t");
              String _name_7 = r1.getName();
              _builder.append(_name_7, "\t");
              _builder.append("._set");
              String _name_8 = r2.getName();
              String _upperFirst_2 = StringUtils.toUpperFirst(_name_8);
              _builder.append(_upperFirst_2, "\t");
              _builder.append("(");
              String _name_9 = r2.getName();
              String _lowerFirst_2 = StringUtils.toLowerFirst(_name_9);
              _builder.append(_lowerFirst_2, "\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("\t");
              String _name_10 = r1.getName();
              _builder.append(_name_10, "\t");
              _builder.append("._get");
              String _name_11 = r2.getName();
              String _upperFirst_3 = StringUtils.toUpperFirst(_name_11);
              _builder.append(_upperFirst_3, "\t");
              _builder.append("().add(");
              String _name_12 = r2.getName();
              String _lowerFirst_3 = StringUtils.toLowerFirst(_name_12);
              _builder.append(_lowerFirst_3, "\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence createBinaryUnlinkMethod(final List<RelationClass> relations) {
    CharSequence _xblockexpression = null;
    {
      RelationClass r1 = relations.get(0);
      RelationClass r2 = relations.get(1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public static void unlink(");
      {
        for(final RelationClass r : relations) {
          ModelEntity _type = r.getType();
          String _entityName = _type.getEntityName();
          _builder.append(_entityName, "");
          _builder.append(" ");
          String _name = r.getName();
          _builder.append(_name, "");
          {
            int _size = relations.size();
            int _minus = (_size - 1);
            RelationClass _get = relations.get(_minus);
            boolean _equals = r.equals(_get);
            boolean _not = (!_equals);
            if (_not) {
              _builder.append(", ");
            }
          }
        }
      }
      _builder.append(") {");
      _builder.newLineIfNotEmpty();
      {
        boolean _isNavigable = r2.isNavigable();
        if (_isNavigable) {
          {
            if ((r2.getMultiplicity().equals("many") || r2.getMultiplicity().equals("one-many"))) {
              _builder.append("\t");
              String _name_1 = r1.getName();
              _builder.append(_name_1, "\t");
              _builder.append("._get");
              String _name_2 = r2.getName();
              String _upperFirst = StringUtils.toUpperFirst(_name_2);
              _builder.append(_upperFirst, "\t");
              _builder.append("().remove(");
              String _name_3 = r2.getName();
              String _lowerFirst = StringUtils.toLowerFirst(_name_3);
              _builder.append(_lowerFirst, "\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("\t");
              String _name_4 = r1.getName();
              _builder.append(_name_4, "\t");
              _builder.append("._set");
              String _name_5 = r2.getName();
              String _upperFirst_1 = StringUtils.toUpperFirst(_name_5);
              _builder.append(_upperFirst_1, "\t");
              _builder.append("(null);");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      {
        boolean _isNavigable_1 = r1.isNavigable();
        if (_isNavigable_1) {
          {
            if ((r1.getMultiplicity().equals("many") || r1.getMultiplicity().equals("one-many"))) {
              _builder.append("\t");
              String _name_6 = r2.getName();
              _builder.append(_name_6, "\t");
              _builder.append("._get");
              String _name_7 = r1.getName();
              String _upperFirst_2 = StringUtils.toUpperFirst(_name_7);
              _builder.append(_upperFirst_2, "\t");
              _builder.append("().remove(");
              String _name_8 = r1.getName();
              String _lowerFirst_1 = StringUtils.toLowerFirst(_name_8);
              _builder.append(_lowerFirst_1, "\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("\t");
              String _name_9 = r2.getName();
              _builder.append(_name_9, "\t");
              _builder.append("._set");
              String _name_10 = r1.getName();
              String _upperFirst_3 = StringUtils.toUpperFirst(_name_10);
              _builder.append(_upperFirst_3, "\t");
              _builder.append("(null);");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  /**
   * Para relaciones establecidas por clases asociativas
   */
  public CharSequence createAssociativeBinaryRelation(final AssociativeEntityClass e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public static class ");
    String _name = e.getName();
    String _plus = (_name + "Link");
    _builder.append(_plus, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    List<RelationClass> _relations = e.getRelations();
    String _name_1 = e.getName();
    CharSequence _createAssociativeBinaryLinkMethod = this.createAssociativeBinaryLinkMethod(_relations, _name_1);
    _builder.append(_createAssociativeBinaryLinkMethod, "\t    ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t    ");
    List<RelationClass> _relations_1 = e.getRelations();
    String _name_2 = e.getName();
    CharSequence _createAssociativeBinaryUnlinkMethod = this.createAssociativeBinaryUnlinkMethod(_relations_1, _name_2);
    _builder.append(_createAssociativeBinaryUnlinkMethod, "\t    ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createAssociativeBinaryLinkMethod(final List<RelationClass> relations, final String className) {
    CharSequence _xblockexpression = null;
    {
      RelationClass r1 = relations.get(0);
      RelationClass r2 = relations.get(1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public static void link(");
      {
        for(final RelationClass r : relations) {
          ModelEntity _type = r.getType();
          String _entityName = _type.getEntityName();
          _builder.append(_entityName, "");
          _builder.append(" ");
          String _name = r.getName();
          _builder.append(_name, "");
          _builder.append(", ");
        }
      }
      _builder.append(className, "");
      _builder.append(" ");
      String _lowerFirst = StringUtils.toLowerFirst(className);
      _builder.append(_lowerFirst, "");
      _builder.append(") {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      String _lowerFirst_1 = StringUtils.toLowerFirst(className);
      _builder.append(_lowerFirst_1, "\t");
      _builder.append("._set");
      String _name_1 = r1.getName();
      String _upperFirst = StringUtils.toUpperFirst(_name_1);
      _builder.append(_upperFirst, "\t");
      _builder.append("(");
      String _name_2 = r1.getName();
      _builder.append(_name_2, "\t");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      String _lowerFirst_2 = StringUtils.toLowerFirst(className);
      _builder.append(_lowerFirst_2, "\t");
      _builder.append("._set");
      String _name_3 = r2.getName();
      String _upperFirst_1 = StringUtils.toUpperFirst(_name_3);
      _builder.append(_upperFirst_1, "\t");
      _builder.append("(");
      String _name_4 = r2.getName();
      _builder.append(_name_4, "\t");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      {
        String _multiplicity = r2.getMultiplicity();
        boolean _contains = _multiplicity.contains("one");
        if (_contains) {
          _builder.append("\t");
          String _name_5 = r1.getName();
          _builder.append(_name_5, "\t");
          _builder.append("._set");
          _builder.append(className, "\t");
          _builder.append("(");
          String _lowerFirst_3 = StringUtils.toLowerFirst(className);
          _builder.append(_lowerFirst_3, "\t");
          _builder.append(");\t\t\t\t\t");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("\t");
          String _name_6 = r1.getName();
          _builder.append(_name_6, "\t");
          _builder.append("._get");
          _builder.append(className, "\t");
          _builder.append("().add(");
          String _lowerFirst_4 = StringUtils.toLowerFirst(className);
          _builder.append(_lowerFirst_4, "\t");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        String _multiplicity_1 = r1.getMultiplicity();
        boolean _contains_1 = _multiplicity_1.contains("one");
        if (_contains_1) {
          _builder.append("\t");
          String _name_7 = r2.getName();
          _builder.append(_name_7, "\t");
          _builder.append("._set");
          _builder.append(className, "\t");
          _builder.append("(");
          String _lowerFirst_5 = StringUtils.toLowerFirst(className);
          _builder.append(_lowerFirst_5, "\t");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("\t");
          String _name_8 = r2.getName();
          _builder.append(_name_8, "\t");
          _builder.append("._get");
          _builder.append(className, "\t");
          _builder.append("().add(");
          String _lowerFirst_6 = StringUtils.toLowerFirst(className);
          _builder.append(_lowerFirst_6, "\t");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence createAssociativeBinaryUnlinkMethod(final List<RelationClass> relations, final String className) {
    CharSequence _xblockexpression = null;
    {
      RelationClass r1 = relations.get(0);
      RelationClass r2 = relations.get(1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public static void unlink(");
      {
        for(final RelationClass r : relations) {
          ModelEntity _type = r.getType();
          String _entityName = _type.getEntityName();
          _builder.append(_entityName, "");
          _builder.append(" ");
          String _name = r.getName();
          _builder.append(_name, "");
          _builder.append(", ");
        }
      }
      _builder.append(className, "");
      _builder.append(" ");
      String _lowerFirst = StringUtils.toLowerFirst(className);
      _builder.append(_lowerFirst, "");
      _builder.append(") {");
      _builder.newLineIfNotEmpty();
      {
        if ((r2.getMultiplicity().equals("many") || r2.getMultiplicity().equals("one-many"))) {
          _builder.append("\t");
          String _name_1 = r1.getName();
          _builder.append(_name_1, "\t");
          _builder.append("._get");
          _builder.append(className, "\t");
          _builder.append("().remove(");
          String _lowerFirst_1 = StringUtils.toLowerFirst(className);
          _builder.append(_lowerFirst_1, "\t");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("\t");
          String _name_2 = r1.getName();
          _builder.append(_name_2, "\t");
          _builder.append("._set");
          _builder.append(className, "\t");
          _builder.append("(null);");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        if ((r1.getMultiplicity().equals("many") || r1.getMultiplicity().equals("one-many"))) {
          _builder.append("\t");
          String _name_3 = r2.getName();
          _builder.append(_name_3, "\t");
          _builder.append("._get");
          _builder.append(className, "\t");
          _builder.append("().remove(");
          String _lowerFirst_2 = StringUtils.toLowerFirst(className);
          _builder.append(_lowerFirst_2, "\t");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("\t");
          String _name_4 = r2.getName();
          _builder.append(_name_4, "\t");
          _builder.append("._set");
          _builder.append(className, "\t");
          _builder.append("(null);");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      String _lowerFirst_3 = StringUtils.toLowerFirst(className);
      _builder.append(_lowerFirst_3, "\t");
      _builder.append("._set");
      String _name_5 = r1.getName();
      String _upperFirst = StringUtils.toUpperFirst(_name_5);
      _builder.append(_upperFirst, "\t");
      _builder.append("(null);");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      String _lowerFirst_4 = StringUtils.toLowerFirst(className);
      _builder.append(_lowerFirst_4, "\t");
      _builder.append("._set");
      String _name_6 = r2.getName();
      String _upperFirst_1 = StringUtils.toUpperFirst(_name_6);
      _builder.append(_upperFirst_1, "\t");
      _builder.append("(null);");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
