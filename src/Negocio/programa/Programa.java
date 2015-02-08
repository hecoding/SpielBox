
package Negocio.programa;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

import Negocio.clasificacion.Clasificacion;
import Negocio.programaPlataforma.ProgramaPlataforma;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Programa  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ID;

	private String nombre;

	private Float version;
	
	//private Float precio;

	private String requisitos;

	private String funcionalidad;

	@OneToMany(mappedBy="programa", cascade = {CascadeType.REMOVE})
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

	public void setClasificacion(Clasificacion c) {
		this.clasificacion = c;
	}
	
	public Clasificacion getClasificacion() {
		return this.clasificacion;
	}
	
}
