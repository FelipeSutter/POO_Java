package br.com.poo.aulaExemplo;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1;
		double n2;
		System.out.println("Digite o primeiro numero: ");
		n1 = sc.nextDouble();
		System.out.println("Digite o segundo numero: ");
		n2 = sc.nextDouble();
		double soma = n1+n2;
		System.out.printf("A soma dos numeros eh: %.2f", soma);
		sc.close();
	}

}
