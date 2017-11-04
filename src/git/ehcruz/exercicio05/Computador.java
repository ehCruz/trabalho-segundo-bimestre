package git.ehcruz.exercicio05;

import java.text.DecimalFormat;

public class Computador {
	public String marca;
	public String cor;
	public String modelo;
	public String numeroSerie;
	public double preco;

	public void imprimir() {
		System.out.println("---Computador---");
		System.out.println(new StringBuilder().append("Marca:").append(this.marca).toString());
		System.out.println(new StringBuilder().append("Modelo: ").append(this.modelo).toString());
		System.out.println(new StringBuilder().append("Cor: ").append(this.cor).toString());
		System.out.println(new StringBuilder().append("Nº de série: ").append(this.numeroSerie).toString());
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println(new StringBuilder().append("Preço: ").append(df.format(this.preco)).toString());
		System.out.println();
	}

	public void calcValor() {
		switch (this.marca.toLowerCase()) {
		case "hp":
			preco += (preco * 30) / 100;
			break;
		case "ibm":
			preco += (preco * 50) / 100;
		default:
			break;
		}
	}

	public int alterarValor(double valor) {
		if (valor > 0) {
			preco = valor;
			return 1;
		} else {
			return 0;
		}
	}
}
