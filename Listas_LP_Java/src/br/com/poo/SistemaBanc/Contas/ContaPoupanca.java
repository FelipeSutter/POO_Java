package br.com.poo.SistemaBanc.Contas;

public class ContaPoupanca extends ContaBanco {
	
	private Double rendimento;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String tipoConta,String numero, String cpf, Double saldo) {
		super(tipoConta,numero, cpf, saldo);
	}

	public Double getRendimento() {
		return rendimento;
	}

	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
	}
	
}
