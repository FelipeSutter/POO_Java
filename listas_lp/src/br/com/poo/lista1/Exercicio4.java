package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double C, F;
		System.out.print("Digite a temperatura desejada: ");
		C = sc.nextInt();
		F = C * 1.8 + 32;
		System.out.printf("Temperatura em C: %.0f\n", C);
		System.out.printf("Temperatura em F: %.0f", F);
		sc.close();
	}

}
