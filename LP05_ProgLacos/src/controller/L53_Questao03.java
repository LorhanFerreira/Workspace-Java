package controller;

import util.Teclado;

public class L53_Questao03 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que apresente os resultados de uma tabuada de um
		 * número qualquer informado pelo usuário.
		 */
		
		int n, cont;
		n = Teclado.lerInt("Favor informe um número: ");
		
		for (cont = n ; cont <= 10 ; cont++ ) {
			System.out.println(n + " x " + cont + " = " + (n*cont));
		}

	}

}
