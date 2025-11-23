package controller;

import util.Teclado;

public class Questao01 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte ao usuário o seu nome completo e seu
		 * sexo. Em seguida, o programa deve apresentar os dados anteriormente
		 * informados
		 */

		String nome, sexo;
		nome = Teclado.lerTexto("Informe seu nome completo: ");
		sexo = Teclado.lerTexto("Informe seu sexo: ");

		System.out.println("Seu nome completo é " + nome + ". Seu sexo é " + sexo);

	}

}
