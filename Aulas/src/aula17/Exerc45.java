package aula17;

import java.util.Scanner;

public class Exerc45 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		boolean temAluno = true;
		String gabarito[] = new String[11];
		String resposta[] = new String[11];
		int acertos = 0, menorAcertos = 11, maiorAcertos = 0, qAlunos = 0, somaAcertos = 0;
		
		System.out.println("Ol� professor digite o gabarito das quest�es");
		for(int i = 1; i < 11; i++) {
			System.out.println("Qual a resposta da quest�o " +i+ "?");
			gabarito[i] = scan.next();
			}
		do {
			System.out.println("Ol� aluno digite suas respostas");
			for(int i = 1; i < 11; i++) {
				System.out.println("Quest�o " +i);
				resposta[i] = scan.next();
				
				if(resposta[i].equalsIgnoreCase(gabarito[i])) {
					acertos++;
				}
				if(i == 10) {
					if(acertos < menorAcertos){
						menorAcertos = acertos;
					}
					if(acertos > maiorAcertos){
						maiorAcertos = acertos;
					}
					System.out.println("Voc� acertou " +acertos+ " quest�es");
					somaAcertos += acertos;
					acertos = 0;
				}
			}
			
			System.out.println("Outro aluno vai utilizar o sistema? digite s ou n");
			String novoaluno = scan.next();
			if(novoaluno.equalsIgnoreCase("n")) {
				temAluno = false;
			}
			qAlunos++;
		}while(temAluno);
		double media = (double) somaAcertos/qAlunos;
		System.out.println("O aluno com menor nota acertou " +menorAcertos+ " quest�es");
		System.out.println("O aluno com maior nota acertou " +maiorAcertos+ " quest�es");
		System.out.println(qAlunos+ " Alunos utilizaram o sistema");
		System.out.println(somaAcertos);
		System.out.println("A m�dia das notas foi " +media);
	}
}
