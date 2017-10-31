package uo.diesels.model.generator.model;

import com.google.common.collect.Iterables;
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
import uo.diesels.model.generator.model.util.ModelVariableDefinition;
import uo.diesels.model.generator.model.util.classes.variables.ModelTypeCollectionVariableClass;
import uo.diesels.model.generator.model.util.classes.variables.SimpleTypeCollectionVariableClass;
import uo.diesels.model.generator.model.util.elements.ValueTypeClass;
import uo.diesels.model.generator.model.util.util.JPAAnnotations;
import uo.diesels.model.generator.model.util.util.ModelUtils;
import uo.diesels.model.generator.util.PackageConstants;
import uo.diesels.model.generator.util.PathConstants;
import uo.diesels.model.generator.util.StringUtils;
import uo.diesels.model.modelDsl.ValueType;

@SuppressWarnings("all")
public class ValueTypeGenerator {
  private Resource resource;
  
  private IFileSystemAccess fsa;
  
  private String project;
  
  public ValueTypeGenerator(final Resource resource, final IFileSystemAccess fsa, final String project) {
    this.resource = resource;
    this.fsa = fsa;
    this.project = project;
  }
  
  public void compile() {
    TreeIterator<EObject> _allContents = this.resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<ValueType> _filter = Iterables.<ValueType>filter(_iterable, ValueType.class);
    for (final ValueType valueType : _filter) {
      {
        ValueTypeClass v = new ValueTypeClass(valueType);
        StringBuilder sb = new StringBuilder();
        CharSequence _compileText = this.compileText(v);
        sb.append(_compileText);
        String _name = v.getName();
        String valueTypePath = String.format(PathConstants.MODEL_VALUE_TYPE_PATH, this.project, _name);
        String _string = sb.toString();
        this.fsa.generateFile(valueTypePath, _string);
      }
    }
  }
  
