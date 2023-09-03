package br.com.poo.BalancoTrimestre;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BalancoBigD {
	private BigDecimal gastoJaneiro =  new BigDecimal(15000);
	private BigDecimal gastoFevereiro = new BigDecimal(23000);
	private BigDecimal gastoMarco = new BigDecimal(17000);
	private BigDecimal somaTotal = gastoJaneiro.add(gastoFevereiro).add(gastoMarco);
	private static Logger logger = Logger.getLogger(BalancoBigD.class.getName());
	
	public BigDecimal soma() {
		String mensagem = String.format("A soma total do trimestre eh: %.2f", somaTotal);
		logger.log(Level.INFO,mensagem);
		logger.log(Level.INFO,"A soma total do trimestre eh: {0}\n", somaTotal);
		return somaTotal;
	}
	
	public BigDecimal soma(BigDecimal janeiro) {
		String mensagem = String.format("A soma total do trimestre eh: %.2f", janeiro);
		logger.log(Level.INFO,mensagem);
		logger.log(Level.INFO,"A soma total do trimestre eh: {0}\n", janeiro);
		return janeiro;
	}
	
	public BigDecimal soma(BigDecimal janeiro, BigDecimal fevereiro) {
		BigDecimal somaTotal1 = janeiro.add(fevereiro);
		String mensagem = String.format("A soma do bimestre eh: %.2f", somaTotal1);
		logger.log(Level.INFO,mensagem);
		logger.log(Level.INFO,"A soma do bimestre eh: {0}\n", somaTotal1);
		return somaTotal1;
	}
	
	public BigDecimal soma(BigDecimal janeiro, BigDecimal fevereiro, BigDecimal marco) {
		BigDecimal somaTotal2 = janeiro.add(fevereiro).add(marco);
		String mensagem = String.format("A soma do bimestre eh: %.2f", somaTotal2);
		logger.log(Level.INFO,mensagem);
		logger.log(Level.INFO,"A soma do bimestre eh: {0}\n", somaTotal2);
		return somaTotal2;
	}
}
