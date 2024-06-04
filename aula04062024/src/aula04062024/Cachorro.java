package aula04062024;

public class Cachorro extends Abs{
	
	protected String raca;

	@Override
	public void emiteSom() {
		System.out.println("au au");
	}

	public void cuidarPatio(){
		System.out.println("O cachorro está cuidando do patio");
	}
	
	@Override
	public void dados() {
		System.out.println("Cachorro [especie=" + especie + ", idade=" + idade +", raca: "+raca + "]");;
	}

}
