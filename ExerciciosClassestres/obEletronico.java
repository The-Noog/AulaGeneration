package ExerciciosClassestres;

import java.util.Scanner;

public class obEletronico {

	public static void main(String[] args) 
	
	{
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Sitema de nome e valor eletrônico...");
		eletronico ele = new eletronico();
		
		System.out.println("Digite o nome do eletrônico:");
		ele.nomeEletronico = tec.next().toUpperCase();
		
		
		System.out.println("Digite o valor do eletrônico: ");
		ele.valorEletrocico = tec.nextDouble();
		
		ele.mostranome();
		ele.mostravalor();
		tec.close();
	}

}
