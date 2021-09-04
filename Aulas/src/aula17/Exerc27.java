package aula17;

import java.util.Scanner;

public class Exerc27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		int qturmas;
		int conturmas = 1;
		int qalunos;
		int soma = 0;
		
		System.out.println("Quantas turmas existem?");
		qturmas = scan.nextInt();
		
		for(int i = qturmas; i > 0; i--) {
			System.out.println("Quantos alunos existem na turma " +conturmas);
			qalunos = scan.nextInt();
			if(qalunos > 40) {
				System.out.println("A turma não pode conter mais de 40 alunos");
				i++;
			}
			else{
				soma += qalunos;
				conturmas++;
			}
		}
		int media = soma/qturmas;
		System.out.println("Cada turma tem em média " +media+ " alunos");
	}
}
