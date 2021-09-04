package aula17;

import java.util.Scanner;

public class Exerc32 {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in );
		
		System.out.println("Entre com o número que deseja saber o fatorial: ");
		int numero = scan.nextInt();
		int resultado = numero; 
		
		System.out.print(numero+"! = ");
		for(int i = numero; i > 1; i--) {
			System.out.print(numero+".");
			resultado *= numero-1;
			numero--;
		}
		System.out.print("1 ");
		System.out.println(" = "+resultado);
	}

}
