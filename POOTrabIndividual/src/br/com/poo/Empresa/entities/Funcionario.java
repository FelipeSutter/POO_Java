package br.com.poo.Empresa.entities;

import java.util.HashMap;
import java.util.Map;

public class Funcionario {
	private Integer id;
	private String nome;
	private String cpf;
	private String telefone;
	private String dataNasc;
	
	public static Map<Integer, Funcionario> mapaFunc = new HashMap<>();
	
	public Funcionario() {
		
	}
	
	public Funcionario(Integer id, String nome, String cpf, String telefone, String dataNasc) {
		
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	@Override
	public String toString() {
		return "ID Funcionário: \t\t" + id + "\nNome: \t\t" + nome + "\nCPF: \t\t" + cpf + "\nTelefone: \t\t" + telefone + "\nData de Nascimento: \t\t" + dataNasc;
	}
	
	
	
}
