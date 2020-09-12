package vetroMatriz;

import java.util.*;

public class vetorEx 

{
	public static void main(String []args) 
	
	{
	Scanner tek = new Scanner(System.in);	
	
	// Valores dos vetores.
	int[] vetUm = {10, 55, 16, 570, 700, 66, 64, 13, 44, 94, 33, 751};
	int[] vetDois = {74, 84, 64, 11, 24, 20, 74, 84};
	
	// Vetor ponto flutuante.
	float[] nota= new float[5];
	
	//.Lenght serve para fazer uma varredura e contar quantas variáveis tem no vetor.
	if (vetDois.length > 8) 
	{
		System.out.println("Tamanho do VetDois é Maior que 8! ");
	}
	else
	{
		
		System.out.println("Tamanho do VetDois é Menor que 8! ");
	}
		System.out.println("Tamanho do VetUm é = "+vetUm.length);
		
		//for each
		String[] cars = {"ford","","volks", "fiat"};
		
		for (String i : cars) 
		{
		System.out.println(i);
		}
		
		// Pupolando um Arrtay
		
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("Entre com uma nota:");
			nota [i]= tek.nextFloat(); 
		}
		
		// apresentando um array
		
		for (int i = 0; i<5; i++)
		{
			System.out.println("Nota "+i+1+"="+nota[i]);
			
		
		}
	tek.close();
	}
}
