package aula17;

import java.util.Scanner;

public class Exerc24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Quantas notas voc� deseja fazer a m�dia");
		int qnotas = scan.nextInt();
		int nota;
		int soma = 0;
		
		for(int i = qnotas; i > 0; i--) {
			System.out.println("Digite a nota");
			nota = scan.nextInt();
			soma += nota;
		}	
		int media = soma/qnotas;
		System.out.println("A m�dia das notas � " +media);
	}

}
