package Negocio.clasificacion;

import javax.persistence.Entity;
import javax.persistence.Id;

import Presentacion.controlador.Generador;

@Entity
public class Clasificacion {
	@Id
	private Integer ID;
	private String dificultad;
	
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