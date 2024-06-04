package exercicios;

public abstract class Conta {
	protected double saldo;
	protected double limite;
	
	public abstract void depositar();
	public abstract void sacar();

}
