package br.com.poo.SistemaBanc.Contas;

import java.util.HashMap;
import java.util.Map;

public class ContaBanco {
	
	private String tipoConta;
	private String numero;
	private String cpf;
	private Double saldo;
	
	public static Map<String, ContaBanco> mapaContas = new HashMap<>();
	
	public ContaBanco() {
		
	}
	
	public ContaBanco(String tipoConta,String numero, String cpf, Double saldo) {
		this.tipoConta = tipoConta;
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaBanco |\nNúmero = " + numero + "\ncpf = " + cpf + "\nSaldo = " + saldo;
	}

	public String getNumero() {
		return numero;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public String getTipoConta() {
		return tipoConta;
	}

	
	
	
}
