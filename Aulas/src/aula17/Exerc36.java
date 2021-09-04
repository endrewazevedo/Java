package aula17;

import java.util.Scanner;

public class Exerc36 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in );
	
	boolean valido = true;
	int inicio, fim;
	System.out.println("Monta a tabuada de: ");
	int numero = scan.nextInt();
	do {
		System.out.println("Começar por: ");
		inicio = scan.nextInt();
		System.out.println("Terminar em: ");
		fim = scan.nextInt();
		if(inicio>fim) {
			System.out.println("Você digitou um número inicial maior que o final");
			valido = false;
		}
		else {
			valido = true;
		}
	} while(!valido);
	
		System.out.println("Vou montar a tabuada de " +numero+ " começando por " +inicio+ " e terminando por " +fim+ ": \n");
		for(int i = inicio; inicio <= fim; inicio++){
			int mult = numero*inicio;
			System.out.println(numero + " x " +inicio+ " = " +mult);
	}

	}
}
