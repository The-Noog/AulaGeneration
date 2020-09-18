package Teste;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno 
{
	public static void main(String[] args) 
	{
		Map <String,AlunoCollection> mapa = new TreeMap<String,AlunoCollection>();
		
		AlunoCollection a = new AlunoCollection("João da Silva Neto","JAVA",6.8);
		AlunoCollection b = new AlunoCollection("Maria Souza","LINUX",7.8);
		AlunoCollection c = new AlunoCollection("Renata Almeida","REDES",8.8);
		AlunoCollection d = new AlunoCollection("Weslley Nogueira","C#",9.8);
		
		mapa.put("João da Silva Neto", a);
		mapa.put("Maria Souza", b);
		mapa.put("Renata Almeida", c);
		mapa.put("Weslley Nogueira", d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Renata Almeida"));
		
		Collection <AlunoCollection> alunos = mapa.values();
		
		for (AlunoCollection e: alunos)
		{
			System.out.println(e);
		}
		
	}
	

}
