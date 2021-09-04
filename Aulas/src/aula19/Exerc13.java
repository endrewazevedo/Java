package aula19;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		int[] vetorA = new int[10];
		int soma = 0;
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
			if(vetorA[i] % 5 == 0) {
				soma += vetorA[i];
			}
		}
			
		System.out.print(soma);
	}

}
