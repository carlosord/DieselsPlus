package uo.diesels.model.generator.model;

import com.google.common.collect.Iterables;
import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import uo.diesels.model.generator.util.ImportConstants;
import uo.diesels.model.generator.util.PackageConstants;
import uo.diesels.model.generator.util.PathConstants;
import uo.diesels.model.generator.util.StringUtils;
import uo.diesels.model.modelDsl.Enumerable;

@SuppressWarnings("all")
public class EnumGenerator {
  private Resource resource;
  
  private IFileSystemAccess fsa;
  
  private String project;
  
  public EnumGenerator(final Resource resource, final IFileSystemAccess fsa, final String project) {
    this.resource = resource;
    this.fsa = fsa;
    this.project = project;
  }
  
  public void compile() {
    TreeIterator<EObject> _allContents = this.resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Enumerable> _filter = Iterables.<Enumerable>filter(_iterable, Enumerable.class);
    for (final Enumerable i : _filter) {
      {
        StringBuilder sb = new StringBuilder();
        CharSequence _compileText = this.compileText(i);
        sb.append(_compileText);
        String _name = i.getName();
        String enumPath = String.format(PathConstants.MODEL_ENUM_PATH, this.project, _name);
        String _string = sb.toString();
        this.fsa.generateFile(enumPath, _string);
      }
    }
  }
  
  public CharSequence compileText(final Enumerable e) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _createPackageDeclaration = this.createPackageDeclaration();
    _builder.append(_createPackageDeclaration, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _createImportDeclarations = this.createImportDeclarations();
    _builder.append(_createImportDeclarations, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _name = e.getName();
    CharSequence _createClassDeclaration = this.createClassDeclaration(_name);
    _builder.append(_createClassDeclaration, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    EList<String> _enums = e.getEnums();
    CharSequence _createEnumeratedValues = this.createEnumeratedValues(_enums);
    _builder.append(_createEnumeratedValues, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createPackageDeclaration() {
    StringConcatenation _builder = new StringConcatenation();
    String _remplaceSlashToDot = StringUtils.remplaceSlashToDot(this.project);
    String _format = String.format(PackageConstants.MODEL_ENUM_PACKAGE, _remplaceSlashToDot);
    _builder.append(_format, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createImportDeclarations() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(ImportConstants.GENERATED_ANNOTATION_IMPORT, "");
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
    _builder.append("public enum ");
    _builder.append(className, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createEnumeratedValues(final EList<String> enumerables) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final String e : enumerables) {
        String _string = e.toString();
        _builder.append(_string, "");
        {
          int _length = ((Object[])Conversions.unwrapArray(enumerables, Object.class)).length;
          int _minus = (_length - 1);
          String _get = enumerables.get(_minus);
          boolean _equals = _get.equals(e);
          boolean _not = (!_equals);
          if (_not) {
            _builder.append(",");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
