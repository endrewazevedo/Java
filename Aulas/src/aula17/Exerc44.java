package aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc44 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in );
		DecimalFormat deci = new DecimalFormat("0");
		DecimalFormat deci2 = new DecimalFormat("0.00");
		
		
		int codigo = 0, cod1 = 0, cod2 = 0, cod3 = 0, cod4 = 0, vnulo = 0;
		double vbranco = 0;
		System.out.println("Elei��o presidencial: \nC�digo 1 - Candidato : Jose\n"
				+ "C�digo 2 - Candidato: Jo�o\n"
				+ "C�digo 3 - Candidato: Matheus\n"
				+ "C�digo 4 - Candidato: Marcos\n"
				+ "C�digo 5 - Voto Nulo\n"
				+ "C�digo 6 - Voto em branco");
		do {
			System.out.println("Qual o seu voto?");
			codigo = scan.nextInt();
			if(codigo == 0) {}
			else if(codigo == 1) { cod1++; }
			else if(codigo == 2) { cod2++; }
			else if(codigo == 3) { cod3++; }
			else if(codigo == 4) { cod4++; }
			else if(codigo == 5) { vnulo++; }
			else if(codigo == 6) { vbranco++; }
			else {System.out.println("Op��o de voto inv�lida");}
		}while(codigo != 0);
		
		double total = cod1+cod2+cod3+cod4+vnulo+vbranco;
		double porcvbranco = (vbranco/total)*100;
		double porcvnulo = (vnulo/total)*100; 
		System.out.println("O candidato 1 - Jos� obteve " +cod1+ " votos");
		System.out.println("O candidato 2 - Jo�o obteve " +cod2+ " votos");
		System.out.println("O candidato 3 - Matheus obteve " +cod3+ " votos");
		System.out.println("O candidato 4 - Marcos obteve " +cod4+ " votos");
		System.out.println("Houveram " +deci.format(vnulo)+ " votos nulos cerca de " +deci2.format(porcvnulo)+ "% dos votos");
		System.out.println("Houveram " +deci.format(vbranco)+ " votos em branco cerca de " +deci2.format(porcvbranco)+ "% dos votos");
	}

}
