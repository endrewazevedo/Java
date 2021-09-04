package aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc21 {

	public static void main(String[] args) {
		
		DecimalFormat deci = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in );
		double[] vetorA = new double[20];
		System.out.println("Qual a cotação do dólar?");
		double dolar = scan.nextDouble();
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = dolar*(i+1);
			
		}
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println(deci.format(vetorA[i])+ " ");
		}
		

	}

}
