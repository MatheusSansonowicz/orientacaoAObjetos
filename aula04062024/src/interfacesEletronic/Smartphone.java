package interfacesEletronic;

public class Smartphone implements Celular, PC {
	public String Email;
	public int numero;

	@Override
	public void verificaEmail() {
		System.out.println("Verificando email");

	}

	@Override
	public void realizandoChamada() {
		System.out.println("Realizando vhamaad");

	}

}
