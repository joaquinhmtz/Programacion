public class P08_02Test {
	public static void main (String[] args) {

		//Persona pers1 = new Persona();
		Persona pers2 = new Persona("anonimo");
		Cajon cajon1 = new Cajon();
		Cajon cajon2 = new Cajon("Chico","NO discapacitado");
	
		//pers1.pimpLeeNombre();
		//pers1.mosNombre();
		cajon1.pimpLeeNumero();
		
		pers2.mosNombre();
		cajon2.mosDatos();
		
	}
}