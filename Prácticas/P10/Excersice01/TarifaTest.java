public class TarifaTest {
	public static void main(String[] args) {

		Lector reader = new Lector();
		TarifaPension tarifa = new TarifaPension();
		Tarifa pension = new Tarifa();

		TarifaPension.tarifaDia = 65.00F;
		TarifaPension.tarifaMes = 1850.00F;
		TarifaPension.tarifaAnio = 20000.00F;
		TarifaEstacionamiento.tarifa15Min = 15.00F;
		TarifaEstacionamiento.tarifaHora = 35.00F;

		System.out.println("1.- Tarifa.");
		System.out.println("2.- Tarifa Estacionamiento.");
		System.out.println("3.- Tarifa Pensión.");

		switch(reader.leeInt()) {

			case 1:
				System.out.println("Pensión/Día: "+TarifaPension.tarifaDia);
				System.out.println("Pensión/Mes: "+TarifaPension.tarifaMes);
				System.out.println("Pensión/Año: "+TarifaPension.tarifaAnio);
				System.out.println("Estacionamiento/15 Minutos: "+TarifaEstacionamiento.tarifa15Min);
				System.out.println("Estacionamiento/Hora: "+TarifaEstacionamiento.tarifaHora);

			break;

			case 2:
			System.out.println("1.- Tarifa por  15 Minutos.");
			System.out.println("2.- Tarifa por Hora.");
			System.out.println("-----------------------");
			switch(reader.leeInt()) {

				case 1:
				System.out.println("Tu cobro es: "+TarifaEstacionamiento.tarifa15Min);
				break;
				case 2:
				System.out.print("Ingresa el número de horas: ");
				pension.setNumero(reader.leeFloat());
				break;
			}
			break;

			case 3:
			System.out.println("1.- Tarifa por Día.");
			System.out.println("2.- Tarifa por Mes.");
			System.out.println("3.- Tarifa por Año.");
			System.out.println("-------------------");

			switch(reader.leeInt()) {

				case 1:
				System.out.print("Ingresa el número de días: ");
				pension.setNumero(reader.leeFloat());
				//tarifa.getTarifaDia();
				tarifa.res();
				break;
				case 2:
				System.out.print("Ingresa el número de meses: ");
				pension.setNumero(reader.leeFloat());
				break;
				case 3:
				System.out.print("Ingresa el número de años: ");
				pension.setNumero(reader.leeFloat());
				break;
			}
			break;
		}


	}
}