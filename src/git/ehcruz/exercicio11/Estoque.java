package git.ehcruz.exercicio11;

import java.text.DecimalFormat;

public class Estoque {
	DecimalFormat df = new DecimalFormat("#.##");
	
	public String nomeProduto;
	public double valor;
	public int quantidade;

	public void imprimir() {
		System.out.println(new StringBuilder().append("Produto: ").append(this.nomeProduto).toString());
		System.out.println(new StringBuilder().append("Valor: R$").append(df.format(this.valor)).toString());
		System.out.println(new StringBuilder().append("Qtd estoque: ").append(this.quantidade).toString());
		System.out.println();
	}

	public int verificarDisponibilidade(int qtde) {
		if ((this.quantidade > 0) && (this.quantidade >= qtde)) {
			return 1;
		} else {
			return 0;
		}
	}

	public int removerProdutos(int qtde) {
		int disp = verificarDisponibilidade(qtde);
		if (disp == 1) {
			this.quantidade -= qtde;
			return 1;
		} else {
			return 0;
		}
	}
}
