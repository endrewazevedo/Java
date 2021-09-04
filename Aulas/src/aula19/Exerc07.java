package aula19;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];
		
		System.out.println("Digite os elementos do Vetor A");
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = scan.nextInt();

		}
		System.out.println("Digite os elementos do Vetor B");
		for(int i = 0; i<vetorB.length; i++) {
			vetorB[i] = scan.nextInt();
		}
		
		for(int i = 0; i<vetorC.length; i++) {
			vetorC[i] = vetorA[i] - vetorB[i];
		}
		for(int i = 0; i<vetorC.length; i++) {
			System.out.print(vetorC[i]+ " ");
		}
		

	}

}
