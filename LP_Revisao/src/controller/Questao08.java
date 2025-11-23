package controller;

import util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que armazene 5 nomes de pessoas em um vetor, depois
		 * pergunte um nome, e se for encontrado, exibir a posição desse nome no vetor,
		 * caso contrário, exibir uma mensagem informando que o nome não está
		 * cadastrado.
		 */
		
		String nomes[] = {"Lorhan", "Lucas", "Luan", "Miguel", "Luana"};
		String nomePesquisado;
			 
		nomePesquisado = Teclado.lerTexto("Informe um nome para consulta no vetor: ");
		
		for ( int cont = 0 ; cont <5 ; cont++) {
			
			
			if (nomePesquisado.equals(nomes[cont])) {
				System.out.println("O nome " + nomePesquisado +" Foi encontrado na posição " + (cont) + " do vetor");
			}
			else if (nomePesquisado != nomes[cont]){
				System.out.println("Nome não encontrado no vetor.");
			}
			
			
		}

	}

}
