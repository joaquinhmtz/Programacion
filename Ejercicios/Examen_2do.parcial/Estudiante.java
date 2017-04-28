public class Estudiante {
	
	private String NoEstudiante;
	private String Nombre;
	//private Fecha fecha;
	private int puntuacion;

	public Estudiante() {
		this.Nombre = "No conocido";
		this.puntuacion = 20;
		//this.fecha = ;
	}

	public Estudiante(String NoEstudiante_p, String Nombre_p,  int puntuacion_p) {
		this.NoEstudiante = NoEstudiante_p;
		this.Nombre = Nombre_p;
		//this.fecha = fecha_p;
		this.puntuacion = puntuacion_p;
	}

	public void setNoEstudiante(String NoEstudiante_p) {
		this.NoEstudiante = NoEstudiante_p;
	}

	public String getEstudiante() {
		return this.NoEstudiante;
	}

	public void setNombre(String Nombre_p) {
		this.Nombre = Nombre_p;
	}

	public String getNombre() {
		return this.Nombre;
	}

	public void setPuntuacion(int puntuacion_p) {
		this.puntuacion = puntuacion_p;
	}

	public int getPuntuacion() {
		return this.puntuacion;
	}

	public void imprimir() {
		System.out.println(Nombre +" " +puntuacion);
	}


}