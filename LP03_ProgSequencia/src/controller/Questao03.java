package controller;

import util.Teclado;

public class Questao03 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que pergunte um valor em Dólares e apresente o equivalente
		 * em Reais. Considere U$1,00 = R$3,80.
		 */
		double dolar;
		dolar = Teclado.lerDouble("Informe um valor em dólar: ");
		System.out.println("O valor convertido em real equivale a R$" + (dolar * 3.80));

	}

}
