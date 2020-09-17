
/*1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters) e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas opções de construtores conforme sua percepção. Atributos: String nome; String endereço; String telefone; 
 * 
 */

package Empresa;

public class Pessoa 
{
	private String nome;
	private String endereco;
	private String telefone;
	private int idade;
	private String cpf;
	
	
	
	public Pessoa(String nome, String endereco, String telefone, int idade, String cpf) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.idade = idade;
		this.cpf = cpf;
	}
	public Pessoa() {
		
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
