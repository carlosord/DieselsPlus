package uo.diesels.model.generator.persistence;

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
import uo.diesels.model.generator.persistence.util.PersistenceMethod;
import uo.diesels.model.generator.persistence.util.PersistenceVariableDefinition;
import uo.diesels.model.generator.persistence.util.classes.methods.MethodCollectionReturnClass;
import uo.diesels.model.generator.persistence.util.classes.methods.MethodSimpleReturnClass;
import uo.diesels.model.generator.persistence.util.elements.FinderClass;
import uo.diesels.model.generator.persistence.util.util.FinderMethodImplementations;
import uo.diesels.model.generator.util.PackageConstants;
import uo.diesels.model.generator.util.PathConstants;
import uo.diesels.model.generator.util.StringUtils;
import uo.diesels.model.persistenceDsl.Finder;
import uo.diesels.model.persistenceDsl.SimpleReturnTypeCollection;

@SuppressWarnings("all")
public class FinderGenerator {
  private Resource resource;
  
  private IFileSystemAccess fsa;
  
  private String project;
  
  public FinderGenerator(final Resource resource, final IFileSystemAccess fsa, final String project) {
    this.resource = resource;
    this.fsa = fsa;
    this.project = project;
  }
  
  public void compile() {
    TreeIterator<EObject> _allContents = this.resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Finder> _filter = Iterables.<Finder>filter(_iterable, Finder.class);
    for (final Finder finder : _filter) {
      {
        FinderClass f = new FinderClass(finder);
        StringBuilder sb = new StringBuilder();
        CharSequence _compileText = this.compileText(f);
        sb.append(_compileText);
        String _name = f.getName();
        String finderPath = String.format(PathConstants.FINDER_PERSISTENCE_PATH, this.project, _name);
        String _string = sb.toString();
        this.fsa.generateFile(finderPath, _string);
      }
    }
  }
  
  public CharSequence compileText(final FinderClass f) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _createPackageDeclaration = this.createPackageDeclaration();
    _builder.append(_createPackageDeclaration, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _createImportDeclaration = this.createImportDeclaration(f);
    _builder.append(_createImportDeclaration, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _createClassDeclaration = this.createClassDeclaration(f);
    _builder.append(_createClassDeclaration, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    CharSequence _createMethodDeclaration = this.createMethodDeclaration(f);
    _builder.append(_createMethodDeclaration, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createPackageDeclaration() {
    StringConcatenation _builder = new StringConcatenation();
    String _remplaceSlashToDot = StringUtils.remplaceSlashToDot(this.project);
    String _format = String.format(PackageConstants.FINDER_PERSISTENCE_PACKAGE, _remplaceSlashToDot);
    _builder.append(_format, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createImportDeclaration(final FinderClass f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _remplaceSlashToDot = StringUtils.remplaceSlashToDot(this.project);
      Set<String> _imports = f.getImports(_remplaceSlashToDot);
      for(final String i : _imports) {
        _builder.append(i, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence createClassDeclaration(final FinderClass f) {
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
    String _name = f.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createMethodDeclaration(final FinderClass f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<PersistenceMethod> _methods = f.getMethods();
      for(final PersistenceMethod m : _methods) {
        {
          if (((((m instanceof MethodCollectionReturnClass) && 
            (((MethodCollectionReturnClass) m).getReturnType() instanceof SimpleReturnTypeCollection)) || (m instanceof MethodSimpleReturnClass)) && m.isNullable())) {
            _builder.append("@SuppressWarnings(\"unchecked\")");
            _builder.newLine();
          }
        }
        _builder.append("public static ");
        String _methodReturnType = m.getMethodReturnType();
        _builder.append(_methodReturnType, "");
        _builder.append(" ");
        String _methodName = m.getMethodName();
        _builder.append(_methodName, "");
        _builder.append("(");
        {
          List<PersistenceVariableDefinition> _methodParameters = m.getMethodParameters();
          for(final PersistenceVariableDefinition p : _methodParameters) {
            String _variableType = p.getVariableType();
            _builder.append(_variableType, "");
            _builder.append(" ");
            String _variableName = p.getVariableName();
            _builder.append(_variableName, "");
            {
              List<PersistenceVariableDefinition> _methodParameters_1 = m.getMethodParameters();
              List<PersistenceVariableDefinition> _methodParameters_2 = m.getMethodParameters();
              int _size = _methodParameters_2.size();
              int _minus = (_size - 1);
              PersistenceVariableDefinition _get = _methodParameters_1.get(_minus);
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
        _builder.append("\t");
        String _name = f.getName();
        String _implementation = m.getImplementation(_name);
        _builder.append(_implementation, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        int cont = 1;
        _builder.newLineIfNotEmpty();
        {
          List<PersistenceVariableDefinition> _methodParameters_3 = m.getMethodParameters();
          for(final PersistenceVariableDefinition p_1 : _methodParameters_3) {
            _builder.append("\t");
            FinderMethodImplementations _instance = FinderMethodImplementations.getInstance();
            Map<String, String> _implementations = _instance.getImplementations();
            String _get_1 = _implementations.get("param");
            int _plusPlus = cont++;
            String _variableName_1 = p_1.getVariableName();
            String _format = String.format(_get_1, Integer.valueOf(_plusPlus), _variableName_1);
            _builder.append(_format, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          boolean _isNullable = m.isNullable();
          boolean _not_1 = (!_isNullable);
          if (_not_1) {
            _builder.append("\t");
            FinderMethodImplementations _instance_1 = FinderMethodImplementations.getInstance();
            Map<String, String> _implementations_1 = _instance_1.getImplementations();
            String _get_2 = _implementations_1.get("singleResult");
            _builder.append(_get_2, "\t");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            FinderMethodImplementations _instance_2 = FinderMethodImplementations.getInstance();
            Map<String, String> _implementations_2 = _instance_2.getImplementations();
            String _get_3 = _implementations_2.get("resultList");
            _builder.append(_get_3, "\t");
            {
              if ((!(m instanceof MethodCollectionReturnClass))) {
                _builder.append(")");
              }
            }
            _builder.append(";");
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
