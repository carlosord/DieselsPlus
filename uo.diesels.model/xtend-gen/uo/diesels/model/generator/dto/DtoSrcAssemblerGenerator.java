package uo.diesels.model.generator.dto;

import com.google.common.collect.Iterables;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import uo.diesels.model.dtoDsl.DtoFor;
import uo.diesels.model.generator.dto.util.DtoEntity;
import uo.diesels.model.generator.dto.util.elements.DtoForClass;
import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.generator.util.PackageConstants;
import uo.diesels.model.generator.util.PathConstants;
import uo.diesels.model.generator.util.ResourceUtils;
import uo.diesels.model.generator.util.StringUtils;

@SuppressWarnings("all")
public class DtoSrcAssemblerGenerator {
  private Resource resource;
  
  private IFileSystemAccess fsa;
  
  private String project;
  
  public DtoSrcAssemblerGenerator(final Resource resource, final IFileSystemAccess fsa, final String project) {
    this.resource = resource;
    this.fsa = fsa;
    this.project = project;
  }
  
  public void compile() {
    StringBuilder sb = new StringBuilder();
    CharSequence _compileText = this.compileText();
    sb.append(_compileText);
    String dtoAssemblerPath = String.format(PathConstants.DTO_SRC_PATH, this.project, "DtoAssembler");
    File fichero = new File(dtoAssemblerPath);
    fichero.delete();
    String _format = String.format(PathConstants.DTO_SRC_PATH_PROJECT, this.project, "DtoAssembler");
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
      this.fsa.generateFile(dtoAssemblerPath, _string);
    }
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
    _builder.append("public class DtoAssembler extends BaseDtoAssembler {");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createMethods(final List<DtoForClass> dtos) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final DtoForClass d : dtos) {
        _builder.append("public static ");
        DtoEntity _entity = d.getEntity();
        String _entityName = _entity.getEntityName();
        _builder.append(_entityName, "");
        _builder.append(" toEntity(");
        String _name = d.getName();
        _builder.append(_name, "");
        _builder.append(" ");
        String _name_1 = d.getName();
        String _lowerFirst = StringUtils.toLowerFirst(_name_1);
        _builder.append(_lowerFirst, "");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("// TODO Auto-generated method stub");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("return null;");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    return _builder;
  }
}
