/**
 */
package org.eclipse.xtext.classdef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dummy Java Class Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.classdef.DummyJavaClassMethod#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.classdef.DummyJavaClassMethod#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.xtext.classdef.DummyJavaClassMethod#getInput <em>Input</em>}</li>
 *   <li>{@link org.eclipse.xtext.classdef.DummyJavaClassMethod#getOuput <em>Ouput</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.classdef.ClassdefPackage#getDummyJavaClassMethod()
 * @model
 * @generated
 */
public interface DummyJavaClassMethod extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.xtext.classdef.ClassdefPackage#getDummyJavaClassMethod_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.classdef.DummyJavaClassMethod#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.eclipse.xtext.classdef.ClassdefPackage#getDummyJavaClassMethod_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.classdef.DummyJavaClassMethod#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.classdef.DummyJavaClassMethodParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference list.
   * @see org.eclipse.xtext.classdef.ClassdefPackage#getDummyJavaClassMethod_Input()
   * @model containment="true"
   * @generated
   */
  EList<DummyJavaClassMethodParameter> getInput();

  /**
   * Returns the value of the '<em><b>Ouput</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.classdef.DummyJavaClassMethodParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ouput</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ouput</em>' containment reference list.
   * @see org.eclipse.xtext.classdef.ClassdefPackage#getDummyJavaClassMethod_Ouput()
   * @model containment="true"
   * @generated
   */
  EList<DummyJavaClassMethodParameter> getOuput();

} // DummyJavaClassMethod
