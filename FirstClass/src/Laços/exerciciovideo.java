package La�os;

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
	
		System.out.printf("\nSeu nome � %s", nome);
		System.out.printf("\nSua idade � %d", idade);
	
	if (idade >= 18) 
	{
		System.out.printf("\nVoc� � maior de idade. Pode entrar.");	
		
	}
	else if(idade >= 1 && idade <18)
	{
		System.out.print("\nVoc� n�o tem permiss�o para entrar.....");
	}
	
	else 
	{
		
	System.out.printf("\n Voc� digidou uma idade inv�lida.");	
	}
	
	tec.close();

}
}