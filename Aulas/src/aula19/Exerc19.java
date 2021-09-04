package aula19;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in );
		
		double[] nota1 = new double[10];
		double[] nota2 = new double[10];
		double[] result = new double[10];
		String situacao;
		
		for(int i = 0; i<10; i++) {
			System.out.println("Qual a primeira nota do aluno " +(1+i));
			nota1[i] = scan.nextDouble();
			System.out.println("Qual a segunda nota do aluno " +(1+i));
			nota2[i] = scan.nextDouble();
			result[i] = (nota1[i]+nota2[i])/2;
		}
		for(int i = 0; i<10; i++) {
			if(result[i] >= 7) {
				System.out.println("O aluno " +(1+i)+ " ficou com média " +result[i]+ " \nSituação: Aprovado");
			}
			else {
				System.out.println("O aluno " +(1+i)+ " ficou com média " +result[i]+ " \nSituação: Reprovado");
			}
			
		}
	}

}
