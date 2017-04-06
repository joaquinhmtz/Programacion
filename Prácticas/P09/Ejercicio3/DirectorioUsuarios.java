 public class DirectorioUsuarios {

 	private String user1 = "joaquinhmtz";
 	private String contra1 = "contraseña";

 	public DirectorioUsuarios(){

 		String cons1 = this.user1;
 		String cons2 = this.contra1;
 	}

 	public void iniciarSesion(String nickname, String contraseña) {
 		
 		DirectorioUsuarios obj1 = new DirectorioUsuarios();


 		if(nickname.equals(user1) && contraseña.equals(contra1)){
 			System.out.println("Acceso Correcto");
 			
 		} else
 		System.out.println("Acceso Denegado. Datos incorrectos");	
 		
 	}


 } 
