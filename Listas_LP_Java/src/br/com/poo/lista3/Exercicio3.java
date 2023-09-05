package br.com.poo.lista3;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.BalancoTrimestre.Util;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Logger customLogger = Util.setupLogger();
		int num; 
		int soma = 0;
		boolean verificacao = true;
		while(verificacao) {
			customLogger.log(Level.INFO, () -> "Digite um número: ");
			num = sc.nextInt();
			if(num < 0) {
				verificacao = false;
			}
			else {
				soma += num; 
			}
 		}
		System.out.println("A soma dos números digitados foi: " + soma);
		sc.close();
		
	}

}
