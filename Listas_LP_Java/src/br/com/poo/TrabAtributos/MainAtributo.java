package br.com.poo.TrabAtributos;

import br.com.poo.BalancoTrimestre.BalancoTeste;

public class MainAtributo extends BalancoTeste{

	public static void main(String[] args) {
		SomaValores sv = new SomaValores();
		SubValores sub = new SubValores();
		BalancoTeste bt = new BalancoTeste();
		bt.banana(); // bi.
		bt.soma();
		sv.somar();
		sub.subtrair();

	}

}
