package controller;

import util.Teclado;

public class LP081_Questao05 {

	/*
	 * Desenvolver um programa que crie uma matriz de 4 linhas e 4 colunas. Pergunte
	 * ao usuário nomes de pessoas para preencher toda a matriz. Em seguida o
	 * programa perguntará ao usuário as coordenadas (linha e coluna) que deseja
	 * visualizar o conteúdo correspondente na matriz. Enquanto o usuário informar
	 * coordenadas válidas, o programa exibirá o conteúdo correspondente. No momento
	 * em que forem inseridas coordenadas não válidas o programa será encerrado com
	 * a mensagem na tela “Coordenadas inválidas”.
	 */

	public static void main(String[] args) {

		String matriz[][] = new String[4][4];

		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				matriz[linha][coluna] = Teclado.lerTexto("[" + linha + "][" + coluna + "] Informe um nome");
			}
		}
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {

			}

		}
	}
}