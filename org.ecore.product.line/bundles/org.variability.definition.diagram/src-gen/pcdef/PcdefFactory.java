/**
 */
package pcdef;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pcdef.PcdefPackage
 * @generated
 */
public interface PcdefFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcdefFactory eINSTANCE = pcdef.impl.PcdefFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PC Diagram Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PC Diagram Definition</em>'.
	 * @generated
	 */
	PCDiagramDefinition createPCDiagramDefinition();

	/**
	 * Returns a new object of class '<em>Stronger Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stronger Than</em>'.
	 * @generated
	 */
	StrongerThan createStrongerThan();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PcdefPackage getPcdefPackage();

} //PcdefFactory
