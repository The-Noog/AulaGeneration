package Laços;

/*
 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
·10-14 infantil
·15-17 juvenil
·18-25 adulto

 */

import java.util.*;
public class EntradaMaiorIdade {
	
	public static void main (String[]args) 
	{
		
		
		Scanner tec = new Scanner(System.in);
		int idade;
		
		System.out.print("Entre com a sua idade: ");
		idade = tec.nextInt();
		
		if (idade >= 18) 
		{
			System.out.printf("Você tem permissão para poder entrar.");
			
		}
		else if (idade >1 && idade < 18)
		{
			System.out.printf("Você é menor de idade.");
			
		}
		else 
		{
			System.out.printf("Você digitou uma idade inválida. Favor digitar um número válido.");
			
		}
		tec.close();
	}

}
