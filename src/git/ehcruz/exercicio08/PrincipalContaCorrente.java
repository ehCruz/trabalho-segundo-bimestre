package git.ehcruz.exercicio08;

import java.util.Scanner;

import git.ehcruz.exercicio07.ContaCorrente;

public class PrincipalContaCorrente {
	static ContaCorrente cc = new ContaCorrente();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean loopMenu = true;
		while (loopMenu) {
			System.out.println(
					"---- Menu Principal ----\n1 - Cadastrar\n2 - Sacar\n3 - Depositar\n4 - Consultar\n9 - Sair");
			int op = sc.nextInt();
			switch (op) {
			case 1:
				// Cadastrar cliente
				execCadastro();
				break;
			case 2:
				// Sacar
				execSaque();
				break;
			case 3:
				// Depositar
				execDeposito();
				break;
			case 4:
				// Consultar
				execConsultar();
				break;
			case 9:
				// Sair
				System.exit(0);
				loopMenu = false;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}
	}

	public static void execCadastro() {
		String nome = "a";
		int conta = 0;
		int agencia = 0;
		while (nome.length() <= 4) {
			System.out.println("Informe o nome:");
			nome = sc.nextLine();
			if (nome.length() <= 4) {
				System.out.println("O nome deve conter ao mínimo 4 caracteres.");
			}
		}
		cc.nomeCliente = nome;

		while (conta < 10 || conta > 99) {
			System.out.println("Informe o Nº da conta(Ex: XX):");
			conta = sc.nextInt();
			if (conta < 10 || conta > 99) {
				System.out.println("Número da conta é inválido");
			}
		}
		cc.conta = conta + 100;

		while (agencia < 100 || agencia > 999) {
			System.out.println("Informe o Nº da agência(Ex: XXX):");
			agencia = sc.nextInt();
			if (agencia < 100 || agencia > 999) {
				System.out.println("Número da agência é inválido");
			}
		}
		cc.agencia = agencia + 1000;

		System.out.println("Deseja fazer um depósito?\n1 - Sim\n2 - Não");
		int op = sc.nextInt();
		switch (op) {
		case 1:
			execDeposito();
			break;
		case 2:
			cc.saldo = 0;
		default:
			System.out.println("Opção inválida.");
			break;
		}
	}

	public static void execConsultar() {
		if (cc.nomeCliente != null) {
			cc.imprimir();
		} else {
			System.out.println("Nenhuma conta cadastrada!");
		}
	}

	public static void execDeposito() {
		double valDeposito;
		if (cc.nomeCliente != null) {
			do {
				System.out.println("Informe o valor a ser depósitado:");
				valDeposito = sc.nextDouble();
			} while (valDeposito <= 0);
			System.out.println(
					new StringBuilder().append("Confirmar depósito no valor de R$").append(valDeposito).toString());
			System.out.println("1 - Confirmar\n2 - Cancelar");
			int op = sc.nextInt();
			switch (op) {
			case 1:
				cc.saldo += valDeposito;
				break;
			case 2:
				System.out.println("Cancelado...");
			default:
				System.out.println("Inválido... Cancelando operação!");
				break;
			}
		} else {
			System.out.println("Não foi possível realizar o deposito!");
		}

	}

	public static void execSaque() {
		double valorSaque;
		if (cc.nomeCliente != null && cc.saldo > 0) {
			System.out.println("Informe o valor do saque:");
			valorSaque = sc.nextDouble();
			if (valorSaque > 0) {
				int saque = cc.sacar(valorSaque);
				if (saque == 1) {
					System.out.println("Saque realizado.");
				} else {
					System.out.println("Saque não realizado.");
				}
			} else {
				System.out.println("Erro... Valor inválido.");
			}
		} else {
			System.out.println("Não foi possível realizar o saque!");
		}
	}
}
