package aula19;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		int[] vetorA = new int[10];
		int qPar = 0;
		int qImpar = 0;
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
			if(vetorA[i] % 2 == 1) {
				qImpar++;
			}
			else {
				qPar++;
			}
		}
		System.out.println("Num�ros pares s�o " +qPar*10+ "%");
		System.out.println("N�meros impares s�o " +qImpar*10+ "%");
	}

}
