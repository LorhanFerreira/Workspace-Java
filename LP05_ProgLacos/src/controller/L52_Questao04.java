package controller;

import util.Teclado;

public class L52_Questao04 {

	public static void main(String[] args) {
		/*
			 * Desenvolver um programa que apresente os resultados de uma tabuada de um
			 * número n qualquer a ser perguntado ao usuário (n x 1, n x 2, n x 3, ... , n x
			 * 9, n x 10)
		 */
		
		        int n, cont = 1;
		        
		        n = Teclado.lerInt("Informe um número: ");
		        
		        do {
		        	System.out.println(n + "x" + cont + " = " + (n * cont));
		        	cont++;
		        } while (cont <= 10);

	}

}
