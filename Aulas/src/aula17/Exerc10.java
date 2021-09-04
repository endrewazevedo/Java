package aula17;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in );
	
	System.out.println("Digite o primeiro inteiro: ");
	int inteiro1 = scan.nextInt();
	System.out.println("Digite o segundo inteiro: ");
	int inteiro2 = scan.nextInt();
	
	System.out.println("Os seguintes números estão entre os inteiros: ");
	for(int i = inteiro1+1; i < inteiro2; i++) {
		System.out.print(i+ " ");
	}
	}
}
