/**
 */
package org.eclipse.xtext.classdef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dummy Java Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.classdef.DummyJavaClass#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.classdef.DummyJavaClass#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.xtext.classdef.DummyJavaClass#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.classdef.ClassdefPackage#getDummyJavaClass()
 * @model
 * @generated
 */
public interface DummyJavaClass extends EObject
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
   * @see org.eclipse.xtext.classdef.ClassdefPackage#getDummyJavaClass_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.classdef.DummyJavaClass#getName <em>Name</em>}' attribute.
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
   * @see org.eclipse.xtext.classdef.ClassdefPackage#getDummyJavaClass_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.classdef.DummyJavaClass#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.classdef.DummyJavaClassMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see org.eclipse.xtext.classdef.ClassdefPackage#getDummyJavaClass_Methods()
   * @model containment="true"
   * @generated
   */
  EList<DummyJavaClassMethod> getMethods();

} // DummyJavaClass
