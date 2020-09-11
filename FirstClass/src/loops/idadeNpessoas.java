package loops;
/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
 
 */

import java.util.Scanner;
public class idadeNpessoas 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int idade = 0, menores = 0, maiores = 0, max = -99;
		
		System.out.printf("Entre com a sua idade:");
		idade = tec.nextInt();
		
			while (idade != max)
			{
				System.out.printf("Entre com a sua idade:");
				idade = tec.nextInt();
				
				if(idade < 22)
				{
					menores ++;
				}
				if(idade > 49)
				{
				maiores++;
				}
			}
			System.out.printf("A quantidade de pessoas menores é  %d", menores);
			System.out.printf("\nA quantidade de pessoas maiores é  %d", maiores);
		tec.close();
	}	
}