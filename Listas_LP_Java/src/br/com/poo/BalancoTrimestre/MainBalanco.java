package br.com.poo.BalancoTrimestre;

import java.math.BigDecimal;

public class MainBalanco {

	public static void main(String[] args) {
		BalancoInt bi = new BalancoInt();
		BalancoDouble bd = new BalancoDouble();
		BalancoBigD big = new BalancoBigD();
		bi.soma();
		bi.soma(100);
		bi.soma(100,200);
		bi.soma(100,200,300);
		
		bd.soma();
		bd.soma(10);
		bd.soma(100,200);
		bd.soma(0, 0, 0);
		
		big.soma();
		big.soma(new BigDecimal(200));
		big.soma(new BigDecimal(300),new BigDecimal(400));
		big.soma(new BigDecimal(600), new BigDecimal(800), new BigDecimal(1000));
		
	}

}
