import java.io.*;

public class Cajon {  //NOMBRE

	private  String tamanio;			//ATRIBUTOS
	private  String tipo;				//ATRIBUTOS ESTÁTICOS
	private  int numero;
	private static String dato;

	private InputStreamReader isr = new InputStreamReader(System.in);
	private BufferedReader br = new BufferedReader(isr);

	//MÉTODOS

	public String pimpLeetamanio() {
		System.out.print("Tamaño del automóvil: ");
		return leeTamanio();
	}
	private String leeTamanio() {
		try{
			tamanio = br.readLine();
		}catch(IOException e) {}
		return tamanio;
	}
	public String pimpLeeTipo() {
		System.out.print("Discapacitado/NO Discapacitado: ");
		return leetipo();
	}
	private String leetipo() {
		try{
			tipo = br.readLine();
		}catch(IOException e) {}
		return tipo;
	}
	public void pimpLeeNumero() {
		System.out.print("Número de cajón asignado: ");
		 this.Condition();

	}
	private int leenumero() {
		int a = 0;
		while(a==0){
		try{
			dato = br.readLine();
			numero = Integer.parseInt(dato);
			a++;
		}catch(IOException e) {

		}catch(NumberFormatException e){
			System.out.println("Numero no valio");
		}
	}
		return numero;
	}
	private void Condition() {
		this.leenumero();		
		int num_param = 0;
		num_param = numero;
		if(num_param == numero) {
			System.out.println("El cajón designado, ya está ocupado");
		} else
			System.out.println("El cajón designado, está libre");

	}

	public void mosDatos() {
		System.out.println("Tamanio: "+tamanio +" Tipo: "+tipo);
	}



	//CONSTRUCTORES

	public Cajon() {
		tamanio = null;
		tipo = null;
	}

	public Cajon(String tamanio_p, String tipo_p) {
		tamanio = tamanio_p;
		tipo = tipo_p;
	}
}
