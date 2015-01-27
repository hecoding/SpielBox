package Negocio.programa;


public class TransferPrograma {
	private Integer ID;
	private String nombre;
	private Float version;
	private String requisitos;
	private String funcionalidad;
	protected Float precio;

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

	public Float getPrecio() {
		
		return precio;
	}

	public void setPrecio(Float precio) {
		
		this.precio = precio;
	}

	public Integer getID() {
		
		return ID;
	}

	public void setID(int generaIds) {

		this.ID = generaIds;
		
	}
}