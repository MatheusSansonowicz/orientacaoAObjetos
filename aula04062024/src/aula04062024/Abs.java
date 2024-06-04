package aula04062024;

public abstract class Abs {
	
	protected String especie;
	
	protected int idade;
	
	public abstract void emiteSom();
	
	public void dados() {
		System.out.println("Cachorro [especie=" + especie + ", idade=" + idade + "]");
	}

	
}
