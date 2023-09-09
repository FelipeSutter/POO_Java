package br.com.poo.SistemaBanc.Contas;

public class ContaCorrente extends ContaBanco {
	
	private double chequeEspecial;
	private double tarifa;
	
	public ContaCorrente() {
		super();
	}
	
	public ContaCorrente(int numero, String titular, double saldo, double chequeEspecial, double tarifa) {
		super(numero, titular, saldo);
		this.chequeEspecial = chequeEspecial;
		this.tarifa = tarifa;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
}
