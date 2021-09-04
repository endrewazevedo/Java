package aula19;

import java.util.Scanner;

public class Exerc27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		int[] vetorA = new int[10];
		char[] vetorB = new char[10];
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
			if(vetorA[i] < 7) {
				vetorB[i] = 'a';
			}
			else if(vetorA[i] == 7) {
				vetorB[i] = 'b';
			}
			else if(vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] = 'c';
			}
			else if(vetorA[i] == 10) {
				vetorB[i] = 'd';
			}
			else {
				vetorB[i] = 'e';
			}
			
		}
		for(int i = 0; i<vetorB.length; i++) {
			System.out.print(vetorB[i]+ " ");
		}

	}

}
