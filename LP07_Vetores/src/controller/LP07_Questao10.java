package controller;

import util.Teclado;

public class LP07_Questao10 {

	public static void main(String[] args) {
		/*
		 * ) Crie 3 vetores (nomes, telefones, endereços) e pergunte ao usuário o nome,
		 * telefone e endereço de 5 pessoas. Em seguida peça ao usuário para digitar um
		 * número de 1 a 5, e exibir como resposta os dados da pessoa cadastrada no
		 * número informado.
		 */
		
		String nome[] = new String [5];
		String telefone[] = new String [5];
		String endereco[] = new String [5];
		int num;
		
		for (int cont = 0 ; cont<5 ; cont++) {
			
			System.out.println("---Pessoa " + (cont+1) + "---");
			nome[cont] = Teclado.lerTexto("Favor, informe seu nome: ");
			endereco[cont] = Teclado.lerTexto("Informe seu endereco: ");
			telefone[cont] = Teclado.lerTexto("Informe seu número de telefone: ");
			System.out.println("------------------------------------");
			
		}
			num = Teclado.lerInt("Favor informe um número de 1 a 5: ");
			if (num>=1 && num<=5) {
				System.out.println("Pessoa cadastrada na posição " + num + ":");
				System.out.println("Nome: " + nome[num-1]);
				System.out.println("Telefone: " + telefone[num-1]);
				System.out.println("Endereço: " + endereco[num-1]);
				
			}else { System.out.println("Número não corresponde ao vetor. ");
				
			
		}

	}

}
