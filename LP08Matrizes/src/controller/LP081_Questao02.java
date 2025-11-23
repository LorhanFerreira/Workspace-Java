package controller;

import util.Teclado;

public class LP081_Questao02 {
	/*
	 * Desenvolver um programa que crie uma matriz com 3 linhas e 2 colunas.
	 * Pergunte ao usuário números para preencher toda a matriz, e ao final exiba a
	 * matriz inteira e também a soma dos números desta matriz.
	 */
	public static void main(String[] args) {
		
		int matriz [] [] = new int [3] [2];
		int soma = 0; //variável acumuladora
		
		for (int linha = 0 ; linha <3 ; linha++) {
			for (int coluna = 0 ; coluna <2 ; coluna++) {
				matriz [linha] [coluna] = Teclado.lerInt("matriz [" + linha + "] [" + coluna + "] Número?");
				soma = soma + matriz [linha] [coluna];
			}
		}
		System.out.println("---Exibindo a Matriz inteira---\n");
		for (int linha = 0 ; linha <3 ; linha++) {
			for (int coluna = 0 ; coluna <2 ; coluna++) {
				System.out.println("Matriz [" + linha + "][" + coluna + "]: " + matriz [linha] [coluna]  );

	}

		}
		System.out.println("\nA soma dos valores da matriz é: " + soma);
		}
}
