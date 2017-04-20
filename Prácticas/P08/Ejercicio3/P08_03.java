public class P08_03 {
	    
    private final int dia;
    private final int mes;
    private final int anio;

    public P08_03() {
        dia = 0;
        mes = 0;
        anio = 0;
    }
    
    public P08_03(int dia_p, int mes_p, int anio_p) {
        dia = dia_p;
        mes = mes_p;
        anio = anio_p;
    }
    
    public void mostrar() {
        System.out.println(dia+"/"+mes+"/"+anio);
    }
    
    public void finalize(){
        
        System.out.println("El objeto será destruido");
    }
}