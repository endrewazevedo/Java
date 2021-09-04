package aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in );
		
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Informe o preço do pão");
		double preco = scan.nextDouble();
		double valor = preco;
		System.out.println("Lojas Quase Dois - Tabela de preços");
		for(int i = 1; i < 51; i++) {
			System.out.println("°" +i+" - R$ " +df.format(valor));
			valor += preco;
		}
	}
}
