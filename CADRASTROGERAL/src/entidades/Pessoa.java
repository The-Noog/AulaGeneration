package entidades;
public class Pessoa {
		
		private String nome; // nome 
		private char sexo; // MF
		private int anoNasc; //
		private String etnia;
		
			
		
		public Pessoa(String nome) 
		{
			
			this.nome = nome;
		}


		
		//sobrecarga
		public Pessoa(String nome, char sexo) {
			this.nome = nome;
			this.sexo = sexo;
		}



		public Pessoa(String nome, char sexo, int anoNasc) {
			this.nome = nome;
			this.sexo = sexo;
			this.anoNasc = anoNasc;
		}



		public Pessoa(String nome, char sexo, int anoNasc, String etnia) {
			this.nome = nome;
			this.sexo = sexo;
			this.anoNasc = anoNasc;
			this.etnia = etnia;
		}
		
		
		
		
		


}