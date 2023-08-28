package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio3 {

	public static int menu(Scanner sc) {
		int valor;
		do {
			System.out.println("Bem-vindo(a) ao programa Zeus! A calculadora dos Deuses.");
			System.out.println("1. Adicao");
			System.out.println("2. Subtracao");
			System.out.println("3. Multiplicacao");
			System.out.println("4. Divisao");
			System.out.println("5. Sair");
			System.out.print("Escolha a sua operacao: ");
			valor = sc.nextInt();
			if(valor < 1 || valor > 5) {
				System.out.println("Você colocou um caracter invalido");
				limpa();
			}
		} while(valor < 1 || valor > 5);
		return valor;
	}
	
	public static void limpa() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	/*public static void lerNumeros(int v1, int v2) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		v1  = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		v2 = sc.nextInt();
		sc.close();
	} */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		boolean verdadeiro = true;
		while(verdadeiro) {
			switch (menu(sc)) {
				// soma
				case 1:
					System.out.print("Digite o primeiro numero: ");
					n1  = sc.nextInt();
					System.out.print("Digite o segundo numero: ");
					n2 = sc.nextInt();
					System.out.printf("O resultado eh: %d\n", n1+n2);
					break;
					
				// subtracao
				case 2:
					System.out.print("Digite o primeiro numero: ");
					n1  = sc.nextInt();
					System.out.print("Digite o segundo numero: ");
					n2 = sc.nextInt();
					System.out.printf("O resultado eh: %d\n", n1-n2);
					break;
					
				// multiplicacao
				case 3:
					System.out.print("Digite o primeiro numero: ");
					n1  = sc.nextInt();
					System.out.print("Digite o segundo numero: ");
					n2 = sc.nextInt();
					System.out.printf("O resultado eh: %d\n", n1*n2);
					break;
					
				//divisao
				case 4:
					System.out.print("Digite o primeiro numero: ");
					n1  = sc.nextInt();
					System.out.print("Digite o segundo numero: ");
					n2 = sc.nextInt();
					if(n1 == 0) {
						System.out.println("Divisao por zero...");
						break;
					}
					else {
						System.out.printf("O resultado eh: %.2f\n", (double) n1/n2);
						break;
					}
				
				//sair
				case 5:
					System.out.println("Obrigado por utilizar o nosso sistema!");
					verdadeiro = false;
					break;
			}
		}
		sc.close();
	}

}
