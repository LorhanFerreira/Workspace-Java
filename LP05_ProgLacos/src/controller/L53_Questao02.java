package controller;

import util.Teclado;

public class L53_Questao02 {

	public static void main(String[] args) {
		/*
		 * 2) Desenvolver um programa que apresente o total da soma de n números
		 * inteiros do número 1 até n, onde n é um valor informado pelo usuário.
		 * 
		 */
		int n, acumulador = 0;
		
		n = Teclado.lerInt("Favor, informe um número: ");
		for ( int cont = 1 ; cont <= n ; cont++) {
			if (n >=1)
				acumulador = acumulador + cont;
			
		}
		System.out.println("A soma de 1 até " + n + " = " + acumulador);

	}

}
