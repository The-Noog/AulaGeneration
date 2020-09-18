package Teste;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {

	public static void main(String[] args) 
	{
	
		Set <AlunoCollection> conjunto = new HashSet<AlunoCollection>();
		
		AlunoCollection a = new AlunoCollection("João da Silva Neto","JAVA",6.8);
		AlunoCollection b = new AlunoCollection("Maria Souza","LINUX",7.8);
		AlunoCollection c = new AlunoCollection("Renata Almeida","REDES",8.8);
		AlunoCollection d = new AlunoCollection("Weslley Nogueira","C#",9.8);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);
		

	}

}
