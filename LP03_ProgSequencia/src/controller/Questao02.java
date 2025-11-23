package controller;

import util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
		/*
		 * Elaborar um programa que pergunte quatro valores inteiros e apresente 2 resultados:
a) Resultado de suas adições
b) Resultado de suas multiplicações
		 */
		int n1,n2,n3,n4, m, s;
		
		n1 = Teclado.lerInt("Digite um número: ");
		n2 = Teclado.lerInt("Digite o segundo número: ");
		n3 = Teclado.lerInt("Digite o terceiro número: ");
		n4 = Teclado.lerInt("Digite o quarto número: ");
		m = n1*n2*n3*n4;
		s = n1+n2+n3+n4;
		
		System.out.println("O resultado da soma desses números é igual a: " + s);
		System.out.println("O resultado da multiplicação desses números é igual a: " + m);
		
		
		
		
		
	}

}
