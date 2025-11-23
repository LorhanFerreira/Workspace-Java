package controller;

import util.Teclado;

public class L53_Questao10 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que apresente o fatorial de um número informado pelo usuário
		 */
		
		int n, fat = 1; // fat é p acumulador (fatorial)
		
		n = Teclado.lerInt("Informe um número: ");
		for ( int cont = 1 ; cont <= n ; cont++) {
			fat = fat * cont;
			
		} System.out.println("O fatorial de " + n + " é " + fat);

	}

}
