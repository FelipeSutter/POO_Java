package br.com.poo.SistemaBanc.Contas;

public class ContaCorrente extends ContaBanco {
	
	private Double chequeEspecial;
	private Double tarifa;
	
	public ContaCorrente() {
		super();
	}
	
	public ContaCorrente(String tipoConta,String numero, String cpf, Double saldo, Double chequeEspecial) {
		super(tipoConta,numero, cpf, saldo);
		this.chequeEspecial = chequeEspecial;
	}

	public Double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(Double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public Double getTarifa() {
		return tarifa;
	}

	public void setTarifa(Double tarifa) {
		this.tarifa = tarifa;
	}
	
}
