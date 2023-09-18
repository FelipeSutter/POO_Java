package br.com.poo.SistemaBanc.Contas;

import java.util.Scanner;

class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}

class ContaBancaria {
    private String numeroConta;
    private Cliente titular;
    private double saldo;

    public ContaBancaria(String numeroConta, Cliente titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para a transferência.");
        }
    }
}

public class SistemaBancarioExemplo {
	
	public static int menu(Scanner sc) {
		int opc;
		do {
			System.out.println("1. Inserir Cliente");
			System.out.println("2. Depositar");
			System.out.println("3. Transferir");
			System.out.println("4. Sair");
			opc = sc.nextInt();
		} while (opc < 1 || opc > 4);
		return opc;
	}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String nome, cpf;
    	boolean verifica = false;
    	while(!verifica) {
    		switch(menu(sc)) {
    		case 1:
    			System.out.print("Digite o nome do cliente:");
    			nome = sc.nextLine();
    			System.out.print("Digite o CPF do cliente:");
    			cpf = sc.nextLine();
    			Cliente cliente1 = new Cliente(nome, cpf);
    			ContaBancaria conta1 = new ContaBancaria("001", cliente1);
    			System.out.println("Cliente inserido com sucesso!\nA sua conta é " + conta1 + " e o nome do cliente é " + cliente1);
    		case 2:
    			
    		}
    	}
        Cliente cliente1 = new Cliente("João", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria", "987.654.321-00");

        ContaBancaria conta1 = new ContaBancaria("001", cliente1);
        ContaBancaria conta2 = new ContaBancaria("002", cliente2);

        conta1.depositar(1000.0);
        conta2.depositar(500.0);

        System.out.println("Saldo de " + cliente1.getNome() + ": R$" + conta1.getSaldo());
        System.out.println("Saldo de " + cliente2.getNome() + ": R$" + conta2.getSaldo());

        conta1.transferir(conta2, 200.0);

        System.out.println("Saldo de " + cliente1.getNome() + ": R$" + conta1.getSaldo());
        System.out.println("Saldo de " + cliente2.getNome() + ": R$" + conta2.getSaldo());
    }
}
