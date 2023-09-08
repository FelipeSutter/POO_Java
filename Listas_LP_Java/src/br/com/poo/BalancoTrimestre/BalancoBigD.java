package br.com.poo.BalancoTrimestre;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.util.Util;

public class BalancoBigD {
	private BigDecimal gastoJaneiro =  new BigDecimal(15000);
	private BigDecimal gastoFevereiro = new BigDecimal(23000);
	private BigDecimal gastoMarco = new BigDecimal(17000);
	private BigDecimal somaTotal = gastoJaneiro.add(gastoFevereiro).add(gastoMarco);
	private Logger customLogger = Util.setupLogger();
	private DecimalFormat df = new DecimalFormat("#,###.00");
	
	public BigDecimal soma() {
		Util.customizer();
		customLogger.log(Level.INFO, () -> "\nO balanço trimestral é: " + df.format(somaTotal));
		return somaTotal;
	}
	
	public BigDecimal soma(BigDecimal janeiro) {
		Util.customizer();
		customLogger.log(Level.INFO, () -> "A soma de janeiro eh: " + df.format(janeiro));
		return janeiro;
	}
	
	public BigDecimal soma(BigDecimal janeiro, BigDecimal fevereiro) {
		BigDecimal somaTotal1 = janeiro.add(fevereiro);
		Util.customizer();
		customLogger.log(Level.INFO, () -> "A soma do bimestre eh: " + df.format(somaTotal1));
		return somaTotal1;
	}
	
	public BigDecimal soma(BigDecimal janeiro, BigDecimal fevereiro, BigDecimal marco) {
		BigDecimal somaTotal2 = janeiro.add(fevereiro).add(marco);
		Util.customizer();
		customLogger.log(Level.INFO, () -> "A soma do trimestre eh: " + df.format(somaTotal2));
		return somaTotal2;
	}
}
