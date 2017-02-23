public class Excercise_1 {
	public static void main (String[] args) {

	long TimeStart;
	long TimeEnd;
	long Time;
	TimeStart = System.currentTimeMillis();

	int result = 0;

	System.out.println("Result is now: " + (result += 3));
	System.out.println("Result is now: " + (result -= 1));
	System.out.println("Result is now: " + (result *= 2));
	System.out.println("Result is now: " + (result /= 2));
	System.out.println("Result is now: " + (result *= 5));
	System.out.println("Result is now: " + (result -= 7));


	TimeEnd = System.currentTimeMillis();
	Time = TimeEnd - TimeStart;
	System.out.println("Tiempo en ejecución en milisegundos: "+Time);
	}
}