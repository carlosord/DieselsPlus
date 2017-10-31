package uo.diesels.model.generator.dto;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import uo.diesels.model.dtoDsl.DtoFor;
import uo.diesels.model.generator.common.util.TypeCodeTransformation;
import uo.diesels.model.generator.dto.util.DtoEntity;
import uo.diesels.model.generator.dto.util.DtoVariableDefinition;
import uo.diesels.model.generator.dto.util.elements.DtoForClass;
import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.generator.util.PackageConstants;
import uo.diesels.model.generator.util.PathConstants;
import uo.diesels.model.generator.util.StringUtils;

@SuppressWarnings("all")
public class DtoAssemblerGenerator {
  private Resource resource;
  
  private IFileSystemAccess fsa;
  
  private String project;
  
  public DtoAssemblerGenerator(final Resource resource, final IFileSystemAccess fsa, final String project) {
    this.resource = resource;
    this.fsa = fsa;
    this.project = project;
  }
  
  public void compile() {
    StringBuilder sb = new StringBuilder();
    CharSequence _compileText = this.compileText();
    sb.append(_compileText);
    String entityPath = String.format(PathConstants.DTO_PATH, this.project, "BaseDtoAssembler");
    String _string = sb.toString();
    this.fsa.generateFile(entityPath, _string);
  }
  
  public CharSequence compileText() {
    CharSequence _xblockexpression = null;
    {
      ArrayList<DtoForClass> dtos = new ArrayList<DtoForClass>();
      TreeIterator<EObject> _allContents = this.resource.getAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
      Iterable<DtoFor> _filter = Iterables.<DtoFor>filter(_iterable, DtoFor.class);
      for (final DtoFor dto : _filter) {
        DtoForClass _dtoForClass = new DtoForClass(dto);
        dtos.add(_dtoForClass);
      }
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _createPackageDeclaration = this.createPackageDeclaration();
      _builder.append(_createPackageDeclaration, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      CharSequence _createImportDeclarations = this.createImportDeclarations(dtos);
      _builder.append(_createImportDeclarations, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      CharSequence _createClassDeclaration = this.createClassDeclaration();
      _builder.append(_createClassDeclaration, "");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      CharSequence _createMethods = this.createMethods(dtos);
      _builder.append(_createMethods, "\t");
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
    String _format = String.format(PackageConstants.DTO_PACKAGE, _remplaceSlashToDot);
    _builder.append(_format, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createImportDeclarations(final List<DtoForClass> dtos) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(ImportConstants.GENERATED_ANNOTATION_IMPORT, "");
    _builder.newLineIfNotEmpty();
    {
      for(final DtoForClass d : dtos) {
        String _remplaceSlashToDot = StringUtils.remplaceSlashToDot(this.project);
        String _name = d.getName();
        String _format = String.format(ImportConstants.DTO_PACKAGE_IMPORT, _remplaceSlashToDot, _name);
        _builder.append(_format, "");
        _builder.newLineIfNotEmpty();
        String _remplaceSlashToDot_1 = StringUtils.remplaceSlashToDot(this.project);
        DtoEntity _entity = d.getEntity();
        String _entityName = _entity.getEntityName();
        String _format_1 = String.format(ImportConstants.MODEL_PACKAGE_IMPORT, _remplaceSlashToDot_1, _entityName);
        _builder.append(_format_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
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
    _builder.append("public class BaseDtoAssembler {");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createDefaultConstructor(final DtoForClass d) {
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
        _builder.append("this.");
        String _variableName_1 = v_1.getVariableName();
        _builder.append(_variableName_1, "");
        _builder.append(" = ");
        String _variableName_2 = v_1.getVariableName();
        _builder.append(_variableName_2, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createMethods(final List<DtoForClass> dtos) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final DtoForClass d : dtos) {
        _builder.append("public static ");
        String _name = d.getName();
        _builder.append(_name, "");
        _builder.append(" fromEntity(");
        DtoEntity _entity = d.getEntity();
        String _entityName = _entity.getEntityName();
        _builder.append(_entityName, "");
        _builder.append(" ");
        DtoEntity _entity_1 = d.getEntity();
        String _entityName_1 = _entity_1.getEntityName();
        String _lowerFirst = StringUtils.toLowerFirst(_entityName_1);
        _builder.append(_lowerFirst, "");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return new ");
        String _name_1 = d.getName();
        _builder.append(_name_1, "\t");
        _builder.append("(");
        DtoEntity _entity_2 = d.getEntity();
        DtoEntity _entity_3 = d.getEntity();
        String _entityName_2 = _entity_3.getEntityName();
        String _lowerFirst_1 = StringUtils.toLowerFirst(_entityName_2);
        String _dtoAssemblerParameters = _entity_2.getDtoAssemblerParameters(_lowerFirst_1);
        String _removeLastChar = StringUtils.removeLastChar(_dtoAssemblerParameters);
        _builder.append(_removeLastChar, "\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    return _builder;
  }
}
