package vetroMatriz;

import java.util.*;
/*
 * Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.

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
			System.out.println("Digite seis n�meros inteiros:");
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
		System.out.printf("A quantidade de n�meros �mpares fora: %d\n",somatorioImpar);
		System.out.printf("A quantidade de n�meros pares fora: %d\n",somatorioPar);
		System.out.printf("As soma dos n�meros pares s�o: %d\n",par);
		System.out.printf("As soma dos n�meros �mpares s�o: %d",impar);
		tek.close();
	}

}
