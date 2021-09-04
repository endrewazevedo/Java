package aula17;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		int anterior = 0;
		int pnultimo = 1;
		int prox = 1;
		
		System.out.println("Digite até que termo deseja fazer a série");
		int nesimo = scan.nextInt();
		System.out.print(anterior+", ");
		for(int i = 1; i < nesimo; i++) {
			if(i == nesimo-1) {
				System.out.print(prox+ ".");
			} else{System.out.print(prox+", ");}
			prox = anterior+pnultimo;
			anterior = pnultimo;
			pnultimo = prox;
		}
	}
}	
