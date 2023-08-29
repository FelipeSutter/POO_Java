package br.com.poo.lista2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1,a2,a3;
		System.out.print("Digite o primeiro angulo: ");
		a1 = sc.nextInt();
		System.out.print("Digite o segundo angulo: ");
		a2 = sc.nextInt();
		System.out.print("Digite o terceiro angulo: ");
		a3 = sc.nextInt();
		// triangulo invalido
		if(a1 + a2 + a3 != 180) {
			System.out.println("Isso nao eh um triangulo valido.");
		}
		// triangulo retangulo
		else if(a1 == 90 || a2 == 90 || a3 == 90) {
			System.out.printf("Primeiro angulo: %d\n", a1);
			System.out.printf("Segundo angulo: %d\n", a2);
			System.out.printf("Terceiro angulo: %d\n", a3);
			System.out.println("Voce obteve um Triangulo Retangulo.");
		}
		// triangulo obtusangulo
		else if(a1 > 90 || a2 > 90 || a3 > 90) {
			System.out.printf("Primeiro angulo: %d\n", a1);
			System.out.printf("Segundo angulo: %d\n", a2);
			System.out.printf("Terceiro angulo: %d\n", a3);
			System.out.println("Voce obteve um Triangulo Obtusangulo.");
		}
		// triangulo acutangulo
		else if(a1 < 90 || a2 < 90 || a3 < 90) {
			System.out.printf("Primeiro angulo: %d\n", a1);
			System.out.printf("Segundo angulo: %d\n", a2);
			System.out.printf("Terceiro angulo: %d\n", a3);
			System.out.println("Voce obteve um Triangulo Acutangulo.");
		}
		sc.close();

	}

}
