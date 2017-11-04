package git.ehcruz.exercicio01;

public class Apolice {
	public String nomeAssegurado;
	public int idade;
	public double valorPremio;

	public void imprimir() {
		System.out.println(new StringBuilder().append("Nome: ").append(this.nomeAssegurado).toString());
		System.out.println(new StringBuilder().append("Idade: ").append(this.idade).toString());
		System.out.println(new StringBuilder().append("Valor do prêmio: ").append(this.valorPremio).toString());
		System.out.println();
	}

	public void calcPremioApolice() {
		if (idade > 18 && idade <= 25) {
			this.valorPremio += (valorPremio * 20) / 100;
		} else if (idade > 25 && idade <= 36) {
			this.valorPremio += (valorPremio * 15) / 100;
		} else {
			this.valorPremio += (valorPremio * 10) / 100;
		}
	}

	public void ofercerDesconto(String cidade) {
		switch (cidade.toLowerCase()) {
		case "curitiba":
			this.valorPremio -= (valorPremio * 20) / 100;
			break;
		case "rio de janeiro":
			this.valorPremio -= (valorPremio * 15) / 100;
			break;
		case "são paulo":
			this.valorPremio -= (valorPremio * 10) / 100;
			break;
		case "belo horizonte":
			this.valorPremio -= (valorPremio * 5) / 100;
			break;
		default:
			System.out.println("Desconto não disponível para a cidade informada.");
			break;
		}
	}

}
