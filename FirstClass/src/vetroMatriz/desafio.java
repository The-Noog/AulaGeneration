package vetroMatriz;
/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
	em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
	diagonal, ou seja, diagonal principal.
 * 
 */

import java.util.Scanner;

public class desafio 
{
	
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		final int N1 = 3;
		int [][] matriz = new int [N1][3];
		
				int LINHA, COLUNA,  SOMAD = 0;
				
				
				for(LINHA = 0; LINHA<N1; LINHA++)
				{
				
				for(COLUNA = 0; COLUNA<3; COLUNA++)	
				{
					System.out.println(" VALOR: ");				
					matriz[LINHA][COLUNA] = tec.nextInt();
				}
								
				}
				
				for (LINHA = 0; LINHA<N1; LINHA++)
				{
				for (COLUNA = 0; COLUNA<2; COLUNA++)	
				{
					
				System.out.printf("[",matriz[LINHA][COLUNA],"]");	

				if (LINHA == COLUNA)
				{
				SOMAD = SOMAD + matriz[LINHA][COLUNA];
				}
				}
				System.out.printf("\n O valor da diagonal princial é ", SOMAD, "\n", "\n");
				}
				
				tec.close();
				
				}	
				
}


