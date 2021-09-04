package aula17;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in );
	
	System.out.println("Digite um número entre 1 e 10");
	int numero = scan.nextInt();
	int i=1;
	
	for(i=1; i < 11; i++){
		int mult = numero*i;
		System.out.println(numero + " x " +i+ " = " +mult);
	}

	}
}
