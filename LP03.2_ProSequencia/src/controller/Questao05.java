package controller;

import util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
		/*
		 * Fazer um algoritmo que pergunte dois números e ao final apresente os seguintes valores: a soma dos dois
números, a subtração do primeiro pelo segundo número, a subtração do segundo pelo primeiro número, a
multiplicação entre os dois números, a divisão do primeiro pelo segundo número, e também o resto da divisão
do primeiro pelo segundo número.
		 */
			int n1, n2;
			
			n1 = Teclado.lerInt("Informe um número: ");
			n2 = Teclado.lerInt("Informe outro número: ");
			System.out.println("A soma dos dois equivale a " + (n1+n2));
			System.out.println("A subtração do primeiro pelo segundo equivale a: " + (n1-n2));
			System.out.println("A subtração do segundo pelo primeiro equivale a " + (n2-n1));
			System.out.println("A multiplicação deles equivale a " + (n1*n2));
			System.out.println("A divisão do primeiro pelo segundo número equivale a  " + (n1/n2));
			System.out.println("O resto da divisão do primeiro pelo segundo número equivale a " + (n1%n2));
			
			

	}

}
