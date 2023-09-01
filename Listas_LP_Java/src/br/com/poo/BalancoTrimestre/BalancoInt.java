package br.com.poo.BalancoTrimestre;

import java.util.logging.Logger;
import java.util.logging.Level;

public class BalancoInt {
	
	private Integer gastoJaneiro = 15000;
	private Integer gastoFevereiro = 23000;
	private Integer gastoMarco = 17000;
	private Integer somaTotal = gastoJaneiro + gastoFevereiro + gastoMarco;
	private static Logger logger = Logger.getLogger(BalancoInt.class.getName());
	public int num = 1000;
	protected int numEx = 2000;
	
	public int soma() {
		//System.out.printf("A soma total do trimestre eh: %d\n", somaTotal);
		logger.log(Level.INFO, "A soma total do trimestre eh: " + somaTotal);
		// olhar o sonarLint no logger e achar uma solução do pq o sublinhado
		return somaTotal;
	}
	
	public int soma(int janeiro) {
		System.out.printf("A soma de janeiro eh: %d\n", janeiro);
		return janeiro;
	}
	
	public int soma(int janeiro, int fevereiro) {
		int somaTotal = janeiro + fevereiro;
		System.out.printf("A soma do bimestre eh: %d\n", somaTotal);
		return somaTotal;
	}
	
	public int soma(int janeiro, int fevereiro, int marco) {
		int somaTotal = janeiro + fevereiro + marco;
		System.out.printf("A soma do trimestre eh: %d\n", somaTotal);
		return somaTotal;
	}
}
