package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void limpa() {
		for(int i = 0; i < 20; i++) {
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		String nome, sobrenome;
		Scanner sc = new Scanner(System.in); // declarado o scanner 
		
		System.out.println("Por favor informe o seu nome: ");
		nome = sc.nextLine(); // leia a variável / line - para dar espaço na string
		
		System.out.println("Por favor informe o seu sobrenome: ");
		sobrenome = sc.nextLine(); // leia a variável
		
		sc.close(); // fecha o scanner para tirar o warning
		limpa();
		System.out.printf("Seja bem vindo(a) %s %s\n",nome,sobrenome); // printf formata a saida e pode usar virgula
		System.out.println("Seja bem vindo(a) " + nome + " " + sobrenome); // println tem que usar o +

	}

}
