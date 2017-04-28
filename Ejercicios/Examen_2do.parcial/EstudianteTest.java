public class EstudianteTest {
	public static void main(String[] args) {

		Estudiante est1 = new Estudiante();
		Estudiante est2 = new Estudiante("No conocido", "Sin nombre", 0);
		est1.imprimir();
		est2.imprimir();
	}
}