package Negocio.clasificacion;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import Negocio.programa.Programa;

@Entity
public class Clasificacion implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ID;
	private String dificultad;
	
	@OneToMany(mappedBy = "clasificacion", cascade ={CascadeType.REMOVE})
	private Collection <Programa> programas;
	
	public Clasificacion() {
		
		//this.ID = Generador.generaIds();
	}
	
	public Integer getID() {
		
		return this.ID;
	}

	public String getDificultad() {
		
		return this.dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}
	
	public Collection<Programa> getProgramas() {
		return this.programas;
	}

	public void setAsociacion (Collection<Programa> programas) {
		this.programas = programas;
	}
}