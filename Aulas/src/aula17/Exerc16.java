package aula17;

import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		int anterior = 0;
		int pnultimo = 1;
		int prox = 1;
		
		System.out.print(anterior+", ");
		
		for(int i = 0; prox < 500; i++) {
			if(prox == 377) {
				System.out.print(prox+ ".");
			} else{System.out.print(prox+", ");}
			prox = anterior+pnultimo;
			anterior = pnultimo;
			pnultimo = prox;
		}
	}
}	
