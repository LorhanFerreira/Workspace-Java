package controller;

public class L52_Questao06 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que apresente os quadrados dos números inteiros de 2 a 50.
		 */
		 int cont = 2;
		 
		 do {
			//System.out.println(cont + " Elevado ao quadrado = " + (cont * cont));
			 System.out.println(cont + " Elevado ao quadrado = " + Math.pow(cont, 2));
			
			 cont++;
		 } while (cont <=50);

	}

}
