package Teste;

public class Erros {

	public static void main(String[] args) {

		String frase = null;
		String novaFrase = null;
		
		try {
			novaFrase = frase.toUpperCase();
			
		}
			catch (NullPointerException e) {
				System.out.println("A frase inicial � nula, para solucionar ao problema foi lhe atribuido um valor defaut.");
				
				frase = "Frase Vazia";
				novaFrase = frase.toUpperCase();
			}
		System.out.println("Frase antiga: " + frase);
		System.out.println("Frase nova: " + novaFrase);
	
	}

}
