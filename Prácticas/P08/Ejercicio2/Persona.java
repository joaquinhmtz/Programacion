import java.io.*;

public class Persona { //NOMBRE

	private String nombre; //ATRIBUTOS 
	private static int num;//ATRIBUTOS ESTÁTICOS

	private InputStreamReader isr = new InputStreamReader(System.in);
	private BufferedReader br = new BufferedReader(isr);

	//MÉTODOS
	
	/*public String pimpLeeNombre() {
		System.out.print("Nombre del propietario: ");
		return leeNombre();
	}
	private String leeNombre() {
		try{
			nombre = br.readLine();
		}catch(IOException e) {}
		return nombre;
	}*/

	//CONSTRUCTORES

	public void mosNombre() {
		System.out.println("Nombre: "+nombre);
	}

	public Persona() {
		nombre = "\0";
	}

	public Persona(String nombre_p) {
		nombre = nombre_p;
	}

}