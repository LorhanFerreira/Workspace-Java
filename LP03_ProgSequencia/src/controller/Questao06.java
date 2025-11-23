package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que pergunte uma temperatura ao usuário, em graus
		 * Fahrenheit, e apresente esta temperatura convertida em graus Celsius. A
		 * fórmula da conversão é c = (f – 32) x 5 : 9 , onde c é a temperatura em graus
		 * Celsius e f em Fahrenheit.
		 */
		double f;

		f = Teclado.lerDouble("Informe a temperatura em Fahrenheit: ");
		// c = (f – 32) x 5 : 9
		System.out.println(f + " equivale a " + (f - 32) * 5 / 9 + " graus Celsius.");

	}

}
