package ExerciciosClassesdois;

import java.util.Scanner;

import ExerciciosClassesdois.aviao;

public class obAviao {

	//public static void main(String[] args) 
	//public String nomeAviao;
	//public String companhiaAviao;
	//public char tipoAviao;
	public static void main(String[] args){
	
	{
	Scanner tek = new Scanner(System.in);
	aviao av = new aviao ();
	
	System.out.println("Entrada nome avião");
	
	System.out.println("Digite o nome do avião Tam ou gol:");
	av.nomeAviao = tek.next();
	
	System.out.println("Digite o tipo do avião [T/G] :");
	av.tipoAviao = tek.next().charAt(0);
	
	av.fini();
	
		
	tek.close();
	}
	}
}
