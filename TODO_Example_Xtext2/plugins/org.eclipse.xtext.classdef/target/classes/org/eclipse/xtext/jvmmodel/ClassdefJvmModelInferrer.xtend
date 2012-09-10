package org.eclipse.xtext.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.classdef.DummyJavaClass
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.common.types.JvmFormalParameter

class ClassdefJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder
    @Inject extension TypeReferences typeReferences
	@Inject extension TypeReferenceSerializer
    @Inject XbaseCompiler xbaseCompiler    
	
   	def dispatch void infer(DummyJavaClass element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(element.toClass("org.example.mydsl." + element.name.toFirstUpper))
   			.initializeLater
   			(
   				[
   					if(element.methods.size > 0) {
   						for (method : element.methods) {
   							members += method.toMethod(method.name.toFirstLower, "void".getTypeForName(method)) 
   							[
			                    documentation = method.description
			                    for (p : method.input) {
			                        parameters += p.toParameter(p.name, p.type.getTypeForName(p))
			                    }
//			                    body = [
//			                        xbaseCompiler.compile("", it, "void".getTypeForName(method), null)
//			                    ]
   							]
   						}
   					}	
   				]
   			)
   	}
 
    def declareVariableForOutputParameter(ITreeAppendable it, JvmFormalParameter o) {
        val outputVarName = it.declareVariable(o, o.simpleName)
        o.parameterType.serialize(o, it)
        it.append(" " + outputVarName + " = null; // output parameter")
    }
}

