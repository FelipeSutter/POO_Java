package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio5 {
	
	public static int menu(Scanner sc) {
		int valor;
		do {
			System.out.println("1 - Exibir primeira expressao");
			System.out.println("2 - Exibir segunda expressao");
			System.out.println("3 - Sair");
			System.out.print("Escolha a sua opcao: ");
			valor = sc.nextInt();
		} while(valor < 1 || valor > 3);
		return valor;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean verdadeiro = true;
		int a = (-5 * 8) + (7 * 66) + (2 + 3) + (-4 + 354 - 521);
		int b = 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9;
		while(verdadeiro) {
			switch(menu(sc)) {
				case 1:
					System.out.println("O resultado dessa expressao eh: " + a);
					break;
			
				case 2:
					System.out.println("O resultado dessa expressao eh: " + b);
					break;
				
				case 3:
					System.out.println("Obrigado por utilizar nossas expressoes!");
					verdadeiro = false;
					break;
			}
		}
		sc.close();

	}

}
