package com.maycon.aula;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		boolean valida = true;
		
		do {
		System.out.println("Digite um número entre 0 e 10");
		double nota = scan.nextInt();
		
		if(nota >= 0 && nota <= 10) {
			System.out.println("Sua nota foi: " + nota);
			valida = true;
		} else {
			System.out.println("Nota inválida, digite novamente");
			valida = false;
		}
		
	} while(!valida);
	}
}
