package controller;

import util.Teclado;

public class DesvioCondicionalSimples {

	public static void main(String[] args) {
		
		int idade;
		
		idade = Teclado.lerInt("Informe sua idade: ");
		
		if (idade >= 18) {
			System.out.println("Você pode tirar CNH.");
		}

	}

}
