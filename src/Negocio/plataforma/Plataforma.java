/**
 * 
 */
package Negocio.plataforma;

import java.util.Collection;

import javax.persistence.*;


import Negocio.programaPlataforma.ProgramaPlataforma;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
@Entity
public class Plataforma {
	@Id
	private Integer ID;
	
	private String tipo;

	////////////////////////////
	//private Collection<ProgramaPlataforma> asociacion;
	//////////////////////////////
	
	
	
	public Integer getID() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return ID;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getTipo() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return tipo;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setTipo(String t) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		this.tipo=t;
		// end-user-code
	}

	public Plataforma() {
		// begin-user-code
		// TODO Apéndice de constructor generado automáticamente
		// end-user-code
	}

	public void setId(int i) {
		// TODO Auto-generated method stub
		ID=i;
	}
/*
	public Collection<ProgramaPlataforma> getAsociacion() {
		return asociacion;
	}

	public void setAsociacion(Collection<ProgramaPlataforma> asociacion) {
		this.asociacion = asociacion;
	}*/
}