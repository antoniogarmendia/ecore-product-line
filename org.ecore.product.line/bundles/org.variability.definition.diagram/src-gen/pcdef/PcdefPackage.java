/**
 */
package pcdef;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pcdef.PcdefFactory
 * @model kind="package"
 * @generated
 */
public interface PcdefPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pcdef";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pc.definition.diagram/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pcdef";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcdefPackage eINSTANCE = pcdef.impl.PcdefPackageImpl.init();

	/**
	 * The meta object id for the '{@link pcdef.impl.RepresentationExtensionFeatureImpl <em>Representation Extension Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcdef.impl.RepresentationExtensionFeatureImpl
	 * @see pcdef.impl.PcdefPackageImpl#getRepresentationExtensionFeature()
	 * @generated
	 */
	int REPRESENTATION_EXTENSION_FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EXTENSION_FEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Viewpoint Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EXTENSION_FEATURE__VIEWPOINT_URI = 1;

	/**
	 * The feature id for the '<em><b>Representation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EXTENSION_FEATURE__REPRESENTATION_NAME = 2;

	/**
	 * The number of structural features of the '<em>Representation Extension Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EXTENSION_FEATURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Representation Extension Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EXTENSION_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pcdef.impl.PCDiagramDefinitionImpl <em>PC Diagram Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcdef.impl.PCDiagramDefinitionImpl
	 * @see pcdef.impl.PcdefPackageImpl#getPCDiagramDefinition()
	 * @generated
	 */
	int PC_DIAGRAM_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_DIAGRAM_DEFINITION__NAME = REPRESENTATION_EXTENSION_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Viewpoint Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_DIAGRAM_DEFINITION__VIEWPOINT_URI = REPRESENTATION_EXTENSION_FEATURE__VIEWPOINT_URI;

	/**
	 * The feature id for the '<em><b>Representation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_DIAGRAM_DEFINITION__REPRESENTATION_NAME = REPRESENTATION_EXTENSION_FEATURE__REPRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Graphical Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_DIAGRAM_DEFINITION__GRAPHICAL_ELEMENTS = REPRESENTATION_EXTENSION_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_DIAGRAM_DEFINITION__PREDICATES = REPRESENTATION_EXTENSION_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PC Diagram Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_DIAGRAM_DEFINITION_FEATURE_COUNT = REPRESENTATION_EXTENSION_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PC Diagram Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_DIAGRAM_DEFINITION_OPERATION_COUNT = REPRESENTATION_EXTENSION_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcdef.impl.StrongerThanImpl <em>Stronger Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcdef.impl.StrongerThanImpl
	 * @see pcdef.impl.PcdefPackageImpl#getStrongerThan()
	 * @generated
	 */
	int STRONGER_THAN = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONGER_THAN__REF = 0;

	/**
	 * The feature id for the '<em><b>Is Source Stronger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONGER_THAN__IS_SOURCE_STRONGER = 1;

	/**
	 * The number of structural features of the '<em>Stronger Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONGER_THAN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stronger Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONGER_THAN_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link pcdef.RepresentationExtensionFeature <em>Representation Extension Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation Extension Feature</em>'.
	 * @see pcdef.RepresentationExtensionFeature
	 * @generated
	 */
	EClass getRepresentationExtensionFeature();

	/**
	 * Returns the meta object for the attribute '{@link pcdef.RepresentationExtensionFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pcdef.RepresentationExtensionFeature#getName()
	 * @see #getRepresentationExtensionFeature()
	 * @generated
	 */
	EAttribute getRepresentationExtensionFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link pcdef.RepresentationExtensionFeature#getViewpointUri <em>Viewpoint Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Viewpoint Uri</em>'.
	 * @see pcdef.RepresentationExtensionFeature#getViewpointUri()
	 * @see #getRepresentationExtensionFeature()
	 * @generated
	 */
	EAttribute getRepresentationExtensionFeature_ViewpointUri();

	/**
	 * Returns the meta object for the attribute '{@link pcdef.RepresentationExtensionFeature#getRepresentationName <em>Representation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation Name</em>'.
	 * @see pcdef.RepresentationExtensionFeature#getRepresentationName()
	 * @see #getRepresentationExtensionFeature()
	 * @generated
	 */
	EAttribute getRepresentationExtensionFeature_RepresentationName();

	/**
	 * Returns the meta object for class '{@link pcdef.PCDiagramDefinition <em>PC Diagram Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PC Diagram Definition</em>'.
	 * @see pcdef.PCDiagramDefinition
	 * @generated
	 */
	EClass getPCDiagramDefinition();

	/**
	 * Returns the meta object for the reference list '{@link pcdef.PCDiagramDefinition#getGraphicalElements <em>Graphical Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Graphical Elements</em>'.
	 * @see pcdef.PCDiagramDefinition#getGraphicalElements()
	 * @see #getPCDiagramDefinition()
	 * @generated
	 */
	EReference getPCDiagramDefinition_GraphicalElements();

	/**
	 * Returns the meta object for the containment reference list '{@link pcdef.PCDiagramDefinition#getPredicates <em>Predicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predicates</em>'.
	 * @see pcdef.PCDiagramDefinition#getPredicates()
	 * @see #getPCDiagramDefinition()
	 * @generated
	 */
	EReference getPCDiagramDefinition_Predicates();

	/**
	 * Returns the meta object for class '{@link pcdef.StrongerThan <em>Stronger Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stronger Than</em>'.
	 * @see pcdef.StrongerThan
	 * @generated
	 */
	EClass getStrongerThan();

	/**
	 * Returns the meta object for the reference '{@link pcdef.StrongerThan#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see pcdef.StrongerThan#getRef()
	 * @see #getStrongerThan()
	 * @generated
	 */
	EReference getStrongerThan_Ref();

	/**
	 * Returns the meta object for the attribute '{@link pcdef.StrongerThan#isIsSourceStronger <em>Is Source Stronger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Source Stronger</em>'.
	 * @see pcdef.StrongerThan#isIsSourceStronger()
	 * @see #getStrongerThan()
	 * @generated
	 */
	EAttribute getStrongerThan_IsSourceStronger();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PcdefFactory getPcdefFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pcdef.impl.RepresentationExtensionFeatureImpl <em>Representation Extension Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcdef.impl.RepresentationExtensionFeatureImpl
		 * @see pcdef.impl.PcdefPackageImpl#getRepresentationExtensionFeature()
		 * @generated
		 */
		EClass REPRESENTATION_EXTENSION_FEATURE = eINSTANCE.getRepresentationExtensionFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPRESENTATION_EXTENSION_FEATURE__NAME = eINSTANCE.getRepresentationExtensionFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Viewpoint Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPRESENTATION_EXTENSION_FEATURE__VIEWPOINT_URI = eINSTANCE
				.getRepresentationExtensionFeature_ViewpointUri();

		/**
		 * The meta object literal for the '<em><b>Representation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPRESENTATION_EXTENSION_FEATURE__REPRESENTATION_NAME = eINSTANCE
				.getRepresentationExtensionFeature_RepresentationName();

		/**
		 * The meta object literal for the '{@link pcdef.impl.PCDiagramDefinitionImpl <em>PC Diagram Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcdef.impl.PCDiagramDefinitionImpl
		 * @see pcdef.impl.PcdefPackageImpl#getPCDiagramDefinition()
		 * @generated
		 */
		EClass PC_DIAGRAM_DEFINITION = eINSTANCE.getPCDiagramDefinition();

		/**
		 * The meta object literal for the '<em><b>Graphical Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PC_DIAGRAM_DEFINITION__GRAPHICAL_ELEMENTS = eINSTANCE.getPCDiagramDefinition_GraphicalElements();

		/**
		 * The meta object literal for the '<em><b>Predicates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PC_DIAGRAM_DEFINITION__PREDICATES = eINSTANCE.getPCDiagramDefinition_Predicates();

		/**
		 * The meta object literal for the '{@link pcdef.impl.StrongerThanImpl <em>Stronger Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcdef.impl.StrongerThanImpl
		 * @see pcdef.impl.PcdefPackageImpl#getStrongerThan()
		 * @generated
		 */
		EClass STRONGER_THAN = eINSTANCE.getStrongerThan();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRONGER_THAN__REF = eINSTANCE.getStrongerThan_Ref();

		/**
		 * The meta object literal for the '<em><b>Is Source Stronger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRONGER_THAN__IS_SOURCE_STRONGER = eINSTANCE.getStrongerThan_IsSourceStronger();

	}

} //PcdefPackage
