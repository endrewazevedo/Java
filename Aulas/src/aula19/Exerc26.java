package aula19;

import java.util.Scanner;

public class Exerc26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];
		
		System.out.println("Digite os elementos do vetor A");
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
		}
		System.out.println("Digite os elementos do vetor B");
		for(int i = 0; i<vetorB.length; i++) {
			vetorB[i] = scan.nextInt();
		}
		for(int i = 0; i<vetorC.length; i++) {
			if(vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			}
			else if(vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			}
			else {
				vetorC[i] = 1;
			}
		}
		for(int i = 0; i<vetorC.length; i++) {
			System.out.print(vetorC[i]+ " ");
		}
	}

}
