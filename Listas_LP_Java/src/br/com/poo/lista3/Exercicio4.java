package br.com.poo.lista3;

import java.util.Random;

import br.com.poo.util.Util;

public class Exercicio4 {

	public static void main(String[] args) {
		Random r = new Random();
		int num;
		int par = 0;
		for(int i = 0; i < 20; i++) {
			num = r.nextInt(1000);
			Util.customizer();
			System.out.println("Digite um número: " + num);
			if(num % 2 == 0) {
				par++;
			}
		}
		System.out.println("O total de números pares digitados foi: " + par);

	}

}
