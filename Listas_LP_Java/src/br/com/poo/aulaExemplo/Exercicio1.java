package br.com.poo.aulaExemplo;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		String nome, sobrenome, texto = "Seja bem vindo(a) ";
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Por favor informe o seu nome: ");
		nome = sc.next(); 
		
		System.out.println("Por favor informe o seu sobrenome: ");
		sobrenome = sc.next(); 
		
		sc.close(); 
		System.out.printf("%s%s %s \n", texto, nome, sobrenome); 

	}

}


