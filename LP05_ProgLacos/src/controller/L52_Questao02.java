package controller;

public class L52_Questao02 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que apresente no final a soma dos valores pares
		 * existentes na faixa de 0 até 500. Utilize um laço que varie de 2 em 2.
		 * 
		 */
		int contador, acumulador;
		contador = 0;
		acumulador = 0;
		
		do {
			acumulador = acumulador + contador;
			contador = contador + 2;
			
		} while (contador <=500);
		System.out.println("A soma dos pares de 0 a 500 é " + acumulador);
	} 

}
