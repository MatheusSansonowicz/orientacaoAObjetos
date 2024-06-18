package exemplosConta;

public class Pconta {

	public static void main(String[] args) throws depositoNegativo, semSaldo, saqueNegativo {
		// TODO Auto-generated method stub
		
	try {
            ContaConcreta conta = new ContaConcreta(5000, 900);
            conta.depositar(-900);
            conta.depositar(900);
            conta.sacar(-800);
            conta.sacar(10000);
            conta.sacar(2000);
            System.out.println("Operações realizadas com sucesso. Saldo atual: " + conta.getSaldo());
        } catch (DepositoNegativo | SemSaldo | SaqueNegativo e) {
            System.out.println(e.getMessage());
        }

	}

}
