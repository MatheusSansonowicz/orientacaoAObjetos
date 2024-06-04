package pkg;

public interface Animal {
	public static final int idade = 0;
	public static final String nome = "";
	void emitirSom();
	default void exibirDados() {
		System.out.println("Gato [Nomeado=" + nome + ", idade=" + idade + "]");
	}

}
