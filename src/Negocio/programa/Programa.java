/**
 * 
 */
package Negocio.programa;

import java.util.Collection;

import javax.persistence.*;

import Negocio.programaPlataforma.ProgramaPlataforma;

@Entity
public class Programa {
	@Id
	private Integer ID;

	private String nombre;

	private Float version;

	private String requisitos;

	private String funcionalidad;

	@OneToMany(mappedBy="programa")
	private Collection<ProgramaPlataforma> asociacion;
	
	public Integer getID() {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return this.ID;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getNombre() {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return nombre;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Float getVersion() {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return version;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getRequisitos() {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return requisitos;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getFuncionalidad() {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return funcionalidad;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setNombre(String n) {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.nombre=n;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setVersion(Float f) {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.version=f;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setRequisitos(String r) {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.requisitos=r;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setFuncionalidad(String f) {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.funcionalidad=f;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Programa() {
		// begin-user-code
		// TODO Ap�ndice de constructor generado autom�ticamente
		// end-user-code
	}
}