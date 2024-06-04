package pkg;

public class PrincipalAnimal {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		c.emitirSom();
		
		Animal g = new Gato();
		g.emitirSom();
		
		c.cuidarPatio();
		c.exibirDados();

	}

}
