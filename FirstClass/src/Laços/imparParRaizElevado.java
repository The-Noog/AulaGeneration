package La�os;

/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.

 */
import java.util.*;

public class imparParRaizElevado 
{

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		int num;
		double raiz = 0;
		
		System.out.printf("Entre com um n�mero: ");
		num = tec.nextInt();
		
		if (num%2 == 0)
			
		{
			raiz = Math.sqrt(num);
			
			System.out.printf("O n�mero %d � par e sua ra�z quadrada � %.1f",num, raiz);
			
		}
		else {
			raiz = num*num;
			System.out.printf("O n�mero %d � impar e seu n�mero elevado � %.1f", num, raiz);
		}
		tec.close();
	}

}
