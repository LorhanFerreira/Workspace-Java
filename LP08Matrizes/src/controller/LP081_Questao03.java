package controller;

import util.Teclado;

public class LP081_Questao03 {
	/*
	 * Desenvolver um programa que crie uma matriz de 4 linhas e 3 colunas. Pergunte
	 * ao usuário números para preencher toda a matriz, e ao final, exiba a matriz
	 * inteira e a soma dos números pares contidos na matriz.
	 */
	public static void main(String[] args) {

		int matriz[][] = new int[4][3];
		int somaPares = 0;

		for (int linha = 0; linha < 4; linha++) {
			for (int col = 0; col < 3; col++) {
				matriz[linha][col] = Teclado.lerInt("[" + linha + "][" + col + "] Número?");
				if (matriz[linha][col] % 2 == 0) {
					somaPares = somaPares + matriz[linha][col];
				}

			} // fim do for col

		} // fim do for linha
		
		System.out.println("\n---Exibindo a matriz---");
		for (int linha = 0; linha < 4; linha++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(matriz[linha][col] + " ");

			} // fim do col
			System.out.println();
		} // fim da linha
		System.out.println("A soma dos número pares é = " + somaPares );
	}

}
