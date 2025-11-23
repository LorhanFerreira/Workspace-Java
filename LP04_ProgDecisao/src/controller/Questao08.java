package controller;

import util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte um número inteiro qualquer e verifique se ele está na faixa de 1 a 10
		 */
		
		int num;
		
		num = Teclado.lerInt("Favor, informe um número inteiro.");
		if (num <=10) {
			System.out.println(num + " Está entre 1 e 10");
				
			} else {
				System.out.println("O número informado é " + num);
		}
		

	}

}
