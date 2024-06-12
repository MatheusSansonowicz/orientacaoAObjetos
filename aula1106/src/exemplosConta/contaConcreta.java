package exemplosConta;

public class contaConcreta extends Conta {

	public contaConcreta(double saldo, double limite) {
		super(saldo, limite);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void depositar(double valor) throws depositoNegativo {
		// TODO Auto-generated method stub
		if (valor<0)
			throw new depositoNegativo("Imposivel depositar valores negativos");
		else
			saldo+=valor;
	}

	@Override
	public void sacar(double valor) throws semSaldo, saqueNegativo {
		// TODO Auto-generated method stub
		if(valor>(saldo+limite))
			throw new semSaldo("Saldo insuficiente");
		else if (valor<0)
			throw new saqueNegativo("Imposivel sacarar valores negativos");
		else
			System.out.println("Sacando...");

	}

}
