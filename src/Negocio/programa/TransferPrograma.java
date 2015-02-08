package Negocio.programa;


public class TransferPrograma {
	private Integer ID;
	private String nombre;
	private Float version;
	private String requisitos;
	private String funcionalidad;
	private String clasificacion;
	
	public String getNombre() {
		
		return nombre;
	}

	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}

	public Float getVersion() {
		
		return version;
	}

	public void setVersion(Float version) {
		
		this.version = version;
	}

	public String getRequisitos() {
		
		return requisitos;
	}

	public void setRequisitos(String requisitos) {
		
		this.requisitos = requisitos;
	}

	public String getFuncionalidad() {
		
		return funcionalidad;
	}

	public void setFuncionalidad(String funcionalidad) {
		
		this.funcionalidad = funcionalidad;
	}
	public Integer getID() {
		
		return ID;
	}

	public void setID(int generaIds) {

		this.ID = generaIds;
		
	}

	public void setClasificacion(String string) {
		this.clasificacion = string;
		
	}
	
	public String getClasificacion() {
		return this.clasificacion;
	}
	
	public String toString() {
		return "ID :" + this.ID + System.lineSeparator() + "Nombre: " + this.nombre + System.lineSeparator() + "Version: " + this.version + System.lineSeparator() + "Requisitos: " + this.requisitos + System.lineSeparator() + "Funcionalidad: " + this.funcionalidad + System.lineSeparator() + "Clasificación: " + this.clasificacion + System.lineSeparator();
	}
}