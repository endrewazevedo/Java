package aula17;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in );
	
	double soma = 0;
	for(int i=0; i<5; i++) {
		System.out.println("Digite um número");
		double numero=scan.nextInt();
		soma += numero;
	}
	double media = soma/2;
	
	System.out.println("A soma dos números é igual a " +soma);
	System.out.println("A média da soma dos números é igual a " +media);

	}

}
