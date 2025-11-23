package controller;

import util.Teclado;

public class Questao05b {

	public static void main(String[] args) {
/*
 * Desenvolver um programa que pergunte 4 notas escolares de um aluno e exiba mensagem informando que o
aluno foi aprovado se a média escolar for maior ou igual a 7.
Em recuperação se a média estiver entre 4  e 6.9 ou reprovado se a média estiver abaixo de 4.
 */
		double n1, n2 ,n3, n4, media;
		
		n1 = Teclado.lerDouble("Informe a primeira nota: ");
		n2 = Teclado.lerDouble("Informe a segunda nota: ");
		n3 = Teclado.lerDouble("Informe a terceira nota: ");
		n4 = Teclado.lerDouble("Informe a quarta nota: ");
		media = (n1 + n2 + n3 + n4) / 4;
		
		if (media >=7 ) {
			System.out.println("Parabéns, você foi aprovado!");
		
		} else if(media >=4) {
			System.out.println("Recuperação!");
		} else {
			System.out.println("Reprovado!");
		}
	}

}
