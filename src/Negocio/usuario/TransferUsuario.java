package Negocio.usuario;

public class TransferUsuario {
	
	private int ID;
	
	private String nombre;
	
	private String apellidos;
	
	private String email;
	
	private String nick;
	
	
	public int getID() {
		
		return this.ID;
	}

	
	public String getNombre() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return this.nombre;
	}

	
	public String getApellidos() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return this.apellidos;
		// end-user-code
	}

	
	public String getEmail() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return this.email;
		// end-user-code
	}

	
	public String getNick() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return this.nick;
		// end-user-code
	}

	public void setNombre(String string) {
		
		this.nombre = string;
	}

	
	public void setApellidos(String string) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		this.apellidos = string;
		// end-user-code
	}

	
	public void setEmail(String string) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		this.email = string;
		// end-user-code
	}

	
	public void setNick(String string) {
		
		this.nick = string;
	}
	
	public void setID(int id) {
		this.ID = id;
	}
}
