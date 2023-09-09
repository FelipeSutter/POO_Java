package br.com.poo.SistemaBanc.pessoas;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario() {
		super();
	}

	public Funcionario(String nome, String cpf, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public double getSalario() {
		return salario;
	}
	
}