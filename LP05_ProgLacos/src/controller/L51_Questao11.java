package controller;

import util.Teclado;

public class L51_Questao11 {

	public static void main(String[] args) {
		/*
		 * ) Elaborar um programa que apresente o valor de uma potência de uma base
		 * qualquer (Variável b) elevada a um expoente qualquer (Variável e), ou seja,
		 * de be . (Sem usar Math.pow();)
		 */
		double b, e, potencia = 1; //potencia é a variável acumuladora
		int cont = 1;
		
		b = Teclado.lerInt("informe o número da base: ");
		e = Teclado.lerInt("Informe o número do expoente: ");
		
		while ( cont <=e) {
			potencia = potencia * b;
			
			cont++;
		}
		
		System.out.println(b + " Elevado a " + e + " Equivale a " + potencia);

	}

}
