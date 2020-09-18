package Teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {

	public static void main(String[] args) 
	{
	 Collection<String> nomes = new ArrayList();
	 nomes.add("Mario");
	 nomes.add("Sonic");
	 nomes.add("Juliana");
	 nomes.add("Rafaela");
	 System.out.println("Lista de nomes "+nomes);
	 
	 //varredura de nomes.
	 for(String name : nomes)
	 {
		 System.out.println("Lista de nomes "+name);
	 }
			 
	 
	 /*
	 //Adicionando mais listas na coleção.
	 Collection <String> nomes2 = Arrays.asList("João","Aline");
	 nomes.addAll(nomes2);
	 System.out.println("Lista de nomes "+nomes);
	 */
	 
	 
	 /*
	 // confirmando se tem mesmo o nome na linsta.
	 System.out.println("A lista comtém o nome Mario? "+nomes.contains("Mario"));
	 System.out.println("A lista: "+nomes);
	 */
	 
	 /*
	 //Limpando os nomes da lista
	 nomes.clear();
	 System.out.println("Lista de nomes "+nomes);
	 */
	 
	 
	 
	 /*
	 //Removento um nome da lista.
	 System.out.println("Lista de nomes "+nomes);
	 nomes.remove("Mario");
	 System.out.println("Lista de nomes "+nomes);
	 */
	
	
	 /*
	 if (nomes.isEmpty())
	 {
		 System.out.println("Lista vazia"+nomes);
	 }
	 else
	 {
		 System.out.println("Lista de nomes "+nomes);
	 }
	 */
	 
	//  System.out.println("Lista de nomes "+nomes);
	}

}
