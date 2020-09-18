package aplicacao;
import entidades.Pessoa;
import entidades.Professor;
import entidades.Aluno;
public class Cadastro {
	public static void main(String[] args)
	{
		System.out.println("SISTEMA DE CADASTRO:");
		
		Pessoa fulano = new Pessoa("JOAO");
		Pessoa sicrano = new Pessoa("MARIA",'F',1970);
		Aluno novoAluno =  new Aluno ("Pedro",'M', 2020, "Preto", "Turma B");
				
		Professor prof = new Professor();
		
		
		System.out.println(prof);
					
	}
}