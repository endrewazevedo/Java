package aula17;

import java.util.Scanner;

public class Exerc03 {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in );
	
	boolean valida = true;
	
		do {
			System.out.println("Digite o primeiro nome");
			String nome = scan.next();
			if(nome.length() < 3) {
				valida = false;
				System.out.println("Erro: Nome com poucos caractéres");
			}
			else {valida = true;}
		}while(!valida);
		
		do{
			System.out.println("Digite sua idade");
			int idade = scan.nextInt();
			if(idade < 0 || idade > 150) {
				valida = false;
				System.out.println("Erro: Idade inválida");
			}
			else {valida = true;}
		} while(!valida);
		
		do{
			System.out.println("Digite salário");
			double salario = scan.nextDouble();
			
			if(salario <= 0) {
				valida = false;
				System.out.println("Erro: Sálario inferior ou igual 0");
			}
			else {valida = true;}
		} while(!valida);
		
		do{
			System.out.println("Digite seu sexo(F ou M)");
			String sexo = scan.next();
			
			if(sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")){
				valida = true;
			}
			else {
				System.out.println("Erro: Sexo inválido");
				valida = false;
				}
		} while(!valida);
		
		do{ 
			System.out.println("Digite seu estado civil(S - C - V - D)");
			String estcivil = scan.next();
			if	   (estcivil.equalsIgnoreCase("C") || 
					estcivil.equalsIgnoreCase("S") || 
					estcivil.equalsIgnoreCase("V") || 
					estcivil.equalsIgnoreCase("D")) {
				valida = true;
			}else {
				System.out.println("Erro: estado civil inválido");
				valida = false;}
		} while(!valida);

		System.out.println("Todas as informações são válidas");
}
}