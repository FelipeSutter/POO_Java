package br.com.poo.lista2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double estudantes, m1,m2,m3;
		System.out.print("Bem-vindo(a), este eh um Estudo da Madrugada.\nDigite a quantidade de Estudantes a seguir: ");
		estudantes = sc.nextDouble();
		m1 = ((estudantes * 35) / 100);
		m2 = ((m1 * 30) / 100);
		m3 = m1 / m2;
		System.out.printf("Em media, %.2f dos estudantes da primeira disciplina estudam de madrugada.\n", m1);
		System.out.printf("Em media, %.2f dos estudantes da segunda disciplina estudam de madrugada.\n", m2);
		System.out.printf("No total, %.2f dos estudantes estudam de madrugada em ambas as disciplinas.\n", m3);
		sc.close();

	}

}
