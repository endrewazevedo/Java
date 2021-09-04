package aula17;

import java.util.Scanner;

public class Exerc05 {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in );
	
	System.out.println("Informe a popula��o do pa�s A");
	double populacaoA = scan.nextDouble();
	System.out.println("Informe a popula��o do pa�s B");
	double populacaoB = scan.nextDouble();
	System.out.println("Informe a taxa de crescimento da popula��o do pa�s A");
	double porcTaxaA = scan.nextDouble();
	System.out.println("Informe a taxa de crescimento da popula��o do pa�s B");
	double porcTaxaB = scan.nextDouble();
	
	System.out.println("A popula��o do pa�s A de " + populacaoA + " cresce a uma taxa de " + porcTaxaA + "% por ano\n"
			+ "enquanto a popula��o do pa�s B de " + populacaoB + " cresce a uma taxa de " + porcTaxaB + "% por ano");
	
	int ano = 0;
	
	do{
		double taxaA = populacaoA * porcTaxaA/100;
		double taxaB = populacaoB * porcTaxaB/100;
		populacaoA = populacaoA + taxaA;
		populacaoB = populacaoB + taxaB;
		ano++; 
	}while(populacaoA < populacaoB);
	System.out.println("\nSer�o necess�rios " + ano + " anos para que o pa�s A ultrapasse a popula��o do pa�s B\n"
			+ "Pais A: " + populacaoA + "\nPais B: " + populacaoB );
	}
}
