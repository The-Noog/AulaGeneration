package vetroMatriz;

import java.util.*;
public class matrizEx {

	public static void main(String[] args) 
	
	{
		Scanner tek = new Scanner(System.in);
		int [][] matriz = new int [3][3];
		
		
		System.out.println("matriz M [3][3]/n");
		
		for (int linha = 0; linha <3; linha ++)
		{
			for (int coluna = 0; coluna <3; coluna++)
			{
				// o +1 na linha e na coluna é para começar no 1 e não no 0
				System.out.printf("Insira o elemento M [%d] [%d]: ", linha+1, coluna+1);
				matriz[linha][coluna] = tek.nextInt();
			}
		}
				System.out.println("\nA matriz ficou: \n");
				for (int linha = 0; linha <3; linha ++)
				{
					for (int coluna = 0; coluna < 3; coluna++)
					{
						System.out.printf("\t %d \t", matriz[linha][coluna]);
					}
					System.out.println();
				}
		tek.close();
	}

}
