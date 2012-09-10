package org.eclipse.xtext.jvmmodel;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.classdef.DummyJavaClass;
import org.eclipse.xtext.classdef.DummyJavaClassMethod;
import org.eclipse.xtext.classdef.DummyJavaClassMethodParameter;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ClassdefJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private TypeReferences typeReferences;
  
  @Inject
  private TypeReferenceSerializer _typeReferenceSerializer;
  
  @Inject
  private XbaseCompiler xbaseCompiler;
  
  protected void _infer(final DummyJavaClass element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    String _name = element.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _plus = ("org.example.mydsl." + _firstUpper);
    JvmGenericType _class = this._jvmTypesBuilder.toClass(element, _plus);
    IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          EList<DummyJavaClassMethod> _methods = element.getMethods();
          int _size = _methods.size();
          boolean _greaterThan = (_size > 0);
          if (_greaterThan) {
            EList<DummyJavaClassMethod> _methods_1 = element.getMethods();
            for (final DummyJavaClassMethod method : _methods_1) {
              EList<JvmMember> _members = it.getMembers();
              String _name = method.getName();
              String _firstLower = StringExtensions.toFirstLower(_name);
              JvmTypeReference _typeForName = ClassdefJvmModelInferrer.this.typeReferences.getTypeForName("void", method);
              final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                  public void apply(final JvmOperation it) {
                    String _description = method.getDescription();
                    ClassdefJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _description);
                    EList<DummyJavaClassMethodParameter> _input = method.getInput();
                    for (final DummyJavaClassMethodParameter p : _input) {
                      EList<JvmFormalParameter> _parameters = it.getParameters();
                      String _name = p.getName();
                      String _type = p.getType();
                      JvmTypeReference _typeForName = ClassdefJvmModelInferrer.this.typeReferences.getTypeForName(_type, p);
                      JvmFormalParameter _parameter = ClassdefJvmModelInferrer.this._jvmTypesBuilder.toParameter(p, _name, _typeForName);
                      ClassdefJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                    }
                  }
                };
              JvmOperation _method = ClassdefJvmModelInferrer.this._jvmTypesBuilder.toMethod(method, _firstLower, _typeForName, _function);
              ClassdefJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
            }
          }
        }
      };
    _accept.initializeLater(_function);
  }
  
  public ITreeAppendable declareVariableForOutputParameter(final ITreeAppendable it, final JvmFormalParameter o) {
    ITreeAppendable _xblockexpression = null;
    {
      String _simpleName = o.getSimpleName();
      final String outputVarName = it.declareVariable(o, _simpleName);
      JvmTypeReference _parameterType = o.getParameterType();
      this._typeReferenceSerializer.serialize(_parameterType, o, it);
      String _plus = (" " + outputVarName);
      String _plus_1 = (_plus + " = null; // output parameter");
      ITreeAppendable _append = it.append(_plus_1);
      _xblockexpression = (_append);
    }
    return _xblockexpression;
  }
  
  public void infer(final EObject element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (element instanceof DummyJavaClass) {
      _infer((DummyJavaClass)element, acceptor, isPreIndexingPhase);
      return;
    } else if (element != null) {
      _infer(element, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element, acceptor, isPreIndexingPhase).toString());
    }
  }
}
