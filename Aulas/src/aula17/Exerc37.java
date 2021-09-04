package aula17;

import java.util.Scanner;

public class Exerc37 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		int i, codigo = 1, codmaioralt = 0, codmenoralt = 0, codmaiorpes = 0, codmenorpes = 0;
		double altura, peso, somapeso = 0, somaalt = 0, maioralt = 0, menoralt = 1000, maiorpes = 0, menorpes = 1000;
		
		for(i = 1; codigo != 0; i++) {
			System.out.println("Qual o código do cliente?");
			codigo = scan.nextInt();
			if(codigo != 0) {
				System.out.println("Qual a altura do cliente?");
				altura = scan.nextDouble();
				System.out.println("Qual o peso do cliente?");
				peso = scan.nextDouble();
				
				if(altura > maioralt) {
					maioralt = altura;
					codmaioralt = codigo;
				}
				if(altura < menoralt) {
					menoralt = altura;
					codmenoralt = codigo;
				}
				if(peso > maiorpes) {
					maiorpes = peso;
					codmaiorpes = codigo;
				}
				if(peso < menorpes) {
					menorpes = peso;
					codmenorpes = codigo;
				}
				somaalt += altura;
				somapeso += peso;
			}
			}
			
		double mediaalt = somaalt/i;
		double mediapeso = somapeso/i;
		System.out.println("O cliente mais alto possui código " +codmaioralt+ " e altura " +maioralt+ "m");
		System.out.println("O cliente mais baixo possui código " +codmenoralt+ " e altura " +menoralt+ "m");
		System.out.println("O cliente mais gordo possui código " +codmaiorpes+ " e peso " +maiorpes+ "kg");
		System.out.println("O cliente mais magro possui código " +codmenoralt+ " e peso " +menorpes+ "kg");
		System.out.println("A média das alturas é " +mediaalt+ "m" );
		System.out.println("A média dos pesos é " +mediapeso+ "kg");
	}

}
