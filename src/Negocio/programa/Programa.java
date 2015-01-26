
package Negocio.programa;

import java.util.Collection;

import javax.persistence.*;

import Negocio.clasificacion.Clasificacion;
import Negocio.programaPlataforma.ProgramaPlataforma;

@Entity
public class Programa {
	@Id
	private Integer ID;

	private String nombre;

	private Float version;
	
	private Float precio;

	private String requisitos;

	private String funcionalidad;

	@OneToMany(mappedBy="programa")
	private Collection<ProgramaPlataforma> asociacion;
	@ManyToOne
	private Clasificacion clasificacion;
	
	public Integer getID() {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return this.ID;
		// end-user-code
	}

	
	public String getNombre() {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return nombre;
		// end-user-code
	}

	
	public Float getVersion() {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return version;
		// end-user-code
	}

	
	public String getRequisitos() {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return requisitos;
		// end-user-code
	}

	
	public String getFuncionalidad() {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return funcionalidad;
		// end-user-code
	}

	
	public void setNombre(String n) {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.nombre=n;
		// end-user-code
	}

	
	public void setVersion(Float f) {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.version=f;
		// end-user-code
	}

	
	public void setRequisitos(String r) {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.requisitos=r;
		// end-user-code
	}

	
	public void setFuncionalidad(String f) {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.funcionalidad=f;
		// end-user-code
	}

	
	public Programa() {
		// begin-user-code
		// TODO Ap�ndice de constructor generado autom�ticamente
		// end-user-code
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}
}