package La�os;

import java.util.*;
/*
 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */

public class inteirosMaiorValor 
{

	public static void main(String[] args) 
	
	{
	Scanner tec = new Scanner(System.in);
	
	int numA, numB, numC;
	String nome;
	
	System.out.printf("Entre com o seu nome: ");
	nome = tec.next();
	
		
	System.out.printf("Entre com o primeiro valor inteiro: ");
	numA = tec.nextInt();
	
	System.out.printf("Entre com o segundo valor inteiro: ");
	numB = tec.nextInt();
	
	System.out.printf("Entre com o terceiro valor inteiro: ");
	numC = tec.nextInt();
	
	if (numA > numB && numA > numC)
	{
		System.out.printf("\n ol� %s. O maior n�mero �: %d",nome, numA);
		
	}
	
	else if (numB > numA && numB > numC) 
	{
		System.out.printf("\n ol� %s. O maior n�mero �: %d",nome, numB);
		
	}
	
	else if (numC > numA && numC > numB)
	{
		System.out.printf("\n ol� %s. O maior n�mero �: %d",nome, numC);
	}
	
	tec.close();
	}

}
