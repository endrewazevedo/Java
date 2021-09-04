package aula17;

import java.util.Scanner;

public class Exerc39 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		int numero, nmenoralt = 0, nmaioralt = 0;
		double altura, menoralt = 1000, maioralt = 0;
		
		for(int i = 1; i < 11; i++) {
			System.out.println("Qual o número do aluno " +i+ "?");
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
		System.out.println("O aluno mais alto é o de número " +nmaioralt+ " de altura " +maioralt);
		System.out.println("O aluno mais baixo é o de número " +nmenoralt+ " de altura " +menoralt);

	}

}
