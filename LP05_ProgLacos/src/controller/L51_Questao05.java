package controller;

import util.Teclado;

public class L51_Questao05 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que apresente os resultados de uma tabela de um número qualquer. Ela deve ser
impressa no seguinte formato:
Considerando como exemplo o fornecimento do número 2
2 . 1 = 2
2 . 2 = 4
2 . 3 = 6
2 . 4 = 8
2 . 5 = 10
(...)
2 . 10 = 20
		 */
		int num, cont;
		
		num = Teclado.lerInt("Informe um número: ");
		
		cont = 1;
		
		while (cont <=10) {
			System.out.println(num + "." + cont + " = " + (num*cont));
			
			cont = cont + 1;
		}
		
		

	}

}
