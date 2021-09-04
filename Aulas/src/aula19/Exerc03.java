package aula19;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		int[] vetorA = new int[15];
		int[] vetorB = new int[15];
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i]*vetorA[i];
		}
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print(vetorB[i]+ " ");
		}
		

	}

}
