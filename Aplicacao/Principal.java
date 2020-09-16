package Aplicacao;

import java.util.Scanner;

import entidades.Alunno;

public class Principal {

	public static void main(String[] args) {

		Scanner tec = new Scanner (System.in);
		Alunno exemploAluno = new Alunno();
		int ano;
		
		System.out.println("SISTEMA DE CONTROLE EM JAVA - POO");

	
		System.out.println("Entre com o nome do aluno");
		exemploAluno.nomeAluno = tec.next().toUpperCase();
				
		
		System.out.println(" sexo do aluno [M/F]");
		exemploAluno.sexoAluno = tec.next().toUpperCase().charAt(0);
		
		
		System.out.println("Digite a nota 1: ");
		exemploAluno.notas[0] = tec.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		exemploAluno.notas[1] = tec.nextDouble();
		
		System.out.println("Digite a nota 3: ");
		exemploAluno.notas[2] = tec.nextDouble();
		
		System.out.println("Digite a nota 4: ");
		exemploAluno.notas[3] = tec.nextDouble();
		
		
		System.out.println("Digite o ano de nascimento");
		ano = tec.nextInt();
		
		exemploAluno.media();
		exemploAluno.mostra();
		exemploAluno.mostraIdade(ano);
		
		tec.close();
	}

}
