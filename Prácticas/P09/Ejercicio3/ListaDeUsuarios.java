public class ListaDeUsuarios {

	private String nickname;
	private String contraseña;

	public void setNickname(String nickname_p) {
		this.nickname= nickname_p;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setContraseña(String contraseña_p) {
		this.contraseña = contraseña_p;
	}

	public String getContraseña() {
		return this.contraseña;
	}
}