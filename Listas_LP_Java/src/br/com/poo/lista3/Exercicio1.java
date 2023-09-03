package br.com.poo.lista3;

import java.util.logging.Logger;
import java.util.logging.Level;

public class Exercicio1 {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Exercicio1.class.getName());
		for(int i = 0; i < 20; i++) {
			logger.log(Level.INFO, "Agora eu vou entender o laço de repetição!");
		}

	}

}
