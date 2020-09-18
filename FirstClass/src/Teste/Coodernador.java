package Teste;

public class Coodernador extends Pessoa
{
	private String cursoCoodernado;
	
	public Coodernador (String nome, int matricula, String cusoCoodernado)
	
	{
		super (nome, matricula);
		this.cursoCoodernado = cursoCoodernado;
	}

	public String getCursoCoodernado() {
		return cursoCoodernado;
	}

	public void setCursoCoodernado(String cursoCoodernado) {
		this.cursoCoodernado = cursoCoodernado;
	}
	
	
}
