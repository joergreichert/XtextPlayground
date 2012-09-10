/**
 */
package org.eclipse.xtext.classdef.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.classdef.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassdefFactoryImpl extends EFactoryImpl implements ClassdefFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ClassdefFactory init()
  {
    try
    {
      ClassdefFactory theClassdefFactory = (ClassdefFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/xtext/Classdef"); 
      if (theClassdefFactory != null)
      {
        return theClassdefFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ClassdefFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassdefFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ClassdefPackage.CLASS_DEFINITIONS: return createClassDefinitions();
      case ClassdefPackage.DUMMY_JAVA_CLASS: return createDummyJavaClass();
      case ClassdefPackage.DUMMY_JAVA_CLASS_METHOD: return createDummyJavaClassMethod();
      case ClassdefPackage.DUMMY_JAVA_CLASS_METHOD_PARAMETER: return createDummyJavaClassMethodParameter();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDefinitions createClassDefinitions()
  {
    ClassDefinitionsImpl classDefinitions = new ClassDefinitionsImpl();
    return classDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DummyJavaClass createDummyJavaClass()
  {
    DummyJavaClassImpl dummyJavaClass = new DummyJavaClassImpl();
    return dummyJavaClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DummyJavaClassMethod createDummyJavaClassMethod()
  {
    DummyJavaClassMethodImpl dummyJavaClassMethod = new DummyJavaClassMethodImpl();
    return dummyJavaClassMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DummyJavaClassMethodParameter createDummyJavaClassMethodParameter()
  {
    DummyJavaClassMethodParameterImpl dummyJavaClassMethodParameter = new DummyJavaClassMethodParameterImpl();
    return dummyJavaClassMethodParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassdefPackage getClassdefPackage()
  {
    return (ClassdefPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ClassdefPackage getPackage()
  {
    return ClassdefPackage.eINSTANCE;
  }

} //ClassdefFactoryImpl
