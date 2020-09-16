package ExerciciosClasses;
/*
 * Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.

 * 
 */
public class exercicioCliente 
{
	public String nomeCliente;
	public int idadeCliente;
	public char sexoCliente;
	
	public void sex () {
		if (sexoCliente == 'M')
		{
			System.out.printf("O nome do cliente é %s, do sexo %s e sua idade é %d.", nomeCliente, sexoCliente, idadeCliente);
		}
		else if (sexoCliente == 'F')
		{
			System.out.printf("O nome do cliente é %s, do sexo %s e sua idade é %d.", nomeCliente, sexoCliente, idadeCliente);
			
		}
		
		
		
	}

}
