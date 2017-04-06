public class DirectorioUsuarioTest {
	public static void main(String[] args) {


		ListaDeUsuarios [] lista = new ListaDeUsuarios[1];
		LectorUsuario reader = new LectorUsuario();
		DirectorioUsuarios direc = new DirectorioUsuarios();
		String nickname = "";
		String contraseña = "";
		String aux1 = "0";
		String aux2 = "0";

		for(int  i = 0; i < lista.length; i++){

			ListaDeUsuarios usuario = new ListaDeUsuarios();

			System.out.print("Nickname: ");
			aux1 = reader.leeString();
			System.out.print("Contraseña: ");
			aux2 = reader.leeString();
			direc.iniciarSesion(aux1, aux2);

			lista[i] = usuario;
		}
	}

}