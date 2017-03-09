import java.io.*;
import java.util.Random;

public class Arreglos_2 {
	public static void main (String[] args) {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader flujoE = new BufferedReader(isr);
		PrintStream flujoS = System.out; 

		String dato;

		int vector [];
		int tamaño;
		int cifra;

		try {

			flujoS.println("¿De qué tamaño es su vector?");
			dato = flujoE.readLine();
			tamaño = Integer.parseInt(dato);

			vector = new int [tamaño];
			Random r = new Random();

			flujoS.println();

			for(int i = 0; i < vector.length; i++) {
				vector[i] = (r.nextInt(300));
				flujoS.println(vector[i]);
			}

			flujoS.println("Ingresa número, que será la última cifra, con está sabremos que cantidades tienen este último número: ");				dato = flujoE.readLine();
			cifra = Integer.parseInt(dato);

			if(cifra >= 0 && cifra <= 9) {
				
				for(int i = 0; i < vector.length; i++) {
					if(vector[i]%10 == cifra) {
					flujoS.println("El número es: "+vector[i]);
					}							}
			} else flujoS.println("No ingresaste un dígito válido.");


		}catch(IOException e) {}

	}
}


