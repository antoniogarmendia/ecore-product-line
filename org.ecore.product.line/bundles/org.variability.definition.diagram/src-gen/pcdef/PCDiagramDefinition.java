/**
 */
package pcdef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.sirius.diagram.description.DiagramElementMapping;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PC Diagram Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcdef.PCDiagramDefinition#getGraphicalElements <em>Graphical Elements</em>}</li>
 *   <li>{@link pcdef.PCDiagramDefinition#getPredicates <em>Predicates</em>}</li>
 * </ul>
 *
 * @see pcdef.PcdefPackage#getPCDiagramDefinition()
 * @model
 * @generated
 */
public interface PCDiagramDefinition extends RepresentationExtensionFeature {
	/**
	 * Returns the value of the '<em><b>Graphical Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.diagram.description.DiagramElementMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphical Elements</em>' reference list.
	 * @see pcdef.PcdefPackage#getPCDiagramDefinition_GraphicalElements()
	 * @model required="true"
	 * @generated
	 */
	EList<DiagramElementMapping> getGraphicalElements();

	/**
	 * Returns the value of the '<em><b>Predicates</b></em>' containment reference list.
	 * The list contents are of type {@link pcdef.StrongerThan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicates</em>' containment reference list.
	 * @see pcdef.PcdefPackage#getPCDiagramDefinition_Predicates()
	 * @model containment="true"
	 * @generated
	 */
	EList<StrongerThan> getPredicates();

} // PCDiagramDefinition
