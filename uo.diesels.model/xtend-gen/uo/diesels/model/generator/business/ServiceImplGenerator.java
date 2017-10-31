package uo.diesels.model.generator.business;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import uo.diesels.model.businessDsl.Service;
import uo.diesels.model.generator.business.CommandGenerator;
import uo.diesels.model.generator.business.util.BusinessMethod;
import uo.diesels.model.generator.business.util.BusinessVariableDefinition;
import uo.diesels.model.generator.business.util.classes.methods.JpaMethodClass;
import uo.diesels.model.generator.business.util.elements.ServiceClass;
import uo.diesels.model.generator.business.util.util.BusinessMethodImplementations;
import uo.diesels.model.generator.business.util.util.BusinessUtils;
import uo.diesels.model.generator.common.util.TypeCodeTransformation;
import uo.diesels.model.generator.util.PackageConstants;
import uo.diesels.model.generator.util.PathConstants;
import uo.diesels.model.generator.util.StringUtils;
import uo.diesels.model.modelDsl.AssociativeEntity;
import uo.diesels.model.modelDsl.Entity;

@SuppressWarnings("all")
public class ServiceImplGenerator {
  private Resource resource;
  
  private IFileSystemAccess fsa;
  
  private String project;
  
  public ServiceImplGenerator(final Resource resource, final IFileSystemAccess fsa, final String project) {
    this.resource = resource;
    this.fsa = fsa;
    this.project = project;
  }
  
  public void compile() {
    TreeIterator<EObject> _allContents = this.resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Service> _filter = Iterables.<Service>filter(_iterable, Service.class);
    for (final Service service : _filter) {
      {
        ServiceClass s = new ServiceClass(service);
        StringBuilder sb = new StringBuilder();
        CharSequence _compileText = this.compileText(s);
        sb.append(_compileText);
        String _implName = s.getImplName();
        String serviceImplPath = String.format(PathConstants.SERVICE_BUSINESS_IMPL_PATH, 
          this.project, _implName);
        String _string = sb.toString();
        this.fsa.generateFile(serviceImplPath, _string);
        boolean _hasUserMethods = BusinessUtils.hasUserMethods(s);
        if (_hasUserMethods) {
          CommandGenerator command = new CommandGenerator(this.resource, this.fsa, this.project, s);
          command.compile();
        }
      }
    }
  }
  
