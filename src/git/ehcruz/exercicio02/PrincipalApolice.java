package git.ehcruz.exercicio02;

import git.ehcruz.exercicio01.Apolice;

public class PrincipalApolice {

	public static void main(String[] args) {
		Apolice apolice = new Apolice();

		apolice.nomeAssegurado = "Eduardo Henrique Cruz";
		apolice.idade = 22;
		apolice.valorPremio = 500;
		
		apolice.imprimir();
		apolice.calcPremioApolice();
		apolice.imprimir();
		apolice.ofercerDesconto("Curitiba");
		apolice.imprimir();
	}

}
