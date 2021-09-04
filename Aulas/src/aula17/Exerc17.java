package aula17;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in );
		
		System.out.println("Entre com o número que deseja saber o fatorial: ");
		int numero = scan.nextInt();
		int resultado = numero; 
		
		for(int i = numero; i > 1; i--) {
			resultado *= numero-1;
			numero--;
		}
		System.out.println(resultado);
	}

}
