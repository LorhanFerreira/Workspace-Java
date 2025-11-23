package controller;

import util.Teclado;

public class Questao11 {

	public static void main(String[] args) {
		/*
		 * ) Desenvolver um programa que pergunte um número de 3 casas e apresente como resultado somente o
algarismo das centenas.
		 */
int num;
num = Teclado.lerInt("Informe um número: ");

if (num <100 || num >999) {
	System.out.println(num + " Não possui 3 casas.");
}else {
	System.out.println("O algarismo das centenas é " + (num/100));
}
	}

}
