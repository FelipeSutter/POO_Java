package br.com.poo.aulaExemplo;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.print("Digite um numero: ");
		n1 = sc.nextInt();		
		System.out.print("Digite outro numero: ");
		n2 = sc.nextInt();
		System.out.printf("O resultado eh: %.2f", (double) n1/n2);
		sc.close();
	}

}
