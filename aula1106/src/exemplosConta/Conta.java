package exemplosConta;

public abstract class Conta {
		
		protected double saldo;
		protected double limite;
		
		public Conta(double saldo, double limite) {
			this.limite = limite;
			this.saldo = saldo;
		}
		
		public abstract void depositar(double valor) throws depositoNegativo;
		public abstract void sacar(double valor) throws semSaldo, saqueNegativo;

	

}
