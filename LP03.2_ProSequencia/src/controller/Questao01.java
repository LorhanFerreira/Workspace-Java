package controller;

import util.Teclado;

public class Questao01 {

	public static void main(String[] args) {
		/*
		 * ) Desenvolver um programa que pergunte o valor da conta a ser paga no restaurante e exiba como resposta o
valor com o acréscimo dos 10% da gorjeta do garçom.
		 */
		double valor;
		
		valor = Teclado.lerDouble("Qual é o valor da conta? ");
		
		System.out.println("O valor total com os 10% da gorjeta do garçom é R$" + valor*1.10);
	}

}
