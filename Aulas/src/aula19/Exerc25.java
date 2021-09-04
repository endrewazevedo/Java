package aula19;

import java.util.Scanner;

public class Exerc25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
			if(vetorA[i] % 2 == 0) {
				vetorB[i] = 1;
			}
			else {
				vetorB[i] = 0;
			}
		}
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print(vetorA[i]+ " ");
		}
		System.out.println();
		for(int i = 0; i<vetorB.length; i++) {
			System.out.print(vetorB[i]+ " ");
		}
		
		

	}

}
