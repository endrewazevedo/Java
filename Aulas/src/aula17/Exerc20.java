package aula17;

import java.util.Scanner;

public class Exerc20 {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in );
		
		boolean repete = true;
		do {
			System.out.println("Entre com o n�mero que deseja saber o fatorial: ");
			int numero = scan.nextInt();
			int resultado = numero;
			if(numero > 0 && numero < 16) {
			for(int i = numero; i > 1; i--) {
				resultado *= numero-1;
				numero--;
			}
			} else { 
				System.out.println("O N�mero precisa ser um inteiro positivo menor que 16");
			}
			System.out.println(resultado);
		} while(repete);
	}	
}
