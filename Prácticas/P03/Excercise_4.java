public class Excercise_4 {
	public static void main (String[] args) {

	long TimeStart;
	long TimeEnd;
	long Time;
	TimeStart = System.currentTimeMillis();

	int option = 1;

	switch (option) {

		case 1:
		System.out.println("31 days");

		case 2:
		System.out.println("29 days");

		case 3:
		System.out.println("31 days");

		case 4:
		System.out.println("30 days");

		case 5:
		System.out.println("31 days");

		case 6:
		System.out.println("30 days");

		case 7:
		System.out.println("31 days");

		case 8:
		System.out.println("31 days");

		case 9:
		System.out.println("30 days");

		case 10:
		System.out.println("31 days");

		case 11:
		System.out.println("30 days");

		case 12:
		System.out.println("31 days");

		default:

	}

	TimeEnd = System.currentTimeMillis();
	Time = TimeEnd - TimeStart;
	System.out.println("Tiempo en ejecución en milisegundos: "+Time);

	}
}