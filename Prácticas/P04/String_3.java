public class String_3 {
	public static void main (String[] args) {

		long TimeStart;
		long TimeEnd;
		long Time;
		TimeStart = System.currentTimeMillis();

		String cadena1 = "Hello, my good friend";
		int index = cadena1.indexOf(",");
		String cadena2;
		cadena2 = cadena1.substring(0,index);
		System.out.println(cadena2);

		TimeEnd = System.currentTimeMillis();
		Time = TimeEnd - TimeStart;
		System.out.println("Tiempo en ejecución en milisegundos: "+Time);
		
		
			}
}