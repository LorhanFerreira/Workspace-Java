package controller;

import util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
		/*
		 * Fazer um algoritmo que pergunte 1 número e apresente:
a) O próprio número
b) O quadrado deste número
c) A raiz quadrada deste número
		 */
		int n1, raiz, quadrado;
		
		n1 = Teclado.lerInt("Digite um número:");
		raiz = n1 * n1;
		quadrado = n1*2;
		System.out.println("A raíz quadrada de " + n1 + " equivale a " + raiz + ". E se elevado ao quadrado, seu resultado é " + quadrado);
		}

}
