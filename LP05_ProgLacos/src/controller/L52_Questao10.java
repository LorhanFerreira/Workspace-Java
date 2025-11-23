package controller;

import util.Teclado;

public class L52_Questao10 {

	public static void main(String[] args) {
		/*
		 * ) A série de Ricci difere da série de Fibonacci porque os dois primeiros
		 * termos são fornecidos pelo usuário. O restante da série é calculado da mesma
		 * forma que na série de Fibonacci. Altere o programa da questão anterior, para
		 * que sejam perguntados os dois primeiros termos da série de Ricci, e sejam
		 * exibidos os 15 termos subsequentes desta série.
		 */
		int cont = 1, ant, pos, aux;
		
		ant = Teclado.lerInt("Informe o primeiro termo: ");
		pos = Teclado.lerInt("Informe o segundo termo: ");
		
		do {
			
			System.out.print(ant + " ");
			aux = ant + pos; // soma de fibonacci
			ant = pos; // guarda em anterior o que está em posterior
			pos = aux; // guarda em posterior o resultado da soma

			cont++;

		} while (cont <= 15);
	}

}
