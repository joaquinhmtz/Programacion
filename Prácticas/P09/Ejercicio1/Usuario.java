public class Usuario {

	private String nombre;
	private String telefono;
	private String direccion;
	private String mail;
	private String nickname;
	private String fecha;

	public Usuario() {
		
	}

	public Usuario(String nombre_pa, String telefono_pa, String direccion_pa, String mail_pa, String nickname_pa, String fecha_pa) {
		this.nombre = nombre_pa;
		this.telefono = telefono_pa;
		this.direccion = direccion_pa;
		this.mail = mail_pa;
		this.nickname = nickname_pa;
		this.fecha = fecha_pa;
	}

	public Usuario(String nombre_pa) {
		this.nombre = nombre_pa;
		this.telefono = null;
		this.direccion = null;
		this.mail = null;
		this.nickname = null;
		this.fecha = null;
	}

	public void setNombre(String nombre_p) {
		this.nombre = nombre_p;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setTelefono(String telefono_p) {
		this.telefono = telefono_p;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setDireccion(String direccion_p) {
		this.direccion = direccion_p;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setMail(String mail_p) {
		this.mail = mail_p;
	}

	public String getMail() {
		return this.mail;
	}

	public void setNickname(String nickname_p) {
		this.nickname = nickname_p;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setFecha(String fecha_p) {
		this.fecha = fecha_p;
	}

	public String getFecha() {
		return this.fecha;
	}

	public String toString() {
		return ("Nombre: "+this.nombre+"\n") +
        ("Teléfono: "+this.telefono+"\n")+
        ("Dirección: "+ this.direccion+"\n")+("Mail: "+this.mail+"\n")+("Nickname: "+this.nickname+"\n")+
        ("Fecha de nacimiento: "+this.fecha+"\n");
	}
}