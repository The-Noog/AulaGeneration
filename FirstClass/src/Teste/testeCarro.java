package Teste;

public class testeCarro {
	
	public static void main(String args[])
	{
		Carro meuCarro  = new Carro();
		meuCarro.cor = "Azul";
		meuCarro.modelo = "Gol";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		meuCarro.liga();
		meuCarro.acelela(20);
		
		System.out.println(meuCarro.velocidadeAtual);
	}

}
