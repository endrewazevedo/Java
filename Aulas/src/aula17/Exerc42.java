package aula17;

import java.util.Scanner;

public class Exerc42 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		int numero, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;
		
		do {
			System.out.println("Insira um número");
			numero = scan.nextInt();
			if(numero<0) {
				
			}
			else if(numero <= 25) {
				cont1++;
			}
			else if(numero <= 50) {
				cont2++;
			}
			else if(numero <= 75) {
				cont3++;
			}
			else if(numero <= 100) {
				cont4++;
			}
					
		}while(numero>0);
		
		System.out.println("Existem " +cont1+ " números no intervalo [0-25]");
		System.out.println("Existem " +cont2+ " números no intervalo [26-50]");
		System.out.println("Existem " +cont3+ " números no intervalo [51-75]");
		System.out.println("Existem " +cont4+ " números no intervalo [76-100]");
		
	}

}
