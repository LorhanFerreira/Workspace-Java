package controller;

import util.Teclado;

public class DesvioCondicionalEncadeado {

	public static void main(String[] args) {
		
		double salario, salFinal;
		
		salario = Teclado.lerDouble("Informe o salário do funcionário: ");
		if (salario <500) {
			salFinal = salario * 1.15;
		} else {
			if (salario <=1000 ) {
				salFinal = salario * 1.10;
			} else {
				salFinal = salario * 1.05;
			}
		}
		System.out.println("O salário reajustado será de R$" + salFinal);

	}
	}

	
