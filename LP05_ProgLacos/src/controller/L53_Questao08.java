package controller;

import util.Teclado;

public class L53_Questao08 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte 20 vezes o nome inteiro de uma pessoa,
		 * sexo e idade, e exiba o nome inteiro das pessoas que são do sexo masculino e
		 * possuem 21 anos ou mais.
		 */
		
		String nome, sexo;
		int idade;
		
		
		
		for (int cont = 1 ; cont <=20 ; cont++) {
			nome = Teclado.lerTexto("Favor, informe seu nome completo: ");
			sexo = Teclado.lerTexto("Favor, informe o seu sexo: ");
			idade = Teclado.lerInt("Favor, informe a sua idade: ");
			
			if ( sexo.equals("m") && idade >=21) {
				System.out.println(" --- m e >=21: " + nome);
				System.out.println();
			}
			
		} 
			
		
		

	}

}
