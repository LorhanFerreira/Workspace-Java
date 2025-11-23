package controller;

import model.Usuario;

public class Cadastro {

	public static void main(String[] args) {
		
		//Instanciar objeto de usuário
		Usuario user = new Usuario();
		user.nome = "João da Silva Sauro";
		user.endereco = "Rua Sem Fim, 72";
		
		Usuario ana = new Usuario();
		ana.nome = "Ana da Silva";
		ana.endereco = "Rua do Começo, 37";
		
		System.out.println("---Dados do João---");
		System.out.println("Nome: " + user.nome);
		System.out.println("Endereço: " + user.endereco);
		
		System.out.println("\n---Dados da Ana---");
		System.out.println("Nome: " + ana.nome);
		System.out.println("Endereço: " + ana.endereco);
		
	}
		

	

}
