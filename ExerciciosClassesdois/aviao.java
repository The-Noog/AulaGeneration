package ExerciciosClassesdois;

/*
 * Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as informa��es deste objeto no console.
 * 
 */

public class aviao {
	public String nomeAviao;
	public char tipoAviao;
	
	public void fini () {
		if (tipoAviao == 'T')
		{
			System.out.printf("O nome do avi�o � Tam, e ele � de tranporte de pessoas...");
		}
		else if (tipoAviao == 'G')
		{
			System.out.printf("O nome do avi�o � Gol, e ele � de tranporte de cargas...");
			
		}
	}

}
