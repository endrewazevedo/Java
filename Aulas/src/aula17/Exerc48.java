package aula17;

import java.util.ArrayList;
import java.util.Scanner;

public class Exerc48 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String numero;
		numero = scan.next();
		String reverse = new StringBuilder(numero).reverse().toString();
		System.out.println(reverse);

	}

}
