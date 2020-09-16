package entidades;

public class Alunno 
{
	// primeiros passos atributos da classe.
	public String nomeAluno;
	public int anoNascimentoAluno;
	public char sexoAluno;
	public char turmaAluno;
	
	public double notas[] = new double [4];
	
	
	//metodos
	
	public void mostra()//não vai dar nada
	{
		
		if (sexoAluno == 'M')
		{
			System.out.printf("O nome do aluno é %s, do sexo %s", nomeAluno, sexoAluno);
		}
		else if (sexoAluno == 'F')
		{
			System.out.printf("O nome do aluno é %s, do sexo %s", nomeAluno, sexoAluno);
			
		}
		}
	
		public double media()
		{
			double	media = notas[0] +notas[1] +notas[2] +notas[3]/4;
			
			System.out.printf("\n A média é : %f",(media));
			return media;
			
		}
		
	
		public void mostraIdade(int anoNascimentoAluno) 
		{
			System.out.printf("\n A sua idade é : %d",(2020-anoNascimentoAluno));
		
		}
}
	
