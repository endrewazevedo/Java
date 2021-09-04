package aula19;

import java.util.Scanner;

public class Exerc23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		int[] vetorA = new int[10];
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
			if(vetorA[i] % 2 == 1) {
				break;
			}
		}
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print(vetorA[i]+ " ");
		}
		

	}

}
