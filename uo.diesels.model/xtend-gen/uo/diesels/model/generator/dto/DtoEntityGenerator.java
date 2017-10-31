package uo.diesels.model.generator.dto;

import com.google.common.collect.Iterables;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import uo.diesels.model.dtoDsl.DtoEntity;
import uo.diesels.model.generator.common.util.TypeCodeTransformation;
import uo.diesels.model.generator.dto.util.DtoVariableDefinition;
import uo.diesels.model.generator.dto.util.elements.DtoEntityClass;
import uo.diesels.model.generator.util.PackageConstants;
import uo.diesels.model.generator.util.PathConstants;
import uo.diesels.model.generator.util.StringUtils;

@SuppressWarnings("all")
public class DtoEntityGenerator {
  private Resource resource;
  
  private IFileSystemAccess fsa;
  
  private String project;
  
  public DtoEntityGenerator(final Resource resource, final IFileSystemAccess fsa, final String project) {
    this.resource = resource;
    this.fsa = fsa;
    this.project = project;
  }
  
  public void compile() {
    TreeIterator<EObject> _allContents = this.resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<DtoEntity> _filter = Iterables.<DtoEntity>filter(_iterable, DtoEntity.class);
    for (final DtoEntity dto : _filter) {
      {
        DtoEntityClass d = new DtoEntityClass(dto);
        StringBuilder sb = new StringBuilder();
        CharSequence _compileText = this.compileText(d);
        sb.append(_compileText);
        String _name = d.getName();
        String dtoPath = String.format(PathConstants.DTO_PATH, this.project, _name);
        String _string = sb.toString();
        this.fsa.generateFile(dtoPath, _string);
      }
    }
  }
  
