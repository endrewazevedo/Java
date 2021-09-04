package aula17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc46 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		boolean temNome = true;
		String nome;
		double maiorSalto = 0, menorSalto = 0, soma = 0;
		ArrayList<Double> saltos = new ArrayList<Double>(6);
		do {
			System.out.println("Qual o nome do atleta?");
			nome = scan.nextLine();
			if(nome != "") {
				for(int i = 0; i < 5; i++) {
					System.out.println("Qual a distância do "+(i+1)+"º salto?");
					saltos.add(i, scan.nextDouble());
					if(i == 0) {
						menorSalto = saltos.get(i);
						maiorSalto = saltos.get(i);
					}
					else{
						if(saltos.get(i) > maiorSalto) {
							maiorSalto = saltos.get(i);
						}
						if(saltos.get(i) < menorSalto) {
							menorSalto = saltos.get(i);
						}
					}
				

				}
				for(int i = 0; i < 5; i++ ) {
					soma += saltos.get(i);
				}
				System.out.println("Atleta: "+nome);
				System.out.println("Primeiro Salto: "+saltos.get(0));
				System.out.println("Segundo Salto: "+saltos.get(1));
				System.out.println("Terceiro Salto: "+saltos.get(2));
				System.out.println("Quarto Salto: "+saltos.get(3));
				System.out.println("Quinto Salto: "+saltos.get(4));
				System.out.println("Melhor Salto: " +maiorSalto);
				System.out.println("Pior Salto: " +menorSalto);
				System.out.println("Média dos demais saltos: " +(soma-(menorSalto+maiorSalto))/3);
				scan.nextLine();
			}
			else {
				temNome = false;
			}

		}while(temNome);		
	}
}
