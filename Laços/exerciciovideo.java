package Laços;

import java.util.*;

public class exerciciovideo 
{

public static void main (String args[])

{
		Scanner tec = new Scanner (System.in);
	
		int idade;
		String nome;
	
		System.out.printf("Entre com a sua idade: ");
		idade = tec.nextInt();
	
		tec.nextLine();
	
		System.out.printf("Entre com o seu nome: ");
		nome = tec.nextLine();
	
		System.out.printf("\nSeu nome é %s", nome);
		System.out.printf("\nSua idade é %d", idade);
	
	if (idade >= 18) 
	{
		System.out.printf("\nVocê é maior de idade. Pode entrar.");	
		
	}
	else if(idade >= 1 && idade <18)
	{
		System.out.print("\nVocê não tem permissão para entrar.....");
	}
	
	else 
	{
		
	System.out.printf("\n Você digidou uma idade inválida.");	
	}
	
	tec.close();

}
}