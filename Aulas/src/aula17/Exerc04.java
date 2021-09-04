package aula17;

public class Exerc04 {
	public static void main(String[] args) {
	
	System.out.println("A população do país A de 80000 cresce a uma taxa de 3% por ano\n"
			+ "enquanto a população do país B de 200000 cresce a uma taxa de 1.5% por ano");
	
	double populacaoA = 80000;
	double populacaoB = 200000;
	int ano = 0;
	
	do{
		double taxaA = populacaoA * 0.03;
		double taxaB = populacaoB * 0.015;
		populacaoA = populacaoA + taxaA;
		populacaoB = populacaoB + taxaB;
		ano++; 
	}while(populacaoA < populacaoB);
	System.out.println("\nSerão necessários " + ano + " anos para que o país A ultrapasse a população do país B\n"
			+ "Pais A: " + populacaoA + "\nPais B: " + populacaoB );
	}
}