package aula19;

import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		int[] vetorA = new int[10];
		int menoridade = 0, maioridade = 0, posicaomenor = 0, posicaomaior = 0;
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
			if(i == 0) {
				menoridade = vetorA[i];
				maioridade = vetorA[i];
				posicaomenor = i;
				posicaomaior = i;
			}
			else if(vetorA[i] < menoridade) {
				menoridade = vetorA[i];
				posicaomenor = i;

			}
			else if(vetorA[i] > maioridade) {
				maioridade = vetorA[i];
				posicaomaior = i;
			}
		}
			
		System.out.println("A menor idade é " +menoridade+ " anos e está na posição " +posicaomenor);
		System.out.println("A maior idade é " +maioridade+ " anos e está na posição " +posicaomaior);
	}

}
