package git.ehcruz.exercicio10;

import git.ehcruz.exercicio09.Eleitoral;

public class PrincipalEleitoral {

	public static void main(String[] args) {
		Eleitoral eleitor = new Eleitoral();
		eleitor.nome = "Luiz Inácio";
		eleitor.idade = 72;
		eleitor.imprimir();
		System.out.println("-----");
		eleitor.nome = "Maria da Flores";
		eleitor.idade = 45;
		eleitor.imprimir();
		System.out.println("-----");
		eleitor.nome = "Bolsominion";
		eleitor.idade = 13;
		eleitor.imprimir();
	}

}
