package git.ehcruz.exercicio04;

import git.ehcruz.exercicio03.Acampamento;

public class PrincipalAcampamento {

	public static void main(String[] args) {
		Acampamento escoteiro01 = new Acampamento();
		Acampamento escoteiro02 = new Acampamento();
		Acampamento escoteiro03 = new Acampamento();
		
		escoteiro01.nome = "João Silva";
		escoteiro01.idade = 12;
		
		escoteiro02.nome = "Marcela Barella";
		escoteiro02.idade = 22;
		
		escoteiro03.nome = "Ricardo Bonfim";
		escoteiro03.idade = 8;
		
		System.out.println("Teste 1");
		escoteiro01.imprimir();
		
		System.out.println("Teste 2");
		escoteiro02.imprimir();
		
		System.out.println("Teste 3");
		escoteiro03.imprimir();
		
		System.out.println("--------------");
		escoteiro01.separarGrupos();
		escoteiro02.separarGrupos();
		escoteiro03.separarGrupos();
		
		System.out.println("Novo teste 1");
		escoteiro01.imprimir();
		
		System.out.println("Novo teste 2");
		escoteiro02.imprimir();
		
		System.out.println("Novo teste 3");
		escoteiro03.imprimir();
		
	}

}
