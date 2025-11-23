package controller;

public class L51_Questao09 {

	public static void main(String[] args) {
		/*
		 * Elaborar um programa que apresente no final a soma dos valores pares existentes na faixa de 0 até 500. Utilize
um laço que efetue a variação de 2 em 2.
		 */
		int cont, acumulador;
		cont = 0;
		acumulador = 0;
		
		while (cont <= 500) {
			acumulador = acumulador + cont;
			cont = cont+2;
		}
		System.out.println("A soma dos valores pares de 0 a 500 é: " +acumulador);

	}

}
