package aula19;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		int[] vetorA = new int[10];
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
		}
		for(int i = 0; i<vetorA.length; i++) {
			if(vetorA[i]% 2 == 0) {
				System.out.print(vetorA[i]+ " ");
			}	
		}
		
	}

}
