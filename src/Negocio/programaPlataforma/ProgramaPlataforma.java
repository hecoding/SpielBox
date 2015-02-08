package Negocio.programaPlataforma;

import java.io.Serializable;

import javax.persistence.*;

import Negocio.plataforma.Plataforma;
import Negocio.programa.Programa;

@Entity
@IdClass(ProgramaPlataformaId.class)
public class ProgramaPlataforma implements Serializable{
	@Id
	@ManyToOne
	private Programa programa;
	
	@Id
	@ManyToOne
	private Plataforma plataforma;
	
	private int espacioTotal;
	
	public int getEspacioTotal() {
		return espacioTotal;
	}
	public void setEspacioTotal(int espacioTotal) {
		this.espacioTotal = espacioTotal;
	}
	public Programa getPrograma() {
		return programa;
	}
	public void setPrograma(Programa programa) {
		this.programa = programa;
	}
	public Plataforma getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}
}
