package aula17;

import java.util.Scanner;

public class Exerc35 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Até que número deseja verificar?");
		int numero = scan.nextInt();
		int teste = 0;
		int cont = 2;
		int contdiv = 0;
		
		do {
			for (int i = 2; i < cont && teste == 0; i++) {
				if (cont % i == 0) {
					teste++;
				}
			}
			if (teste == 0) {
				System.out.print(cont + " ");
			}
			teste = 0;
			cont++;
		} while (numero-1 > cont);
	}
}
