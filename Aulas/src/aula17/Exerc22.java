package aula17;

import java.util.Scanner;

public class Exerc22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Digite o número: ");
		int numero = scan.nextInt();
		int teste = 0;
		int cont = 1;
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
			System.out.println("É divisível por: ");
			do {
				if(numero % cont == 0) {
					System.out.print(cont+" ");
				}
				cont++;
			}while(numero >= cont);
		}
	}
}
