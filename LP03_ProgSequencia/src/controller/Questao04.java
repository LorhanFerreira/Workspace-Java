package controller;

import util.Teclado;

public class Questao04 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que pergunte um número inteiro e apresente o seu antecessor e seu sucessor.
		 */
		int n1;
		
		n1 = Teclado.lerInt("Digite um número: ");
		System.out.println("O antecessor de " + n1 + " é " + (n1-1) + ". E seu sucessor é " + (n1+1) +".");

	}

}
