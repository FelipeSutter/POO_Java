package br.com.poo.Empresa.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.Empresa.entities.Departamento;
import br.com.poo.Empresa.entities.Funcionario;
import br.com.poo.Empresa.enums.departamentoEnum;
import br.com.poo.Empresa.util.Util;

public class LeituraEscrita {

	public static final Logger customLogger = Util.setupLogger();
	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";
	static int contador = 0;

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));

		String linha = "";
		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {
				contador++;
				String[] dados = linha.split(";");
				if (dados[0].equalsIgnoreCase(departamentoEnum.INVEST_JA.getTipoDepartamento())
						|| dados[0].equalsIgnoreCase(departamentoEnum.SUPORTE_AO_CLIENTE.getTipoDepartamento())
						|| dados[0].equalsIgnoreCase(departamentoEnum.DEPARTAMENTO_DE_CARTOES.getTipoDepartamento()) 
						|| dados[0].equalsIgnoreCase(departamentoEnum.DEPARTAMENTO_DE_GRAFICOS.getTipoDepartamento())
						|| dados[0].equalsIgnoreCase(departamentoEnum.INFRAESTRUTURA_EMPRESARIAL.getTipoDepartamento())){
					// String nome, Integer id,  String telefone
					Departamento d = new Departamento(dados[0], Integer.parseInt(dados[1]), dados[2]);
					Departamento.mapaDepartamento.put(Integer.parseInt(dados[1]), d);
				} else if (Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8").contains(dados[0])) {
					// Integer id, String nome, String cpf, String telefone, String dataNasc
					Funcionario f = new Funcionario(Integer.parseInt(dados[0]), dados[1], dados[2], dados[3], dados[4], Integer.parseInt(dados[5]));
					Funcionario.mapaFunc.put(Integer.parseInt(dados[0]), f);
				}
			} else {
				break;
			}
		}
		buffRead.close();
	}

	public static void relatorioDepartamento(Departamento dep) throws IOException {
		String path = dep.getNome() + "_" + dep.getId();
		BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + path + EXTENSAO, true));

		buffWriter.append("------------------ RELATÓRIO DE DEPARTAMENTO ------------------\n");
		buffWriter.append("Nome do Departamento: " + dep.getNome() + "\n");
		buffWriter.append("Quantidade de Funcionários: " + Funcionario.mapaFunc.size() + "\n");
		LocalDateTime dataHora = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		buffWriter.append("Relatório gerado em: " + dtf.format(dataHora) + "\n");
		buffWriter.append("------------------ FIM DO RELATÓRIO ------------------\n");
		buffWriter.close();
	}

	public static void relatorioFuncionario(Funcionario func) throws IOException {
		String path = func.getNome() + "_" + func.getCpf();
		BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + path + EXTENSAO, true));

		buffWriter.append("------------------ RELATÓRIO DE FUNCIONARIO ------------------\n");
		buffWriter.append("Nome do Funcionário: " + func.getNome() + "\n");
		buffWriter.append("CPF do Funcionário: " + func.getCpf() + "\n");
		LocalDateTime dataHora = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		buffWriter.append("Relatório gerado em: " + dtf.format(dataHora) + "\n");
		buffWriter.append("------------------     FIM DO RELATÓRIO     ------------------\n");
		buffWriter.close();
	}
	
	public static void mostrarDepartamento(Departamento dep) {
		customLogger.log(Level.INFO, () -> "------------------ RELATÓRIO DE DEPARTAMENTO ------------------");
		customLogger.log(Level.INFO, () -> "Nome do Departamento: " + dep.getNome());
		customLogger.log(Level.INFO, () -> "Quantidade de Funcionários: " + Funcionario.mapaFunc.size());
	    LocalDateTime dataHora = LocalDateTime.now();
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	    customLogger.log(Level.INFO, () -> "Relatório gerado em: " + dtf.format(dataHora));
	    customLogger.log(Level.INFO, () -> "------------------ FIM DO RELATÓRIO ------------------");
	}
	
	public static void mostrarFuncionario(Funcionario func) {
		customLogger.log(Level.INFO, () -> "------------------ RELATÓRIO DE FUNCIONARIO ------------------");
		customLogger.log(Level.INFO, () -> "Nome do Funcionário: " + func.getNome());
		customLogger.log(Level.INFO, () -> "CPF do Funcionário: " + func.getCpf());
	    LocalDateTime dataHora = LocalDateTime.now();
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	    customLogger.log(Level.INFO, () -> "Relatório gerado em: " + dtf.format(dataHora));
	    customLogger.log(Level.INFO, () -> "------------------     FIM DO RELATÓRIO     ------------------");
	}
}
