package ExerciciosClassestres;

public class eletronico {
	
	public String nomeEletronico; 
	public double valorEletrocico;
	
	
	public void mostranome() {
	System.out.printf("O nome é %s", nomeEletronico);

	}
	public double mostravalor ()
	{
		System.out.printf("O valor custa %.2f", valorEletrocico);
		return valorEletrocico;
	}
}