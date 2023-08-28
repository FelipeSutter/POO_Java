package br.com.poo.lista2;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date diaMesAno = new Date(); // recebe a data por completo
		String dia = new SimpleDateFormat("dd").format(diaMesAno); // formata em dia
		String mes = new SimpleDateFormat("MM").format(diaMesAno); // -- mes
		String ano = new SimpleDateFormat("YYYY").format(diaMesAno); // -- ano
		int diaDigitado, mesDigitado, anoDigitado;
		System.out.print("Digite o dia de preferencia: ");
		diaDigitado = sc.nextInt();
		System.out.print("Digite o mes de preferencia: ");
		mesDigitado = sc.nextInt();
		System.out.print("Digite o ano de preferencia: ");
		anoDigitado = sc.nextInt();
		// se a data for maior ou igual a data atual
		if(anoDigitado >= Integer.valueOf(ano) && mesDigitado >= Integer.valueOf(mes) && diaDigitado >= Integer.valueOf(dia)) {
			System.out.println("Voce ainda nem nasceu!");
		}
		// dia maior que 31 ou mes maior que 12
		else if(diaDigitado >= 32 || mesDigitado >= 12) {
			System.out.println("Dia ou mes invalidos.");
		}
		// se a data for menor do que a atual, comparado com o dia, mes e ano, diminui o ano atual pelo ano digitado
		else if(anoDigitado < Integer.valueOf(ano) && mesDigitado < Integer.valueOf(mes)) {
			System.out.printf("A idade digitada em comparacao com a data atual eh: %d", Integer.valueOf(ano) - anoDigitado);
		}
		else if(anoDigitado < Integer.valueOf(ano) && mesDigitado == Integer.valueOf(mes) && diaDigitado == Integer.valueOf(mes)) {
			System.out.printf("A idade digitada em comparacao com a data atual eh: %d", Integer.valueOf(ano) - anoDigitado);
		}
		else if(anoDigitado < Integer.valueOf(ano) && mesDigitado > Integer.valueOf(mes)) {
			System.out.printf("A idade digitada em comparacao com a data atual eh: %d", Integer.valueOf(ano) - anoDigitado - 1);
		}
		
		else if(anoDigitado < Integer.valueOf(ano) && mesDigitado >= Integer.valueOf(mes) && diaDigitado > Integer.valueOf(mes)) {
			System.out.printf("A idade digitada em comparacao com a data atual eh: %d", Integer.valueOf(ano) - anoDigitado - 1);
		}
		
		sc.close();
	}

}
