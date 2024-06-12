package exemplosConta;

public class Pconta {

	public static void main(String[] args) throws depositoNegativo, semSaldo, saqueNegativo {
		// TODO Auto-generated method stub
		
		contaConcreta C = new contaConcreta(5000, 900);
		C.depositar(-900);
		C.depositar(900);
		C.sacar(-800);
		C.sacar(10000);
		C.sacar(2000);

	}

}
