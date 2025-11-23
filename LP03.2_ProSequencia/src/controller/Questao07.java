package controller;

import util.Teclado;

public class Questao07 {

	public static void main(String[] args) {
		/*
		 * A Loja Mamão com Açúcar está vendendo seus produtos em até 10 prestações sem juros. Faça um algoritmo que
pergunte um valor de uma compra, o número de prestações escolhidas e apresente como resultado o valor das
prestações.
		 */
		double valorCompra;
		int prestacao;
		
		valorCompra = Teclado.lerDouble("Favor, informe o valor da compra: R$");
		prestacao = Teclado.lerInt("Favor, informe o número de prestações: ");
		
		System.out.println("O valor das prestações é R$" + (valorCompra/prestacao));
		
	}

}
