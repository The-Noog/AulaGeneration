package Laços;

/*
 * Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.

 */
import java.util.*;

public class imparParRaizElevado 
{

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int num;
		double raiz = 0;
		
		System.out.printf("Entre com um número: ");
		num = tec.nextInt();
		
		if (num%2 == 0)
			
		{
			raiz = Math.sqrt(num);
			
			System.out.printf("O número %d é par e sua raíz quadrada é %.1f",num, raiz);
			
		}
		else {
			raiz = num*num;
			System.out.printf("O número %d é impar e seu número elevado é %.1f", num, raiz);
		}
		tec.close();
	}

}
