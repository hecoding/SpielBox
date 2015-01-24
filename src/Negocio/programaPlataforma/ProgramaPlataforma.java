package Negocio.programaPlataforma;

import Negocio.plataforma.Plataforma;
import Negocio.programa.Programa;

public class ProgramaPlataforma {
	private int espacioTotal;
	private Programa programa;
	private Plataforma plataforma;
	
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
