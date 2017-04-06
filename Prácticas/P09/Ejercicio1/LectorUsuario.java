import java.io.*;

public class LectorUsuario {

	int tamanio;
	String dato;
	int opcion;

	private InputStreamReader isr = new InputStreamReader(System.in);
	private BufferedReader br = new BufferedReader(isr);

	public String leeString() {
		try{
			dato = br.readLine();
		}catch(IOException e) {}
		return dato;
	}

	public int leeInt() {
		try{
			dato = br.readLine();
			opcion = Integer.parseInt(dato);
		}catch(IOException e) {}
		return opcion;
	}

}