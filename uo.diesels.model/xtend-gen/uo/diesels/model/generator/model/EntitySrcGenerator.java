package uo.diesels.model.generator.model;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
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
import uo.diesels.model.generator.model.util.ModelEntity;
import uo.diesels.model.generator.model.util.ModelMethod;
import uo.diesels.model.generator.model.util.ModelVariableDefinition;
import uo.diesels.model.generator.model.util.classes.RelationClass;
import uo.diesels.model.generator.model.util.elements.AssociativeEntityClass;
import uo.diesels.model.generator.model.util.elements.SimpleEntityClass;
import uo.diesels.model.generator.model.util.elements.SimpleLinkClass;
import uo.diesels.model.generator.model.util.util.ModelUtils;
import uo.diesels.model.generator.util.PackageConstants;
import uo.diesels.model.generator.util.PathConstants;
import uo.diesels.model.generator.util.ResourceUtils;
import uo.diesels.model.generator.util.StringUtils;
import uo.diesels.model.modelDsl.SimpleLink;

@SuppressWarnings("all")
public class EntitySrcGenerator {
  private Resource resource;
  
  private IFileSystemAccess fsa;
  
  private String project;
  
  private ModelEntity entity;
  
  public EntitySrcGenerator(final Resource resource, final IFileSystemAccess fsa, final String project, final ModelEntity e) {
    this.resource = resource;
    this.fsa = fsa;
    this.project = project;
    this.entity = e;
  }
  
