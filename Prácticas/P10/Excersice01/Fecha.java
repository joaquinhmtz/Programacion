import java.util.*;

public class Fecha {
	
	private int dia;
	private int mes;
	private int anio;

	private Calendar fecha = new GregorianCalendar();

	public void asignarFecha() {	
		this.dia = fecha.get(Calendar.DAY_OF_MONTH);
		this.mes = fecha.get(Calendar.MONTH) + 1;
		this.anio = fecha.get(Calendar.YEAR);
	}

	public void obtenerfecha(int[] ob_fecha) {
		ob_fecha[0] = dia;
		ob_fecha[1] = mes;
		ob_fecha[2] = anio;
	}

	public static void mofecha(int[] ob_fecha) {
		System.out.println(ob_fecha[0]+"/"+ob_fecha[1]+"/"+ob_fecha[2]);
	}
}