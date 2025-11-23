package controller;

public class L53_Questao07 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que apresente no final a soma dos valores pares existentes na faixa de 3 até 21.
		 */
		
		int soma = 0; // variável acumuladora
		for (int cont = 3 ; cont <= 21 ; cont++) {
			int resto = cont % 2;
			if (resto == 0) {
				soma +=cont;
				
			}
			
		}System.out.println("A soma dos números pares entre 3 e 21 é  = " + soma);

	}

}
