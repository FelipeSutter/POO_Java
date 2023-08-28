package br.com.poo.lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static int menu(Scanner sc) {
		int valor;
		do {
			System.out.println("+--------------------------------------------+");
			System.out.println("! Bem-vindo(a) ao nosso estoque de frutas.   !");
			System.out.println("! 1 - Listar produtos com Estoque            !");
			System.out.println("! 2 - Listar produtos sem Estoque            !");
			System.out.println("! 3 - Sair do Programa                       !");
			System.out.println("+--------------------------------------------+\n");
			System.out.print("Digite a sua opcao: ");
			valor = sc.nextInt();
			if(valor < 1 || valor > 3) {
				System.out.println("Você colocou um caracter invalido");
				limpa();
			}
		} while(valor < 1 || valor > 3);
		return valor;
	}
	
	public static void menuCarregando() {
		System.out.print("Carregando");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(".");
			}
		}
	}

	public static void limpa() {
		for(int i = 0; i < 20; i++) {
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// no java tem que botar o array antes do nome
		String[][] matrizEstoque = {{"Morango","3"}, {"Maracuja","7"}, {"Banana","2"}, {"Laranja","1"}, {"Pera","2"}};
		String[] semEstoque = {"Uva", "Maça", "Tangerina"};
		boolean verdadeiro = true;
		char letra;
		menuCarregando();
		limpa();
		while(verdadeiro) {
			switch(menu(sc)) {
				// exibe os produtos com estoque
				case 1:
					for(int i = 0; i < 5; i++) {
						System.out.printf("%d. %s \tQtd: %s\n", i+1, matrizEstoque[i][0],matrizEstoque[i][1]);
					}
					break;
					
				case 2:
					for(int i = 0; i < 3; i++) {
						System.out.printf("%d. %s\n", i+1, semEstoque[i]);
					}
					break;
				case 3:
					System.out.println("Voce deseja realmente sair? Digite 's' para Sim e 'n' para Nao");
					letra = sc.next().charAt(0); // para ler o primeiro caracter
					if(letra == 's' || letra == 'S') {
						menuCarregando();
						System.out.println(" Obrigado por utilizar o nosso sistema de frutas!");
						verdadeiro = false;
					}
					break;
				
			}
		}
	}

}
