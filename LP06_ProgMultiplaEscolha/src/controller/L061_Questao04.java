package controller;

import util.Teclado;

public class L061_Questao04 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte a sigla do estado onde a pessoa reside,
		 * e apresente uma das seguintes alternativas como resposta: Carioca, Paulista,
		 * Mineiro, Outros Estados.	
		 */
		
		String estado;
		
		estado = Teclado.lerTexto("Favor, informe a sigla do estado em que você reside: ");
		
		switch (estado.toUpperCase()) {
		
		case "RJ": 
			System.out.println("Você é carioca");
		break;
		
		case "SP": 
			System.out.println("Você é paulista");
		break;
		
		case "MG": 
			System.out.println("Você é mineiro");
		break;
		
		default: 
			System.out.println("Outros estados");
		

	}

}
	}
