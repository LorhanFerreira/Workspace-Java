package controller;

import util.Teclado;

public class ExemploVetor2 {

	public static void main(String[] args) {
		/*
		 * Crie um vetor a do tipo inteiro, contendo os números 4, 17 33, 99 117.
		 * Ao final, exiba os números existentes nesse vetor.
		 */
		
		int a[] = {4, 17, 33, 99, 117 };//Criado um vetor chamado a, int, com 5 casas (de 0 a 4)
		
		a[0] = 4;
		a[1] = 17;
		a[2] = 33;
		a[3] = 99;
		a[4] = 117;
		
		for (int cont = 0 ; cont <= 4; cont++) {
			System.out.println("a[" + cont+ ") = " + a[cont]);
		}
		
		
		

}
}
