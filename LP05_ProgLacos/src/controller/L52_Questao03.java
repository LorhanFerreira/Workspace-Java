package controller;

public class L52_Questao03 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que apresente o total da soma dos cinco primeiros números inteiros.
		 */
		int contador, acumulador;
		contador = 1;
		acumulador = 0;
		
		do {
			acumulador = acumulador + contador;
			contador++;
		} while (contador <=5);
		
		System.out.println("A soma de 1 a 5 é " + acumulador);
		

	}

}
