package Pacote;

import java.util.Scanner;

/*
 * Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e 
 * dias e mostre-a expressa apenas em dias.
 */

public class ConversaoDias {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int anos, meses = 0, dias = 0, totalDeDias;
		
		 
		
		System.out.println(" Entre com a sua idade: ");
		anos = teclado.nextInt();

		System.out.println(" Entre com os meses: ");
		anos = teclado.nextInt();
		
		System.out.println(" Entre com os dias: ");
		anos = teclado.nextInt();
		
		anos = anos * 365;
		meses = anos + (meses*30);
		totalDeDias = dias + meses;
		
		System.out.print("O total de dias é:");
		System.out.println(totalDeDias);
		
		teclado.close();
		
	}

}
