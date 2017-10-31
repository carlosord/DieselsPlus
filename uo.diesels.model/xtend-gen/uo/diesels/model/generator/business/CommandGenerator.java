package uo.diesels.model.generator.business;

import com.google.common.base.Objects;
import java.util.List;
import java.util.Set;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import uo.diesels.model.generator.business.util.BusinessMethod;
import uo.diesels.model.generator.business.util.BusinessVariableDefinition;
import uo.diesels.model.generator.business.util.elements.ServiceClass;
import uo.diesels.model.generator.common.util.TypeCodeTransformation;
import uo.diesels.model.generator.util.PackageConstants;
import uo.diesels.model.generator.util.PathConstants;
import uo.diesels.model.generator.util.ResourceUtils;
import uo.diesels.model.generator.util.StringUtils;

@SuppressWarnings("all")
public class CommandGenerator {
  private Resource resource;
  
  private IFileSystemAccess fsa;
  
  private String project;
  
  private ServiceClass service;
  
  public CommandGenerator(final Resource resource, final IFileSystemAccess fsa, final String project, final ServiceClass s) {
    this.resource = resource;
    this.fsa = fsa;
    this.project = project;
    this.service = s;
  }
  
  public void compile() {
    List<BusinessMethod> _methods = this.service.getMethods();
    for (final BusinessMethod m : _methods) {
      String _methodKeyword = m.getMethodKeyword();
      boolean _equals = Objects.equal(_methodKeyword, null);
      if (_equals) {
        StringBuilder sb = new StringBuilder();
        CharSequence _compileText = this.compileText(m);
        sb.append(_compileText);
        String _name = this.service.getName();
        String _lowerFirst = StringUtils.toLowerFirst(_name);
        String _methodName = m.getMethodName();
        String _upperFirst = StringUtils.toUpperFirst(_methodName);
        String _plus = (_upperFirst + "Command");
        String commandPath = String.format(PathConstants.SERVICE_BUSINESS_IMPL_COMMAND_PATH, this.project, _lowerFirst, _plus);
        String _name_1 = this.service.getName();
        String _lowerFirst_1 = StringUtils.toLowerFirst(_name_1);
        String _methodName_1 = m.getMethodName();
        String _upperFirst_1 = StringUtils.toUpperFirst(_methodName_1);
        String _plus_1 = (_upperFirst_1 + "Command");
        String _format = String.format(PathConstants.SERVICE_BUSINESS_IMPL_COMMAND_PATH_PROJECT, this.project, _lowerFirst_1, _plus_1);
        Path path = new Path(_format);
        IWorkspace _workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot _root = _workspace.getRoot();
        String _obtainProjectName = ResourceUtils.obtainProjectName(this.resource);
        IProject _project = _root.getProject(_obtainProjectName);
        IFile _file = _project.getFile(path);
        boolean _exists = _file.exists();
        boolean _not = (!_exists);
        if (_not) {
          String _string = sb.toString();
          this.fsa.generateFile(commandPath, _string);
        }
      }
    }
  }
  
