package br.com.poo.BalancoTrimestre;

import java.math.BigDecimal;

public class ExercicioBigDecimal {

	public static void main(String[] args) {
		BigDecimal gastosJaneiro = new BigDecimal(15000);
		BigDecimal gastosFevereiro = new BigDecimal(23000);
		BigDecimal gastosMarco = new BigDecimal(17000);
		BigDecimal somaTotal = gastosJaneiro.add(gastosFevereiro).add(gastosMarco);
		System.out.printf("A soma trimestral eh: %f", somaTotal);

	}

}
