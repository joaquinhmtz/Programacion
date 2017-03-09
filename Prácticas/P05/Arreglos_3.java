import java.io.*;

public class Arreglos_3 {
	public static void main (String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader flujoE = new BufferedReader(isr);
		PrintStream flujoS = System.out;

		String dato;

		float [] calif = new float [10];
		String [] nombre = new String [10];
		String [] word = new String [10];
		word [1] = "Reprobado";
		word [2] = "Bien";
		word [3] = "Notable";
		word [4] = "Sobresaliente";

	
		try {


			for(int i = 0; i < calif.length; i++) {

				flujoS.println("Calificación: ");
				dato = flujoE.readLine();
				calif[i] = Float.parseFloat(dato);

				if(calif[i] < 0 || calif[i] > 10) {
				flujoS.println("Fuera de rango.");
				}
					flujoS.println("Nombre: ");
					nombre[i] = flujoE.readLine();

				}
			
			for(int i = 0; i < calif.length; i++) {

				if(calif[i] >= 0 && calif[i] <= 4.9) {
					flujoS.println(nombre[i]+", "+"Calificación: " +calif[i] +" " +word[1]);
				}else if(calif[i] >= 5 && calif[i] <= 6.9) {
					flujoS.println(nombre[i]+", "+"Calificación: " +calif[i] +" " +word[2]);
				}else if(calif[i] >= 7 && calif[i] <= 8.9) {
					flujoS.println(nombre[i]+", "+"Calificación: " +calif[i] +" " +word[3]);
				}else if(calif[i] >= 9 && calif[i] <= 10) {
					flujoS.println(nombre[i]+", "+"Calificación: " +calif[i] +" " +word[4]);
				}	

			}
			

		
		}catch(IOException e) {}	
		
				

		 
	}
}
