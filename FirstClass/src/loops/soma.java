package loops;

public class soma
{

	public static void main(String[] args) 
	{
	 int x, soma = 0;
	 
	 for (x= 1; x<=10; x++)
	 {
		 System.out.printf("\n %d",x);
		 soma = soma + x;
	 }
	 System.out.printf("\n Total da soma é: %d",soma);
	}

}
