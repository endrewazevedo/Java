package aula17;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Digite o número da base");
		int base = scan.nextInt();
		System.out.println("Digite o número do expoente");
		int expoente = scan.nextInt();
		double resultado = base;
		
		for(int i = 1; i < expoente; i++ ) {
			resultado = resultado*base;
		}
		System.out.println("O resultado é igual a: " +resultado);
	}

}
