package br.com.poo.BalancoTrimestre;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BalancoDouble {

	private Double gastoJaneiro = 15000.00;
	private Double gastoFevereiro = 23000.00;
	private Double gastoMarco = 17000.00;
	private Double somaTotal = gastoJaneiro + gastoFevereiro + gastoMarco;
	private static Logger logger = Logger.getLogger(BalancoDouble.class.getName());
	
	public double soma() {
		String mensagem = String.format("A soma total do trimestre eh: %.2f", somaTotal);
		logger.log(Level.INFO,mensagem);
		logger.log(Level.INFO,"A soma total do trimestre eh: {0}", somaTotal);
		// {0} age como se fosse o % do printf, e se quiser botar mais variáveis vai aumentando
		return somaTotal;
	}
	
	public double soma(double janeiro) {
		String mensagem = String.format("A soma de janeiro eh: %.2f", janeiro);
		logger.log(Level.INFO,mensagem);
		logger.log(Level.INFO,"A soma de janeiro eh: {0}", janeiro);
		// {0} age como se fosse o % do printf, e se quiser botar mais variáveis vai aumentando
		return janeiro;
	}
	
	public double soma(double janeiro, double fevereiro) {
		double somaTotal = janeiro + fevereiro;
		String mensagem = String.format("A soma do bimestre eh: %.2f", somaTotal);
		logger.log(Level.INFO,mensagem);
		logger.log(Level.INFO,"A soma do bimestre eh: {0}", somaTotal);
		// {0} age como se fosse o % do printf, e se quiser botar mais variáveis vai aumentando
		return somaTotal;
	}
	
	public double soma(double janeiro, double fevereiro, double marco) {
		double somaTotal = janeiro + fevereiro + marco;
		String mensagem = String.format("A soma do trimestre eh: %.2f", somaTotal);
		logger.log(Level.INFO,mensagem);
		logger.log(Level.INFO,"A soma do trimestre eh: {0}", somaTotal);
		return somaTotal;
	}
	
}
