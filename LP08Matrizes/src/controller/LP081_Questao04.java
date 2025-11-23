package controller;

import util.Teclado;

public class LP081_Questao04 {
	/*
	 * Desenvolver um programa que crie uma matriz de 5 linhas e 2 colunas. Pergunte
	 * ao usuário números para preencher toda a matriz, e ao final, exiba a matriz
	 * inteira e a média dos números da matriz.
	 */
	public static void main(String[] args) {

		int matriz[][] = new int[5][2];
		double soma = 0;

		for (int linha = 0; linha < 5; linha++) {
			for (int col = 0; col < 2; col++) {
				matriz[linha][col] = Teclado.lerInt("[" + linha + "][" + col + "] Número?");
				soma = soma + matriz[linha][col];
			}
		}
			double media = soma / 10;
			
			System.out.println("\n ---Exibindo a matriz---");
			
		for (int linha = 0; linha < 5; linha++) {
			for (int col = 0; col < 2; col++) {
				System.out.print(matriz[linha][col] + " ");
			}System.out.println(" ");
		}
		System.out.println();
		System.out.println("Média: " + media);

	}

}
