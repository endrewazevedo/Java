package aula19;

import java.util.Scanner;

public class Exerc24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		boolean flag = false;
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i];
		}
		for(int i = 0, j = 9; i<vetorA.length; i++, j--) {
			if(vetorA[i] == vetorB[j]) {
			flag = true;
			}
			else {
				System.out.println("O Vetor não é um palíndromo"); break;
			}
		}
		if(flag == true) {
			System.out.println("O Vetor é um palíndromo");
		}

	}

}
