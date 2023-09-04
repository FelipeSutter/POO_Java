package br.com.poo.BalancoTrimestre;

import java.math.BigDecimal;

// import java.math.BigDecimal;

public class MainBalanco {

	public static void main(String[] args) {
		
		// declaração do construtor vazio
		BalancoInt bi = new BalancoInt();
		System.out.println(bi); // mostra os resultados que está estão atribuídos na classe
		
		// declaração do construtor trimestre
		BalancoInt bitri = new BalancoInt(30000,2000,10000); 
		System.out.println(bitri); // só alterou os três primeiros meses
		
		// declaração do construtor semestre
		BalancoInt bisem = new BalancoInt(1000, 20009, 90123, 80764, 1234, 20001);
		System.out.print(bisem); // alterou todos os valores
		
		BalancoDouble bd = new BalancoDouble();
		BalancoBigD big = new BalancoBigD();
		System.out.println("\nInteger:");
		bi.soma();
		bi.soma(100);
		bi.soma(100,200);
		bi.soma(100,200,300);
		System.out.println("\nDouble:");
		bd.soma();
		bd.soma(10);
		bd.soma(100,200);
		bd.soma(1000, 20, 10);
		System.out.println("\nBigDecimal:");
		big.soma();
		big.soma(new BigDecimal(200));
		big.soma(new BigDecimal(300),new BigDecimal(400));
		big.soma(new BigDecimal(600), new BigDecimal(800), new BigDecimal(1000));
				
	}

}
