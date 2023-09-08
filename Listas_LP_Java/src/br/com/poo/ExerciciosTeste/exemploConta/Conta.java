package br.com.poo.ExerciciosTeste.exemploConta;

abstract class Conta {

	private double saldo;
	private static int contador;
	
	protected Conta() {
		Conta.contador = Conta.contador + 1;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public abstract void imprimeExtrato();

	@Override
	public String toString() {
		return "Contador de contas: " + Conta.contador;
	}
	
	

}
