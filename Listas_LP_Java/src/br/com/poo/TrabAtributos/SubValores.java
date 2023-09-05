package br.com.poo.TrabAtributos;

import br.com.poo.BalancoTrimestre.BalancoTeste;

public class SubValores extends BalancoTeste{
	
	SomaValores sv = new SomaValores();
	BalancoTeste bt = new BalancoTeste();
	
	public int subtrair() {
		System.out.println("A subtracao eh: " + (sv.sub));
		System.out.println(numEx - varTeste);
		return sv.sub; // sv.
	}
}
