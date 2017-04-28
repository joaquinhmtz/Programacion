import java.util.*;

public class Hora {

	private int horas;
	private int min;
	private int seg;

	private Calendar hora = new GregorianCalendar();

	public void asignarHora() {
		this.horas = hora.get(Calendar.HOUR_OF_DAY);
		this.min = hora.get(Calendar.MINUTE);
		this.seg = hora.get(Calendar.SECOND);
	}

	public void obtenerHora(int[] ob_hora) {
		ob_hora[0] = horas;
		ob_hora[1] = min;
		ob_hora[2] = seg;
	}

	public static void mostrarHora(int[] ob_hora) {
		System.out.println(ob_hora[0]+":"+ob_hora[1]+":"+ob_hora[2]);
	}

}