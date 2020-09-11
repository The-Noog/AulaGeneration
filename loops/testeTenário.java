package loops;

import java.util.*;

public class testeTenário
{

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in); 
		
		int opcao = 0;
		
		System.out.printf("Entre com o um número de 1 para masculino, 2 para feminino e 3 para outros: ");
		opcao = tec.nextInt();
		
		System.out.print(( opcao == 1) ? "Você é do sexo masculino." : (opcao == 2) ? "\nO Você é do sexo feminino. " : (opcao == 3) ?"\n você é outro genero" : "Você digitou um número errado, tente novamente "); // && e || !=
		
		tec.close();
	}

}
