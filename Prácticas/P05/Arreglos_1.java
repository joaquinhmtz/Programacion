import java.io.*;

public class Arreglos_1 {
	public static void main (String[] args) {
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader flujoE = new BufferedReader(isr);
	PrintStream flujoS = System.out;

	String dato;
	int aux = 0;
	int mediana = 0;
	int []vector = new int[7];

	try {

	for(int i = 0; i < vector.length; i++) {
	flujoS.println("Ingresa un número: ");
	dato = flujoE.readLine();
	vector[i] = Integer.parseInt(dato);	
	}	

	for(int i = 0; i < vector.length; i++) {
		for(int j = i+1; j < vector.length; j++) {
			if(vector[i] > vector[j]) {
				aux = vector[j];
				vector[j] = vector[i];
				vector[i] = aux;
			}
		}
	}

	mediana = vector[vector.length/2];

	flujoS.println("La mediana de los numeros es: "+mediana);
	
	}catch(IOException e) {}

}

}