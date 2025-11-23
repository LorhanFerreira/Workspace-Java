package controller;

import util.Teclado;

public class L061_Questao01 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que mostre o menu de opções da tabela abaixo e peça o
		 * código desejado. Mostre como resposta uma mensagem confirmando a escolha do
		 * usuário, ou que o número digitado não existe no menu de opções.
		 *
		 * Código de opção:
		 1 Incluir
		 2 Alterar
		 3 Excluir
		 4 Pesquisar
		 5 Sair
		 */
		int cod;
		
		System.out.println(" ----- Menu de Opções -----");
		System.out.println("- Código     Opção");
		System.out.println("-   1        Incluir");
		System.out.println("-   2        Alterar");
		System.out.println("-   3        Excluir");
		System.out.println("-   4        Pesquisar");
		System.out.println("-   5        Sair");
		
		cod = Teclado.lerInt("\nInforme o código da ação desejada: ");
		switch ( cod ) {
		case 1:
			System.out.println("Ação escolhida: Incluir");
			break;
		case 2:
			System.out.println("Ação escolhida: Alterar");
			break;
		case 3:
			System.out.println("Ação escolhida: Excluir");
			break;
		case 4:
			System.out.println("Ação escolhida: Pesquisar");
			break;
		case 5:
			System.out.println("Ação escolhida: Sair");
			break;
		default:
			System.out.println("ERRO: Código Inexistente");
			break;
		
		
		

	}

}
}
