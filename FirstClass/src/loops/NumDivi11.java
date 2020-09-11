package loops;
import java.util.*;

/*
 * Informar todos os números de 1000 a 1999 que quando divididos por 11 
 * obtemos resto = 5. (FOR)

 */

	public class NumDivi11 
{
	public static void main (String args[])
	{
		Scanner tec = new Scanner(System.in);
		int num;
	
		for (num = 1000; num <= 1999; num++)
		{
			if (num%11 == 5)
			{
				System.out.printf("\n %d",num);
			}
			
		}
		
			
		tec.close();
	}
	
}
