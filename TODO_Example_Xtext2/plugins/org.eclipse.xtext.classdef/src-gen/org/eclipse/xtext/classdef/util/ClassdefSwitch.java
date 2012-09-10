/**
 */
package org.eclipse.xtext.classdef.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.xtext.classdef.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.classdef.ClassdefPackage
 * @generated
 */
public class ClassdefSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ClassdefPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassdefSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ClassdefPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ClassdefPackage.CLASS_DEFINITIONS:
      {
        ClassDefinitions classDefinitions = (ClassDefinitions)theEObject;
        T result = caseClassDefinitions(classDefinitions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ClassdefPackage.DUMMY_JAVA_CLASS:
      {
        DummyJavaClass dummyJavaClass = (DummyJavaClass)theEObject;
        T result = caseDummyJavaClass(dummyJavaClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ClassdefPackage.DUMMY_JAVA_CLASS_METHOD:
      {
        DummyJavaClassMethod dummyJavaClassMethod = (DummyJavaClassMethod)theEObject;
        T result = caseDummyJavaClassMethod(dummyJavaClassMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ClassdefPackage.DUMMY_JAVA_CLASS_METHOD_PARAMETER:
      {
        DummyJavaClassMethodParameter dummyJavaClassMethodParameter = (DummyJavaClassMethodParameter)theEObject;
        T result = caseDummyJavaClassMethodParameter(dummyJavaClassMethodParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Definitions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Definitions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassDefinitions(ClassDefinitions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dummy Java Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dummy Java Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDummyJavaClass(DummyJavaClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dummy Java Class Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dummy Java Class Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDummyJavaClassMethod(DummyJavaClassMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dummy Java Class Method Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dummy Java Class Method Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDummyJavaClassMethodParameter(DummyJavaClassMethodParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ClassdefSwitch
