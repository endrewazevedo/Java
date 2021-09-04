package aula17;

import java.util.Scanner;

public class Exerc33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		int numero;
		int soma = 0;
		System.out.println("Quantas temperaturas serão inseridos");
		int qtemp = scan.nextInt();
		System.out.println("Digite as temperaturas: ");
		int ptemp = scan.nextInt();
		int menor = ptemp;
		int maior = ptemp;
		for(int i = qtemp; i > 1; i--) {
			numero = scan.nextInt();
			soma += numero;
			if(numero < menor) {
				menor = numero;
			}
			if(numero > maior) {
				maior = numero;
			}
		}
		int media = soma/qtemp;
		System.out.println("A menor temperatura é "+menor);
		System.out.println("A maior temperatura é "+maior);
		System.out.println("A média das temperaturas é "+media);
	}
}
