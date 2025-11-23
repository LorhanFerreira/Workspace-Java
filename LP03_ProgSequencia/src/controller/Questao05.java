package controller;

import util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que pergunte o salário de um funcionário e apresente este salário com um aumento de 15%.
		 */
		double sal;
		
		sal = Teclado.lerDouble("Informe seu salário: ");
		System.out.println("Seu salário com o aumento de 15% equivale a R$" + sal*1.15);

	}

}
