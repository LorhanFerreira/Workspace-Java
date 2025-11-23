package controller;

import util.Teclado;

public class LP07_Questao12 {

	public static void main(String[] args) {
		/*
		 * Crie dois vetores a e b com 5 elementos cada e preencha-os com números
		 * informados pelo usuário. Ao final apresente os números que existem repetidos
		 * entre os 2 vetores.
		 */
		
		int a[] = new int [5];
		int b[] = new int [5];
		
		System.out.println("Vetor A");
		for (int cont = 0 ; cont<5 ; cont++) {
			a[cont] = Teclado.lerInt("Informe um número: ");
		}
		System.out.println("Vetor B");
		for (int cont = 0 ; cont<5 ; cont++) {
			b[cont] = Teclado.lerInt("Informe um número: ");
		}
		
		System.out.println("Números em comuns do Vetor A com o B");
		for (int contA = 0 ; contA<5 ; contA++) {
			for ( int contB = 0 ; contB<5 ; contB++) {
				if (a[contA] == b[contB]) {
					System.out.println(a[contA]);
				}
			}
				
			

	}

	}
}
