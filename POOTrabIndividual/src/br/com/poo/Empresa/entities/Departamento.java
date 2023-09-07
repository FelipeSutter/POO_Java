package br.com.poo.Empresa.entities;

public class Departamento {
	private int id;
	private String nome;
	private String telefone;
	
	public Departamento() {
		
	}
	
	public Departamento(int id, String nome, String telefone) {

		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
	}

	public int getId() {
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
