package controller;

import util.Teclado;

public class Questao04 {

	public static void main(String[] args) {
		/*
		 * Fazer um algoritmo que peça um número de 1 a 7, e ao final, informe o dia da
		 * semana (por extenso) correspondente ao número que foi inserido. 
		 */
		
		int dia;
		
		dia = Teclado.lerInt("Favor, informe um número correspondente ao dia da semana: ");
		
		switch (dia) {
		
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Terça-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
			
		default: System.out.println("Número inválido.");
		}

	}

}
