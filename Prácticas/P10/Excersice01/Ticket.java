public class Ticket {

	public Fecha fecha;
	private Tarifa precio;
	private int ret_fecha[] = new int[3];

	public Ticket() {
		fecha = new Fecha();
		precio = new Tarifa();
	}



	public Fecha getFecha() {
		return this.fecha;
	}

	public Tarifa getTarifa() {
		return this.precio;
	}

	public void imprimir() {
		fecha.asignarFecha();
		fecha.obtenerfecha(ret_fecha);
		fecha.mofecha(ret_fecha);
	}
}