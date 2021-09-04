package aula19;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		int[] vetorA = new int[10];
		int idade35 = 0;
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
			if(vetorA[i] > 35) {
				idade35 ++;
			}
		}
			
		System.out.print("Existem " +idade35+ " pessoas com idade superior a 35");
	}

}
