package pkg;

public class Gato implements Animal {

	@Override
	public void emitirSom() {
		System.out.println("miau");

	}

	@Override
	public void exibirDados() {
			System.out.println("Gato [Nomeado=" + nome + ", idade=" + idade + "]");
	}

}
