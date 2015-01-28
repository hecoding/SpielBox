
package Negocio.programa;

import java.util.Collection;

import javax.persistence.*;

import Negocio.clasificacion.Clasificacion;
import Negocio.programaPlataforma.ProgramaPlataforma;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
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
	
	public Programa() {
		
	}
	
	public Integer getID() {
		
		return this.ID;
	}

	
	public String getNombre() {
		
		return nombre;
	}

	
	public Float getVersion() {
		
		return version;
	}

	
	public String getRequisitos() {
		
		return requisitos;
	}

	
	public String getFuncionalidad() {
		
		return funcionalidad;
	}

	
	public void setNombre(String n) {
		
		this.nombre=n;
	}

	
	public void setVersion(Float f) {
		
		this.version=f;
	}

	
	public void setRequisitos(String r) {
		
		this.requisitos=r;
	}
	
	public void setFuncionalidad(String f) {
		
		this.funcionalidad=f;
	}

	public Float getPrecio() {
		
		return precio;
	}

	public void setPrecio(Float precio) {
		
		this.precio = precio;
	}
}