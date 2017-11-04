package git.ehcruz.exercicio09;

public class Eleitoral {
	public String nome;
	public int idade;

	public void imprimir() {
		System.out.println(new StringBuilder().append("Nome: ").append(this.nome).toString());
		System.out.println(new StringBuilder().append("Idade: ").append(this.idade).toString());
		verificar();
	}

	public void verificar() {
		if (this.idade < 16) {
			System.out.println("Eleitor não pode votar.");
		} else if (idade >= 16 && idade <= 65) {
			System.out.println("Eleitor deve votar.");
		} else {
			System.out.println("Voto é facultativo.");
		}
	}
}
