package git.ehcruz.exercicio06;

import git.ehcruz.exercicio05.Computador;

public class PrincipalComputador {

	public static void main(String[] args) {
		Computador pc01 = new Computador();
		pc01.marca = "HP";
		pc01.modelo = "E25s";
		pc01.cor = "Cinza";
		pc01.numeroSerie = "BA4487HC";
		pc01.preco = 2539.99;
		System.out.println("Preço inicial do HP");
		pc01.imprimir();
		pc01.calcValor();
		System.out.println("Preço final do HP");
		pc01.imprimir();

		System.out.println("----------------------\n");

		Computador pc02 = new Computador();
		pc02.marca = "IBM";
		pc02.modelo = "5150";
		pc02.cor = "Branco";
		pc02.numeroSerie = "IBMBR88758";
		pc02.preco = 1659.59;
		pc02.calcValor();
		System.out.println("Valor final do IBM");
		pc02.imprimir();
		int valida = pc02.alterarValor(839.45);
		if (valida == 1) {
			System.out.println("ALTERADO");
		} else {
			System.out.println("NÃO ALTERADO");
		}

		valida = pc01.alterarValor(-1);
		if (valida == 1) {
			System.out.println("Valor alterado");
		} else {
			System.out.println("Valor não alterado");
		}
		
		System.out.println();
		pc01.imprimir();
		pc02.imprimir();

	}

}
