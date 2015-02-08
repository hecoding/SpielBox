
package Negocio.plataforma;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;


import Negocio.programaPlataforma.ProgramaPlataforma;


@Entity
public class Plataforma implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ID;
	
	private String tipo;

	///*
	@OneToMany(mappedBy="plataforma")
	private Collection<ProgramaPlataforma> asociacion;
	//////////////////////////////*/
	
	
	
	public Integer getID() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return ID;
		// end-user-code
	}

	
	public String getTipo() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return tipo;
		// end-user-code
	}

	
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

	public Plataforma(int i, String tipo2) {
		// TODO Auto-generated constructor stub
		ID=i;
		tipo=tipo2;
	}

	public Collection<ProgramaPlataforma> getAsociacion() {
		return asociacion;
	}

	public void setAsociacion(Collection<ProgramaPlataforma> asociacion) {
		this.asociacion = asociacion;
	}
}