public class Circulo {
	private float radio;
	private float centro_x;
	private float centro_y;
	public final static float pi = 3.1416F;

	public Circulo () {

	}

	public Circulo (float radio, float c_x, float c_y) {
		this.radio = radio;
		this.centro_x = c_x;
		this.centro_y = c_y;
	}

	public Circulo (float radio) {
		this.radio = radio;
		this.centro_x = 0.0F;
		this.centro_y = 0.0F;
	}

	public void finalize() {
		System.out.println("Objeto:" + this);
	}

	public void setRadio(float radio_p) {
		this.radio = radio_p;
	}

	public float getRadio() {
		return this.radio;
	}

	public void setCentroX(float centro_x_p) {
		this.centro_x = centro_x_p;
	}

	public float getCentroX() {
		return this.centro_x;
	}

	public void setCentroY(float centro_y_p) {
		this.centro_y = centro_y_p;
	}

	public float getCentroY() {
		return this.centro_y;
	}

	public float calculaArea () {
		return this.pi * (this.radio*this.radio);
	}

	public float calculaPerimetro () {
		return 2*this.pi * this.radio;
	}

	public String toString() {
		return "Radio: " +  this.radio + " Centro X: " + this.centro_x + " Centro Y:" + this.centro_y; 
	}
}