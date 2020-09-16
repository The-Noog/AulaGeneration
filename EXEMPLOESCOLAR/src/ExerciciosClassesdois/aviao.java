package ExerciciosClassesdois;

/*
 * Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto avião, defina as instancias deste objeto e apresente as informações deste objeto no console.
 * 
 */

public class aviao {
	public String nomeAviao;
	public char tipoAviao;
	
	public void fini () {
		if (tipoAviao == 'T')
		{
			System.out.printf("O nome do avião é Tam, e ele é de tranporte de pessoas...");
		}
		else if (tipoAviao == 'G')
		{
			System.out.printf("O nome do avião é Gol, e ele é de tranporte de cargas...");
			
		}
	}

}
