package Reino;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Animal
{

	public static void main(String args[])
	
	{
		
		int a;
		String nome;
		int idade;
		char som;
		char corre;
				
				
		Scanner tec = new Scanner (System.in);
		
		System.out.print("Digite o número de animais");
		a = tec.nextInt();
		
		for (int i = 0; i<a; i++) 
		{
			System.out.println("Entrada de animais..."+i+" : ");
			
			System.out.println("Nome: ");
			nome = tec.next();
			
			System.out.println("Idade: ");
			idade = tec.nextInt();
			
			System.out.println("O animal emite som? [S/N]");
			som = tec.next().toUpperCase().charAt(0);

			System.out.println("O animal corre? [S/N]");
			corre = tec.next().toUpperCase().charAt(0);
				
		}
	
		
		System.out.println();
		System.out.println("ANIMAIS");
			
			tec.close();
				
	}
	
	
}
