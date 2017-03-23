public class P07_excercise2_Test {
	public static void main (String[] args) {

		P07_excercise2 obj = new P07_excercise2();
		int obj2[] = new int[3];
		int obj3[] = new int[2];
		int obj4[] = new int[1];

		obj.asignarFecha();
		obj.obtenerfecha(obj2);
		P07_excercise2.mofecha(obj2);

		obj.asignarFecha();
		obj.obtenerfecha2(obj3);
		P07_excercise2.mofecha2(obj3);

		obj.asignarFecha();
		obj.obtenerfecha3(obj4);
		P07_excercise2.mofecha3(obj4);
		
	}
}