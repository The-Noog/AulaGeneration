package loops;
/*
 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)

 */

import java.util.*;
public class doWhileMutiploDeTres 
{

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int num,soma = 0, media = 0, multi = 0;
		
		do
		{
			System.out.printf("Entre com os n�meros: ");
			num = tec.nextInt();
			soma = soma +num;
			if (num%3==0)
			{
				multi++;
				
			}
			if (num%3==0)
			{
				media = soma +multi;
			}
		}
		
		while (num != 0);
		{
			
			System.out.printf("O resultado das somas �: %d, %d, %d",soma,media,multi);
		}
		
		tec.close();
		}
}
