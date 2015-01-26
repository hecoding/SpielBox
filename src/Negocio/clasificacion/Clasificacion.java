package Negocio.clasificacion;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import Negocio.programa.Programa;
import Presentacion.controlador.Generador;

@Entity
public class Clasificacion {
	@Id
	private Integer ID;
	private String dificultad;
	
	@OneToMany(mappedBy = "clasificacion")
	private Collection <Programa> programas;
	
	public Clasificacion() {
		this.ID = Generador.generaIds();
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
}