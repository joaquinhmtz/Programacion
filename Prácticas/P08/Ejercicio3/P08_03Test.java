public class P08_03Test {
	public static void main (String[] args) {
		P08_03 fecha = new P08_03(25,6,1997);
        P08_03 fecha2 = new P08_03();

        fecha.mostrar();
        fecha2 = fecha;
        fecha2 =null;
        
       

        System.gc();
	}	
}