package controller;

public class L52_Questao01b {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que apresente todos os valores numéricos inteiros
		 * pares situados na faixa de 100 a 200.
		 */
		int contador;
		contador = 100;
		
		do {
			
			if (contador % 2 == 0)
			System.out.println(contador);
			contador = contador + 2;
			
		} while ( contador <= 200);
		
		
		

	}

}
