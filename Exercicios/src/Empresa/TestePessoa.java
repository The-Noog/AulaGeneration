package Empresa;

public class TestePessoa 
{
	public static void main (String args[]) 
	

	{
	Pessoa pes = new Pessoa();
	pes.setNome("Weslley");
	pes.setEndereco("Mangualde");
	pes.setTelefone("95555555");
	pes.setIdade(27);
	pes.setCpf("408666966-62");
	
	System.out.println(pes.getNome());
	System.out.println(pes.getEndereco());
	System.out.println(pes.getTelefone());
	System.out.println(pes.getIdade());
	System.out.println(pes.getCpf());
	
	
	
	
	}
	
}
