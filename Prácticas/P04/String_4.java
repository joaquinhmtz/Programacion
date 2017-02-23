public class String_4 {
	public static void main (String[] args) {

	long TimeStart;
	long TimeEnd;
	long Time;
	TimeStart = System.currentTimeMillis();

	int vector [] = {1,5,3,2,3};
	int minimo = vector [0];
	int maximo = vector [0];
	int rango = 0;
	int suma = 0;
	int count = 0;
	int media = 0;
	int mediana = 0;
	int moda = 0;
	int desv = 0;
	int rangomed = 0;


	for(int i = 0; i < 5; i++) {

		 if(minimo > vector [i]) {

		 	minimo = vector [i];

		 }
	
	 }

	for(int i = 0; i < 5; i++) {

		 if(maximo < vector [i]) {

		 	maximo = vector [i];

		 }
		
		}

	rango = maximo - minimo;

	for(int i = 0; i < 5; i++) {

		suma = suma + vector[i];

	}

	count = vector.length;	
	media = suma / count;
	mediana = vector[count / 2];

	int repeticion = 0;

	for(int i = 0; i < vector.length; i++) {
		for(int j = 0; j < vector.length; j++) {
			if(vector[i] == vector[j]) 
				moda = vector[i];
			repeticion++;
		}
	}

	rangomed = (minimo + maximo) / 2;





	

	System.out.println("El número mínimo es: " + minimo);
	System.out.println("El número máximo es: " + maximo);
	System.out.println("El rango es: " + rango);
	System.out.println("La suma total es: " + suma);
	System.out.println("El tamaño de cuenta es: " + count);
	System.out.println("El valor de la media es: " + media);
	System.out.println("El valor de la mediana es: " + mediana);
	System.out.println("El valor del rango medio es: " + rangomed);
	System.out.println("El valor de la moda es: " + moda);


	
	TimeEnd = System.currentTimeMillis();
	Time = TimeEnd - TimeStart;
	System.out.println("Tiempo en ejecución en milisegundos: "+Time);

	}
}