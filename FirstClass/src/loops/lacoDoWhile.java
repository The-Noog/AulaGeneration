package loops;
import java.util.*;

public class lacoDoWhile {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		int idade;
		
		System.out.printf("Entre com a sua idade: ");
		idade = tec.nextInt();
		
		do
		{
			
			
			System.out.printf(" \n A sua idade é: %d", idade);	
			
			if(idade >= 18)
			{
				System.out.printf("\n Você é maior de idade....\n");
			}
			else 
			{
				System.out.printf("\n Você é menor de idade.\n");
			}
			System.out.printf("\n Entre com a sua idade: ");
			idade = tec.nextInt();
			
		}
		while(idade >= 1);
		tec.close();
	}

}
