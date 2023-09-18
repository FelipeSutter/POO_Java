package br.com.poo.Empresa.entities;

import java.util.HashMap;
import java.util.Map;

public class Funcionario {
	private Integer id;
	private String nome;
	private String cpf;
	private String telefone;
	private String dataNasc;
	private Integer departamentoId;
	
	public static Map<Integer, Funcionario> mapaFunc = new HashMap<>();
	
	public Funcionario() {
		
	}
	
	public Funcionario(Integer id, String nome, String cpf, String telefone, String dataNasc, Integer departamentoId) {
		
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
		this.departamentoId = departamentoId;
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
		return "ID Funcionário: " + id + " Nome: " + nome + " CPF: " + cpf + " Telefone: " + telefone + " Data de Nascimento: " + dataNasc;
	}

	public Integer getDepartamentoId() {
		return departamentoId;
	}
	
	
	
}
