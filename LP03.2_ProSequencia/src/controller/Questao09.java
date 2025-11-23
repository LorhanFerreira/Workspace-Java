package controller;

import util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas
em dias. Obs: Considere os anos com 365 dias e os meses com 30 dias.
		 */
		
		int anos, meses, dias, totalDias;
		
		anos = Teclado.lerInt("Quantos anos você tem? ");
		meses = Teclado.lerInt("Quantos meses se passaram desde o seu último aniversário? ");
		dias = Teclado.lerInt("Quantos dias se passaram desde o último mês apontado na resposta anterior? ");
		
		totalDias = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("Você já viveu " + totalDias + "  dias.");
		
	
		

	}

}
