package br.com.poo.BalancoTrimestre;

public class ExercicioDouble {

	public static void main(String[] args) {
		Double gastosJaneiro = 15000.00;
		Double gastosFevereiro = 23000.00;
		Double gastosMarco = 17000.00;
		Double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.printf("A soma trimestral eh: %.2f",gastosTrimestre);

	}

}
