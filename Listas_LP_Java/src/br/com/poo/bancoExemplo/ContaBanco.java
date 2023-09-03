package br.com.poo.bancoExemplo;

public class ContaBanco {
	int numero;
	String titular;
	double saldo;
	
	public ContaBanco(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaBanco |\nNúmero = " + numero + "\nTitular = " + titular + "\nSaldo = " + saldo;
	}
	
	
}
