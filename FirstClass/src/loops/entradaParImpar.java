package loops;
import java.util.*;
/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
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
	 		System.out.print("Entre com o n�mero:");
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
	 	System.out.printf("A quantidade de numeros pares � %d", par);
		System.out.printf("\nA quantidade de numeros �mpares � %d", impar);	
		tec.close();
		}
	
}
	
	