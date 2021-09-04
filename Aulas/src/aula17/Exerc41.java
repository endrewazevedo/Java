package aula17;

import java.util.Scanner;

public class Exerc41 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		
		System.out.println("Qual o valor da dídida?");
		double divida = scan.nextInt();
		double dividafixa = divida;
		double valorjuros = 0;
		int porcjuros = 10;
		
		for(int i = 1; i < 13; i+=3) {		
			if(i == 1) {
				System.out.print("Dívida: R$ " +divida+" || ");
				System.out.print("Valor dos Juros: " +valorjuros+" || ");
				System.out.print("Quantidade das parcelas: " +(i)+" || ");
				System.out.print("Valor das parcelas: R$" +(divida + valorjuros)+" || ");
				i = 0;
				System.out.println("");
			}
			else {
				valorjuros = (dividafixa/100)*porcjuros;
				System.out.print("Dívida: R$ " +(divida+valorjuros)+" || ");
				System.out.print("Valor dos Juros: " +valorjuros+" || ");
				System.out.print("Quantidade das parcelas: " +(i)+" || ");
				System.out.print("Valor das parcelas: R$" +((divida+valorjuros)/i)+" || ");
				System.out.println("");
				porcjuros += 5;
			}
		}

	}
}
