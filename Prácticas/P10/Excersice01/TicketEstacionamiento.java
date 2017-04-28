public class TicketEstacionamiento extends Ticket {

	private Hora hora;
	private Fecha fecha;
	private Tarifa tarifa;
	private int[] ret_hora = new int[3];
	private int[] ret_fecha = new int[3];

	
	public TicketEstacionamiento(Fecha fecha, Tarifa tarifa_p, Hora hora_p) {
		super();
		this.hora = hora_p;
	}

	public TicketEstacionamiento() {
		fecha = new Fecha();
		tarifa = new Tarifa();
		hora = new Hora();
	}

	public Fecha getFecha() {
		return this.fecha;
	}

	public Tarifa getTarifa() {
		return this.tarifa;
	}

	public Hora getHora() {
		return this.hora;
	}

	public void imprimirHora() {
		hora.asignarHora();
		hora.obtenerHora(ret_hora);
		hora.mostrarHora(ret_hora);
	}

	public void imprimirFecha() {
		fecha.asignarFecha();
		fecha.obtenerfecha(ret_fecha);
		fecha.mofecha(ret_fecha);
	}

	public void imprimir() {
		imprimirFecha();
		imprimirHora();
	}

}