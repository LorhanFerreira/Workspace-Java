package controller;

import util.Teclado;

public class Questao04 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte ao usuário o seu peso e sua altura. Ao final o programa deverá exibir na
tela o valor do índice de massa corporal desta pessoa (IMC).
Fórmula: IMC = peso / altura2
 - Obs: peso em quilos e altura em metros.
		 */
		double peso, altura, indCorp;
		
		peso = Teclado.lerDouble("Favor informe seu peso (em quilos): ");
		altura = Teclado.lerDouble("Favor informe sua altura (em metros): ");
		indCorp = peso/(altura * altura);
		
		System.out.println("Seu índice de massa corporal é igual a " + indCorp);
		
		

	}

}
