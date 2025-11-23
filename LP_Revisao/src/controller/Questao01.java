package controller;

import util.Teclado;

public class Questao01 {

	public static void main(String[] args) {
		/*
		 * 1. Fazer um algoritmo que pergunte um valor e exiba como resposta este valor
		 * com acréscimo de 18% e também o mesmo valor inicial com desconto de 65%.
		 */
		
		double num;
		
		num = Teclado.lerDouble("Informe um número:");
		
		System.out.println("Valor informado: R$" + num);
		System.out.println("Valor informado com o acréscimo de 18%: R$" + (num + (num *18/100)));
		System.out.println("Valor informado com desconto de 65%: R$" +  (num - (num *65/100)));
	}

}
