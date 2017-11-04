package git.ehcruz.exercicio03;

public class Acampamento {
	public String nome;
	public String equipe;
	public int idade;

	public void imprimir() {
		System.out.println(new StringBuilder().append("Nome: ").append(this.nome).toString());
		System.out.println(new StringBuilder().append("Equipe: ").append(this.equipe).toString());
		System.out.println(new StringBuilder().append("Idade: ").append(this.idade).toString());
		System.out.println();
	}

	public void separarGrupos() {
		if ((idade >= 6) && (idade <= 10)) {
			this.equipe = "A";
		} else if ((idade >= 11) && (idade <= 20)) {
			this.equipe = "B";
		} else if (idade >= 21){
			this.equipe = "C";
		} 
	}
}
