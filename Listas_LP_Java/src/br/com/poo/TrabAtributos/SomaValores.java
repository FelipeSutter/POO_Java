package br.com.poo.TrabAtributos;

public class SomaValores {
	private int n1 = 2;
	private int n2 = 3;
	private int soma = n1 + n2;
	
	protected int n3 = 10;
	public int n4 = 20;
	protected int sub = n4 - n3;
	
	
	public int somar() {
		System.out.println("O total eh: " + soma);
		return soma;
	}
	
}
