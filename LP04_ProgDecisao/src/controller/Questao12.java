package controller;

import util.Teclado;

public class Questao12 {

	public static void main(String[] args) {
		/*
		 * ) Desenvolver um programa que pergunte um número de 3 casas e apresente como
		 * resultado somente o algarismo das centenas.
		 */
		
		int n, n3;

		
		n = Teclado.lerInt("Informe um número de 3 casas");
		n3 = n/100%10;
		
		if (n <100) {
			System.out.println("Favor, digite um número com 3 casas decimais");
	} else {
		System.out.println("A casa das centenas é " +n3);
	}
		
	}

}
	
