package controller;

import util.Teclado;

public class LP07_Questao11 {

	public static void main(String[] args) {
		/*
		 * Crie um vetor a com 10 elementos e pergunte ao usuário 10 números para
		 * preencher este vetor. Ao final, apresente o maior e o menor valor informados,
		 * além da média dos 10 números informados.
		 */
		
		double a[] = new double [10];
		double  media, maior, menor, soma = 0;
		
		for (int cont = 0 ; cont<10 ; cont++) {
			a[cont] = Teclado.lerDouble("Informe um número: ");
			soma = soma + a[cont];
		}
		media = soma/10;
		maior = a[0];
		menor = a[0];
		
		for (int cont = 1 ; cont<10 ; cont++) {
			if (maior < a[cont]) {
				maior = a[cont];
			}
		}
		for (int cont = 1 ; cont<10 ; cont++) {
			if (menor > a[cont]) {
				menor = a[cont];
			}
		}
		System.out.println("\n----Informações dos dados informados----");
		System.out.println("\nMaior número informado: " + maior);
		System.out.println("Menor número informado: " + menor);
		System.out.println("Média dos números informados: " + media);
				
		
		
		}
		
		
	}

