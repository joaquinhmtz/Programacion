import java.io.*;

public class LectorUsuario {

	int tamanio;
	String dato;
	int i;

	private InputStreamReader isr = new InputStreamReader(System.in);
	private BufferedReader br = new BufferedReader(isr);

	public String leeString() {
		try{
			dato = br.readLine();
		}catch(IOException e) {}
		return dato;
	}

}