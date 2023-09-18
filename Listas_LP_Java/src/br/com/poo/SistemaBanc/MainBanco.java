package br.com.poo.SistemaBanc;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;

import br.com.poo.SistemaBanc.Contas.ContaBanco;
import br.com.poo.banco.io.LeituraEscrita;
import br.com.poo.util.Util;

public class MainBanco {

	public static void main(String[] args) throws IOException {
		LeituraEscrita.leitor("banco");
		//LeituraEscrita.escritor("banco");
		
		DecimalFormat df = new DecimalFormat("#,###.00");
//		ContaBanco cb = new ContaBanco(100,"Felipe",200.00);
//		
//		System.out.println(cb);
//		Util.customizer();
//		Util.setupLogger().log(Level.INFO, () -> "O seu saldo é: " + df.format(cb.getSaldo()));

	}

}
