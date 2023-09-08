package br.com.poo.BalancoTrimestre;

import java.util.logging.Logger;

import br.com.poo.util.Util;

import java.text.DecimalFormat;

import java.util.logging.Level;

public class BalancoInt {
	
	private Integer gastoJaneiro = 15000;
	private Integer gastoFevereiro = 23000;
	private Integer gastoMarco = 17000;
	private Integer gastoAbril = 10000;
	private Integer gastoMaio = 8000;
	private Integer gastoJunho = 20000;
	private Integer somaTotal = gastoJaneiro + gastoFevereiro + gastoMarco;
	private Logger customLogger = Util.setupLogger();
	private DecimalFormat df = new DecimalFormat("#,###.00");
	public int num = 1000;
	protected int numEx = 2000;
	
	public BalancoInt() {
		
	}

	public BalancoInt(Integer gastoJaneiro, Integer gastoFevereiro, Integer gastoMarco) {
		this.gastoJaneiro = gastoJaneiro;
		this.gastoFevereiro = gastoFevereiro;
		this.gastoMarco = gastoMarco;
	}

	public BalancoInt(Integer gastoJaneiro, Integer gastoFevereiro, Integer gastoMarco, Integer gastoAbril, Integer gastoMaio, Integer gastoJunho) {
		this.gastoJaneiro = gastoJaneiro;
		this.gastoFevereiro = gastoFevereiro;
		this.gastoMarco = gastoMarco;
		this.gastoAbril = gastoAbril;
		this.gastoMaio = gastoMaio;
		this.gastoJunho = gastoJunho;
	}

	public Integer getGastoJaneiro() {
		return gastoJaneiro;
	}
	
	@Override
	public String toString() {
		return "--- Balanço total ---\n\nJaneiro: \t" + gastoJaneiro + "\nFevereiro: \t" + gastoFevereiro + "\nMarço: \t\t" + gastoMarco + "\nAbril: \t\t" + gastoAbril + "\nMaio: \t\t" + gastoMaio + "\nJunho: \t\t" + gastoJunho + "\n---------------------";
	}
	
	public int soma() {
		Util.customizer();
		customLogger.log(Level.INFO, () -> "\nO balanço trimestral é: " + df.format(somaTotal));
		return somaTotal;
	}
	
	public int soma(int janeiro) {
		Util.customizer();
		customLogger.log(Level.INFO, () -> "A soma de janeiro eh: " + df.format(janeiro));
		return janeiro;
	}
	
	public int soma(int janeiro, int fevereiro) {
		int somaTotal1 = janeiro + fevereiro;
		Util.customizer();
		customLogger.log(Level.INFO, () -> "A soma do bimestre eh: " + df.format(somaTotal1));
		return somaTotal1;
	}
	
	public int soma(int janeiro, int fevereiro, int marco) {
		int somaTotal2 = janeiro + fevereiro + marco;
		Util.customizer();
		customLogger.log(Level.INFO, () -> "A soma do trimestre eh: " + df.format(somaTotal2));
		return somaTotal2;
	}
}
