package controller;

import util.Teclado;

public class LP07_Questao08 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que armazene nome e nota das PR1 e PR2 de 15 alunos,
		 * calcule e armazene a média, armazene também a situação do aluno (AP ou RP).
		 * Exibir ao final uma listagem contendo nomes, notas, médias e situação de cada
		 * aluno.
		 */
		
		double media[] = new double [15];
		String aluno[] = new String [15];
		double pr1[] = new double [15];
		double pr2[] = new double [15];
		String situacao [] = new String[15];
		
		
		for ( int cont = 0 ; cont<15 ; cont++) {
			System.out.println("---- Aluno " + (cont+1) + " ----");
			aluno[cont] = Teclado.lerTexto("Favor, informe seu nome:");
			pr1[cont] = Teclado.lerDouble("Favor, informe sua nota da prova 1: ");
			pr2[cont] = Teclado.lerDouble("Favor, informe sua nota da prova 2: ");
			media[cont] = (pr1[cont] + pr2[cont])/2;
			
			if (media[cont] >=7) {
				situacao[cont] = "Aprovado";
			} else {
				situacao[cont] = "Reprovado";
			}
			
		}
		System.out.println("\n---RELATÓRIO SITUAÇÃO DOS ALUNOS---\n");
		for ( int cont = 0 ; cont<15 ; cont++) {
			System.out.println("\nNome:" + aluno[cont]);
			System.out.println("PR1:" + pr1[cont]);
			System.out.println("PR2:" + pr2[cont]);
			System.out.println("Média:" + media[cont]);
			System.out.println("Situação:" + situacao[cont]);
			
			
		}
		

	}

}
