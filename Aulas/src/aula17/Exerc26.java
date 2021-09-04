package aula17;

import java.util.Scanner;

public class Exerc26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		int cand1 = 0, cand2 = 0, cand3 = 0;
		int voto = 1;
		
		System.out.println("Para parar a eleição digite 0");
		
		for(int i = 0; voto != 0; i++) {
			System.out.println("Em qual canditado você deseja votar: 1, 2 ou 3?");
			voto = scan.nextInt();
			
			if(voto == 0) {
				System.out.println("Eleição finalizada");
			}
			else if(voto == 1) {
				cand1++;
			}
			else if(voto == 2) {
				cand2++;
			}
			else if(voto == 3) {
				cand3++;
			}
			else {
				System.out.println("Candidato ínvalido");
			}
		}
		System.out.println("O candidato 1 obteve " +cand1+ " votos");
		System.out.println("O candidato 2 obteve " +cand2+ " votos");
		System.out.println("O candidato 3 obteve " +cand3+ " votos");
	}
}
