package controller;

import util.Teclado;

public class L061_Questao02 {
	
	public static void main(String[] args) {
		
		/*
		 * Desenvolver um programa que pergunte o sexo da pessoa e dê como resposta a
		 * seguinte orientação de acordo com o sexo informado: “Banheiro masculino à
		 * direita” ou “Banheiro feminino à esquerda”.
		 */
		
		String sexo;
		sexo = Teclado.lerTexto("Informe o seu sexo: (M ou F)");
		
		switch ( sexo ) {
		case "M":
			System.out.println("Banheiro Masculino à direita");
			break;
		case "F":
			System.out.println("Banheiro Feminino à esquerda");
			break;
		default:
			System.out.println("Não foi possivel identificar");
			break;
		}
		
	}

}