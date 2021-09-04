package aula17;

import java.util.Scanner;

public class Exerc25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Quantas pessoas existem na turma?");
		int qpessoas = scan.nextInt();
		int idade;
		int soma = 0;
		
		for(int i = qpessoas; i > 0; i--) {
			System.out.println("Digite idade");
			idade = scan.nextInt();
			soma += idade;
		}	
		int media = soma/qpessoas;
		
		if(media <= 0 && media <= 25) {
			System.out.println("A turma é na media formada por jovens");
		}
		else if( media >= 26 && media <= 60 ) {
			System.out.println("A turma é na media formada por adultos");
		}
		else {
			System.out.println("A turma é na media formada por idosos");
		}
	}

}
