package vetroMatriz;

import java.util.*;
/*
 * Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.

 */

public class exercicioDoisVetor 
{

	public static void main(String[] args) 
	{
		Scanner tek = new Scanner(System.in);
		
		int[] vet = new int[5];
		int i, par = 0, impar = 0, soma = 0,somatorioPar = 0, somatorioImpar = 0;
		
		
		
		for (i = 0; i < 5; i++) 
		{
			System.out.println("Digite seis números inteiros:");
			vet [i] = tek.nextInt();
		
		if (vet[i]%2 == 0)
			{
				somatorioPar++;
				par = par + vet[i];
			}
		else 
		{	
			somatorioImpar++;
			impar = impar + vet[i];
		}
		}
		System.out.printf("A quantidade de números ímpares fora: %d\n",somatorioImpar);
		System.out.printf("A quantidade de números pares fora: %d\n",somatorioPar);
		System.out.printf("As soma dos números pares são: %d\n",par);
		System.out.printf("As soma dos números ímpares são: %d",impar);
		tek.close();
	}

}
