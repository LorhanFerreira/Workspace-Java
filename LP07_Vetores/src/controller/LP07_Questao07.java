package controller;

import util.Teclado;

public class LP07_Questao07 {

	public static void main(String[] args) {
		/*
		 * Crie um vetor chamado semana com 7 elementos já contendo todos os nomes por
		 * extenso dos dias da semana. Em seguida pergunte ao usuário um número e
		 * apresente o dia correspondente ao número no vetor, ou exiba a mensagem
		 * “Número não corresponde a um dia da semana.”
		 */
		
		String semana[] = new String[] {"Domingo", "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado"};
		
		int num;
		
		num = Teclado.lerInt("Favor, informe um número correspondente ao dia da semana: ");
		if(num>=1 && num<=7) {
			System.out.println(semana[num-1]);
		}
		else {
			System.out.println("Número não corresponde a um dia da semana.");
		}
	}

}
