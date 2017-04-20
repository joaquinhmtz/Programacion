public class TicketTest {
	public static void main(String[] args) {

		Ticket cons1 = new Ticket();
		Cliente nombre = new Cliente();
		TicketPension pension = new TicketPension();
		TicketEstacionamiento estacionamiento = new TicketEstacionamiento();
		Lector reader = new Lector();

		System.out.println("1.- Ticket.");
		System.out.println("2.- Ticket Estacionamiento.");
		System.out.println("3.- Ticket Pensión.");
		System.out.println("---------------------------");

		switch(reader.leeInt()) {

			case 1:
			cons1.imprimir();
			break;

			case 2:
			estacionamiento.imprimir();
			break;

			case 3:
			pension.imprimir();
			break;
		}
	}
}