package aula17;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in );
	
	int maior = 0;
	int menor = 0;
	int cont = 0;
	System.out.println("Digite até 5 numeros");
	maior = scan.nextInt();
	do {
		menor = scan.nextInt();
		cont++;
		if(menor>maior) {
			maior = menor;
		}
	}while(cont<4);
	
	System.out.println("O maior deles é " +maior);
	}
}
