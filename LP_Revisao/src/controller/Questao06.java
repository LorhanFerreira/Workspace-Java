package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		/*
		 * Fazer um algoritmo com while que pergunte a idade de 10 pessoas, e ao final,
		 * informe quantas destas pessoas são menores de idade. 
		 */
		
		int cont = 1;
		int pessoa;
		int idade = 0;
		
		
		while (cont <=10) {
		pessoa = Teclado.lerInt("Informe usa idade:");
			
			if (pessoa <18) {
				idade++;
			}cont++;
		}
		System.out.println(idade + " É o numero de pessoas menores de idade.");
		
		

	}

}
