package aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc50 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in );
		DecimalFormat formato = new DecimalFormat("#"); 
		
		System.out.println("Qual o n termo da série?");
		double ntermo = scan.nextInt();
		double soma = 0;
		for(double i = 1; i < ntermo+1; i++){
			
			if(i == ntermo) {
				System.out.print(formato.format(1)+"/"+formato.format(i)+ " ");
				soma += (1/i);
			}
			else{
				System.out.print(formato.format(1)+"/"+formato.format(i) + " + ");
				soma += (1/i);
			}
					
		}
		
		System.out.println("\n\nA soma final da série é igual a " +soma);

	}

}
