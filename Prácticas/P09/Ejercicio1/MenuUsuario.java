public class MenuUsuario {

	private int opcion = 0;

	LectorUsuario reader = new LectorUsuario();
	Usuario usuario = new Usuario();
	Usuario cons2 = new Usuario("George Lucas", "5521563245", "Av.Juárez no.23", "george@hotmail.com", "georgesito", "21-08-1975");
	Usuario cons3 = new Usuario("Juan Luis"); 

	public void pimpMenu() {

		System.out.println("1.- Ingreasr todos los datos");
		System.out.println("2.- Usuario completo");
		System.out.println("3.- Solo un dato del usuario");
		System.out.println("-------------------------------");

			switch(reader.leeInt()) {

				case 1:
				System.out.print("Nombre del usuario: ");
				usuario.setNombre(reader.leeString());
				System.out.print("Teléfono del usuario: ");
				usuario.setTelefono(reader.leeString());
				System.out.print("Dirección del usuario: ");
				usuario.setDireccion(reader.leeString());
				System.out.print("E-mail del usuario: ");
				usuario.setMail(reader.leeString());
				System.out.print("Nickname del usuario: ");
				usuario.setNickname(reader.leeString());
				System.out.print("Fecha de nacimiento del usuario: ");
				usuario.setFecha(reader.leeString());
				System.out.println();
				System.out.println(usuario.toString());
				break;

				case 2:
				System.out.println(cons2.toString());
				break;

				case 3:
				System.out.println(cons3.toString());
			    break;

				default:
				System.out.println("Opción inválida");
				break;
			}
		}

	

	
}