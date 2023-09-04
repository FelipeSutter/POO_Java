package br.com.poo.BalancoTrimestre;

import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BalancoDouble {

	private Double gastoJaneiro = 15000.00;
	private Double gastoFevereiro = 23000.00;
	private Double gastoMarco = 17000.00;
	private Double somaTotal = gastoJaneiro + gastoFevereiro + gastoMarco;
	private Logger customLogger = Util.setupLogger();
	private DecimalFormat df = new DecimalFormat("#,###.00");
	
	public double soma() {
		Util.customizer();
		customLogger.log(Level.INFO, () -> "\nO balanço trimestral é: " + df.format(somaTotal));
		return somaTotal;
	}
	
	public double soma(double janeiro) {
		Util.customizer();
		customLogger.log(Level.INFO, () -> "A soma de janeiro eh: " + df.format(janeiro));
		return janeiro;
	}
	
	public double soma(double janeiro, double fevereiro) {
		double somaTotal1 = janeiro + fevereiro;
		Util.customizer();
		customLogger.log(Level.INFO, () -> "A soma do bimestre eh: " + df.format(somaTotal1));
		return somaTotal1;
	}
	
	public double soma(double janeiro, double fevereiro, double marco) {
		double somaTotal2 = janeiro + fevereiro + marco;
		Util.customizer();
		customLogger.log(Level.INFO, () -> "A soma do trimestre eh: " + df.format(somaTotal2));
		return somaTotal2;
	}
	
}
