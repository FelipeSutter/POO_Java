package br.com.poo.SistemaBanc.Contas;

public class ContaPoupanca extends ContaBanco {
	
	private double rendimento;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(int numero, String titular, double saldo, double rendimento) {
		super(numero, titular, saldo);
		this.rendimento = rendimento;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
}
