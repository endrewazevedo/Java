package aula17;

import java.util.Scanner;

public class Exerc43 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in );
		
		boolean pedido = true;
		int codigo;
		double total = 0, qcquente = 0, qbsimples = 0, qbovo = 0, qhamb = 0, qchees = 0, qrefri = 0;
		System.out.println("Caso deseje encerrar o pedido digite o código 0");
		do {
			System.out.println("Qual o código do seu pedido?");
			codigo = scan.nextInt();
			if(codigo == 0) {
				System.out.println("Pedidos encerrados");
				pedido = false;
			}
			else if(codigo < 100 && codigo > 105) {
				System.out.println("O código digitado foi inválido");
			}
			else if(codigo == 100) {
				System.out.println("Foi adicionado um Cachorro Quente");
				qcquente += 1.20;
				total += 1.20;
			}
			else if(codigo == 101) {
				System.out.println("Foi adicionado um Bauru Simples");
				qbsimples += 1.30;
				total += 1.30;
			}
			else if(codigo == 102) {
				System.out.println("Foi adicionado um Bauru com ovo");
				qbovo += 1.50;
				total += 1.50;
			}
			else if(codigo == 103) {
				System.out.println("Foi adicionado um Hamburguer");
				qhamb += 1.20;
				total += 1.20;
			}
			else if(codigo == 104) {
				System.out.println("Foi adicionado um Cheeseburguer");
				qchees += 1.30;
				total += 1.30;
			}
			else if(codigo == 105) {
				System.out.println("Foi adicionado um Refrigerante");
				qrefri += 1.20;
				total += 1.20;
			}
		} while(pedido);
		
		if(qcquente > 0) {System.out.println("Você pagará R$ " +qcquente+ " pelo item - Cachorro Quente ");}
		if(qbsimples > 0) {System.out.println("Você pagará R$ " +qbsimples+ " pelo item - Bauru Simples ");}
		if(qbovo > 0) {System.out.println("Você pagará R$ " +qbovo+ " pelo item - Bauru c/ ovo ");}
		if(qhamb > 0) {System.out.println("Você pagará R$ " +qhamb+ " pelo item - Hamburguer ");}
		if(qchees > 0) {System.out.println("Você pagará R$ " +qchees+ " pelo item - Cheeseburguer ");}
		if(qrefri > 0) {System.out.println("Você pagará R$ " +qrefri+ " pelo item - Refrigerante ");}
		System.out.println("O total do pedido foi R$ " +total);
	}

}
