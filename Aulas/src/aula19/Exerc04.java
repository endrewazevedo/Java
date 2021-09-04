package aula19;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		int[] vetorA = new int[15];
		int[] vetorB = new int[15];
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
			vetorB[i] = (int) Math.sqrt(vetorA[i]);
		}
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print(vetorB[i]+ " ");
		}
		

	}

}
