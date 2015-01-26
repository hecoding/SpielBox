package Negocio.programaPlataforma;

import java.io.Serializable;

public class ProgramaPlataformaId implements Serializable{
	
	private int programa;
	private int plataforma;
	
	public int getPrograma() {
		return programa;
	}
	public void setPrograma(int programa) {
		this.programa = programa;
	}
	public int getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(int plataforma) {
		this.plataforma = plataforma;
	}
}
