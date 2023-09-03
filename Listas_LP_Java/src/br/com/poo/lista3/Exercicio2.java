package br.com.poo.lista3;

import java.util.logging.Logger;
import java.util.Random;
import java.util.logging.Level;

public class Exercicio2 {

	public static void main(String[] args) {
		Random r = new Random();
		Logger logger = Logger.getLogger(Exercicio1.class.getName());
		int num; 
		int aux1 = 0; 
		int aux2 = 0; 
		int aux3 = 0;
		
		for(int i = 0; i < 20; i++) {
			num =  r.nextInt(250);
			logger.log(Level.INFO, "Digite um número: {0}", num);
			if(num <= 100) {
				aux1++;
			}
			else if(num > 100 && num <= 200) {
				aux2++;
			}
			else {
				aux3++;
			}
		}
		logger.log(Level.INFO, "A qtd de números menores que 100 são: {0}", aux1);
		logger.log(Level.INFO, "A qtd de números entre 101 e 200 são: {0}", aux2);
		logger.log(Level.INFO, "A qtd de números maiores que 200 são: {0}", aux3);

	}

}
