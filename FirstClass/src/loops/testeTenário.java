package loops;

import java.util.*;

public class testeTen�rio
{

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in); 
		
		int opcao = 0;
		
		System.out.printf("Entre com o um n�mero de 1 para masculino, 2 para feminino e 3 para outros: ");
		opcao = tec.nextInt();
		
		System.out.print(( opcao == 1) ? "Voc� � do sexo masculino." : (opcao == 2) ? "\nO Voc� � do sexo feminino. " : (opcao == 3) ?"\n voc� � outro genero" : "Voc� digitou um n�mero errado, tente novamente "); // && e || !=
		
		tec.close();
	}

}
