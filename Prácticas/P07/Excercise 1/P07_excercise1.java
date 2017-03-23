import java.io.*;

public class P07_excercise1 {

	private int dia;
	private int mes;
	private int anio;
	private String dato;

	private InputStreamReader isr = new InputStreamReader(System.in);
	private BufferedReader br = new BufferedReader(isr);

	public void asignarFecha() {
		this.dia();
		this.mes();
		this.anio();	
	}

	private void dia() {
		System.out.print("Ingresa el día: ");
		this.leeDia();
	}

	private void mes() {
		System.out.print("Ingresa el mes: ");
		this.leeMes();
	}

	private void anio() {
		System.out.print("Ingresa el año: ");
		this.leeAnio();
	}

	private int leeDia() {
		try{
			dato = br.readLine();
			dia = Integer.parseInt(dato);
		}catch(IOException e) {}
		return dia;
	}

	private int leeMes() {
		try{
			dato = br.readLine();
			mes = Integer.parseInt(dato);
		}catch(IOException e) {}
		return mes;
	}

	private int leeAnio() {
		try{
			dato = br.readLine();
			anio = Integer.parseInt(dato);
		}catch(IOException e) {}
		return anio;
	}

	private void ConditionAnio() {
		if(this.anio > 1582) {
		}else 
			System.out.println("El año ingresado es incorrecto");
	}

	private void ConditionDia() {
		if(this.dia >= 1 && this.dia <= 31) {
		} else 
			System.out.println("El día ingresado es incorrecto");
	}

	private void ConditionMes() {
		if(this.mes >= 1 && this.mes <= 12) {
			this.ConditionMesFeb();
		}else 
			System.out.println("El mes ingresado es incorrecto");
	}

	private void ConditionBisiesto() {
		if(this.anio % 400 == 0) {
			System.out.println("El año es bisiesto");
		} else if(this.anio % 4 == 0 && this.anio % 100 != 0) {
			System.out.println("El año es bisiesto");
		} else 
			System.out.println("El año NO es bisiesto");
	}

	private void ConditionMesFeb() {
		if(this.mes == 2){
			if(this.dia < 30){
			} else 
			this.ConditionBisiesto();
				System.out.println("El mes ingresado es menor a 30 días");
		}
	}

	private void ConditionMes2() {
		if(this.mes != 4 && this.mes != 6 && this.mes != 9 && this.mes != 11){
			} if(this.dia == 31) {
				System.out.println("El mes ingresado es menor a 31 días");
			}
	}

	private void fechaCorrecta() {
		this.ConditionDia();
		this.ConditionMes();
		this.ConditionMes2();
		this.ConditionAnio();
	}

	public void obtenerFecha(int [] ob_fecha) {
		this.fechaCorrecta();
		ob_fecha[0] = this.dia;
		ob_fecha[1] = this.mes;
		ob_fecha[2] = this.anio;
	}

	public static void mostrafecha(int [] ob_fecha) {
		System.out.println(ob_fecha[0]+"/"+ob_fecha[1]+"/"+ob_fecha[2]);
	}



}