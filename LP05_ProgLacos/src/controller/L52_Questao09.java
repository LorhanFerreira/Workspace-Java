package controller;

public class L52_Questao09 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que apresente a série de Fibonacci até o décimo
		 * quinto termo. A série de Fibonacci é formada pela sequência
		 * 1,1,2,3,5,8,13,21,34, ... etc. Essa série se caracteriza pela soma de um
		 * termo posterior com o seu anterior subsequente.
		 */
		int cont = 1, ant = 1, pos = 1, aux;
		do {
			System.out.print(ant + " ");
			aux = ant + pos; // soma de fibonacci
					ant = pos; // guarda em anterior o que está em posterior
					pos = aux; // guarda em posterior o resultado da soma
					
					cont++;
			
			
		} while (cont <= 15);
	}

}
