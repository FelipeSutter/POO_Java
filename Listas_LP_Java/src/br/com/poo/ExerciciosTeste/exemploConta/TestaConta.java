package br.com.poo.ExerciciosTeste.exemploConta;

public class TestaConta {

	public static void main(String[] args) {
		Conta cp = new ContaPoupanca();
		System.out.println(cp);
		Conta cc = new ContaCorrente();
		cp.setSaldo(10000);
		cp.imprimeExtrato();
		System.out.println(cc);
		Conta cp1 = new ContaPoupanca();
		System.out.println(cp1);

	}

}
