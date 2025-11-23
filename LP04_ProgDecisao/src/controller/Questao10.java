package controller;

import util.Teclado;

public class Questao10 {

	public static void main(String[] args) {
		/*
		 * ) Desenvolver um programa que pergunte dois números inteiros, e apresente
		 * como resultado se o segundo número informado é ou não um divisor do primeiro
		 * número informado.
		 */
		
		int n1, n2;
		
		n1 = Teclado.lerInt("Favor, informe um número: ");
		n2 = Teclado.lerInt("Favor, informe outro número: ");
		
		if (n2 % n1 == 0) {
			System.out.println(n2 + " É divisível por " +  n1);
		}else {
			System.out.println(n2 + " Não é divisível por " + n1);
		}
		
	}

}
