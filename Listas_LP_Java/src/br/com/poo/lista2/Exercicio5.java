package br.com.poo.lista2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double horas;
		System.out.print("Escreva a qtd de horas desejadas: ");
		horas = sc.nextDouble();
		if(horas < 0) {
			horas *= -1;
		}
		System.out.printf("1 hora = 3600 segundos.\n%.0f hora(s) x 3600 segundos eh: %.0f segundos.", horas, horas * 3600);
		sc.close();
	}

}
