package aula17;

import java.util.Scanner;

public class Exerc38b {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Digite o salário inicial");
		double salario = scan.nextDouble();
		double salariofinal = salario;
		System.out.println("Digite o ano que deseja saber o salário");
		int ano = scan.nextInt();
		double porcent = 1.5,  aumento = 0;
		for(int anoinicio = 1995; anoinicio < ano; anoinicio++) {
			aumento = (salariofinal*porcent)/100;
			porcent *= 2;
			salariofinal += aumento;
		}
		System.out.println("O salário desse funcionário em " +ano+ " é igual a R$" +(salariofinal));

	}
	

}
