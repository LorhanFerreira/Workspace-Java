package controller;

import util.Teclado;

public class Questao04 {

	public static void main(String[] args) {
/*
 * Desenvolver um programa que pergunte um valor numérico inteiro e faça a exibição desse valor caso seja
divisível por 4 e 5. Não sendo divisível por 4 e 5, o programa deverá exibir a mensagem “Valor não é divisível por
4 e 5”.
 */
		
		int num, div4;
		num = Teclado.lerInt("Informe um número: ");
		
		div4 = num % 4;
		
		if (div4 == 0) {
			System.out.println(num + (" Não é divisível por 4 e 5"));
		
		}
		else {
			System.out.println("É divisível por 4 ou 5");
		}
	}

}
