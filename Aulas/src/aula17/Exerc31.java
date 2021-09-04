package aula17;

import java.util.Scanner;

public class Exerc31 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		double valor = 1;
		double total = 0;
		System.out.println("Lojas Tabajara");
		
		for(int i = 1; valor != 0; i++) {
			System.out.println("O produto " +i+ " custa:");
			valor = scan.nextDouble();
			total += valor;
		}
		System.out.println("Total: " +total);
		System.out.println("Qual o valor em dinheiro fornecido?");
		double dinheiro = scan.nextDouble();
		System.out.println("Troco: " +(dinheiro-total));

	}

}
