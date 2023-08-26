package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pessoa;
		int soma = 0;
		for(int i = 0; i < 5; i++) {
			System.out.printf("Qual é a idade da pessoa %d? ", i+1);
			pessoa = sc.nextInt();
			soma += pessoa;
			if(i == 4) {
				System.out.printf("Qual é a minha idade? ");
				pessoa = sc.nextInt();
				soma += pessoa;
			}
		}
		System.out.printf("A soma das pessoas é: %d", soma);
	}

}
