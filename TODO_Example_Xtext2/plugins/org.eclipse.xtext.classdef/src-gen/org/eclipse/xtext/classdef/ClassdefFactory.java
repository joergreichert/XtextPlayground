/**
 */
package org.eclipse.xtext.classdef;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.classdef.ClassdefPackage
 * @generated
 */
public interface ClassdefFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ClassdefFactory eINSTANCE = org.eclipse.xtext.classdef.impl.ClassdefFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Class Definitions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Definitions</em>'.
   * @generated
   */
  ClassDefinitions createClassDefinitions();

  /**
   * Returns a new object of class '<em>Dummy Java Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dummy Java Class</em>'.
   * @generated
   */
  DummyJavaClass createDummyJavaClass();

  /**
   * Returns a new object of class '<em>Dummy Java Class Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dummy Java Class Method</em>'.
   * @generated
   */
  DummyJavaClassMethod createDummyJavaClassMethod();

  /**
   * Returns a new object of class '<em>Dummy Java Class Method Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dummy Java Class Method Parameter</em>'.
   * @generated
   */
  DummyJavaClassMethodParameter createDummyJavaClassMethodParameter();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ClassdefPackage getClassdefPackage();

} //ClassdefFactory
