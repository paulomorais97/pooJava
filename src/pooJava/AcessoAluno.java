package pooJava;

import java.util.Scanner;

public class AcessoAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
		String nomeAluno;
		char sexo;
		int nota1, nota2, nota3, nota4;
		double media=0;
		boolean feminino;
		
		System.out.print("Digite seu nome: ");
		nomeAluno=ler.next().toUpperCase();
		System.out.print("\nDigite a nota 1:");
		nota1=ler.nextInt();
		System.out.print("\nDigite a nota 2:");
		nota2=ler.nextInt();
		System.out.print("\nDigite a nota 3:");
		nota3=ler.nextInt();
		System.out.print("\nDigite a nota 4:");
		nota4=ler.nextInt();
		System.out.println("Digite seu sexo: \nM - Masculino | F - Feminino");
		sexo=ler.next().toUpperCase().charAt(0);
		
		//aluno 2
		System.out.print("Digite seu nome: ");
		aluno1.nomeAluno=ler.next().toUpperCase();
		System.out.print("\nDigite a nota 1:");
		aluno1.nota1=ler.nextInt();
		System.out.print("\nDigite a nota 2:");
		aluno1.nota2=ler.nextInt();
		System.out.print("\nDigite a nota 3:");
		aluno1.nota3=ler.nextInt();
		System.out.print("\nDigite a nota 4:");
		aluno1.nota4=ler.nextInt();
		System.out.println("Digite seu sexo: \nM - Masculino | F - Feminino");
		aluno1.sexo=ler.next().toUpperCase().charAt(0);
		
		aluno1.media = (aluno1.nota1+aluno1.nota2+aluno1.nota3+aluno1.nota4)/4;
		media = (nota1+nota2+nota3+nota4)/4;
		
		if(sexo == 'M' ) {
			feminino = false;
		}
		else {
			feminino = true;
		}
		
		System.out.printf("Nome aluno: %s", nomeAluno);
		System.out.printf("\nNota 1: %d | Nota 2: %d | Nota 3: %d | Nota 4: %d", nota1,nota2,nota3,nota4);
		System.out.printf("\nMédia do aluno: %.2f",media);
		System.out.printf("\nSexo feminino? %b", feminino);
		
		
		ler.close();	
	}

}
