package controller;

import util.Teclado;

public class Questao07 {

	public static void main(String[] args) {
		/*
		 * Fazer um algoritmo que pergunte 3 números e apresente a média aritmética entre estes 3 números.
		 */
double n1, n2, n3, m;

n1 = Teclado.lerDouble("Informe sua primeira nota: ");
n2 = Teclado.lerDouble("Informe sua segunda nota: ");
n3 = Teclado.lerDouble("Informe sua terceira nota: ");
m = (n1+n2+n3)/3;

System.out.println("A média entre essas três notas equivale a " + m);

	}

}
