package loops;
import java.util.*;
public class dowhilezero 
/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)

 */

{

	public static void main(String[] args) 
	{
		int num, soma = 0;
		Scanner tec = new Scanner(System.in);
	do
		{
			System.out.printf("Entre com os n�meros: ");
			num = tec.nextInt();
			soma = soma +num;
		}
		while (num != 0);
		{
			System.out.printf("O resultado das somas �: %d",soma);
		}
	tec.close();
	}

}
