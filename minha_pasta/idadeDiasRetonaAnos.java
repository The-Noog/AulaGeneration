package Pacote;

import java.util.Scanner;

/*
 * Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		expressa em anos, meses e dias.
 */


public class idadeDiasRetonaAnos 
{

	public static void main(String[] args)
	{
		int dias = 0, meses = 0, anos = 0, totalDdias;
		
		Scanner teclado = new Scanner(System.in);

			System.out.println("Entre com a quantidade de dias que você tem: ");
			totalDdias = teclado.nextInt();
			
			anos = totalDdias/365;
			meses = (totalDdias%365)/30; 
			dias = ((totalDdias%365)/7);
			
			System.out.println("Você tem "+ anos+ " anos, " +meses+ " meses e "+dias+" dias");
											
				teclado.close();
	}

}
