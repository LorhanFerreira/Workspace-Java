package controller;

import util.Teclado;

public class LP07_Questao02 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte cinco elementos de um vetor a. No final,
		 * apresente a soma de todos os elementos deste vetor.
		 */
		
		int a []= new int [5];
		int soma = 0; //acumuladora
		
	for (int cont = 0 ; cont<5 ; cont++) {
		a[cont] = Teclado.lerInt("Favor, informe um número: ");
		
	} 
		
	for ( int cont = 0 ; cont<5 ; cont++ ) {
		soma = soma + a[cont];
		
	} 
	System.out.println("A soma dos números informados é igual a " + soma);

	}

}
