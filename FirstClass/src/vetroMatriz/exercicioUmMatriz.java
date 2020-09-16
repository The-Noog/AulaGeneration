package vetroMatriz;

import java.util.Scanner;

/*
 *  Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */

public class exercicioUmMatriz 
{

	public static void main(String[] args) 
	{
	Scanner tec = new Scanner(System.in);
	final int L = 3;
	final int C = 3;
	
	int [][] matriz = new int [L][C];
	int linha = 0, coluna = 0, maiorValor = 0;
	
	for (linha = 0; linha<L; linha++)
		{
		for(coluna = 0; coluna<C; coluna++)
		{
			System.out.printf("Insira o elemento M: ");
			matriz[linha][coluna] = tec.nextInt();
		}
	}
	System.out.println("\nA matriz ficou: \n");
	for (linha = 0; linha <L; linha ++)
	{
		for (coluna = 0; coluna < C; coluna++)
		{
			System.out.printf("\t %d \t", matriz[linha][coluna]);
			if (matriz[linha][coluna] > 10)
			{
				maiorValor++;
			}
		
		}
		
		
		System.out.println();
	}
	System.out.printf("Teve %d, valores maiores que 10 nessa matriz.",maiorValor);
	tec.close();

	}

}
