package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte dois valores numéricos inteiros e apresente o valor da diferença entre o
maior valor e o menor valor lido.

		 */
		int n1, n2, dif;
		
		n1 = Teclado.lerInt("Informe um número: ");
		n2 = Teclado.lerInt("Informe outro número: ");
		
		if (n1<n2) {
			dif = n1-n2;
		} else {
			dif = n2-n1;
		}
		System.out.println("A diferença entre o maior e o "+ "menor número inserido é " + dif);
	}

}
