package git.ehcruz.exercicio07;

import java.text.DecimalFormat;

public class ContaCorrente {
	DecimalFormat df = new DecimalFormat("0.00");

	public int conta;
	public int agencia;
	public double saldo;
	public String nomeCliente;

	public int sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return 1;
		} else {
			return 0;
		}
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void imprimir() {
		System.out.println("-------------------------");
		System.out.println(new StringBuilder().append("Nome cliente: ").append(this.nomeCliente).toString());
		System.out.println(new StringBuilder().append("Nº Conta: ").append(this.conta).toString());
		System.out.println(new StringBuilder().append("Agência: ").append(this.agencia).toString());
		System.out.println(new StringBuilder().append("Saldo: ").append(df.format(this.saldo)).toString());
		System.out.println("-------------------------");
	}
}
