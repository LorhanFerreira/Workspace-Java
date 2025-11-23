package controller;

public class L51_Questao04 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que apresente o valor da soma dos cem primeiros números inteiros (1 + 2 + 3 + 4 + ...
+ 97 + 98 + 99 + 100)
		 */
		int contador, acumulador;
		
		contador = 1;
		acumulador = 0;
		while (contador <=100) {
			acumulador = acumulador + contador;
			contador = contador + 1;
			
		} System.out.println("A soma dos cem primeiros números é " + acumulador);

	}

}
