/**
 */
package org.eclipse.xtext.classdef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.classdef.ClassDefinitions#getDefinedClasses <em>Defined Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.classdef.ClassdefPackage#getClassDefinitions()
 * @model
 * @generated
 */
public interface ClassDefinitions extends EObject
{
  /**
   * Returns the value of the '<em><b>Defined Classes</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.classdef.DummyJavaClass}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Defined Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defined Classes</em>' containment reference list.
   * @see org.eclipse.xtext.classdef.ClassdefPackage#getClassDefinitions_DefinedClasses()
   * @model containment="true"
   * @generated
   */
  EList<DummyJavaClass> getDefinedClasses();

} // ClassDefinitions
