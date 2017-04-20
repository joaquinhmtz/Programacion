public class Test {
	public static void main (String[] args) {

		FechaServicio fecha = new FechaServicio();
		Persona obj = new Persona();
		Cajon tipo = new Cajon();
		TipoPension pens = new TipoPension();
		Estacionamiento cajon = new Estacionamiento();

		fecha.pimpLeefechaContra();
		fecha.pimpLeefechaVenci();
		obj.pimpLeeNombre();
		tipo.pimpLeetamanio();
		tipo.pimpLeeTipo();
		tipo.pimpLeeNumero(); 
		cajon.pimpLeeCajontam();
		pens.menu();


	}
}