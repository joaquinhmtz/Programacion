public class TarifaEstacionamiento extends Tarifa{

	public static float tarifa15Min;
	public static float tarifaHora;

	public TarifaEstacionamiento() {}

	public void setTarifa15Min(float tarifa15Min_p) {
		this.tarifa15Min = tarifa15Min_p;
	}

	public float getTarifa15Min() {
		return super.getNumero();
	}

	public void setTarifaHora(float tarifaHora_p) {
		this.tarifaHora = tarifaHora_p;
	}

	public float getTarifaHora() {
		return this.tarifaHora;
	}

	public void res() {
		float aux = 0;
		aux = super.getNumero() * tarifa15Min;
		System.out.println("res: "+tarifa15Min);
	}
}