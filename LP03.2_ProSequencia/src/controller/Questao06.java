package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		/*
		 * Fazer um algoritmo que pergunte o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por
ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
exibir ao final o seu nome, o salário fixo, a comissão e o salário completo (fixo + comissão sobre vendas) no final
do mês.
		 */
		String nome;
		double sal, vendasTotal, comissao;
	nome = Teclado.lerTexto("Informe seu nome: ");
	sal = Teclado.lerDouble("Informe seu salário: ");
	vendasTotal = Teclado.lerDouble("Informe o total de vendas efetuadas no mês por você: ");
	comissao = vendasTotal*0.15;
	
	System.out.println("Olá, " + nome + "!");
	System.out.println("Seu salário fixo é: R$" + sal);	
	System.out.println("Sua comissão é: R$" + comissao);
	System.out.println("Seu salário completo equivale a: R$" + (sal+comissao));

	}

}
