package aula17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc47 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		String nome;
		double maiorNota = 0, menorNota = 0, soma = 0;
		ArrayList<Double> notas = new ArrayList<Double>(6);

		System.out.println("Qual o nome do atleta?");
		nome = scan.nextLine();
			for(int i = 0; i < 7; i++) {
				System.out.println("Qual a "+(i+1)+"º Nota?");
				notas.add(i, scan.nextDouble());
				if(i == 0) {
					menorNota = notas.get(i);
					maiorNota = notas.get(i);
				}
					else{
						if(notas.get(i) > maiorNota) {
							maiorNota = notas.get(i);
						}
						if(notas.get(i) < menorNota) {
							menorNota = notas.get(i);
						}
					}
				

				}
				for(int i = 0; i < 7; i++ ) {
					soma += notas.get(i);
				}
				System.out.println("Atleta: "+nome);
				for(int i = 0; i < 7; i++) {
					System.out.println("Nota: "+notas.get(i));
				}
				System.out.println("Resultado Final");
				System.out.println("Atleta: "+nome);
				System.out.println("Melhor nota: " +maiorNota);
				System.out.println("Pior nota: " +menorNota);
				System.out.println("Média: " +(soma-(menorNota+maiorNota))/5);
	}
}
