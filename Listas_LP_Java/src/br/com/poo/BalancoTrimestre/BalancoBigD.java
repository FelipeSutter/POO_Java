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
		//System.out.printf("A soma total do trimestre eh: %d\n", somaTotal);
		logger.log(Level.INFO, "A soma total do trimestre eh: " + somaTotal);
		// olhar o sonarLint no logger e achar uma solução do pq o sublinhado
		return somaTotal;
	}
	
	public BigDecimal soma(BigDecimal janeiro) {
		System.out.printf("A soma de janeiro eh: %.2f\n", janeiro);
		return janeiro;
	}
	
	public BigDecimal soma(BigDecimal janeiro, BigDecimal fevereiro) {
		BigDecimal somaTotal = janeiro.add(fevereiro);
		System.out.printf("A soma do bimestre eh: %.2f\n", somaTotal);
		return somaTotal;
	}
	
	public BigDecimal soma(BigDecimal janeiro, BigDecimal fevereiro, BigDecimal marco) {
		BigDecimal somaTotal = janeiro.add(fevereiro).add(marco);
		System.out.printf("A soma do trimestre eh: %.2f\n", somaTotal);
		return somaTotal;
	}
}
