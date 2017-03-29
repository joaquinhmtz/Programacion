public  class CirculoTest {
	public static void main(String[] args) {
		System.out.println("Circulo Test");
		Circulo circulo1 = new Circulo();
		circulo1.setRadio(3.0F);
		circulo1.setCentroX(300.0F);
		circulo1.setCentroY(-200.0F);

		System.out.println(circulo1);
		System.out.println("Valor PI: " + circulo1.pi);
		System.out.println("Valor PI: " + Circulo.pi);
		System.out.println("Area: " + circulo1.calculaArea());
		System.out.println("Perimetro: " + circulo1.calculaPerimetro());


		Circulo circulo2 = new Circulo(3.0F, 300.0F, -200.0F);

		System.out.println(circulo2);
		System.out.println("Valor PI: " + circulo2.pi);
		System.out.println("Valor PI: " + Circulo.pi);
		System.out.println("Area: " + circulo2.calculaArea());
		System.out.println("Perimetro: " + circulo2.calculaPerimetro());

		Circulo circulo3 = new Circulo(3.0F);
		//circulo3.setCentroX(300.0F);
		//circulo3.setCentroY(-200.0F);


		System.out.println(circulo3);
		System.out.println("Valor PI: " + circulo3.pi);
		System.out.println("Valor PI: " + Circulo.pi);
		System.out.println("Area: " + circulo3.calculaArea());
		System.out.println("Perimetro: " + circulo3.calculaPerimetro());

		System.gc();
	}
}