  public CharSequence compileText(final BusinessMethod m) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _createPackageDeclaration = this.createPackageDeclaration();
    _builder.append(_createPackageDeclaration, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _createImportDeclaration = this.createImportDeclaration(m);
    _builder.append(_createImportDeclaration, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _createClassDeclaration = this.createClassDeclaration(m);
    _builder.append(_createClassDeclaration, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      List<BusinessVariableDefinition> _methodParameters = m.getMethodParameters();
      boolean _isEmpty = _methodParameters.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\t");
        CharSequence _createAttributeDeclarations = this.createAttributeDeclarations(m);
        _builder.append(_createAttributeDeclarations, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        CharSequence _createDefaultConstructor = this.createDefaultConstructor(m);
        _builder.append(_createDefaultConstructor, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    CharSequence _createMethodDeclaration = this.createMethodDeclaration(m);
    _builder.append(_createMethodDeclaration, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createPackageDeclaration() {
    StringConcatenation _builder = new StringConcatenation();
    String _remplaceSlashToDot = StringUtils.remplaceSlashToDot(this.project);
    String _name = this.service.getName();
    String _lowerFirst = StringUtils.toLowerFirst(_name);
    String _format = String.format(PackageConstants.SERVICE_BUSINESS_IMPL_COMMAND_PACKAGE, _remplaceSlashToDot, _lowerFirst);
    _builder.append(_format, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createImportDeclaration(final BusinessMethod m) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _remplaceSlashToDot = StringUtils.remplaceSlashToDot(this.project);
      String _name = this.service.getName();
      String _lowerFirst = StringUtils.toLowerFirst(_name);
      Set<String> _imports = m.getImports(_remplaceSlashToDot, "src", _lowerFirst);
      for(final String i : _imports) {
        _builder.append(i, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence createClassDeclaration(final BusinessMethod m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _methodName = m.getMethodName();
    String _upperFirst = StringUtils.toUpperFirst(_methodName);
    _builder.append(_upperFirst, "");
    _builder.append("Command implements Command<");
    String _methodReturnType = m.getMethodReturnType();
    String _upperFirst_1 = StringUtils.toUpperFirst(_methodReturnType);
    _builder.append(_upperFirst_1, "");
    _builder.append("> {");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createAttributeDeclarations(final BusinessMethod m) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<BusinessVariableDefinition> _methodParameters = m.getMethodParameters();
      for(final BusinessVariableDefinition p : _methodParameters) {
        _builder.append("private ");
        TypeCodeTransformation _instance = TypeCodeTransformation.getInstance();
        String _variableType = p.getVariableType();
        String _typeFor = _instance.getTypeFor(_variableType);
        _builder.append(_typeFor, "");
        _builder.append(" ");
        String _variableName = p.getVariableName();
        _builder.append(_variableName, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createDefaultConstructor(final BusinessMethod m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _methodName = m.getMethodName();
    String _upperFirst = StringUtils.toUpperFirst(_methodName);
    _builder.append(_upperFirst, "");
    _builder.append("Command(");
    {
      List<BusinessVariableDefinition> _methodParameters = m.getMethodParameters();
      for(final BusinessVariableDefinition p : _methodParameters) {
        TypeCodeTransformation _instance = TypeCodeTransformation.getInstance();
        String _variableType = p.getVariableType();
        String _typeFor = _instance.getTypeFor(_variableType);
        _builder.append(_typeFor, "");
        _builder.append(" ");
        String _variableName = p.getVariableName();
        _builder.append(_variableName, "");
        {
          List<BusinessVariableDefinition> _methodParameters_1 = m.getMethodParameters();
          List<BusinessVariableDefinition> _methodParameters_2 = m.getMethodParameters();
          int _size = _methodParameters_2.size();
          int _minus = (_size - 1);
          BusinessVariableDefinition _get = _methodParameters_1.get(_minus);
          boolean _equals = p.equals(_get);
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
      List<BusinessVariableDefinition> _methodParameters_3 = m.getMethodParameters();
      for(final BusinessVariableDefinition p_1 : _methodParameters_3) {
        _builder.append("\t");
        _builder.append("this.");
        String _variableName_1 = p_1.getVariableName();
        _builder.append(_variableName_1, "\t");
        _builder.append(" = ");
        String _variableName_2 = p_1.getVariableName();
        _builder.append(_variableName_2, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createMethodDeclaration(final BusinessMethod m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public ");
    TypeCodeTransformation _instance = TypeCodeTransformation.getInstance();
    String _methodReturnType = m.getMethodReturnType();
    String _typeFor = _instance.getTypeFor(_methodReturnType);
    String _upperFirst = StringUtils.toUpperFirst(_typeFor);
    _builder.append(_upperFirst, "");
    _builder.append(" execute() throws BusinessException {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("// TODO Auto-generated method stub");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
