public class TarifaPension extends Tarifa {
	
	public static float tarifaDia;
	public static float tarifaMes;
	public static float tarifaAnio;

	public TarifaPension() {}

	public void setTarifaDia(float tarifaDia_p) {
		this.tarifaDia = tarifaDia_p;
	}

	public float getTarifaDia() {
		return super.getNumero() * tarifaDia;
	}

	/*public float getTarifadia() {
		return this.tarifaDia;
	}*/

	public void setTarifaMes(float tarifaMes_p) {
		this.tarifaMes = tarifaMes_p;
	}

	public float getTarifaMes() {
		return this.tarifaMes;
	}

	public void setTarifaAnio(float tarifaAnio_p) {
		this.tarifaAnio = tarifaAnio_p;
	}

	public float getTarifaAnio() {
		return this.tarifaAnio;
	}

	public void res() {
		float aux = 0;
		aux = super.getNumero() * tarifaDia;
		System.out.println("res: "+tarifaDia);
	}

}