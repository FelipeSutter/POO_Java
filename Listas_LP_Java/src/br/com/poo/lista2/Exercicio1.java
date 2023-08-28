package br.com.poo.lista2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int UNIVERSO = 32;
		boolean verdadeiro = true;
		String letra;
		while(verdadeiro) {
			System.out.print("Qual o significado da vida, do universo e tudo mais? Digite S para saber: ");
			letra = sc.next();
			if(letra.equals("s") || letra.equals("S")) {
				System.out.println(UNIVERSO);
			}
			else {
				System.out.println("Que sem graca!");
				verdadeiro = false;
			}
		}
		sc.close();
	}

}
