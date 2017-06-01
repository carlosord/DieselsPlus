package uo.diesels.model.generator.business;

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
import uo.diesels.model.businessDsl.Service;
import uo.diesels.model.generator.business.util.BusinessMethod;
import uo.diesels.model.generator.business.util.BusinessVariableDefinition;
import uo.diesels.model.generator.business.util.elements.ServiceClass;
import uo.diesels.model.generator.util.PackageConstants;
import uo.diesels.model.generator.util.PathConstants;
import uo.diesels.model.generator.util.StringUtils;

@SuppressWarnings("all")
public class ServiceInterfaceGenerator {
  private Resource resource;
  
  private IFileSystemAccess fsa;
  
  private String project;
  
  public ServiceInterfaceGenerator(final Resource resource, final IFileSystemAccess fsa, final String project) {
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
        String _name = s.getName();
        String serviceInterfacePath = String.format(PathConstants.SERVICE_BUSINESS_PATH, 
          this.project, _name);
        String _string = sb.toString();
        this.fsa.generateFile(serviceInterfacePath, _string);
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
    CharSequence _createMethodDeclaration = this.createMethodDeclaration(s);
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
    String _format = String.format(PackageConstants.SERVICE_BUSINESS_PACKAGE, _remplaceSlashToDot);
    _builder.append(_format, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createImportDeclaration(final ServiceClass s) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _remplaceSlashToDot = StringUtils.remplaceSlashToDot(this.project);
      Set<String> _imports = s.getImports(_remplaceSlashToDot, "interface");
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
    _builder.append("public interface ");
    String _name = s.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createMethodDeclaration(final ServiceClass s) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<BusinessMethod> _methods = s.getMethods();
      for(final BusinessMethod m : _methods) {
        _builder.append("public ");
        String _methodReturnType = m.getMethodReturnType();
        _builder.append(_methodReturnType, "");
        _builder.append(" ");
        String _methodName = m.getMethodName();
        _builder.append(_methodName, "");
        _builder.append("(");
        {
          List<BusinessVariableDefinition> _methodParameters = m.getMethodParameters();
          for(final BusinessVariableDefinition p : _methodParameters) {
            String _variableType = p.getVariableType();
            _builder.append(_variableType, "");
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
        _builder.append(") throws BusinessException;");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
