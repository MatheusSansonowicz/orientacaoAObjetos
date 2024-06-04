package pkg;

public class Circulo extends Forma{
	
	public double raio;
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return raio*3.14*raio;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2*3.14*raio;
	}
	
	

}
