/**
 * 
 */
package Negocio.clasificacion;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TransferClasificacion {
	private Integer ID;
	private String dificultad;
	
	public TransferClasificacion() {
		
	}
	
	public void setID(Integer iD) {
		this.ID = iD;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}
	
	public Integer getID() {
		
		return this.ID;
	}

	public String getDificultad() {
		
		return this.dificultad;
	}
	
	public String toString() {
		return "ID: " + this.ID + System.lineSeparator() + "Dificultad: " + this.dificultad;
	}
}