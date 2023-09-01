package br.com.poo.BalancoTrimestre;

public class ExercicioInteger {
	
	public static void main(String[] args) {
		Integer gastosJaneiro = 15000;
		Integer gastosFevereiro = 23000;
		Integer gastosMarco = 17000;
		Integer gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.printf("A soma trimestral eh: %d" + gastosTrimestre);
		
	}

}
