package aula17;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		int numero = 0;
		int npar = 0;
		int nimpar = 0;
		for(int i = 0; i < 10; i++){
			System.out.println("Digite um número");
			numero = scan.nextInt();
			if(numero % 2 == 0) {
				npar++;
			} else { nimpar++;
		}
	}
		System.out.println("Existem " + npar + " numeros pares");
		System.out.println("Existem " + nimpar + " numeros impares");
}
}