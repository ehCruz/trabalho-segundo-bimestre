package git.ehcruz.exercicio12;

import git.ehcruz.exercicio11.Estoque;

public class PrincipalEstoque {

	public static void main(String[] args) {
		int rmProd;
		
		Estoque produto01 = new Estoque();
		produto01.nomeProduto = "TV LG LED 4K 55'";
		produto01.valor = 4200.99;
		produto01.quantidade = 10;
		produto01.imprimir();
		rmProd = produto01.removerProdutos(1);
		if (rmProd == 1) {
			System.out.println("Produto removido...");
		} else {
			System.out.println("Produto não removido... Quantidade inválida...");
		}
		produto01.imprimir();
		System.out.println("-----------");
		Estoque produto02 = new Estoque();
		produto02.nomeProduto = "Aspire ES 15";
		produto02.valor = 1899.69;
		produto02.quantidade = 4;
		produto02.imprimir();
		rmProd = produto02.removerProdutos(5);
		if (rmProd == 1) {
			System.out.println("Produto removido...");
		} else {
			System.out.println("Produto não removido... Quantidade inválida...");
		}
		produto02.imprimir();
		System.out.println("-----------");
		Estoque produto03 = new Estoque();
		produto03.nomeProduto = "CEL NOKIA 3310";
		produto03.valor = 489.69;
		produto03.quantidade = 0;
		produto03.imprimir();
		rmProd = produto03.removerProdutos(5);
		if (rmProd == 1) {
			System.out.println("Produto removido...");
		} else {
			System.out.println("Produto não removido... Quantidade inválida...");
		}
		produto03.imprimir();
	}

}