  public CharSequence compileText(final DtoEntityClass d) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _createPackageDeclaration = this.createPackageDeclaration();
    _builder.append(_createPackageDeclaration, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _createImportDeclarations = this.createImportDeclarations(d);
    _builder.append(_createImportDeclarations, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _createClassDeclaration = this.createClassDeclaration(d);
    _builder.append(_createClassDeclaration, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _createSerialVersionDeclaration = this.createSerialVersionDeclaration();
    _builder.append(_createSerialVersionDeclaration, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    CharSequence _createAttributeDeclarations = this.createAttributeDeclarations(d);
    _builder.append(_createAttributeDeclarations, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _createEmptyConstructor = this.createEmptyConstructor(d);
    _builder.append(_createEmptyConstructor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _createDefaultConstructor = this.createDefaultConstructor(d);
    _builder.append(_createDefaultConstructor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _createGettersSetters = this.createGettersSetters(d);
    _builder.append(_createGettersSetters, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _createHashCodeEquals = this.createHashCodeEquals(d);
    _builder.append(_createHashCodeEquals, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _createToString = this.createToString(d);
    _builder.append(_createToString, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createPackageDeclaration() {
    StringConcatenation _builder = new StringConcatenation();
    String _remplaceSlashToDot = StringUtils.remplaceSlashToDot(this.project);
    String _format = String.format(PackageConstants.DTO_PACKAGE, _remplaceSlashToDot);
    _builder.append(_format, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createImportDeclarations(final DtoEntityClass d) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _remplaceSlashToDot = StringUtils.remplaceSlashToDot(this.project);
      Set<String> _imports = d.getImports(_remplaceSlashToDot);
      for(final String i : _imports) {
        _builder.append(i, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence createClassDeclaration(final DtoEntityClass d) {
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
    String _name = d.getName();
    _builder.append(_name, "");
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
  
  public CharSequence createEmptyConstructor(final DtoEntityClass d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _name = d.getName();
    _builder.append(_name, "");
    _builder.append("() {}");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createDefaultConstructor(final DtoEntityClass d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _name = d.getName();
    _builder.append(_name, "");
    _builder.append("(");
    {
      List<DtoVariableDefinition> _attributes = d.getAttributes();
      for(final DtoVariableDefinition v : _attributes) {
        TypeCodeTransformation _instance = TypeCodeTransformation.getInstance();
        String _variableType = v.getVariableType();
        String _typeFor = _instance.getTypeFor(_variableType);
        _builder.append(_typeFor, "");
        _builder.append(" ");
        String _variableName = v.getVariableName();
        _builder.append(_variableName, "");
        {
          List<DtoVariableDefinition> _attributes_1 = d.getAttributes();
          List<DtoVariableDefinition> _attributes_2 = d.getAttributes();
          int _size = _attributes_2.size();
          int _minus = (_size - 1);
          DtoVariableDefinition _get = _attributes_1.get(_minus);
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
    {
      List<DtoVariableDefinition> _attributes_3 = d.getAttributes();
      for(final DtoVariableDefinition v_1 : _attributes_3) {
        _builder.append("\t");
        _builder.append("this.");
        String _variableName_1 = v_1.getVariableName();
        _builder.append(_variableName_1, "\t");
        _builder.append(" = ");
        String _variableName_2 = v_1.getVariableName();
        _builder.append(_variableName_2, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createAttributeDeclarations(final DtoEntityClass d) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<DtoVariableDefinition> _attributes = d.getAttributes();
      for(final DtoVariableDefinition a : _attributes) {
        _builder.append("private ");
        TypeCodeTransformation _instance = TypeCodeTransformation.getInstance();
        String _variableType = a.getVariableType();
        String _typeFor = _instance.getTypeFor(_variableType);
        _builder.append(_typeFor, "");
        _builder.append(" ");
        String _variableName = a.getVariableName();
        _builder.append(_variableName, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence createGettersSetters(final DtoEntityClass d) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<DtoVariableDefinition> _attributes = d.getAttributes();
      for(final DtoVariableDefinition a : _attributes) {
        _builder.append("public ");
        TypeCodeTransformation _instance = TypeCodeTransformation.getInstance();
        String _variableType = a.getVariableType();
        String _typeFor = _instance.getTypeFor(_variableType);
        _builder.append(_typeFor, "");
        _builder.append(" get");
        String _variableName = a.getVariableName();
        String _upperFirst = StringUtils.toUpperFirst(_variableName);
        _builder.append(_upperFirst, "");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return this.");
        String _variableName_1 = a.getVariableName();
        _builder.append(_variableName_1, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      List<DtoVariableDefinition> _attributes_1 = d.getAttributes();
      for(final DtoVariableDefinition a_1 : _attributes_1) {
        _builder.append("public void set");
        String _variableName_2 = a_1.getVariableName();
        String _upperFirst_1 = StringUtils.toUpperFirst(_variableName_2);
        _builder.append(_upperFirst_1, "");
        _builder.append("(");
        TypeCodeTransformation _instance_1 = TypeCodeTransformation.getInstance();
        String _variableType_1 = a_1.getVariableType();
        String _typeFor_1 = _instance_1.getTypeFor(_variableType_1);
        _builder.append(_typeFor_1, "");
        _builder.append(" ");
        String _variableName_3 = a_1.getVariableName();
        _builder.append(_variableName_3, "");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("this.");
        String _variableName_4 = a_1.getVariableName();
        _builder.append(_variableName_4, "\t");
        _builder.append(" = ");
        String _variableName_5 = a_1.getVariableName();
        _builder.append(_variableName_5, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence createHashCodeEquals(final DtoEntityClass d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public int hashCode() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return Objects.hash(");
    {
      List<DtoVariableDefinition> _attributes = d.getAttributes();
      for(final DtoVariableDefinition a : _attributes) {
        String _variableName = a.getVariableName();
        _builder.append(_variableName, "\t");
        {
          List<DtoVariableDefinition> _attributes_1 = d.getAttributes();
          List<DtoVariableDefinition> _attributes_2 = d.getAttributes();
          int _size = _attributes_2.size();
          int _minus = (_size - 1);
          DtoVariableDefinition _get = _attributes_1.get(_minus);
          boolean _equals = a.equals(_get);
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
    String _name = d.getName();
    _builder.append(_name, "\t");
    _builder.append(" other = (");
    String _name_1 = d.getName();
    _builder.append(_name_1, "\t");
    _builder.append(") obj;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return Objects.equals(");
    {
      List<DtoVariableDefinition> _attributes_3 = d.getAttributes();
      for(final DtoVariableDefinition a_1 : _attributes_3) {
        String _variableName_1 = a_1.getVariableName();
        _builder.append(_variableName_1, "\t");
        _builder.append(", other.");
        String _variableName_2 = a_1.getVariableName();
        _builder.append(_variableName_2, "\t");
        {
          List<DtoVariableDefinition> _attributes_4 = d.getAttributes();
          List<DtoVariableDefinition> _attributes_5 = d.getAttributes();
          int _size_1 = _attributes_5.size();
          int _minus_1 = (_size_1 - 1);
          DtoVariableDefinition _get_1 = _attributes_4.get(_minus_1);
          boolean _equals_1 = a_1.equals(_get_1);
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
  
  public CharSequence createToString(final DtoEntityClass d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public String toString() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return \"");
    String _name = d.getName();
    _builder.append(_name, "\t");
    _builder.append(" [");
    {
      List<DtoVariableDefinition> _attributes = d.getAttributes();
      for(final DtoVariableDefinition a : _attributes) {
        String _variableName = a.getVariableName();
        _builder.append(_variableName, "\t");
        _builder.append("=\" + ");
        String _variableName_1 = a.getVariableName();
        _builder.append(_variableName_1, "\t");
        _builder.append(" + \"");
        {
          List<DtoVariableDefinition> _attributes_1 = d.getAttributes();
          List<DtoVariableDefinition> _attributes_2 = d.getAttributes();
          int _size = _attributes_2.size();
          int _minus = (_size - 1);
          DtoVariableDefinition _get = _attributes_1.get(_minus);
          boolean _equals = a.equals(_get);
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
    return _builder;
  }
}
