package controller;

import util.Teclado;

public class LP07_Questao05 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte 5 valores do vetor a, e em seguida crie
		 * um vetor b de mesma dimensão contendo os valores ao quadrado correspondentes
		 * no vetor a. Ao final exibir os 2 vetores.
		 */
		
		double a[] = new double [5];
		double b[] = new double [5];
		
		for (int cont = 0 ; cont<5 ; cont++) {
			a[cont] = Teclado.lerInt("Valor para índice " + cont + "?");
			b[cont] = Math.pow(a[cont], 2);
		}
		System.out.println("\nValores do VETOR A:");
		
		for ( int cont = 0 ; cont<5 ; cont++) {
			System.out.print(a[cont] + " ");
			
		}
		System.out.println();
		System.out.print("\nValores do VETOR B: ");
		
		for ( int cont = 0 ; cont<5 ; cont++) {
			System.out.print(b[cont] + " ");
		
		
		

	}

}
}