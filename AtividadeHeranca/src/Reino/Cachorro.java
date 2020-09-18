package Reino;
public class Cachorro {
	
	
	private String nome;
	private int idade;
	private char som;
	private char corre;

	public Cachorro(String nome, int idade, char som, char corre) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.corre = corre;
	}

	public Cachorro() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSom() {
		return som;
	}

	public void setSom(char som) {
		this.som = som;
	}

	public char getCorre() {
		return corre;
	}

	public void setCorre(char corre) {
		this.corre = corre;
	}
	

}
