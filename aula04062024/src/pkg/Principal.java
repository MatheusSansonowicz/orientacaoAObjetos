package pkg;

public class Principal {

	public static void main(String[] args) {
		
		retangulo r = new retangulo(3.5, 4);
		System.out.println("Area do retangulo: "+r.area());
		System.out.println("perimetro do retangulo: "+r.perimetro());
		
		Circulo circulo = new Circulo(5);
		System.out.println("Area do circulo: "+circulo.area());
		System.out.println("Raio do circulo: "+circulo.perimetro());

	}

}
