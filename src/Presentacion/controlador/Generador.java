package Presentacion.controlador;

public class Generador {
	 private static int n= 0;
	 
	 public static int generaIds() {
		  n++;
		  return n;
	}
}
