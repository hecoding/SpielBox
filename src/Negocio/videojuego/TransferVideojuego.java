package Negocio.videojuego;

import Presentacion.controlador.Eventos;

public class TransferVideojuego {
	
	private int ID;
	
	private String nombre;
	
	private String categoria;
	
	private double calificacion;
	
	private double precio;

	public int getID() {
		return ID;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String name) {
		this.nombre=name;
	}

	public String getCategoria() {
		return categoria;		
	}

	public void setCategoria(String cat) {
		this.categoria=cat;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double d) {
		this.calificacion = d;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double d) {
		this.precio = d;
	}
	
	public String toString() {
		return "Nombre: " + nombre + " Categoría: " + categoria + " Precio: " + Double.toString(precio) + " Calificación: " + Double.toString(calificacion);
		
	}

	public void setID(int Id_Unica) {
		this.ID = Id_Unica;
		Eventos.Id_Unica++;		
	}
}