package controller;

import util.Teclado;

public class LP07_Questao09 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que leia 10 nomes de pessoas e armazene no vetor
		 * nomes. Em seguida o programa deve informar que enquanto o usuário responder
		 * SIM, será pedido que ele digite um nome e o programa informará se este nome
		 * existe ou não no vetor nomes. Em resumo, o programa deverá fazer o seguinte:
		 * • Solicitar 10 nomes para preencher o vetor nomes • Perguntar se o usuário
		 * quer fazer uma pesquisa de nomes no vetor nomes. • Se a resposta for SIM,
		 * perguntar qual o nome. • Informar se o nome existe ou não no vetor nomes.
		 * 
		 */
		
		String nomes[] = new String [10];
		
		for (int cont = 0 ; cont<10 ; cont++) {
			String pesquisa = Teclado.lerTexto("Você gostaria de fazer uma pesquisa de nomes disponíveis?");
			if (pesquisa.equals("sim")) {
				nomes[cont] = Teclado.lerTexto("Favor, informe seu nome: ");
				System.out.println(nomes[cont]);
			}
			else {
				
			}
			
			
		}

	}

}
