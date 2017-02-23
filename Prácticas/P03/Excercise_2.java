import java.util.Scanner;

public class Excercise_2 {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);

	long TimeStart;
	long TimeEnd;
	long Time;
	TimeStart = System.currentTimeMillis();


	int num1 = 2;
	int num2 = 7;

	
		System.out.println("\n");
		System.out.println("Número Par o Impar");
		System.out.println("\n");




		if (num1 % 2 == 0){
			System.out.println("El número " + num1 + " es PAR");
		} else 
			System.out.println("El número " + num1 + " es IMPAR");

		if (num2 % 2 == 0){
			System.out.println("El número " + num2 + " es PAR");
		} else 
			System.out.println("El número " + num2 + " es IMPAR");




	TimeEnd = System.currentTimeMillis();
	Time = TimeEnd - TimeStart;
	System.out.println("Tiempo en ejecución en milisegundos: "+Time);


	}
}