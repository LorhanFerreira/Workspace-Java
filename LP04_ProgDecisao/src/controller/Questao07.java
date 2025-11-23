package controller;

import util.Teclado;

public class Questao07 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte um valor inteiro positivo ou negativo, e exiba como resposta o módulo
deste valor, ou seja, o número lido como sendo positivo.
		 */
int n1;

n1 = Teclado.lerInt("Informe um número: ");

if (n1>0) {
	System.out.println(n1 + " É positivo.");
} else if (n1<0) {
	System.out.println(n1 + " É negativo.");
}else {
	System.out.println(n1 + " É nulo.");
}
	}

}
