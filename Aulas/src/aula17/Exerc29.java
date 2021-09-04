package aula17;

import java.text.DecimalFormat;

public class Exerc29 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		double valor = 1.99;
		System.out.println("Lojas Quase Dois - Tabela de preços");
		for(int i = 1; i < 51; i++) {
			System.out.println("°" +i+" - R$ " +df.format(valor));
			valor += 1.99;
		}
	}
}
