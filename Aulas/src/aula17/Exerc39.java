package aula17;

import java.util.Scanner;

public class Exerc39 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		int numero, nmenoralt = 0, nmaioralt = 0;
		double altura, menoralt = 1000, maioralt = 0;
		
		for(int i = 1; i < 11; i++) {
			System.out.println("Qual o n�mero do aluno " +i+ "?");
			numero = scan.nextInt();
			System.out.println("Qual a altura do aluno " +i+ "?");
			altura = scan.nextDouble();
			
			if(altura<menoralt) {
				menoralt = altura;
				nmenoralt = numero;	
			}
			if(altura>maioralt) {
				maioralt = altura;
				nmaioralt = numero;	
			}
			
		}
		System.out.println("O aluno mais alto � o de n�mero " +nmaioralt+ " de altura " +maioralt);
		System.out.println("O aluno mais baixo � o de n�mero " +nmenoralt+ " de altura " +menoralt);

	}

}
