public class String_2 {

	public static void printedCapitalized (String cadena) {

		String cadena2; 
		cadena2 = cadena.toUpperCase();
		System.out.println(cadena2);

	}

	public static void main (String[] args) {

		long TimeStart;
		long TimeEnd;
		long Time;
		TimeStart = System.currentTimeMillis();


		String cadena = "hola mundo";
		printedCapitalized (cadena);



		TimeEnd = System.currentTimeMillis();
		Time = TimeEnd - TimeStart;
		System.out.println("Tiempo en ejecución en milisegundos: "+Time);
		
}
	
}
