package Pacote;

import java.util.Scanner;

public class tempoDeDuracaoSegundos {

	public static void main(String[] args) 
	
	{
		int horas = 0, minutos = 0, segundos = 0, totalDesegundos = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de segundodo do evento: ");
		totalDesegundos = teclado.nextInt();
		
		horas = totalDesegundos/3600;
		minutos = (totalDesegundos%3600)/60;
		segundos = ((totalDesegundos%3600)%60);
		
		System.out.print(totalDesegundos+" é: "+ horas +" horas, "+ minutos+ " minutos e " + segundos+ "segundos.");
		
	
		
		teclado.close();
	}

}
