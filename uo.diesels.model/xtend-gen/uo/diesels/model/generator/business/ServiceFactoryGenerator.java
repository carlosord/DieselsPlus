package uo.diesels.model.generator.business;

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
import uo.diesels.model.businessDsl.Service;
import uo.diesels.model.generator.business.util.elements.ServiceClass;
import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.generator.util.PackageConstants;
import uo.diesels.model.generator.util.StringUtils;

@SuppressWarnings("all")
public class ServiceFactoryGenerator {
  private Resource resource;
  
  private IFileSystemAccess fsa;
  
  private String project;
  
  public ServiceFactoryGenerator(final Resource resource, final IFileSystemAccess fsa, final String project) {
    this.resource = resource;
    this.fsa = fsa;
    this.project = project;
  }
  
  public void compile() {
    StringBuilder sb = new StringBuilder();
    CharSequence _compileText = this.compileText();
    sb.append(_compileText);
    String infrastrucutePath = String.format(PackageConstants.INFRASTRUCTURE_PATH, 
      this.project, "ServiceFactory");
    String _string = sb.toString();
    this.fsa.generateFile(infrastrucutePath, _string);
  }
  
  public CharSequence compileText() {
    CharSequence _xblockexpression = null;
    {
      ArrayList<ServiceClass> servicios = new ArrayList<ServiceClass>();
      TreeIterator<EObject> _allContents = this.resource.getAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
      Iterable<Service> _filter = Iterables.<Service>filter(_iterable, Service.class);
      for (final Service service : _filter) {
        ServiceClass _serviceClass = new ServiceClass(service);
        servicios.add(_serviceClass);
      }
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _createPackageDeclaration = this.createPackageDeclaration();
      _builder.append(_createPackageDeclaration, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      CharSequence _createImportDeclaration = this.createImportDeclaration(servicios);
      _builder.append(_createImportDeclaration, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      CharSequence _createClassDeclaration = this.createClassDeclaration();
      _builder.append(_createClassDeclaration, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("\t");
      CharSequence _createMethods = this.createMethods(servicios);
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
    String _format = String.format(PackageConstants.INFRASTRUCTURE_PACKAGE, _remplaceSlashToDot);
    _builder.append(_format, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createImportDeclaration(final List<ServiceClass> servicios) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(ImportConstants.GENERATED_ANNOTATION_IMPORT, "");
    _builder.newLineIfNotEmpty();
    {
      for(final ServiceClass s : servicios) {
        String _remplaceSlashToDot = StringUtils.remplaceSlashToDot(this.project);
        String _name = s.getName();
        String _format = String.format(ImportConstants.SERVICE_INTERFACE_IMPORT, _remplaceSlashToDot, _name);
        _builder.append(_format, "");
        _builder.newLineIfNotEmpty();
        String _remplaceSlashToDot_1 = StringUtils.remplaceSlashToDot(this.project);
        String _name_1 = s.getName();
        String _plus = (_name_1 + "Impl");
        String _format_1 = String.format(ImportConstants.SERVICE_IMPL_IMPORT, _remplaceSlashToDot_1, _plus);
        _builder.append(_format_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence createClassDeclaration() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Generated (");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("value = \"DieselsCodeGenerator\",");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("comments = \"Generated service factory class\",");
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
    _builder.append("public class ServiceFactory {");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createMethods(final List<ServiceClass> servicios) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final ServiceClass s : servicios) {
        _builder.append("public ");
        String _name = s.getName();
        _builder.append(_name, "");
        _builder.append(" create");
        String _name_1 = s.getName();
        _builder.append(_name_1, "");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return new ");
        String _name_2 = s.getName();
        _builder.append(_name_2, "\t");
        _builder.append("Impl();");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    return _builder;
  }
}
