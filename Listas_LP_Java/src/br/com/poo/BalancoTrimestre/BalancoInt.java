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

	public Integer getGastoJaneiro() {
		return gastoJaneiro;
	}
	
	public int soma() {
		String mensagem = String.format("A soma total do trimestre eh: %d", somaTotal);
		logger.log(Level.INFO,mensagem);
		logger.log(Level.INFO,"A soma total do trimestre eh: {0}\n", somaTotal);
		return somaTotal;
	}
	
	public int soma(int janeiro) {
		String mensagem = String.format("A soma de janeiro eh: %d", janeiro);
		logger.log(Level.INFO,mensagem);
		logger.log(Level.INFO,"A soma de janeiro eh: {0}\n", janeiro);
		return janeiro;
	}
	
	public int soma(int janeiro, int fevereiro) {
		int somaTotal1 = janeiro + fevereiro;
		String mensagem = String.format("A soma do bimestre eh: %d", somaTotal1);
		logger.log(Level.INFO,mensagem);
		logger.log(Level.INFO,"A soma do bimestre eh: {0}\n", somaTotal1);
		return somaTotal1;
	}
	
	public int soma(int janeiro, int fevereiro, int marco) {
		int somaTotal2 = janeiro + fevereiro + marco;
		String mensagem = String.format("A soma do trimestre eh: %d", somaTotal2);
		logger.log(Level.INFO,mensagem);
		logger.log(Level.INFO,"A soma do trimestre eh: {0}\n", somaTotal2);
		return somaTotal2;
	}
}
