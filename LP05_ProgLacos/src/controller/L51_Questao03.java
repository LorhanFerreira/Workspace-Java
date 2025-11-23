package controller;

public class L51_Questao03 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que apresente os quadrados dos números inteiros de 15 a 200.
		 */
		int cont = 15;
				while (cont <= 200) {
					System.out.println(cont + " Elevado ao quadrado é " + Math.pow(cont, 2));
					cont++; //É o mesmo que cont = cont+1;
					
				}

	}

}
