package controller;

import util.Teclado;

public class L51_Questao06 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que leia um número n qualquer menor ou igual a 50 e
		 * apresente o valor obtido da multiplicação sucessiva de n por 3 enquanto o
		 * produto for menor que 250. (n x 3; n x 3 x 3; n x 3 x 3 x 3 etc...).
		 */
		int n, produto;
		
		n = Teclado.lerInt("Informe um número menor ou igual a 50: ");
		if (n <= 50){
			while (n<=250) {
				System.out.println(n);
				produto = n;
			n = produto * 3;
			

	} 
		}else {
		System.out.println("Número inválido. Por favor, insira um número menor ou igual a 50. ");
		}
	}
		

}
