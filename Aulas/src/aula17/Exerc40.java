package aula17;

import java.util.Scanner;

public class Exerc40 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		int codigo, nveiculos, nacidentes, maioracid = 0, menoracid = 0, codmenor = 0, codmaior = 0, somaveic = 0, somaacid = 0, mediaacid = 0;
		
		for(int i = 1; i < 6 ; i++) {
			System.out.println("Qual o c�digo da cidade " +i+ "?");
			codigo = scan.nextInt();
			System.out.println("Qual o n�mero de ve�culos de passeio?");
			nveiculos = scan.nextInt();
			System.out.println("Qual o n�mero de acidentes de tr�nsito com v�timas?");
			nacidentes = scan.nextInt();
			
			if(i == 1) {
				maioracid = nacidentes;
				menoracid = nacidentes;
				codmenor = codigo;
				codmaior = codigo;
			}
			else if(nacidentes > maioracid) {
				maioracid = nacidentes;
				codmaior = codigo;
			}
			else if(nacidentes < menoracid) {
				menoracid = nacidentes;
				codmenor = codigo;
			}
			else if(nveiculos < 2000) {
				somaacid += nacidentes;
				mediaacid++;
			}
			somaveic += nveiculos;
		}
		System.out.println("A cidade com menor acidentes foi a cidade de c�digo " +codmenor+ " com " +menoracid+ " acidentes" );
		System.out.println("A cidade com maior acidentes foi a cidade de c�digo " +codmaior+ " com " +maioracid+ " acidentes" );
		System.out.println("A m�dia de ve�culos das 5 cidades � igual a " +somaveic/5 );
		System.out.println("A m�dia de acidentes nas cidades com menos de 2000 ve�culos � igual a " +somaacid/mediaacid );

	}

}
