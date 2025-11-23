package controller;

import util.Teclado;

public class Questao07 {

	public static void main(String[] args) {
		/*
		 * Fazer um algoritmo com for que pergunte um número positivo, e exiba na tela a
		 * lista de números de 1 até o número informado.
		 */
		
		int num = Teclado.lerInt("Informe um número: ");
		
		for ( int cont = 0 ; cont<=num ; cont++ ) {
					
			if (num >=1) {
				System.out.println(cont);
			}
		}

	}

}
