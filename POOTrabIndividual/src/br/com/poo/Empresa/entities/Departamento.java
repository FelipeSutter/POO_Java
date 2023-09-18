package br.com.poo.Empresa.entities;

import java.util.HashMap;
import java.util.Map;

public class Departamento {
	
	private Integer id;
	private String nome;
	private String telefone;
	
	public static Map<Integer, Departamento> mapaDepartamento = new HashMap<>();
	
	public Departamento() {
		
	}
	
	public Departamento(Integer id, String nome, String telefone) {

		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "ID Departamento: \t\t" + id + "\nNome: \t\t" + nome + "\nTelefone: \t\t" + telefone;
	}
	
	
	
}
