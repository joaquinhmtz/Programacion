public class Excercise_3 {
	public static void main (String[] args) {
	
	long TimeStart;
	long TimeEnd;
	long Time;
	TimeStart = System.currentTimeMillis();

	int mes1 = 1;
	int mes2 = 2;
	int mes3 = 3;
	int mes4 = 4;
	int mes5 = 5;
	int mes6 = 6;
	int mes7 = 7;
	int mes8 = 8;
	int mes9 = 9;
	int mes10 = 10;
	int mes11 = 11;
	int mes12 = 12;
	

	if(mes1 == 1){
		System.out.println("El número de mes " + mes1 + " es Enero");
	} 
	if (mes2 == 2){
		System.out.println("El número de mes " + mes2 + " es Febrero");
	}

	if(mes3 == 3){
		System.out.println("El número de mes " + mes3 + " es Marzo");
	} 
	if (mes4 == 4){
		System.out.println("El número de mes " + mes4 + " es Abril");
	}

	if(mes5 == 5){
		System.out.println("El número de mes " + mes5 + " es Mayo");
	} 
	if (mes6 == 6){
		System.out.println("El número de mes " + mes6 + " es Junio");
	}

	if(mes7 == 7){
		System.out.println("El número de mes " + mes7 + " es Julio");
	} 
	if (mes8 == 8){
		System.out.println("El número de mes " + mes8 + " es Agosto");
	}

	if(mes9 == 9){
		System.out.println("El número de mes " + mes9 + " es Septiembre");
	} 
	if (mes10 == 10){
		System.out.println("El número de mes " + mes10 + " es Octubre");
	}

	if(mes11 == 11){
		System.out.println("El número de mes " + mes11 + " es Noviembre");
	} 
	if (mes12 == 12){
		System.out.println("El número de mes " + mes12 + " es Diciembre");
	}
	


	TimeEnd = System.currentTimeMillis();
	Time = TimeEnd - TimeStart;
	System.out.println("Tiempo en ejecución en milisegundos: "+Time);


	}
}