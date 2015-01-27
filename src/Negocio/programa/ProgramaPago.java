/**
 * 
 */
package Negocio.programa;

import javax.persistence.Entity;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
@Entity
public class ProgramaPago extends Programa {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private float precioFinal;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ProgramaPago() {
		// begin-user-code
		// TODO Apéndice de constructor generado automáticamente
		// end-user-code
	}


	public float getPrecioFinal() {
		return precioFinal;
	}


	public void setPrecioFinal(float precioFinal) {
		this.precioFinal = precioFinal;
	}
}