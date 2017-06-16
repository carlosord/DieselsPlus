package uo.diesels.model.generator.model;

import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.generator.util.PackageConstants;
import uo.diesels.model.generator.util.PathConstants;
import uo.diesels.model.generator.util.StringUtils;
import uo.diesels.model.modelDsl.AssociativeEntity;
import uo.diesels.model.modelDsl.Entity;
import uo.diesels.model.modelDsl.Relation;
import uo.diesels.model.modelDsl.SimpleEntity;

@SuppressWarnings("all")
public class EntityLinkKeyGenerator {
  private Resource resource;
  
  private IFileSystemAccess fsa;
  
  private String project;
  
  private AssociativeEntity entity;
  
  public EntityLinkKeyGenerator(final Resource resource, final IFileSystemAccess fsa, final String project, final AssociativeEntity e) {
    this.resource = resource;
    this.fsa = fsa;
    this.project = project;
    this.entity = e;
  }
  
  public void compile() {
    StringBuilder sb = new StringBuilder();
    CharSequence _compileText = this.compileText(this.entity);
    sb.append(_compileText);
    String _name = this.entity.getName();
    String className = (_name + "Key");
    String keyPath = String.format(PathConstants.MODEL_KEY_PATH, this.project, className);
    String _string = sb.toString();
    this.fsa.generateFile(keyPath, _string);
  }
  
  public CharSequence compileText(final AssociativeEntity e) {
    CharSequence _xblockexpression = null;
    {
      String _name = e.getName();
      String className = (_name + "Key");
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _createPackageDeclaration = this.createPackageDeclaration();
      _builder.append(_createPackageDeclaration, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      CharSequence _createImportsDeclarations = this.createImportsDeclarations();
      _builder.append(_createImportsDeclarations, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      CharSequence _createClassDeclaration = this.createClassDeclaration(className);
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
      EList<Relation> _relations = e.getRelations();
      CharSequence _createIdsDeclaration = this.createIdsDeclaration(_relations);
      _builder.append(_createIdsDeclaration, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      EList<Relation> _relations_1 = e.getRelations();
      CharSequence _createDefaultConstructor = this.createDefaultConstructor(className, _relations_1);
      _builder.append(_createDefaultConstructor, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      EList<Relation> _relations_2 = e.getRelations();
      CharSequence _createHashCodeEquals = this.createHashCodeEquals(className, _relations_2);
      _builder.append(_createHashCodeEquals, "\t");
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
    String _format = String.format(PackageConstants.MODEL_KEY_PACKAGE, _remplaceSlashToDot);
    _builder.append(_format, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createImportsDeclarations() {
    StringConcatenation _builder = new StringConcatenation();
    String _format = String.format(ImportConstants.GENERATED_ANNOTATION_IMPORT);
    _builder.append(_format, "");
    _builder.newLineIfNotEmpty();
    String _format_1 = String.format(ImportConstants.SERIALIZABLE_IMPORT);
    _builder.append(_format_1, "");
    _builder.newLineIfNotEmpty();
    String _format_2 = String.format(ImportConstants.OBJECTS_IMPORT);
    _builder.append(_format_2, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createClassDeclaration(final String className) {
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
    _builder.append("public class ");
    _builder.append(className, "");
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
  
  public CharSequence createIdsDeclaration(final EList<Relation> relations) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Relation r : relations) {
        {
          Entity _type = r.getType();
          if ((_type instanceof SimpleEntity)) {
            _builder.append("Long ");
            String _name = r.getName();
            _builder.append(_name, "");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          } else {
            Entity _type_1 = r.getType();
            String _name_1 = _type_1.getName();
            _builder.append(_name_1, "");
            _builder.append("Key ");
            String _name_2 = r.getName();
            _builder.append(_name_2, "");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence createDefaultConstructor(final String className, final EList<Relation> relations) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    _builder.append(className, "");
    _builder.append("(");
    {
      for(final Relation r : relations) {
        {
          Entity _type = r.getType();
          if ((_type instanceof SimpleEntity)) {
            _builder.append("Long ");
            String _name = r.getName();
            _builder.append(_name, "");
          } else {
            Entity _type_1 = r.getType();
            String _name_1 = _type_1.getName();
            _builder.append(_name_1, "");
            _builder.append("Key ");
            String _name_2 = r.getName();
            _builder.append(_name_2, "");
          }
        }
        {
          int _size = relations.size();
          int _minus = (_size - 1);
          Relation _get = relations.get(_minus);
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
      for(final Relation r_1 : relations) {
        _builder.append("\t");
        _builder.append("this.");
        String _name_3 = r_1.getName();
        _builder.append(_name_3, "\t");
        _builder.append(" = ");
        String _name_4 = r_1.getName();
        _builder.append(_name_4, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createHashCodeEquals(final String className, final EList<Relation> relations) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public int hashCode() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return Objects.hash(");
    {
      for(final Relation r : relations) {
        String _name = r.getName();
        _builder.append(_name, "\t");
        {
          int _size = relations.size();
          int _minus = (_size - 1);
          Relation _get = relations.get(_minus);
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
    _builder.append(className, "\t");
    _builder.append(" other = (");
    _builder.append(className, "\t");
    _builder.append(") obj;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return Objects.equals(");
    {
      for(final Relation r_1 : relations) {
        String _name_1 = r_1.getName();
        _builder.append(_name_1, "\t");
        _builder.append(", other.");
        String _name_2 = r_1.getName();
        _builder.append(_name_2, "\t");
        {
          int _size_1 = relations.size();
          int _minus_1 = (_size_1 - 1);
          Relation _get_1 = relations.get(_minus_1);
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
}
