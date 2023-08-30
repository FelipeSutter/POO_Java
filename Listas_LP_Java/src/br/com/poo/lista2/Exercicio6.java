package br.com.poo.lista2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, p = 0, soma = 0;
		System.out.print("Escreva um numero maior que 100: ");
		num = sc.nextInt();
		
		System.out.print("\nOs menores numeros multiplos de 6 sao: ");
		for(int i  = 100; i <= num; i++) {
			if(i % 6 == 0 && p < 3) {
				System.out.print(i + " ");
				soma += i;
				p++;
			}
		}
		
		System.out.print("\nOs maiores numeros multiplos de 6 sao: ");
		for(int i = num; i >= 100; i--) {
			if(i % 6 == 0 && p > 0) {
				System.out.print(i + " ");
				soma += i;
				p--;
			}
		}
		System.out.print("\nA soma total eh: " + soma);
		sc.close();

	}

}
