package br.com.poo.aulaExemplo;

public class Exercicio4 {

	public static void main(String[] args) {
		char letra1 = 'A';
		char letra2 = 'Z';
		
		System.out.printf("O resultado eh: %d\n", (int) letra1); // A em decimal na tabela ascii e 65, o %d eh de decimal
		System.out.printf("O resultado eh: %d\n", (int) letra2); // Z em decimal na tabela ascii e 90, por padrao, o int
		System.out.printf("O resultado eh: %d\n", (int) letra1 + letra2); // A soma e 155 			   recebe decimal
		
	}

}
