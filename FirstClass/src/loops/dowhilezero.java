package loops;
import java.util.*;
public class dowhilezero 
/*
 * Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)

 */

{

	public static void main(String[] args) 
	{
		int num, soma = 0;
		Scanner tec = new Scanner(System.in);
	do
		{
			System.out.printf("Entre com os números: ");
			num = tec.nextInt();
			soma = soma +num;
		}
		while (num != 0);
		{
			System.out.printf("O resultado das somas é: %d",soma);
		}
	tec.close();
	}

}
