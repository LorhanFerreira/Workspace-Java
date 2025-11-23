package controller;

import util.Teclado;

public class LP07_Questao03 {

	public static void main(String[] args) {
		/*
		 * ) Desenvolver um programa que pergunte cinco elementos de um vetor a. No
		 * final, apresente a soma de todos os elementos que sejam ímpares.
		 */
		

		int a []= new int [5];
		int soma = 0; //acumuladora
		
	for (int cont = 0 ; cont<5 ; cont++) {
		a[cont] = Teclado.lerInt("Favor, informe um número: ");
		
	} 
	for ( int cont = 0 ; cont<5 ; cont++) {
		if (a[cont] % 2 == 1) {
			soma = soma + a[cont];
		} 
		
	}
	System.out.println("A soma de todos os números	 ímpares informados equivale a " + soma);

	}

}
