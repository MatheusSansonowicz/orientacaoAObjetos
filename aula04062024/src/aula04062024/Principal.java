package aula04062024;

public class Principal {

	public static void main(String[] args) {
		 Cachorro animal = new Cachorro();
		 animal.especie = "Dog";
		 animal.idade =15;
		 animal.raca = "viralata";
		 animal.emiteSom();
		 animal.dados();
		 animal.cuidarPatio();
	}

}
