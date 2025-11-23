package controller;

import util.Teclado;

public class L53_Questao09 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte um número inteiro e exiba os números que
		 * são, ao mesmo tempo, múltiplos de 3 e 5, na sequência de 1 até o número
		 * informado pelo usuário.
		 */
		
		int n;
		
		n = Teclado.lerInt("Informe um número inteiro: ");
		
		for ( int cont = 1 ; cont <= n ; cont++) {
			if (cont % 3 ==0 && cont % 5 == 0) {
				System.out.println(cont + " É múltiplo de 3 e 5");
			}
		} System.out.println("\nFim do programa.");

	}

}