  public CharSequence compileText(final ServiceClass s) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _createPackageDeclaration = this.createPackageDeclaration();
    _builder.append(_createPackageDeclaration, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _createImportDeclaration = this.createImportDeclaration(s);
    _builder.append(_createImportDeclaration, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _createClassDeclaration = this.createClassDeclaration(s);
    _builder.append(_createClassDeclaration, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    List<BusinessMethod> _methods = s.getMethods();
    CharSequence _createMethodDeclaration = this.createMethodDeclaration(_methods);
    _builder.append(_createMethodDeclaration, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createPackageDeclaration() {
    StringConcatenation _builder = new StringConcatenation();
    String _remplaceSlashToDot = StringUtils.remplaceSlashToDot(this.project);
    String _format = String.format(PackageConstants.SERVICE_BUSINESS_IMPL_PACKAGE, _remplaceSlashToDot);
    _builder.append(_format, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createImportDeclaration(final ServiceClass s) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _remplaceSlashToDot = StringUtils.remplaceSlashToDot(this.project);
      Set<String> _imports = s.getImports(_remplaceSlashToDot, "impl");
      for(final String i : _imports) {
        _builder.append(i, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence createClassDeclaration(final ServiceClass s) {
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
    String _implName = s.getImplName();
    _builder.append(_implName, "");
    _builder.append(" implements ");
    String _name = s.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createMethodDeclaration(final List<BusinessMethod> methods) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final BusinessMethod m : methods) {
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("public ");
        TypeCodeTransformation _instance = TypeCodeTransformation.getInstance();
        String _methodReturnType = m.getMethodReturnType();
        String _typeFor = _instance.getTypeFor(_methodReturnType);
        _builder.append(_typeFor, "");
        _builder.append(" ");
        String _methodName = m.getMethodName();
        _builder.append(_methodName, "");
        _builder.append("(");
        {
          List<BusinessVariableDefinition> _methodParameters = m.getMethodParameters();
          for(final BusinessVariableDefinition p : _methodParameters) {
            TypeCodeTransformation _instance_1 = TypeCodeTransformation.getInstance();
            String _variableType = p.getVariableType();
            String _typeFor_1 = _instance_1.getTypeFor(_variableType);
            _builder.append(_typeFor_1, "");
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
        _builder.append(") throws BusinessException {");
        _builder.newLineIfNotEmpty();
        {
          String _methodKeyword = m.getMethodKeyword();
          boolean _notEquals = (!Objects.equal(_methodKeyword, null));
          if (_notEquals) {
            _builder.append("\t");
            _builder.append("Command<");
            TypeCodeTransformation _instance_2 = TypeCodeTransformation.getInstance();
            String _methodReturnType_1 = m.getMethodReturnType();
            String _typeFor_2 = _instance_2.getTypeFor(_methodReturnType_1);
            String _upperFirst = StringUtils.toUpperFirst(_typeFor_2);
            _builder.append(_upperFirst, "\t");
            _builder.append("> c = new Command<");
            TypeCodeTransformation _instance_3 = TypeCodeTransformation.getInstance();
            String _methodReturnType_2 = m.getMethodReturnType();
            String _typeFor_3 = _instance_3.getTypeFor(_methodReturnType_2);
            String _upperFirst_1 = StringUtils.toUpperFirst(_typeFor_3);
            _builder.append(_upperFirst_1, "\t");
            _builder.append(">() {\t\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("@Override");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("public ");
            TypeCodeTransformation _instance_4 = TypeCodeTransformation.getInstance();
            String _methodReturnType_3 = m.getMethodReturnType();
            String _typeFor_4 = _instance_4.getTypeFor(_methodReturnType_3);
            String _upperFirst_2 = StringUtils.toUpperFirst(_typeFor_4);
            _builder.append(_upperFirst_2, "\t\t");
            _builder.append(" execute() throws BusinessException {");
            _builder.newLineIfNotEmpty();
            {
              String _methodKeyword_1 = m.getMethodKeyword();
              boolean _equals_1 = _methodKeyword_1.equals("delete");
              if (_equals_1) {
                _builder.append("\t");
                _builder.append("\t\t");
                ((JpaMethodClass) m).setKeyword("find");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t\t");
                Entity entity = ((JpaMethodClass) m).getEntity();
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t\t");
                String entityName = ((JpaMethodClass) m).getEntityName();
                _builder.newLineIfNotEmpty();
                {
                  if ((entity instanceof AssociativeEntity)) {
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append(entityName, "\t\t\t");
                    _builder.append(" ");
                    String _lowerFirst = StringUtils.toLowerFirst(entityName);
                    _builder.append(_lowerFirst, "\t\t\t");
                    _builder.append(" = ");
                    BusinessMethodImplementations _instance_5 = BusinessMethodImplementations.getInstance();
                    Map<String, String> _implementations = _instance_5.getImplementations();
                    String _get_1 = _implementations.get("find");
                    String _parametersToServiceMethod = m.parametersToServiceMethod();
                    String _plus = ((("new " + entityName) + "Key(") + _parametersToServiceMethod);
                    String _plus_1 = (_plus + ")");
                    String _format = String.format(_get_1, (entityName + ".class"), _plus_1);
                    _builder.append(_format, "\t\t\t");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append(entityName, "\t\t\t");
                    _builder.append(" ");
                    String _lowerFirst_1 = StringUtils.toLowerFirst(entityName);
                    _builder.append(_lowerFirst_1, "\t\t\t");
                    _builder.append(" = ");
                    BusinessMethodImplementations _instance_6 = BusinessMethodImplementations.getInstance();
                    Map<String, String> _implementations_1 = _instance_6.getImplementations();
                    String _get_2 = _implementations_1.get("find");
                    String _parametersToServiceMethod_1 = m.parametersToServiceMethod();
                    String _format_1 = String.format(_get_2, (entityName + ".class"), _parametersToServiceMethod_1);
                    _builder.append(_format_1, "\t\t\t");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("\t");
                _builder.append("\t\t");
                ((JpaMethodClass) m).setKeyword("delete");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t\t");
                BusinessMethodImplementations _instance_7 = BusinessMethodImplementations.getInstance();
                Map<String, String> _implementations_2 = _instance_7.getImplementations();
                String _methodKeyword_2 = m.getMethodKeyword();
                String _get_3 = _implementations_2.get(_methodKeyword_2);
                String _entityName = ((JpaMethodClass) m).getEntityName();
                String _lowerFirst_2 = StringUtils.toLowerFirst(_entityName);
                String _format_2 = String.format(_get_3, _lowerFirst_2);
                _builder.append(_format_2, "\t\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              String _methodKeyword_3 = m.getMethodKeyword();
              boolean _equals_2 = _methodKeyword_3.equals("find");
              if (_equals_2) {
                _builder.append("\t");
                _builder.append("\t\t");
                Entity entity_1 = ((JpaMethodClass) m).getEntity();
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t\t");
                String entityName_1 = ((JpaMethodClass) m).getEntityName();
                _builder.newLineIfNotEmpty();
                {
                  if ((entity_1 instanceof AssociativeEntity)) {
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("return ");
                    BusinessMethodImplementations _instance_8 = BusinessMethodImplementations.getInstance();
                    Map<String, String> _implementations_3 = _instance_8.getImplementations();
                    String _get_4 = _implementations_3.get("find");
                    String _parametersToServiceMethod_2 = m.parametersToServiceMethod();
                    String _plus_2 = ((("new " + entityName_1) + "Key(") + _parametersToServiceMethod_2);
                    String _plus_3 = (_plus_2 + ")");
                    String _format_3 = String.format(_get_4, (entityName_1 + ".class"), _plus_3);
                    _builder.append(_format_3, "\t\t\t");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("return ");
                    BusinessMethodImplementations _instance_9 = BusinessMethodImplementations.getInstance();
                    Map<String, String> _implementations_4 = _instance_9.getImplementations();
                    String _get_5 = _implementations_4.get("find");
                    String _parametersToServiceMethod_3 = m.parametersToServiceMethod();
                    String _format_4 = String.format(_get_5, (entityName_1 + ".class"), _parametersToServiceMethod_3);
                    _builder.append(_format_4, "\t\t\t");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
            {
              if ((m.getMethodKeyword().equals("save") || m.getMethodKeyword().equals("update"))) {
                _builder.append("\t");
                _builder.append("\t\t");
                BusinessMethodImplementations _instance_10 = BusinessMethodImplementations.getInstance();
                Map<String, String> _implementations_5 = _instance_10.getImplementations();
                String _methodKeyword_4 = m.getMethodKeyword();
                String _get_6 = _implementations_5.get(_methodKeyword_4);
                String _parametersToServiceMethod_4 = m.parametersToServiceMethod();
                String _format_5 = String.format(_get_6, _parametersToServiceMethod_4);
                _builder.append(_format_5, "\t\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              String _methodKeyword_5 = m.getMethodKeyword();
              boolean _equals_3 = _methodKeyword_5.equals("finder");
              if (_equals_3) {
                _builder.append("\t");
                _builder.append("\t\t");
                {
                  String _methodReturnType_4 = m.getMethodReturnType();
                  boolean _equals_4 = _methodReturnType_4.equals("void");
                  boolean _not_1 = (!_equals_4);
                  if (_not_1) {
                    _builder.append("return ");
                  }
                }
                BusinessMethodImplementations _instance_11 = BusinessMethodImplementations.getInstance();
                Map<String, String> _implementations_6 = _instance_11.getImplementations();
                String _methodKeyword_6 = m.getMethodKeyword();
                String _get_7 = _implementations_6.get(_methodKeyword_6);
                String _methodFinderName = m.getMethodFinderName();
                String _methodName_1 = m.getMethodName();
                String _parametersToServiceMethod_5 = m.parametersToServiceMethod();
                String _format_6 = String.format(_get_7, _methodFinderName, _methodName_1, _parametersToServiceMethod_5);
                _builder.append(_format_6, "\t\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              String _methodReturnType_5 = m.getMethodReturnType();
              boolean _equals_5 = _methodReturnType_5.equals("void");
              if (_equals_5) {
                _builder.append("\t");
                _builder.append("\t\t");
                _builder.append("return null;");
                _builder.newLine();
              }
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("};");
            _builder.newLine();
            _builder.append("\t");
            {
              String _methodReturnType_6 = m.getMethodReturnType();
              boolean _equals_6 = _methodReturnType_6.equals("void");
              boolean _not_2 = (!_equals_6);
              if (_not_2) {
                _builder.append("return ");
              }
            }
            _builder.append("CommandExecutor.execute(c);");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            {
              String _methodReturnType_7 = m.getMethodReturnType();
              boolean _equals_7 = _methodReturnType_7.equals("void");
              boolean _not_3 = (!_equals_7);
              if (_not_3) {
                _builder.append("return ");
              }
            }
            _builder.append("CommandExecutor.execute(new ");
            String _methodName_2 = m.getMethodName();
            String _upperFirst_3 = StringUtils.toUpperFirst(_methodName_2);
            _builder.append(_upperFirst_3, "\t");
            _builder.append("Command(");
            String _parametersToServiceMethod_6 = m.parametersToServiceMethod();
            _builder.append(_parametersToServiceMethod_6, "\t");
            _builder.append("));");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    return _builder;
  }
}
