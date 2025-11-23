package controller;

import util.Teclado;

public class LP07_Questao01 {

	public static void main(String[] args) {
		/*
		 * Crie 2 vetores chamados nome e profissao, cada um com 5 elementos. Pergunte
		 * ao usuário o nome e a profissão de 5 pessoas e preencha estes vetores. Ao
		 * final exiba um relatório apontando o nome e a profissão de cada uma das 5
		 * pessoas cadastradas
		 */
		
		String nomes[] = new String [5];
		String profissoes[] = new String [5];
		
		for (int cont = 0 ; cont <5 ; cont++) {
			nomes [cont] = Teclado.lerTexto("Favor, informe seu nome: ");
			profissoes [cont] = Teclado.lerTexto("Favor, informe sua profissão: ");
			
		}System.out.println("\n----RELATÓRIO DE NOMES E PROFISSÕES----");
		System.out.println();
		
		for (int cont = 0 ; cont <5 ; cont++) {
			System.out.println("Nome: " + nomes[cont] + " - Profissão: " + profissoes[cont] );
		}
		

	}

}
