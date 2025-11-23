package controller;

import util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte um número e exiba a informação de que
		 * ele é positivo, negativo ou nulo.
		 */
		int num;
		
		num = Teclado.lerInt("Informe um número:");
		
		if (num >0) {
			System.out.println(num + " É positivo");
		}else if (num < 0 ) {
			System.out.println(num + " É negativo");
		}else if (num == 0) {
			System.out.println(num + " É nulo");
		}

	}

}
