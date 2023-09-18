package br.com.poo.Empresa.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.contas.ContaCorrente;
import br.com.poo.banco.contas.ContaPoupanca;
import br.com.poo.banco.enums.ContaEnum;
import br.com.poo.banco.enums.PessoasEnum;
import br.com.poo.banco.pessoas.Cliente;
import br.com.poo.banco.pessoas.Diretor;
import br.com.poo.banco.pessoas.Funcionario;
import br.com.poo.banco.pessoas.Gerente;
import br.com.poo.banco.pessoas.Presidente;

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
				if (dados[0].equalsIgnoreCase(ContaEnum.POUPANCA.name())) {
					// String tipoConta,String numConta, String numAgencia, String cpf, Double saldo
					ContaPoupanca cp = new ContaPoupanca(dados[0], dados[1], dados[2], dados[3],
							Double.parseDouble(dados[4]));
					Conta.mapaContas.put(dados[3], cp); // identificador unico, o cpf da conta dados[3]

				} else if (dados[0].equalsIgnoreCase(ContaEnum.CORRENTE.getTipoConta())) {
					// String tipoConta,String numConta, String numAgencia, String cpf, Double
					// saldo, Double chequeEspecial
					ContaCorrente cc = new ContaCorrente(dados[0], dados[1], dados[2], dados[3],
							Double.parseDouble(dados[4]), Double.parseDouble(dados[5]));
					Conta.mapaContas.put(dados[3], cc);

				} else if (dados[0].equalsIgnoreCase(PessoasEnum.CLIENTE.getTipoPessoas())) {
					// String TIPO_PESSOA,String nome, String cpf, String endereco, String contato,
					// String senha
					Cliente c = new Cliente(dados[0], dados[1], dados[2], dados[3], dados[4], dados[5]);
					Cliente.mapaClientes.put(dados[2], c);

				} else if (dados[0].equalsIgnoreCase(PessoasEnum.GERENTE.getTipoPessoas())) {
					// String tipoFuncionario, Double salario, String agencia, String cpf, String
					// nome, String senha
					Gerente g = new Gerente(dados[0], Double.parseDouble(dados[1]), dados[2], dados[3], dados[4],
							dados[5]);
					Funcionario.mapaFuncionario.put(dados[3], g);

				} else if (dados[0].equalsIgnoreCase(PessoasEnum.DIRETOR.getTipoPessoas())) {
					// String tipoFuncionario, Double salario, String agencia, String cpf, String
					// nome, String senha
					Diretor d = new Diretor(dados[0], Double.parseDouble(dados[1]), dados[2], dados[3], dados[4],
							dados[5]);
					Funcionario.mapaFuncionario.put(dados[3], d);

				} else if (dados[0].equalsIgnoreCase(PessoasEnum.PRESIDENTE.getTipoPessoas())) {
					// String tipoFuncionario, Double salario, String agencia, String cpf, String
					// nome, String senha
					Presidente p = new Presidente(dados[0], Double.parseDouble(dados[1]), dados[2], dados[3], dados[4],
							dados[5]);
					Funcionario.mapaFuncionario.put(dados[3], p);
				}
			} else {
				break;
			}
		}
		System.out.println(Conta.mapaContas);
		System.out.println(Funcionario.mapaFuncionario);
		buffRead.close();
	}

	public static void escritor(String path, String cliente, String conta) throws IOException {

		try (BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO))) {
			String dado = "";
			for (int i = 0; i < contador + 1; i++) {
				dado = buffRead.readLine();
				if (dado == null) {
					try (BufferedWriter buffWriter = new BufferedWriter(
							new FileWriter(PATH_BASICO + path + EXTENSAO, true))) {
						buffWriter.append(cliente);
						buffWriter.append(conta);
					}
				}
			}
		}
	}

	public static void escritorFunc(String path, String diretor) throws IOException {

		try (BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO))) {
			String dado = "";
			for (int i = 0; i < contador + 1; i++) {
				dado = buffRead.readLine();
				if (dado == null) {
					try (BufferedWriter buffWriter = new BufferedWriter(
							new FileWriter(PATH_BASICO + path + EXTENSAO, true))) {
						buffWriter.append(diretor);

					}
				}
			}
		}
	}

	public static void cadastrarCliente(String path, String nome, String cpf, String contato, String endereco,
			String senha, String confSenha, JButton botao) {
		try {
			BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + path + EXTENSAO, true));
			buffWriter.append(nome + ";" + cpf + ";" + contato + ";" + endereco + ";" + senha + ";");
			buffWriter.close();
		} catch (IOException e) {
			JOptionPane.showInputDialog(botao, "Erro ao salvar o cadastro.");
			e.printStackTrace();
		}
	}

	public static void comprovanteSaldo(Conta conta) throws IOException {
		String path = conta.getTipoConta() + "_" + conta.getCpf();
		BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + path + EXTENSAO, true));

		buffWriter.append("------------------ SALDO ------------------\n");
		buffWriter.append("CPF: " + conta.getCpf() + "\n");
		buffWriter.append("Conta: " + conta.getNumConta() + "\n");
		buffWriter.append("Saldo atual: " + conta.getSaldo() + "\n");
		LocalDateTime dataHora = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		buffWriter.append("Operação realizada em: " + dtf.format(dataHora) + "\n");
		buffWriter.append("------------------ FIM SALDO ------------------\n");
		buffWriter.close();
	}

	public static void comprovanteSaque(Conta conta, String valor) throws IOException {
		String path = conta.getTipoConta() + "_" + conta.getCpf();
		BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + path + EXTENSAO, true));

		buffWriter.append("------------------ SAQUE ------------------\n");
		buffWriter.append("CPF: " + conta.getCpf() + "\n");
		buffWriter.append("Conta: " + conta.getNumConta() + "\n");
		buffWriter.append("Valor do Saque: " + valor + "\n");
		LocalDateTime dataHora = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		buffWriter.append("Operação realizada em: " + dtf.format(dataHora) + "\n");
		buffWriter.append("------------------ FIM SAQUE ------------------\n");
		buffWriter.close();
	}

	public static void comprovanteDeposito(Conta conta, String valor) throws IOException {
		String path = conta.getTipoConta() + "_" + conta.getCpf();
		BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + path + EXTENSAO, true));

		buffWriter.append("------------------ Depósito ------------------\n");
		buffWriter.append("CPF: " + conta.getCpf() + "\n");
		buffWriter.append("Conta: " + conta.getNumConta() + "\n");
		buffWriter.append("Valor do Depósito: " + valor + "\n");
		LocalDateTime dataHora = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		buffWriter.append("Operação realizada em: " + dtf.format(dataHora) + "\n");
		buffWriter.append("------------------ FIM Depósito ------------------\n");
		buffWriter.close();
	}

	public static void comprovanteTransferencia(Conta remetente, Conta destinatario, String valor) throws IOException {
		String path = remetente.getTipoConta() + "_" + remetente.getCpf();
		BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + path + EXTENSAO, true));
		LocalDateTime dataHora = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		buffWriter.append("--------------------- Transferência ---------------------\n");
		buffWriter.append("CPF do Remetente: " + remetente.getCpf() + "\n");
		buffWriter.append("Conta do Remetente: " + remetente.getTipoConta() + "\n");
		buffWriter.append("Valor Transferido: " + valor + "\n");
		buffWriter.append("CPF do Destinatário: " + destinatario.getCpf() + "\n");
		buffWriter.append("Conta de Destino: " + destinatario.getTipoConta() + "\n");
		buffWriter.append("Saldo do Remetente: " + remetente.getSaldo() + "\n");
		buffWriter.append("Operação realizada em: " + dtf.format(dataHora) + "\n");
		buffWriter.append("------------------ FIM Transferência --------------------\n");
		buffWriter.close();
	}
	
	public static void historicoTransacoes(Conta conta) throws IOException {
		comprovanteSaldo(conta);
		//comprovanteSaque(conta,)
		// como eu vou chamar as informações do parâmetro dos outros comprovantes se essas
		// informações eu só coloco pelo jframe na hora da transação?
	}

	// Relatório Gerente
	public static void gerarRelatorioGerente(Funcionario gerente, Map<String, Conta> contas) throws IOException {
		String path = gerente.getTipoFuncionario() + "_" + gerente.getCpf();
		BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + path + EXTENSAO, true));
		LocalDateTime dataHora = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		// Calcular o total de contas e o total de saldo na agência do gerente
		int totalContas = 0;
		double totalSaldo = 0;
		for (Conta conta : contas.values()) {
			if (conta.getNumAgencia().equals(gerente.getAgencia())) {
				totalContas++;
				totalSaldo += conta.getSaldo();
			}
		}
		buffWriter.append("Relatório do total de contas e total de saldo da mesma agência: \n");
		buffWriter.append("Total de contas na agência " + gerente.getAgencia() + ": " + totalContas + "\n");
		buffWriter.append("Total de saldo na agência " + gerente.getAgencia() + ": " + totalSaldo + "\n");
		buffWriter.append("Horário do Relatório: " + dtf.format(dataHora)+"\n");
		buffWriter.close();
	}
	
	public static void gerarRelatorioDiretor(Funcionario diretor, Map<String, Conta> contas) throws IOException {
	    String path = diretor.getTipoFuncionario() + "_" + diretor.getCpf();
	    BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + path + EXTENSAO, true));
	    LocalDateTime dataHora = LocalDateTime.now();
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	    // Filtrar contas pela agência do diretor e ordenar por nome
	    List<Conta> contasDiretor = contas.values().stream()
	            .filter(conta -> conta.getNumAgencia().equals(diretor.getAgencia()))
	            .sorted(Comparator.comparing(Conta::getNumConta))
	            .collect(Collectors.toList());

	    buffWriter.append("Relatório de clientes da agência " + diretor.getAgencia() + ":\n");

	    for (Conta conta : contasDiretor) {
	        buffWriter.append("Numero da Conta: " + conta.getNumConta() + ", CPF: " + conta.getCpf() + ", Agência: " + conta.getNumAgencia() + "\n");
	    }

	    buffWriter.append("Horário do Relatório: " + dtf.format(dataHora) + "\n");
	    buffWriter.close();
	}

	private static String obterNomeGerente(Map<String, Funcionario> funcionarios, String agenciaControle) {
        for (Funcionario funcionario : funcionarios.values()) {
            if (funcionario.getAgencia().equals(agenciaControle)
                    && funcionario.getTipoFuncionario().equals("Gerente")) {
                return funcionario.getNome();
            }
        }
        return "Não encontrado";
    }
    
    public static void gerarRelatorioPresidente(Funcionario presidente,Map<String, Funcionario> funcionarios, Map<String, Conta> contas) throws IOException {
        String path = presidente.getTipoFuncionario() + "_" + presidente.getCpf();
        BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + path + EXTENSAO, true));
        LocalDateTime dataHora = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        buffWriter.append("Relatório da lista de diretores e suas respectivas agências de controle:\n");

        for (Funcionario func : funcionarios.values()) {
            if (func.getTipoFuncionario().equals("Diretor")) {
                String agenciaControle = func.getAgencia();
                String gerenteAgencia = obterNomeGerente(funcionarios, agenciaControle);
                buffWriter.append("Diretor: " + func.getNome() + ", Agência de Controle: " + agenciaControle);
                buffWriter.append(", Gerente da Agência: " + gerenteAgencia + "\n");
            }
        }
        
        double totalCapital = 0;
        for (Conta conta : contas.values()) {
            totalCapital += conta.getSaldo();
        }
        
        buffWriter.append("Valor Total do Capital no Banco: " + totalCapital + "\n");
        buffWriter.append("Horário do Relatório: " + dtf.format(dataHora) + "\n");

        buffWriter.close();
    }

	
	public static void comprovanteSeguro(Conta conta, String valor) throws IOException {
		String path = conta.getTipoConta() + "_" + conta.getCpf();
		BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + path + EXTENSAO, true));
		
		Double valorTotal = Double.parseDouble(valor) * 0.20;
		DecimalFormat df = new DecimalFormat("#,###.00");
		LocalDateTime dataHora = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		buffWriter.append("------------------ Seguro de Vida ------------------\n");
		buffWriter.append("CPF: " + conta.getCpf() + "\n");
		buffWriter.append("Conta: " + conta.getNumConta() + "\n");
		buffWriter.append("Valor do Seguro: " + df.format(valor) + "\n");
		buffWriter.append("Valor Cobrado (20% do Valor): " + df.format(valorTotal) + "\n");
		buffWriter.append("Operação realizada em: " + dtf.format(dataHora) + "\n");
		buffWriter.append("---------------- FIM Seguro de Vida ----------------\n");
		buffWriter.close();
	}

//	public static void HistoricoTransacoes(Conta conta) throws IOException {
//	    String path = conta.getTipoConta() + "_" + conta.getCpf();
//	    BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + path + EXTENSAO, true));
//
//	    String linha = "------------------ HISTÓRICO DE TRANSAÇÕES ------------------";
//	    buffWriter.append(linha + "\n");
//
//	    linha = "CPF: " + conta.getCpf();
//	    buffWriter.append(linha + "\n");
//
//	    linha = "Conta: " + conta.getTipoConta();
//	    buffWriter.append(linha + "\n");
//
//	    linha = "Saldo Atual: " + conta.getSaldo();
//	    buffWriter.append(linha + "\n");
//
//	    linha = "Últimas Transações:";
//	    buffWriter.append(linha + "\n");
//
//	    for (String transacao : conta.getTransacoes()) {
//	        buffWriter.append(transacao + "\n");
//	    }

	/*
	 * ou buffWriter.append("------------------ SAQUE ------------------\n");
	 * buffWriter.append("CPF: "+ conta.getCpf() + "\n"); etc...
	 */

	// desafio = inserir o nome do cliente, tem que conectar o cpf da conta com o do
	// cliente
}
