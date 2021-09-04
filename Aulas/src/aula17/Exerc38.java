package aula17;

import java.util.Scanner;

public class Exerc38 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		System.out.println("O Funcionário contratado em 1995 com salário inicial de R$1.000,00\nem "
				+ "1996 recebeu um aumento de 1,5% sobre seu salário inicial e nos anos seguintes os aumentos\n"
				+ "correspodem ao dobro do percentual do ano anterior\n"
				+ "Em que ano você deseja saber o salário do funcionário? ");
		
		int ano = scan.nextInt();
		double salario = 1000, salariofinal = salario;
		double porcent = 1.5,  aumento = 0;
		for(int anoinicio = 1995; anoinicio < ano; anoinicio++) {
			aumento = (salariofinal*porcent)/100;
			porcent *= 2;
			salariofinal += aumento;
		}
		System.out.println("O salário desse funcionário em " +ano+ " é igual a R$" +(salariofinal));

	}
	

}
