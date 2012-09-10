/**
 */
package org.eclipse.xtext.classdef;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.classdef.ClassdefFactory
 * @model kind="package"
 * @generated
 */
public interface ClassdefPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "classdef";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/xtext/Classdef";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "classdef";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ClassdefPackage eINSTANCE = org.eclipse.xtext.classdef.impl.ClassdefPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.xtext.classdef.impl.ClassDefinitionsImpl <em>Class Definitions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.classdef.impl.ClassDefinitionsImpl
   * @see org.eclipse.xtext.classdef.impl.ClassdefPackageImpl#getClassDefinitions()
   * @generated
   */
  int CLASS_DEFINITIONS = 0;

  /**
   * The feature id for the '<em><b>Defined Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DEFINITIONS__DEFINED_CLASSES = 0;

  /**
   * The number of structural features of the '<em>Class Definitions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DEFINITIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.classdef.impl.DummyJavaClassImpl <em>Dummy Java Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.classdef.impl.DummyJavaClassImpl
   * @see org.eclipse.xtext.classdef.impl.ClassdefPackageImpl#getDummyJavaClass()
   * @generated
   */
  int DUMMY_JAVA_CLASS = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUMMY_JAVA_CLASS__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUMMY_JAVA_CLASS__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUMMY_JAVA_CLASS__METHODS = 2;

  /**
   * The number of structural features of the '<em>Dummy Java Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUMMY_JAVA_CLASS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.classdef.impl.DummyJavaClassMethodImpl <em>Dummy Java Class Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.classdef.impl.DummyJavaClassMethodImpl
   * @see org.eclipse.xtext.classdef.impl.ClassdefPackageImpl#getDummyJavaClassMethod()
   * @generated
   */
  int DUMMY_JAVA_CLASS_METHOD = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUMMY_JAVA_CLASS_METHOD__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUMMY_JAVA_CLASS_METHOD__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUMMY_JAVA_CLASS_METHOD__INPUT = 2;

  /**
   * The feature id for the '<em><b>Ouput</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUMMY_JAVA_CLASS_METHOD__OUPUT = 3;

  /**
   * The number of structural features of the '<em>Dummy Java Class Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUMMY_JAVA_CLASS_METHOD_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.classdef.impl.DummyJavaClassMethodParameterImpl <em>Dummy Java Class Method Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.classdef.impl.DummyJavaClassMethodParameterImpl
   * @see org.eclipse.xtext.classdef.impl.ClassdefPackageImpl#getDummyJavaClassMethodParameter()
   * @generated
   */
  int DUMMY_JAVA_CLASS_METHOD_PARAMETER = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUMMY_JAVA_CLASS_METHOD_PARAMETER__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUMMY_JAVA_CLASS_METHOD_PARAMETER__TYPE = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUMMY_JAVA_CLASS_METHOD_PARAMETER__DESCRIPTION = 2;

  /**
   * The number of structural features of the '<em>Dummy Java Class Method Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUMMY_JAVA_CLASS_METHOD_PARAMETER_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.classdef.ClassDefinitions <em>Class Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Definitions</em>'.
   * @see org.eclipse.xtext.classdef.ClassDefinitions
   * @generated
   */
  EClass getClassDefinitions();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.classdef.ClassDefinitions#getDefinedClasses <em>Defined Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Defined Classes</em>'.
   * @see org.eclipse.xtext.classdef.ClassDefinitions#getDefinedClasses()
   * @see #getClassDefinitions()
   * @generated
   */
  EReference getClassDefinitions_DefinedClasses();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.classdef.DummyJavaClass <em>Dummy Java Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dummy Java Class</em>'.
   * @see org.eclipse.xtext.classdef.DummyJavaClass
   * @generated
   */
  EClass getDummyJavaClass();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.classdef.DummyJavaClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.classdef.DummyJavaClass#getName()
   * @see #getDummyJavaClass()
   * @generated
   */
  EAttribute getDummyJavaClass_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.classdef.DummyJavaClass#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.xtext.classdef.DummyJavaClass#getDescription()
   * @see #getDummyJavaClass()
   * @generated
   */
  EAttribute getDummyJavaClass_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.classdef.DummyJavaClass#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see org.eclipse.xtext.classdef.DummyJavaClass#getMethods()
   * @see #getDummyJavaClass()
   * @generated
   */
  EReference getDummyJavaClass_Methods();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.classdef.DummyJavaClassMethod <em>Dummy Java Class Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dummy Java Class Method</em>'.
   * @see org.eclipse.xtext.classdef.DummyJavaClassMethod
   * @generated
   */
  EClass getDummyJavaClassMethod();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.classdef.DummyJavaClassMethod#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.classdef.DummyJavaClassMethod#getName()
   * @see #getDummyJavaClassMethod()
   * @generated
   */
  EAttribute getDummyJavaClassMethod_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.classdef.DummyJavaClassMethod#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.xtext.classdef.DummyJavaClassMethod#getDescription()
   * @see #getDummyJavaClassMethod()
   * @generated
   */
  EAttribute getDummyJavaClassMethod_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.classdef.DummyJavaClassMethod#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input</em>'.
   * @see org.eclipse.xtext.classdef.DummyJavaClassMethod#getInput()
   * @see #getDummyJavaClassMethod()
   * @generated
   */
  EReference getDummyJavaClassMethod_Input();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.classdef.DummyJavaClassMethod#getOuput <em>Ouput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ouput</em>'.
   * @see org.eclipse.xtext.classdef.DummyJavaClassMethod#getOuput()
   * @see #getDummyJavaClassMethod()
   * @generated
   */
  EReference getDummyJavaClassMethod_Ouput();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.classdef.DummyJavaClassMethodParameter <em>Dummy Java Class Method Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dummy Java Class Method Parameter</em>'.
   * @see org.eclipse.xtext.classdef.DummyJavaClassMethodParameter
   * @generated
   */
  EClass getDummyJavaClassMethodParameter();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.classdef.DummyJavaClassMethodParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.classdef.DummyJavaClassMethodParameter#getName()
   * @see #getDummyJavaClassMethodParameter()
   * @generated
   */
  EAttribute getDummyJavaClassMethodParameter_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.classdef.DummyJavaClassMethodParameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipse.xtext.classdef.DummyJavaClassMethodParameter#getType()
   * @see #getDummyJavaClassMethodParameter()
   * @generated
   */
  EAttribute getDummyJavaClassMethodParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.classdef.DummyJavaClassMethodParameter#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.xtext.classdef.DummyJavaClassMethodParameter#getDescription()
   * @see #getDummyJavaClassMethodParameter()
   * @generated
   */
  EAttribute getDummyJavaClassMethodParameter_Description();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ClassdefFactory getClassdefFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.xtext.classdef.impl.ClassDefinitionsImpl <em>Class Definitions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.classdef.impl.ClassDefinitionsImpl
     * @see org.eclipse.xtext.classdef.impl.ClassdefPackageImpl#getClassDefinitions()
     * @generated
     */
    EClass CLASS_DEFINITIONS = eINSTANCE.getClassDefinitions();

    /**
     * The meta object literal for the '<em><b>Defined Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DEFINITIONS__DEFINED_CLASSES = eINSTANCE.getClassDefinitions_DefinedClasses();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.classdef.impl.DummyJavaClassImpl <em>Dummy Java Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.classdef.impl.DummyJavaClassImpl
     * @see org.eclipse.xtext.classdef.impl.ClassdefPackageImpl#getDummyJavaClass()
     * @generated
     */
    EClass DUMMY_JAVA_CLASS = eINSTANCE.getDummyJavaClass();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DUMMY_JAVA_CLASS__NAME = eINSTANCE.getDummyJavaClass_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DUMMY_JAVA_CLASS__DESCRIPTION = eINSTANCE.getDummyJavaClass_Description();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DUMMY_JAVA_CLASS__METHODS = eINSTANCE.getDummyJavaClass_Methods();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.classdef.impl.DummyJavaClassMethodImpl <em>Dummy Java Class Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.classdef.impl.DummyJavaClassMethodImpl
     * @see org.eclipse.xtext.classdef.impl.ClassdefPackageImpl#getDummyJavaClassMethod()
     * @generated
     */
    EClass DUMMY_JAVA_CLASS_METHOD = eINSTANCE.getDummyJavaClassMethod();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DUMMY_JAVA_CLASS_METHOD__NAME = eINSTANCE.getDummyJavaClassMethod_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DUMMY_JAVA_CLASS_METHOD__DESCRIPTION = eINSTANCE.getDummyJavaClassMethod_Description();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DUMMY_JAVA_CLASS_METHOD__INPUT = eINSTANCE.getDummyJavaClassMethod_Input();

    /**
     * The meta object literal for the '<em><b>Ouput</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DUMMY_JAVA_CLASS_METHOD__OUPUT = eINSTANCE.getDummyJavaClassMethod_Ouput();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.classdef.impl.DummyJavaClassMethodParameterImpl <em>Dummy Java Class Method Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.classdef.impl.DummyJavaClassMethodParameterImpl
     * @see org.eclipse.xtext.classdef.impl.ClassdefPackageImpl#getDummyJavaClassMethodParameter()
     * @generated
     */
    EClass DUMMY_JAVA_CLASS_METHOD_PARAMETER = eINSTANCE.getDummyJavaClassMethodParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DUMMY_JAVA_CLASS_METHOD_PARAMETER__NAME = eINSTANCE.getDummyJavaClassMethodParameter_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DUMMY_JAVA_CLASS_METHOD_PARAMETER__TYPE = eINSTANCE.getDummyJavaClassMethodParameter_Type();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DUMMY_JAVA_CLASS_METHOD_PARAMETER__DESCRIPTION = eINSTANCE.getDummyJavaClassMethodParameter_Description();

  }

} //ClassdefPackage
