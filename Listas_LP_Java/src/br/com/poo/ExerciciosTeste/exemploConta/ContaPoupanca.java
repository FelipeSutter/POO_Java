package br.com.poo.ExerciciosTeste.exemploConta;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {

	@Override
	public void imprimeExtrato() {
		System.out.println("### Extrato da Conta ###");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
		DecimalFormat df = new DecimalFormat("#,###.00");
		Date date = new Date();

		System.out.println("Saldo: "+df.format(getSaldo()));
		System.out.println("Data: "+sdf.format(date));

	}
}