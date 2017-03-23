import java.io.*;

public class Calculadora {
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String dato;
	int option;

	private float num1;
	private float num2;
	private float suma;
	private float resta;
	private float mult;
	private float division;

	public int Menu() {

		System.out.println("1.- Suma");
		System.out.println("2.- Resta");
		System.out.println("3.- Multiplicación");
		System.out.println("4.- División");
		System.out.println("5.- Salir");
		System.out.println("-------------------");
		System.out.print("Seleccione la operación deseada: ");
		try{
			dato = br.readLine();
			option = Integer.parseInt(dato);
		}catch(IOException e){}

		return option;
	}

	public void Datos() {
		System.out.print("Dame el primer número: ");
		try{
			dato = br.readLine();
			num1 = Float.parseFloat(dato);
		}catch(IOException e) {}
		System.out.print("Dame el segundo número: ");
		try{
			dato = br.readLine();
			num2 = Float.parseFloat(dato);
		}catch(IOException e) {}

	}

	public void Suma() {
		suma = num1 + num2;
		System.out.println("Resultado: "+suma);
	}

	public void Resta() {
		resta = num1 - num2;
		System.out.println("Resultado: "+resta);
	}

	public void Multiplicacion() {
		mult = num1 * num2;
		System.out.println("Resultado: "+mult);
	}

	public void Division() {
		division = num1 / num2;
		System.out.println("Resultado: "+division);
	}

	public void Condicion() {
		if(num2 == 0) 
			System.out.println("Tu operación no ha podido ser realizada.");
	}

	public static void main (String[] args) {	

	Calculadora obj = new Calculadora();

		switch(obj.Menu()) {

			case 1:
			System.out.println("Resolución de la suma.");
			obj.Datos();
			obj.Suma();
			break;

			case 2:
			System.out.println("Resolución de la resta.");
			obj.Datos();
			obj.Resta();
			break;

			case 3:
			System.out.println("Resolución de la multiplicación.");
			obj.Datos();
			obj.Multiplicacion();
			break;

			case 4:
			System.out.println("Resolución de la división.");
			obj.Datos();
			obj.Condicion();
			obj.Division();
			break;

		}

	}
}