package controller;

import util.Teclado;

public class L52_Questao08 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que apresente o valor de uma potência de uma base
		 * qualquer elevada a um expoente qualquer, ou seja, de be . (Não utilize
		 * Math.pow();)
		 */
		int expoente, base, cont = 1, potencia = 1; //potencia é acumuladora
		
		base = Teclado.lerInt("Informe a base da potência: ");
		expoente = Teclado.lerInt("Informe o expoente da potência: ");
		
		do {
			potencia = potencia * base;
			cont++;
		}
		 while (cont <= expoente);
		
		System.out.println(base + " elevado a " + expoente + " = " + potencia);
		
		
		

	}

}
