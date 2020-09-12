package vetroMatriz;

/*
 * 1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.

 */
import java.util.*;
public class exercicioUmarray {

	public static void main(String[] args) 
	{
	Scanner tel = new Scanner (System.in);	
	
	int [] a = {1, 0, 5, -2, -5, 7};
	int soma = 0;
	
	System.out.printf(" os números dos vetores são: %d, %d, %d\n", a[0], a[1], a[5]);
	soma = a[0] + a[1]+ a[5];
	// retorna os valores da soma
	System.out.printf("\n A soma entre os valores é igual a: %d\n", soma);
	
	a[4] = 100;
	// retorna o vetor em cada linha
	System.out.printf("\nvetor atualizado em linha para:\n");
	for (soma = 0; soma <= 5; soma++) {
	System.out.printf("%d\n",a[soma]);
	}
	tel.close();
	}

}
