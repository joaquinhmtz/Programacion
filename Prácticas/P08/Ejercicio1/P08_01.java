import java.io.*;
import java.util.*;

public class P08_01 {
	
  private int dia;
    private int mes;
    private int anio;
    private String dato;
    private final Calendar fecha1 = new GregorianCalendar();

    private final InputStreamReader isr = new InputStreamReader(System.in);
    private final BufferedReader br = new BufferedReader(isr);

    public void asignarFecha() {
        System.out.print("Ingresa el día: ");
        this.dia = leeFecha();
        this.ConditionDia();
        System.out.print("Ingresa el mes: ");
        this.mes = leeFecha();
        this.ConditionMes();
        System.out.print("Ingresa el año: ");
        this.anio = leeFecha();
        this.ConditionAnio();
    }
    
    public void obtenerFecha() {
        this.dia = fecha1.get(Calendar.DAY_OF_MONTH);
        this.mes = fecha1.get(Calendar.MONTH) + 1;
        this.anio = fecha1.get(Calendar.YEAR);
    }
     
    public void asignarFecha(int mes_p, int anio_p) {
        this.asignarFecha();
        this.mes = fecha1.get(Calendar.MONTH) + 1;
        this.anio = fecha1.get(Calendar.YEAR);
    }
    
    public void asignarFecha(int anio_p) {
        this.asignarFecha();
        this.anio = fecha1.get(Calendar.YEAR);
    }
    
    private int leeFecha() {
        int num = 0;
        try {
            dato = br.readLine();
            num = Integer.parseInt(dato);
        } catch (IOException e) {
        }
        return num;
    }

    public void ConditionDia() {
        if (this.dia >= 1 && this.dia <= 31) {
        } else {
            System.out.println("El día es incorrecto");
        }
    }

    public void ConditionMes() {
        if (this.mes >= 1 && this.mes <= 12) {
          if (this.mes == 2 && this.dia > 28){         
                System.out.println("El número de días es incorrecto");
              }
            if ((this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) && this.dia > 30) {
             System.out.println("El mes ingresdo tiene sólo 30 días.");  }
        } else {
            System.out.println("El rango de los meses es de 1-12.");
        }
    }

    public void ConditionBis() {
        while(this.mes == 2 && this.dia < 30){
        if (this.anio % 400 == 0) {
            System.out.println("El año es bisiesto");
        } else if (this.anio % 4 == 0 && this.anio % 100 != 0) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año NO es bisiesto");
        }
        break;}
    }

   public void ConditionAnio() {
       if(this.anio > 1582) {
           this.ConditionBis();
       } else 
           System.out.println("El año ingresado debe ser mayor a 1582");
   }
   
   public void mostrarFecha() {
       System.out.println(dia+"/"+mes+"/"+anio);
   }
   
   public P08_01() {
       dia = 0;
       mes = 0;
       anio = 0;
   }
   
   public P08_01(int dia_p) {
       obtenerFecha();
       dia = dia_p;

   }
   
   public P08_01(int dia_p, int mes_p) {
    obtenerFecha();
      dia = dia_p;
      mes = mes_p;
   }
   
    public P08_01(int dia_p, int mes_p, int anio_p) {
      dia = dia_p;
      mes = mes_p;
      anio = anio_p;
   }

}