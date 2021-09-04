package aula17;

import java.util.Scanner;

public class Exerc05 {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in );
	
	System.out.println("Informe a população do país A");
	double populacaoA = scan.nextDouble();
	System.out.println("Informe a população do país B");
	double populacaoB = scan.nextDouble();
	System.out.println("Informe a taxa de crescimento da população do país A");
	double porcTaxaA = scan.nextDouble();
	System.out.println("Informe a taxa de crescimento da população do país B");
	double porcTaxaB = scan.nextDouble();
	
	System.out.println("A população do país A de " + populacaoA + " cresce a uma taxa de " + porcTaxaA + "% por ano\n"
			+ "enquanto a população do país B de " + populacaoB + " cresce a uma taxa de " + porcTaxaB + "% por ano");
	
	int ano = 0;
	
	do{
		double taxaA = populacaoA * porcTaxaA/100;
		double taxaB = populacaoB * porcTaxaB/100;
		populacaoA = populacaoA + taxaA;
		populacaoB = populacaoB + taxaB;
		ano++; 
	}while(populacaoA < populacaoB);
	System.out.println("\nSerão necessários " + ano + " anos para que o país A ultrapasse a população do país B\n"
			+ "Pais A: " + populacaoA + "\nPais B: " + populacaoB );
	}
}