  public void compile() {
    StringBuilder sb = new StringBuilder();
    CharSequence _compileText = this.compileText(this.entity);
    sb.append(_compileText);
    String _entityName = this.entity.getEntityName();
    String entityPath = String.format(PathConstants.MODEL_SRC_PATH, this.project, _entityName);
    String _entityName_1 = this.entity.getEntityName();
    String _format = String.format(PathConstants.MODEL_SRC_PATH_PROJECT, this.project, _entityName_1);
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
      this.fsa.generateFile(entityPath, _string);
    }
  }
  
  public CharSequence compileText(final ModelEntity e) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _createPackageDeclaration = this.createPackageDeclaration();
    _builder.append(_createPackageDeclaration, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    CharSequence _createImportsDeclarations = this.createImportsDeclarations(e);
    _builder.append(_createImportsDeclarations, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    CharSequence _createClassDeclaration = this.createClassDeclaration(e);
    _builder.append(_createClassDeclaration, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _createSerialVersionDeclaration = this.createSerialVersionDeclaration();
    _builder.append(_createSerialVersionDeclaration, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _createEmptyConstructor = this.createEmptyConstructor(e);
    _builder.append(_createEmptyConstructor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      if ((e instanceof SimpleEntityClass)) {
        {
          List<ModelVariableDefinition> _idVariables = ((SimpleEntityClass)e).getIdVariables();
          boolean _isEmpty = _idVariables.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            _builder.append("\t");
            CharSequence _createDefaultConstructor = this.createDefaultConstructor(((SimpleEntityClass)e));
            _builder.append(_createDefaultConstructor, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        _builder.append("\t");
        CharSequence _createDefaultConstructor_1 = this.createDefaultConstructor(((AssociativeEntityClass) e));
        _builder.append(_createDefaultConstructor_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    CharSequence _createMethods = this.createMethods(e);
    _builder.append(_createMethods, "\t");
    _builder.append("\t\t\t\t");
    _builder.newLineIfNotEmpty();
    {
      if ((e instanceof SimpleEntityClass)) {
        {
          List<ModelVariableDefinition> _idVariables_1 = ((SimpleEntityClass)e).getIdVariables();
          boolean _isEmpty_1 = _idVariables_1.isEmpty();
          boolean _not_1 = (!_isEmpty_1);
          if (_not_1) {
            _builder.append("\t");
            CharSequence _createHashCodeEquals = this.createHashCodeEquals(((SimpleEntityClass)e));
            _builder.append(_createHashCodeEquals, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        _builder.append("\t");
        CharSequence _createHashCodeEquals_1 = this.createHashCodeEquals(((AssociativeEntityClass) e));
        _builder.append(_createHashCodeEquals_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((e instanceof SimpleEntityClass)) {
        {
          List<ModelVariableDefinition> _idVariables_2 = ((SimpleEntityClass)e).getIdVariables();
          boolean _isEmpty_2 = _idVariables_2.isEmpty();
          boolean _not_2 = (!_isEmpty_2);
          if (_not_2) {
            _builder.append("\t");
            CharSequence _createToString = this.createToString(((SimpleEntityClass)e));
            _builder.append(_createToString, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        _builder.append("\t");
        CharSequence _createToString_1 = this.createToString(((AssociativeEntityClass) e));
        _builder.append(_createToString_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createPackageDeclaration() {
    StringConcatenation _builder = new StringConcatenation();
    String _remplaceSlashToDot = StringUtils.remplaceSlashToDot(this.project);
    String _format = String.format(PackageConstants.MODEL_PACKAGE, _remplaceSlashToDot);
    _builder.append(_format, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createDefaultConstructor(final SimpleEntityClass e) {
    CharSequence _xblockexpression = null;
    {
      List<ModelVariableDefinition> allIds = e.getIdVariables();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public ");
      String _name = e.getName();
      _builder.append(_name, "");
      _builder.append("(");
      {
        for(final ModelVariableDefinition v : allIds) {
          {
            Object _variableTypeClass = v.getVariableTypeClass();
            if ((_variableTypeClass instanceof SimpleLink)) {
              String _variableType = v.getVariableType();
              String _variableName = v.getVariableName();
              RelationClass a = this.getTypeFromRelationName(_variableType, _variableName);
              ModelEntity _type = a.getType();
              String _entityName = _type.getEntityName();
              _builder.append(_entityName, "");
              _builder.append(" ");
              String _name_1 = a.getName();
              _builder.append(_name_1, "");
            } else {
              String _variableType_1 = v.getVariableType();
              _builder.append(_variableType_1, "");
              _builder.append(" ");
              String _variableName_1 = v.getVariableName();
              _builder.append(_variableName_1, "");
            }
          }
          {
            int _size = allIds.size();
            int _minus = (_size - 1);
            ModelVariableDefinition _get = allIds.get(_minus);
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
      _builder.append("\t");
      _builder.append("super(");
      {
        List<ModelVariableDefinition> _idVariablesWithoutLink = e.getIdVariablesWithoutLink();
        for(final ModelVariableDefinition i : _idVariablesWithoutLink) {
          String _variableName_2 = i.getVariableName();
          _builder.append(_variableName_2, "\t");
          {
            List<ModelVariableDefinition> _idVariablesWithoutLink_1 = e.getIdVariablesWithoutLink();
            List<ModelVariableDefinition> _idVariablesWithoutLink_2 = e.getIdVariablesWithoutLink();
            int _size_1 = _idVariablesWithoutLink_2.size();
            int _minus_1 = (_size_1 - 1);
            ModelVariableDefinition _get_1 = _idVariablesWithoutLink_1.get(_minus_1);
            boolean _equals_1 = i.equals(_get_1);
            boolean _not_1 = (!_equals_1);
            if (_not_1) {
              _builder.append(", ");
            }
          }
        }
      }
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      {
        List<ModelVariableDefinition> _primaryKey = e.getPrimaryKey();
        for(final ModelVariableDefinition v_1 : _primaryKey) {
          {
            Object _variableTypeClass_1 = v_1.getVariableTypeClass();
            if ((_variableTypeClass_1 instanceof SimpleLink)) {
              _builder.append("\t");
              Object _variableTypeClass_2 = v_1.getVariableTypeClass();
              SimpleLinkClass l = new SimpleLinkClass(((SimpleLink) _variableTypeClass_2));
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              List<RelationClass> _relations = l.getRelations();
              RelationClass thisRel = ModelUtils.containsEntity(_relations, e);
              _builder.newLineIfNotEmpty();
              {
                boolean _notEquals = (!Objects.equal(thisRel, null));
                if (_notEquals) {
                  {
                    List<RelationClass> _relations_1 = l.getRelations();
                    RelationClass _get_2 = _relations_1.get(0);
                    boolean _equals_2 = thisRel.equals(_get_2);
                    if (_equals_2) {
                      _builder.append("\t");
                      _builder.append("Associations.");
                      String _name_2 = l.getName();
                      _builder.append(_name_2, "\t");
                      _builder.append(".link(this, ");
                      String _variableName_3 = v_1.getVariableName();
                      _builder.append(_variableName_3, "\t");
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                    } else {
                      _builder.append("\t");
                      _builder.append("Associations.");
                      String _name_3 = l.getName();
                      _builder.append(_name_3, "\t");
                      _builder.append(".link(");
                      String _variableName_4 = v_1.getVariableName();
                      _builder.append(_variableName_4, "\t");
                      _builder.append(", this);");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
            }
          }
        }
      }
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence createDefaultConstructor(final AssociativeEntityClass e) {
    CharSequence _xblockexpression = null;
    {
      List<RelationClass> _relations = e.getRelations();
      RelationClass r1 = _relations.get(0);
      List<RelationClass> _relations_1 = e.getRelations();
      RelationClass r2 = _relations_1.get(1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public ");
      String _name = e.getName();
      _builder.append(_name, "");
      _builder.append("(");
      ModelEntity _type = r1.getType();
      String _entityName = _type.getEntityName();
      _builder.append(_entityName, "");
      _builder.append(" ");
      String _name_1 = r1.getName();
      _builder.append(_name_1, "");
      _builder.append(", ");
      ModelEntity _type_1 = r2.getType();
      String _entityName_1 = _type_1.getEntityName();
      _builder.append(_entityName_1, "");
      _builder.append(" ");
      String _name_2 = r2.getName();
      _builder.append(_name_2, "");
      _builder.append(") {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("Associations.");
      String _name_3 = e.getName();
      _builder.append(_name_3, "\t");
      _builder.append("Link.link(");
      String _name_4 = r1.getName();
      _builder.append(_name_4, "\t");
      _builder.append(", ");
      String _name_5 = r2.getName();
      _builder.append(_name_5, "\t");
      _builder.append(", this);");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence createImportsDeclarations(final ModelEntity e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _remplaceSlashToDot = StringUtils.remplaceSlashToDot(this.project);
      Set<String> _srcImports = e.getSrcImports(_remplaceSlashToDot);
      for(final String i : _srcImports) {
        _builder.append(i, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence createClassDeclaration(final ModelEntity e) {
    StringConcatenation _builder = new StringConcatenation();
    String _srcAnnotations = e.getSrcAnnotations();
    _builder.append(_srcAnnotations, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    String _entityName = e.getEntityName();
    _builder.append(_entityName, "");
    _builder.append(" extends ");
    String _superClassName = e.getSuperClassName();
    _builder.append(_superClassName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createSerialVersionDeclaration() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private static final long serialVersionUID = 1L;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createEmptyConstructor(final ModelEntity e) {
    StringConcatenation _builder = new StringConcatenation();
    String _entityName = e.getEntityName();
    _builder.append(_entityName, "");
    _builder.append("() {}");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createMethods(final ModelEntity e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<ModelMethod> _srcMethods = e.getSrcMethods();
      for(final ModelMethod m : _srcMethods) {
        _builder.append("public ");
        String _methodReturnType = m.getMethodReturnType();
        _builder.append(_methodReturnType, "");
        _builder.append(" ");
        String _methodName = m.getMethodName();
        _builder.append(_methodName, "");
        _builder.append("(");
        {
          List<ModelVariableDefinition> _methodParameters = m.getMethodParameters();
          for(final ModelVariableDefinition p : _methodParameters) {
            String _variableType = p.getVariableType();
            _builder.append(_variableType, "");
            _builder.append(" ");
            String _variableName = p.getVariableName();
            _builder.append(_variableName, "");
            {
              List<ModelVariableDefinition> _methodParameters_1 = m.getMethodParameters();
              List<ModelVariableDefinition> _methodParameters_2 = m.getMethodParameters();
              int _size = _methodParameters_2.size();
              int _minus = (_size - 1);
              ModelVariableDefinition _get = _methodParameters_1.get(_minus);
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
        _builder.append("// TODO Auto-generated method stub");
        _builder.newLine();
        {
          String _methodReturnType_1 = m.getMethodReturnType();
          boolean _equals_1 = _methodReturnType_1.equals("void");
          boolean _not_1 = (!_equals_1);
          if (_not_1) {
            _builder.append("\treturn null;");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence createHashCodeEquals(final SimpleEntityClass e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public int hashCode() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return Objects.hash(");
    {
      List<ModelVariableDefinition> _idVariables = e.getIdVariables();
      for(final ModelVariableDefinition i : _idVariables) {
        _builder.append("this.get");
        String _variableName = i.getVariableName();
        String _upperFirst = StringUtils.toUpperFirst(_variableName);
        _builder.append(_upperFirst, "\t");
        _builder.append("()");
        {
          List<ModelVariableDefinition> _idVariables_1 = e.getIdVariables();
          List<ModelVariableDefinition> _idVariables_2 = e.getIdVariables();
          int _size = _idVariables_2.size();
          int _minus = (_size - 1);
          ModelVariableDefinition _get = _idVariables_1.get(_minus);
          boolean _equals = i.equals(_get);
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
    String _name = e.getName();
    _builder.append(_name, "\t");
    _builder.append(" other = (");
    String _name_1 = e.getName();
    _builder.append(_name_1, "\t");
    _builder.append(") obj;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return Objects.equals(");
    {
      List<ModelVariableDefinition> _idVariables_3 = e.getIdVariables();
      for(final ModelVariableDefinition i_1 : _idVariables_3) {
        _builder.append("this.get");
        String _variableName_1 = i_1.getVariableName();
        String _upperFirst_1 = StringUtils.toUpperFirst(_variableName_1);
        _builder.append(_upperFirst_1, "\t");
        _builder.append("(), other.get");
        String _variableName_2 = i_1.getVariableName();
        String _upperFirst_2 = StringUtils.toUpperFirst(_variableName_2);
        _builder.append(_upperFirst_2, "\t");
        _builder.append("()");
        {
          List<ModelVariableDefinition> _idVariables_4 = e.getIdVariables();
          List<ModelVariableDefinition> _idVariables_5 = e.getIdVariables();
          int _size_1 = _idVariables_5.size();
          int _minus_1 = (_size_1 - 1);
          ModelVariableDefinition _get_1 = _idVariables_4.get(_minus_1);
          boolean _equals_1 = i_1.equals(_get_1);
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
  
  public CharSequence createHashCodeEquals(final AssociativeEntityClass e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public int hashCode() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return Objects.hash(");
    {
      List<RelationClass> _relations = e.getRelations();
      for(final RelationClass r : _relations) {
        _builder.append("this.get");
        String _name = r.getName();
        String _upperFirst = StringUtils.toUpperFirst(_name);
        _builder.append(_upperFirst, "\t");
        _builder.append("()");
        {
          List<RelationClass> _relations_1 = e.getRelations();
          List<RelationClass> _relations_2 = e.getRelations();
          int _size = _relations_2.size();
          int _minus = (_size - 1);
          RelationClass _get = _relations_1.get(_minus);
          boolean _equals = r.equals(_get);
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
    String _name_1 = e.getName();
    _builder.append(_name_1, "\t");
    _builder.append(" other = (");
    String _name_2 = e.getName();
    _builder.append(_name_2, "\t");
    _builder.append(") obj;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return Objects.equals(");
    {
      List<RelationClass> _relations_3 = e.getRelations();
      for(final RelationClass r_1 : _relations_3) {
        _builder.append("this.get");
        String _name_3 = r_1.getName();
        String _upperFirst_1 = StringUtils.toUpperFirst(_name_3);
        _builder.append(_upperFirst_1, "\t");
        _builder.append("(), other.get");
        String _name_4 = r_1.getName();
        String _upperFirst_2 = StringUtils.toUpperFirst(_name_4);
        _builder.append(_upperFirst_2, "\t");
        _builder.append("()");
        {
          List<RelationClass> _relations_4 = e.getRelations();
          List<RelationClass> _relations_5 = e.getRelations();
          int _size_1 = _relations_5.size();
          int _minus_1 = (_size_1 - 1);
          RelationClass _get_1 = _relations_4.get(_minus_1);
          boolean _equals_1 = r_1.equals(_get_1);
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
  
  public CharSequence createToString(final SimpleEntityClass e) {
    CharSequence _xblockexpression = null;
    {
      ArrayList<ModelVariableDefinition> vars = new ArrayList<ModelVariableDefinition>();
      List<ModelVariableDefinition> _primaryKey = e.getPrimaryKey();
      vars.addAll(_primaryKey);
      List<ModelVariableDefinition> _attributes = e.getAttributes();
      vars.addAll(_attributes);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("public String toString() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return \"");
      String _name = e.getName();
      _builder.append(_name, "\t");
      _builder.append(" [");
      {
        for(final ModelVariableDefinition v : vars) {
          String _variableName = v.getVariableName();
          _builder.append(_variableName, "\t");
          _builder.append("=\" + this.get");
          String _variableName_1 = v.getVariableName();
          String _upperFirst = StringUtils.toUpperFirst(_variableName_1);
          _builder.append(_upperFirst, "\t");
          _builder.append("() + \"");
          {
            int _size = vars.size();
            int _minus = (_size - 1);
            ModelVariableDefinition _get = vars.get(_minus);
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
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence createToString(final AssociativeEntityClass e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public String toString() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return \"");
    String _name = e.getName();
    _builder.append(_name, "\t");
    _builder.append(" [");
    {
      List<RelationClass> _relations = e.getRelations();
      for(final RelationClass r : _relations) {
        String _name_1 = r.getName();
        _builder.append(_name_1, "\t");
        _builder.append("=\" + this.get");
        String _name_2 = r.getName();
        String _upperFirst = StringUtils.toUpperFirst(_name_2);
        _builder.append(_upperFirst, "\t");
        _builder.append("() + \"");
        {
          if (((!r.equals(e.getRelations().get((e.getRelations().size() - 1)))) || (!e.getAttributes().isEmpty()))) {
            _builder.append(", ");
          }
        }
      }
    }
    {
      List<ModelVariableDefinition> _attributes = e.getAttributes();
      for(final ModelVariableDefinition v : _attributes) {
        String _variableName = v.getVariableName();
        _builder.append(_variableName, "\t");
        _builder.append("=\" + get");
        String _variableName_1 = v.getVariableName();
        String _upperFirst_1 = StringUtils.toUpperFirst(_variableName_1);
        _builder.append(_upperFirst_1, "\t");
        _builder.append("() + \"");
        {
          List<ModelVariableDefinition> _attributes_1 = e.getAttributes();
          List<ModelVariableDefinition> _attributes_2 = e.getAttributes();
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
    _builder.append("}\t\t");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Métodos de apoyo
   */
  public RelationClass getTypeFromRelationName(final String linkName, final String relationName) {
    TreeIterator<EObject> _allContents = this.resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<SimpleLink> _filter = Iterables.<SimpleLink>filter(_iterable, SimpleLink.class);
    for (final SimpleLink l : _filter) {
      {
        SimpleLinkClass link = new SimpleLinkClass(l);
        String _name = link.getName();
        boolean _equals = _name.equals(linkName);
        if (_equals) {
          List<RelationClass> _relations = link.getRelations();
          for (final RelationClass r : _relations) {
            String _name_1 = r.getName();
            boolean _equals_1 = _name_1.equals(relationName);
            if (_equals_1) {
              return r;
            }
          }
        }
      }
    }
    return null;
  }
}
