package aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc49 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in );
		DecimalFormat formato = new DecimalFormat("#"); 
		
		System.out.println("Qual o n termo da série?");
		double ntermo = scan.nextInt();
		double mtermo = 1;
		double soma = 0;
		for(double i = 1; i < ntermo; i++){
			
			if(i == ntermo-1) {
				System.out.print(formato.format(i)+"/"+formato.format(mtermo)+ " ");
				soma += (i/mtermo);
			}
			else{
				System.out.print(formato.format(i)+"/"+formato.format(mtermo) + " + ");
				soma += (i/mtermo);
				mtermo += 2;
			}
					
		}
		
		System.out.println("\n\nA soma final da série é igual a " +soma);

	}

}
