package loops;
import java.util.*;
/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */
	public class entradaParImpar 
{
	public static void main (String args[])
	{
		
		int par = 0, impar=0;	
		final int num = 10;
		
		Scanner tec = new Scanner(System.in);
		
	 	for (int i = 1; i <= num; i++) 
	 
		{
	 		System.out.print("Entre com o número:");
	 			int nume = tec.nextInt();
	 		
			if (nume%2 == 0) 
			{
			
				par = par+1;
			}
			else
			{
				impar = impar +1;
			}
				
		}
	 	System.out.printf("A quantidade de numeros pares é %d", par);
		System.out.printf("\nA quantidade de numeros ímpares é %d", impar);	
		tec.close();
		}
	
}
	
	