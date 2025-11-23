package controller;

public class L52_Questao05 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que apresente todos os números divisíveis por 4 que sejam menores que 20.
		 */
		
		int cont = 0, resto;
		
		do {
			resto = cont %4;
			
			if (resto == 0) {
				System.out.println(cont);
			}
			
			cont = cont +1;
		} while (cont <20);

	}

}
