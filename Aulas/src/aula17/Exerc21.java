package aula17;

import java.util.Scanner;

public class Exerc21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Digite o número: ");
		int numero = scan.nextInt();
		int teste = 0;
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				teste++;
			}
		}
		if(teste == 0) {
			System.out.println("É primo");
		}
		else {
			System.out.println("Não é primo");
		}
	}
}
