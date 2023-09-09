package br.com.poo.SistemaBanc.Contas;

public class ContaBanco {
	
	private int numero;
	private String titular;
	private double saldo;
	
	public ContaBanco() {
		
	}
	
	public ContaBanco(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaBanco |\nNúmero = " + numero + "\nTitular = " + titular + "\nSaldo = " + saldo;
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	
	
	
}
