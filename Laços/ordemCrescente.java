package Laços;
/*
 * Faça um programa que entre com três números e coloque em ordem crescente.
 * 
 */
import java.util.*;
public class ordemCrescente {

	public static void main(String[] args) 
	
	
	{
	Scanner tec = new Scanner(System.in);
	
	int numA, numB, numC;
	
	System.out.printf("Entre com o primeiro número: ");
	numA = tec.nextInt();
	
	System.out.printf("Entre com o segundo número: ");
	numB = tec.nextInt();
	
	System.out.printf("Entre com o terceiro número: ");
	numC = tec.nextInt();
		
	if (numA <= numB && numA <= numC && numB <= numC) 
	{
		System.out.printf("Os números são: %d, %d, e %d",numA, numB, numC);
	}
	else if (numA <= numC && numA <= numB)
	{		
		System.out.printf("Os números são: %d, %d, e %d",numA, numC, numB);
	}
	else if (numB <= numC && numB <= numA && numC <= numA)
	{		
		System.out.printf("Os números são: %d, %d, e %d",numB, numC, numA);
	}
	else if (numB <= numA && numB <= numC)
	{		
		System.out.printf("Os números são: %d, %d, e %d",numB, numA, numC);
	}
	
	else if (numC <= numA && numC <= numB && numA <= numB)
	{
		System.out.printf("Os números são: %d, %d, e %d",numC, numA, numB);
	}
	else if (numC <= numB && numC <= numA)
	{
		System.out.printf("Os números são: %d, %d, e %d",numC, numB, numA);
	}
	
	
	tec.close();
	}

}
