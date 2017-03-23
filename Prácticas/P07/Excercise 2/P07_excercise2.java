import java.util.*;
import java.io.*;

public class P07_excercise2 {

	private int dia;
	private int mes;
	private int anio;

	private InputStreamReader isr = new InputStreamReader(System.in);
	private BufferedReader br = new BufferedReader(isr);


	public void asignarFecha() {
		Calendar fecha = new GregorianCalendar();
		this.dia = fecha.get(Calendar.DAY_OF_MONTH);
		this.mes = fecha.get(Calendar.MONTH) + 1;
		this.anio = fecha.get(Calendar.YEAR);
	}

	public void asignarFecha(int dia_param) {
		this.asignarFecha();
		this.dia = dia_param;
	}

	public void asignarFecha(int dia_param, int mes_param) {
		this.asignarFecha();
		this.dia = dia_param;
		this.mes = mes_param;
	}

	public void asignarFecha(int dia_param, int mes_param, int anio_param) {
		this.dia = dia_param;
		this.mes = mes_param;
		this.anio = anio_param;
	}

	public void obtenerfecha(int[] ob_fecha) {
		ob_fecha[0] = dia;
		ob_fecha[1] = mes;
		ob_fecha[2] = anio;
	}

	public void obtenerfecha2(int[] ob_fecha) {
		ob_fecha[0] = dia;
		ob_fecha[1] = mes;
	}

	public void obtenerfecha3(int[] ob_fecha) {
		ob_fecha[0] = dia;
	}

	public static void mofecha(int[] ob_fecha) {
		System.out.println(ob_fecha[0]+"/"+ob_fecha[1]+"/"+ob_fecha[2]);
	}

	public static void mofecha2(int[] ob_fecha) {
		System.out.println(ob_fecha[0]+"/"+ob_fecha[1]+"/"+"0");
	}

	public static void mofecha3(int[] ob_fecha) {
		System.out.println(ob_fecha[0]+"/"+"0"+"/"+"0");
	}


	
}