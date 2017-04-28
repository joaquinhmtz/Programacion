public class TicketPension extends Ticket {
	
	private Cliente persona;
	private Contrato contra;
	private Fecha fecha;
	private int[] ret_fecha = new int[3];
	private Lector reader = new Lector();

	public TicketPension(Fecha fecha, Tarifa precio, Cliente persona, Contrato contra) {
		super();
		this.persona = persona;
		this.contra = contra;
	}

	public TicketPension() {
		fecha = new Fecha();
		contra = new Contrato();
		persona = new Cliente();
	}

	public Contrato getContrato() {
		return this.contra;
	}

	public Fecha getFecha() {
		return this.fecha;
	}

	public Cliente getCliente() {
		return this.persona;
	}


	public void imprimirFecha() {
		fecha.asignarFecha();
		fecha.obtenerfecha(ret_fecha);
		fecha.mofecha(ret_fecha);
	}

	public void imprimir() {
		System.out.print("Propietario: ");
		persona.setNombre(reader.leeString());
		contra.Menu(0);
		System.out.println("Tarifa: ");
		imprimirFecha();
	}


}