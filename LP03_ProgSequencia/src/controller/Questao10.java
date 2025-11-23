package controller;

import util.Teclado;

public class Questao10 {

	public static void main(String[] args) {
/*
 * ) Fazer um algoritmo que efetue o cálculo do valor de uma prestação em atraso, utilizando a fórmula prestação	=	
valor	+	(valor	x	(taxa	:	100)	x	tempo	em	dias).
 */
		double prestacao, valor, taxa, tempo;
	
		valor = Teclado.lerDouble("Insira o valor da prestação:");
		taxa = Teclado.lerDouble("Qual é a taxa de juros?");
		tempo = Teclado.lerDouble("Quantos dias de atraso? ");
		prestacao = valor + (valor* (taxa/100) * tempo);
		System.out.println("O valor da prestação em atraso é R$" + prestacao );
	}

}
