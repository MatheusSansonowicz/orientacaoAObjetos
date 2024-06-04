package pkg;

public class retangulo extends Forma {
	
	public double largura;
	public double altura;
	
	public retangulo(double largura, double altura) {
		super();
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return largura*altura;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2*(largura+altura);
	}

}
