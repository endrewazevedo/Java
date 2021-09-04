package aula19;

import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		int[] vetorA = new int[10];
		int media = 0;
		int somaInf = 0;
		int somaSup = 0;
		int qQuinze = 0;
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
			if(vetorA[i] < 15) {
				somaInf += vetorA[i];
			}
			else if(vetorA[i] == 15) {
				qQuinze++;
			}
			else {
				somaSup += vetorA[i];
				media++;
			}
		}
			
		System.out.println("A soma dos elementos inferiores a 15 é igual a " +somaInf);
		System.out.println("Existem " +qQuinze+ " elementos iguais a 15");
		System.out.println("A média dos elementos superiores a 15 é igual a " +somaSup);
	}

}
