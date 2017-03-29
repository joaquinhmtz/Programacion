public class P08_01Test {
	public static void main (String[] args) {

   		P08_01 fecha = new P08_01(); 
    	P08_01 fecha2 = new P08_01();
        P08_01 fecha3 = new P08_01();
        P08_01 fecha4 = new P08_01();
        P08_01 fecha5 = new P08_01(25);
        P08_01 fecha6 = new P08_01(25,6);
        P08_01 fecha7 = new P08_01(25,6,1997);

        fecha.asignarFecha();
        fecha.mostrarFecha();
        System.out.println();
        
       /* fecha3.asignarFecha(Calendar.MONTH + 1, Calendar.YEAR);
        fecha3.mostrarFecha();
        System.out.println();
        
        fecha2.asignarFecha(Calendar.YEAR);
        fecha2.mostrarFecha();
        System.out.println();
        
        fecha4.asignarFecha(Calendar.DAY_OF_MONTH, Calendar.MONTH + 1, Calendar.YEAR);
        fecha4.mostrarFecha();
        System.out.println();*/
       
        fecha5.mostrarFecha();
        fecha6.mostrarFecha();
        fecha7.mostrarFecha();

	}
}
