package ExerciciosClasses;

import java.util.Scanner;

public class objetoCliente {

	public static void main(String[] args) 
	{
		
		Scanner tec = new Scanner (System.in);
		exercicioCliente cliente = new exercicioCliente();
		
		System.out.println("Sistema de nome, idade e sexo do Cliente.");
		
		System.out.println("Digite o nome do cliente:");
		cliente.nomeCliente = tec.next().toUpperCase();
	
		System.out.println("Digite a idade do cliente:");
		cliente.idadeCliente = tec.nextInt();
		
		System.out.println("Digite o sexo do cliente [M/F]");
		cliente.sexoCliente = tec.next().toUpperCase().charAt(0);
	
		cliente.sex();
		
		tec.close();
	}

}
