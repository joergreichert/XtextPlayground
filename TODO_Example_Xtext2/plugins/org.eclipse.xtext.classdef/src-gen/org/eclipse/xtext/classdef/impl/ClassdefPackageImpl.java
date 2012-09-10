/**
 */
package org.eclipse.xtext.classdef.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.classdef.ClassDefinitions;
import org.eclipse.xtext.classdef.ClassdefFactory;
import org.eclipse.xtext.classdef.ClassdefPackage;
import org.eclipse.xtext.classdef.DummyJavaClass;
import org.eclipse.xtext.classdef.DummyJavaClassMethod;
import org.eclipse.xtext.classdef.DummyJavaClassMethodParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassdefPackageImpl extends EPackageImpl implements ClassdefPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classDefinitionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dummyJavaClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dummyJavaClassMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dummyJavaClassMethodParameterEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.xtext.classdef.ClassdefPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ClassdefPackageImpl()
  {
    super(eNS_URI, ClassdefFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ClassdefPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ClassdefPackage init()
  {
    if (isInited) return (ClassdefPackage)EPackage.Registry.INSTANCE.getEPackage(ClassdefPackage.eNS_URI);

    // Obtain or create and register package
    ClassdefPackageImpl theClassdefPackage = (ClassdefPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ClassdefPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ClassdefPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theClassdefPackage.createPackageContents();

    // Initialize created meta-data
    theClassdefPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theClassdefPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ClassdefPackage.eNS_URI, theClassdefPackage);
    return theClassdefPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassDefinitions()
  {
    return classDefinitionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassDefinitions_DefinedClasses()
  {
    return (EReference)classDefinitionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDummyJavaClass()
  {
    return dummyJavaClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDummyJavaClass_Name()
  {
    return (EAttribute)dummyJavaClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDummyJavaClass_Description()
  {
    return (EAttribute)dummyJavaClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDummyJavaClass_Methods()
  {
    return (EReference)dummyJavaClassEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDummyJavaClassMethod()
  {
    return dummyJavaClassMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDummyJavaClassMethod_Name()
  {
    return (EAttribute)dummyJavaClassMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDummyJavaClassMethod_Description()
  {
    return (EAttribute)dummyJavaClassMethodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDummyJavaClassMethod_Input()
  {
    return (EReference)dummyJavaClassMethodEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDummyJavaClassMethod_Ouput()
  {
    return (EReference)dummyJavaClassMethodEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDummyJavaClassMethodParameter()
  {
    return dummyJavaClassMethodParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDummyJavaClassMethodParameter_Name()
  {
    return (EAttribute)dummyJavaClassMethodParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDummyJavaClassMethodParameter_Type()
  {
    return (EAttribute)dummyJavaClassMethodParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDummyJavaClassMethodParameter_Description()
  {
    return (EAttribute)dummyJavaClassMethodParameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassdefFactory getClassdefFactory()
  {
    return (ClassdefFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    classDefinitionsEClass = createEClass(CLASS_DEFINITIONS);
    createEReference(classDefinitionsEClass, CLASS_DEFINITIONS__DEFINED_CLASSES);

    dummyJavaClassEClass = createEClass(DUMMY_JAVA_CLASS);
    createEAttribute(dummyJavaClassEClass, DUMMY_JAVA_CLASS__NAME);
    createEAttribute(dummyJavaClassEClass, DUMMY_JAVA_CLASS__DESCRIPTION);
    createEReference(dummyJavaClassEClass, DUMMY_JAVA_CLASS__METHODS);

    dummyJavaClassMethodEClass = createEClass(DUMMY_JAVA_CLASS_METHOD);
    createEAttribute(dummyJavaClassMethodEClass, DUMMY_JAVA_CLASS_METHOD__NAME);
    createEAttribute(dummyJavaClassMethodEClass, DUMMY_JAVA_CLASS_METHOD__DESCRIPTION);
    createEReference(dummyJavaClassMethodEClass, DUMMY_JAVA_CLASS_METHOD__INPUT);
    createEReference(dummyJavaClassMethodEClass, DUMMY_JAVA_CLASS_METHOD__OUPUT);

    dummyJavaClassMethodParameterEClass = createEClass(DUMMY_JAVA_CLASS_METHOD_PARAMETER);
    createEAttribute(dummyJavaClassMethodParameterEClass, DUMMY_JAVA_CLASS_METHOD_PARAMETER__NAME);
    createEAttribute(dummyJavaClassMethodParameterEClass, DUMMY_JAVA_CLASS_METHOD_PARAMETER__TYPE);
    createEAttribute(dummyJavaClassMethodParameterEClass, DUMMY_JAVA_CLASS_METHOD_PARAMETER__DESCRIPTION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(classDefinitionsEClass, ClassDefinitions.class, "ClassDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassDefinitions_DefinedClasses(), this.getDummyJavaClass(), null, "definedClasses", null, 0, -1, ClassDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dummyJavaClassEClass, DummyJavaClass.class, "DummyJavaClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDummyJavaClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, DummyJavaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDummyJavaClass_Description(), ecorePackage.getEString(), "description", null, 0, 1, DummyJavaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDummyJavaClass_Methods(), this.getDummyJavaClassMethod(), null, "methods", null, 0, -1, DummyJavaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dummyJavaClassMethodEClass, DummyJavaClassMethod.class, "DummyJavaClassMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDummyJavaClassMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, DummyJavaClassMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDummyJavaClassMethod_Description(), ecorePackage.getEString(), "description", null, 0, 1, DummyJavaClassMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDummyJavaClassMethod_Input(), this.getDummyJavaClassMethodParameter(), null, "input", null, 0, -1, DummyJavaClassMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDummyJavaClassMethod_Ouput(), this.getDummyJavaClassMethodParameter(), null, "ouput", null, 0, -1, DummyJavaClassMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dummyJavaClassMethodParameterEClass, DummyJavaClassMethodParameter.class, "DummyJavaClassMethodParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDummyJavaClassMethodParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, DummyJavaClassMethodParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDummyJavaClassMethodParameter_Type(), ecorePackage.getEString(), "type", null, 0, 1, DummyJavaClassMethodParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDummyJavaClassMethodParameter_Description(), ecorePackage.getEString(), "description", null, 0, 1, DummyJavaClassMethodParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ClassdefPackageImpl
