package aula17;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		boolean valida = true;
		int numero;
		int soma = 0;
		System.out.println("Quantos números serão inseridos");
		int qnumeros = scan.nextInt();
		do {
		System.out.println("Digite os números: ");
		int pnumero = scan.nextInt();
		if(pnumero >= 0 && pnumero <= 1000) {
			soma = pnumero;
			int menor = pnumero;
			int maior = pnumero;
			for(int i = qnumeros; i > 1; i--) {
				numero = scan.nextInt();
				if(numero >= 0 && numero <= 1000) {
					soma += numero;
					if(numero < menor) {
						menor = numero;
					}
					if(numero > maior) {
						maior = numero;
					}
				} else {
					System.out.println("O número deve estar entre 0 e 1000");
					i++;
				}
			}
			System.out.println("O menor valor é "+menor);
			System.out.println("O maior valor é "+maior);
			System.out.println("O soma dos valores é igual a "+soma);
			valida = true;
		} 
		else {
			System.out.println("O número deve estar entre 0 e 1000");
			valida = false;
			}
		}while(!valida);
	}
}
