package controller;

import util.Teclado;

public class L061_Questao03 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte um número e informe como resposta se o
		 * número informado é par ou é ímpar.
		 * 
		 */

		int num, resto;

		num = Teclado.lerInt("Informe um número: ");

		resto = num % 2;

		switch (resto) {
		case 0:
			System.out.println(num + " é par");
			break;
		case 1:
			System.out.println(num + " é ímpar");
			break;
		}

	}

}
