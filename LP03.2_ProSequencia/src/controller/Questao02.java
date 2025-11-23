package controller;

import util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que faça duas perguntas: o valor referente às horas atuais e o valor referente aos
minutos atuais. Exemplo, se agora são 09:35h o usuário deverá informar como resposta às horas atuais o valor
09 e como resposta aos minutos atuais o valor 35. Em seguida o programa deverá apresentar como resposta
quantos minutos já se passaram desde às 00:00h deste dia.
		 */
		int horas, minutos, totalMinutos;
		
		horas = Teclado.lerInt("Que horas são?");
		minutos = Teclado.lerInt("Quantos minutos?");
		totalMinutos = (horas * 60) + minutos;
		
		System.out.println("Já se passaram desde meia noite " + totalMinutos + " minutos");
		
	}

}
