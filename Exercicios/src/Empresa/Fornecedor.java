/*
 2. Considere, como subclasse da classe Pessoa (desenvolvida no exerc�cio anterior) a classe Fornecedor. Considere que cada inst�ncia da classe Fornecedor tem, para al�m dos atributos que caracterizam a classe Pessoa, os atributos valorCredito (correspondente ao cr�dito m�ximo atribu�do ao fornecedor) e valorDivida (montante da d�vida para com o fornecedor). Implemente na classe Fornecedor, para al�m dos usuais m�todos seletores e modificadores, um m�todo obterSaldo() que devolve a diferen�a entre os valores dos atributos valorCredito e valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita verificar o funcionamento dos m�todos implementados na classe Fornecedor e os herdados da classe Pessoa. 
 */
package Empresa;

public class Fornecedor extends Pessoa

{
	private double valorCredito = 5.000; //(correspondente ao cr�dito m�ximo atribu�do ao fornecedor)
	private double valorDivida = 1.000; // (montante da d�vida para com o fornecedor)
	
		
	
	
	public Fornecedor(String nome, String endereco, String telefone, int idade, String cpf, double valorCredito,
			double valorDivida, double obterSaldo) {
		super(nome, endereco, telefone, idade, cpf);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		this.obterSaldo = obterSaldo;
	}
	public Fornecedor() {
		
	}
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	public double getObterSaldo() {
		return obterSaldo;
	}
	public void setObterSaldo(double obterSaldo) {
		this.obterSaldo = obterSaldo;
	}
	double obterSaldo = valorCredito - valorDivida;


}
