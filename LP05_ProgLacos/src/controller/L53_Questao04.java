package controller;

public class L53_Questao04 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que apresente todos os números divisíveis por 5 que sejam menores que 50
		 */
		
		for (int cont = 1 ; cont < 50 ; cont++) {
			if (cont % 5 == 0) {
				System.out.println(cont);
			}
		}

	}

}
