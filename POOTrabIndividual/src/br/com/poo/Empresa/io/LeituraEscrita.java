package br.com.poo.Empresa.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import br.com.poo.Empresa.entities.Departamento;
import br.com.poo.Empresa.entities.Funcionario;

public class LeituraEscrita {

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
				if (Arrays.asList("1", "2", "3", "4", "5").contains(dados[0])) {
	                // Integer id, String nome, String telefone
					Integer departamentoId = 1000 + Integer.parseInt(dados[0]);
	                Departamento d = new Departamento(departamentoId, dados[1], dados[2]);
	                Departamento.mapaDepartamento.put(departamentoId, d);
	            } else if (Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8").contains(dados[0])) {
	                // Integer id, String nome, String cpf, String telefone, String dataNasc
	            	Integer funcionarioId = 2000 + Integer.parseInt(dados[0]);
	            	Integer departamentoId = Integer.parseInt(dados[5]);
	                Funcionario f = new Funcionario(funcionarioId, dados[1], dados[2], dados[3], dados[4], departamentoId);
	                Funcionario.mapaFunc.put(funcionarioId, f);
	                
	                if(Departamento.mapaDepartamento.containsKey(departamentoId)) {
	                	Departamento dep = Departamento.mapaDepartamento.get(departamentoId);
	                }
	            }
			} else {
				break;
			}
		}
		System.out.println(Departamento.mapaDepartamento);
		System.out.println(Funcionario.mapaFunc);
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
}
