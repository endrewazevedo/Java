package aula17;

import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		int numero;
		int soma = 0;
		System.out.println("Quantos números serão inseridos");
		int qnumeros = scan.nextInt();
		System.out.println("Digite os números: ");
		int pnumero = scan.nextInt();
		int menor = pnumero;
		int maior = pnumero;
		for(int i = qnumeros; i > 1; i--) {
			numero = scan.nextInt();
			soma += numero;
			if(numero < menor) {
				menor = numero;
			}
			if(numero > maior) {
				maior = numero;
			}
		}
		System.out.println("O menor valor é "+menor);
		System.out.println("O maior valor é "+maior);
		System.out.println("O soma dos valores é igual a "+soma);
	}
}
