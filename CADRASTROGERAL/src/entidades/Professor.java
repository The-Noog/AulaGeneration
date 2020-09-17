package entidades;

public class Professor extends Pessoa
{
	public Professor(String nome, char sexo, int anoNasc, String etnia, String turma) {
		super(nome, sexo, anoNasc, etnia);
		this.turma = turma;
	}
	
	private String turma;

	public String getTurma() 
	{
		return turma;
	}

	public void setTurma(String turma) 
	{
		this.turma = turma;
	}
	public Professor(String nome) 
	{
		super(nome);
	
	}

	

	
}
