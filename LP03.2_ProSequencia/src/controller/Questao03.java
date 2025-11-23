package controller;

import util.Teclado;

public class Questao03 {

	public static void main(String[] args) {
		/*
		 * ) Desenvolver um programa que pergunte ao usuário o seu peso (em quilos) e sua altura (em metros). Ao final o
programa deverá exibir na tela para o usuário o valor do peso informado em gramas e a altura em centímetros.
		 */
		double peso, altura, gramas, centimetros;
		
		peso = Teclado.lerDouble("Favor, informar seu peso (Em quilos)");
		altura = Teclado.lerDouble("Favor, informar sua altura (Em metros)");
		gramas = peso * 1000;
		centimetros = altura * 100;
		System.out.println("Seu peso em gramas equivale a " + gramas + " gramas." + " Sua altura em centímetros é " + centimetros + " centímetros")
		;
	}

}
