package aula19;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i];
		}
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print(vetorA[i]+ " ");
		}
		

	}

}
