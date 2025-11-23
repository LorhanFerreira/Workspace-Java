package controller;

import util.Teclado;

public class LP07_Questao13 {

	public static void main(String[] args) {
		/*
		 * ) Desenvolver um programa que armazene nome e salário de 20 pessoas, calcule
		 * e armazene o novo salário sabendo-se que houve um reajuste de 8%. Exibir uma
		 * listagem numerada com nome e novo salário.
		 */
		
		double salario[] = new double [20];
		double novoSalario[] = new double [20];
		String nome[] = new String [20];
		
		
		for (int cont = 0 ; cont < 20 ; cont++ ) {
			
			System.out.println("------Funcionário " + (cont+1) + "-----");
			nome[cont] = Teclado.lerTexto("Informe seu nome: ");
			salario[cont] = Teclado.lerDouble("Informe seu salário: ");
			novoSalario[cont]= salario[cont] * 8/100;
		}
		System.out.println("\n-----LISTA COM REAJUSTE DE 8% NO SALÁRIO DOS FUNCIONÁRIOS-----\n");
		
		for (int cont = 0 ; cont < 20 ; cont++) {
			System.out.println(nome[cont]);
			System.out.println("Novo salário:" + (novoSalario[cont] + salario[cont]));
			System.out.println();
		}
		
		

	}

}