  public CharSequence compileText(final ValueTypeClass v) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _createPackageDeclaration = this.createPackageDeclaration();
    _builder.append(_createPackageDeclaration, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    CharSequence _createImportsDeclarations = this.createImportsDeclarations(v);
    _builder.append(_createImportsDeclarations, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    CharSequence _createClassDeclaration = this.createClassDeclaration(v);
    _builder.append(_createClassDeclaration, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _createSerialVersionDeclaration = this.createSerialVersionDeclaration();
    _builder.append(_createSerialVersionDeclaration, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    CharSequence _createAtributteDeclarations = this.createAtributteDeclarations(v);
    _builder.append(_createAtributteDeclarations, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _createEmptyConstructor = this.createEmptyConstructor(v);
    _builder.append(_createEmptyConstructor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _createDefaultConstructor = this.createDefaultConstructor(v);
    _builder.append(_createDefaultConstructor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _createGettersSetters = this.createGettersSetters(v);
    _builder.append(_createGettersSetters, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _createHashCodeEquals = this.createHashCodeEquals(v);
    _builder.append(_createHashCodeEquals, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _createToString = this.createToString(v);
    _builder.append(_createToString, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createPackageDeclaration() {
    StringConcatenation _builder = new StringConcatenation();
    String _remplaceSlashToDot = StringUtils.remplaceSlashToDot(this.project);
    String _format = String.format(PackageConstants.MODEL_VALUE_TYPE_PACKAGE, _remplaceSlashToDot);
    _builder.append(_format, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createImportsDeclarations(final ValueTypeClass value) {
    CharSequence _xblockexpression = null;
    {
      String _remplaceSlashToDot = StringUtils.remplaceSlashToDot(this.project);
      Set<String> _imports = value.getImports(_remplaceSlashToDot);
      HashSet<String> imports = new HashSet<String>(_imports);
      List<ModelVariableDefinition> _attributes = value.getAttributes();
      for (final ModelVariableDefinition v : _attributes) {
        Object _variableTypeClass = v.getVariableTypeClass();
        if ((_variableTypeClass instanceof ValueType)) {
          if ((ModelUtils.containsOtherValueTypeLike(value.getAttributes(), v) || v.isNullable())) {
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
  
  public CharSequence createClassDeclaration(final ValueTypeClass v) {
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
    String _annotations = v.getAnnotations();
    _builder.append(_annotations, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    String _name = v.getName();
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
  
  public CharSequence createAtributteDeclarations(final ValueTypeClass value) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<ModelVariableDefinition> _attributes = value.getAttributes();
      for(final ModelVariableDefinition v : _attributes) {
        String _annotations = v.getAnnotations();
        _builder.append(_annotations, "");
        _builder.newLineIfNotEmpty();
        {
          Object _variableTypeClass = v.getVariableTypeClass();
          if ((_variableTypeClass instanceof ValueType)) {
            {
              List<ModelVariableDefinition> _attributes_1 = value.getAttributes();
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
        String _variableType = v.getVariableType();
        String _typeFor = _instance_2.getTypeFor(_variableType);
        _builder.append(_typeFor, "");
        _builder.append(" ");
        String _variableName_1 = v.getVariableName();
        _builder.append(_variableName_1, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence createEmptyConstructor(final ValueTypeClass v) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _name = v.getName();
    _builder.append(_name, "");
    _builder.append("() {}");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createDefaultConstructor(final ValueTypeClass value) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _name = value.getName();
    _builder.append(_name, "");
    _builder.append("(");
    {
      List<ModelVariableDefinition> _attributes = value.getAttributes();
      for(final ModelVariableDefinition v : _attributes) {
        TypeCodeTransformation _instance = TypeCodeTransformation.getInstance();
        String _variableType = v.getVariableType();
        String _typeFor = _instance.getTypeFor(_variableType);
        _builder.append(_typeFor, "");
        _builder.append(" ");
        String _variableName = v.getVariableName();
        _builder.append(_variableName, "");
        {
          List<ModelVariableDefinition> _attributes_1 = value.getAttributes();
          List<ModelVariableDefinition> _attributes_2 = value.getAttributes();
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
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    {
      List<ModelVariableDefinition> _attributes_3 = value.getAttributes();
      for(final ModelVariableDefinition v_1 : _attributes_3) {
        {
          if (((!(v_1 instanceof ModelTypeCollectionVariableClass)) && (!(v_1 instanceof SimpleTypeCollectionVariableClass)))) {
            _builder.append("\t");
            _builder.append("this.");
            String _variableName_1 = v_1.getVariableName();
            _builder.append(_variableName_1, "\t");
            _builder.append(" = ");
            String _variableName_2 = v_1.getVariableName();
            _builder.append(_variableName_2, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            _builder.append("this.");
            String _variableName_3 = v_1.getVariableName();
            _builder.append(_variableName_3, "\t");
            _builder.append(" = ");
            String _variableType_1 = v_1.getVariableType();
            String _collectionInitialize = ModelUtils.getCollectionInitialize(_variableType_1);
            _builder.append(_collectionInitialize, "\t");
            _builder.append("(");
            String _variableName_4 = v_1.getVariableName();
            _builder.append(_variableName_4, "\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createGettersSetters(final ValueTypeClass value) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<ModelVariableDefinition> _attributes = value.getAttributes();
      for(final ModelVariableDefinition v : _attributes) {
        _builder.append("public ");
        TypeCodeTransformation _instance = TypeCodeTransformation.getInstance();
        String _variableType = v.getVariableType();
        String _typeFor = _instance.getTypeFor(_variableType);
        _builder.append(_typeFor, "");
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
        _builder.newLine();
      }
    }
    {
      List<ModelVariableDefinition> _attributes_1 = value.getAttributes();
      for(final ModelVariableDefinition v_1 : _attributes_1) {
        _builder.append("public void set");
        String _variableName_2 = v_1.getVariableName();
        String _upperFirst_1 = StringUtils.toUpperFirst(_variableName_2);
        _builder.append(_upperFirst_1, "");
        _builder.append("(");
        TypeCodeTransformation _instance_1 = TypeCodeTransformation.getInstance();
        String _variableType_1 = v_1.getVariableType();
        String _typeFor_1 = _instance_1.getTypeFor(_variableType_1);
        _builder.append(_typeFor_1, "");
        _builder.append(" ");
        String _variableName_3 = v_1.getVariableName();
        _builder.append(_variableName_3, "");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("this.");
        String _variableName_4 = v_1.getVariableName();
        _builder.append(_variableName_4, "\t");
        _builder.append(" = ");
        String _variableName_5 = v_1.getVariableName();
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
  
  public CharSequence createHashCodeEquals(final ValueTypeClass value) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public int hashCode() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return Objects.hash(");
    {
      List<ModelVariableDefinition> _attributes = value.getAttributes();
      for(final ModelVariableDefinition v : _attributes) {
        String _variableName = v.getVariableName();
        _builder.append(_variableName, "\t");
        {
          List<ModelVariableDefinition> _attributes_1 = value.getAttributes();
          List<ModelVariableDefinition> _attributes_2 = value.getAttributes();
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
    String _name = value.getName();
    _builder.append(_name, "\t");
    _builder.append(" other = (");
    String _name_1 = value.getName();
    _builder.append(_name_1, "\t");
    _builder.append(") obj;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return Objects.equals(");
    {
      List<ModelVariableDefinition> _attributes_3 = value.getAttributes();
      for(final ModelVariableDefinition v_1 : _attributes_3) {
        String _variableName_1 = v_1.getVariableName();
        _builder.append(_variableName_1, "\t");
        _builder.append(", other.");
        String _variableName_2 = v_1.getVariableName();
        _builder.append(_variableName_2, "\t");
        {
          List<ModelVariableDefinition> _attributes_4 = value.getAttributes();
          List<ModelVariableDefinition> _attributes_5 = value.getAttributes();
          int _size_1 = _attributes_5.size();
          int _minus_1 = (_size_1 - 1);
          ModelVariableDefinition _get_1 = _attributes_4.get(_minus_1);
          boolean _equals_1 = v_1.equals(_get_1);
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
  
  public CharSequence createToString(final ValueTypeClass value) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public String toString() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return \"");
    String _name = value.getName();
    _builder.append(_name, "\t");
    _builder.append(" [");
    {
      List<ModelVariableDefinition> _attributes = value.getAttributes();
      for(final ModelVariableDefinition v : _attributes) {
        String _variableName = v.getVariableName();
        _builder.append(_variableName, "\t");
        _builder.append("=\" + ");
        String _variableName_1 = v.getVariableName();
        _builder.append(_variableName_1, "\t");
        _builder.append(" + \"");
        {
          List<ModelVariableDefinition> _attributes_1 = value.getAttributes();
          List<ModelVariableDefinition> _attributes_2 = value.getAttributes();
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
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
