package br.com.poo.Empresa;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.Empresa.entities.Departamento;
import br.com.poo.Empresa.entities.Funcionario;
import br.com.poo.Empresa.io.LeituraEscrita;
import br.com.poo.Empresa.util.Util;

public class EmpresaMain {

	public static final Logger customLogger = Util.setupLogger();
	
	public static int menu(Scanner sc) {
		int valor;
		do {
			Util.customizer();
			customLogger.log(Level.INFO, () -> "-------- DEPARTAMENTO x FUNCIONARIO --------");
			customLogger.log(Level.INFO, () -> "! 1. Imprimir Relatório Departamento       !");
			customLogger.log(Level.INFO, () -> "! 2. Imprimir Relatório Funcionario        !");
			customLogger.log(Level.INFO, () -> "! 3. Sair                                  !");
			customLogger.log(Level.INFO, () -> "!------------------------------------------!");
			customLogger.log(Level.INFO, () -> "Escolha a sua opção:");
			valor = sc.nextInt();
		} while(valor < 1 || valor > 3);
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
	
	public static void menuCarregando() {
		System.out.print("Carregando");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(".");
				try {
					  Thread.sleep(500);
				} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
			}
		}
	}
	
	public static void esperar() {
		try {
			Thread.sleep(500);
		} catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		LeituraEscrita.leitor("banco");
		Scanner sc = new Scanner(System.in);
		// Integer id, String nome, String cpf, String telefone, String dataNasc, Integer departamentoId
		// String nome, Integer id,  String telefone
		menuCarregando();
		limpa();
		Departamento dep = new Departamento("Invest agora", 2, "2234-9090");
		Funcionario func = new Funcionario(1, "Roberta", "12345677", "2223-4440", "2321-90-20",2);
		boolean verifica = true;
		while(verifica) {
			switch(menu(sc)) {
				case 1:
					LeituraEscrita.relatorioDepartamento(dep);
					limpa();
					LeituraEscrita.mostrarDepartamento(dep);
					esperar();
					break;
				case 2:
					LeituraEscrita.relatorioFuncionario(func);
					limpa();
					LeituraEscrita.mostrarFuncionario(func);
					esperar();
					break;
				case 3:
					limpa();
					menuCarregando();
					customLogger.log(Level.INFO, () -> "\nObrigado por utilizar o nosso programa!");
					verifica = false;
					break;
				default:
					System.out.println("Ops");
			}
		}
		

	}

}
