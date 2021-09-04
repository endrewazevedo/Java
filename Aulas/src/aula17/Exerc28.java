package aula17;

import java.util.Scanner;

public class Exerc28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		int qcds;
		int contcds = 1;
		int valortotal;
		int soma = 0;
		
		System.out.println("Quantas CDs você possui?");
		qcds = scan.nextInt();
		
		for(int i = qcds; i > 0; i--) {
			System.out.println("Qual o valor do CD " +contcds);
			valortotal = scan.nextInt();
			soma += valortotal;
			contcds++;
			}
		int media = soma/qcds;
		System.out.println("Cada CD custou em média " +media);
		System.out.println("O Valor total dos CDs foi " +soma);
	}
}
