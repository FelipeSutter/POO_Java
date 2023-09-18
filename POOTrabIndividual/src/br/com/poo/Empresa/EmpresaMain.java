package br.com.poo.Empresa;

import java.io.IOException;
import java.util.Scanner;

import br.com.poo.Empresa.io.LeituraEscrita;

public class EmpresaMain {

	public static int menu(Scanner sc) {
		int valor;
		do {
			System.out.println("-------- DEPARTAMENTO x FUNCIONARIO --------");
			System.out.println("! 1. Imprimir Relatório Departamento       !");
			System.out.println("! 2. Imprimir Relatório Funcionario        !");
			System.out.println("! 3. Sair                                  !");
			System.out.println("!------------------------------------------!");
			System.out.print("Escolha a sua opção:");
			valor = sc.nextInt();
		} while(valor < 1 || valor > 3);
		return valor;
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		LeituraEscrita.leitor("banco");
		boolean verifica = true;
		while(verifica) {
			switch(menu(sc)) {
				case 1:
					System.out.println("Opa");
					break;
				case 2:
					System.out.println("E aí");
					break;
				case 3:
					System.out.println("Tchau!");
					verifica = false;
					break;
				default:
					System.out.println("Ops");
			}
		}
		

	}

}
