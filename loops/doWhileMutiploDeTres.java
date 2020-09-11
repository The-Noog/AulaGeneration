package loops;
/*
 * Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)

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
			System.out.printf("Entre com os números: ");
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
			
			System.out.printf("O resultado das somas é: %d, %d, %d",soma,media,multi);
		}
		
		tec.close();
		}
}
