package aula17;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		boolean valida = true;
		
		do {
			System.out.println("Insira seu nome de usuário");
			String nome = scan.next();
			System.out.println("Insira sua senha");
			String senha = scan.next();
			
			if(senha.equalsIgnoreCase(nome)) {
				valida = false;
				System.out.println("Senha não pode ser a mesma que o nome do usuário");				
			} else {
				valida = true;
				System.out.println("Login completo");
			}
		} while(!valida);
	}

}
