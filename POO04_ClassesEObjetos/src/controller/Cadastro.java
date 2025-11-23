package controller;

import model.Carro;
import model.Funcionario;
import model.Livro;
import model.Produto;

public class Cadastro {

	public static void main(String[] args) {
		Carro Tracker = new Carro();
		
		Tracker.Fabricante = "Chevrolet";
		Tracker.Modelo = "SUV";
		Tracker.Cor = "Branco";
		Tracker.Ano = 2024;
		
		System.out.println("---Carro---");
		System.out.println("Fabricante: " + Tracker.Fabricante);
		System.out.println("Modelo: " + Tracker.Modelo);
		System.out.println("Cor: " + Tracker.Cor);
		System.out.println("Ano: " + Tracker.Ano);
		
		Carro uno = new Carro();
		
		uno.Fabricante = "Fiat";
		uno.Modelo = "miller";
		uno.Cor = "vermelho";
		uno.Ano = 2010;
		
		System.out.println("\nFabricante: " + uno.Fabricante);
		System.out.println("Modelo: " + uno.Modelo);
		System.out.println("Cor: " + uno.Cor);
		System.out.println("Ano: " + uno.Ano);
		
		Carro Camaro = new Carro();
		
		Camaro.Fabricante = "Chevrolet";
		Camaro.Modelo = "SUV";
		Camaro.Cor = "Amarelo";
		Camaro.Ano = 2024;
		
		System.out.println("\nFabricante: " + Camaro.Fabricante);
		System.out.println("Modelo: " + Camaro.Modelo);
		System.out.println("Cor: " + Camaro.Cor);
		System.out.println("Ano: " + Camaro.Ano);
		
		Funcionario user = new Funcionario();
		user.matricula = 3214567;
		user.nome = "Carlos Andrade";
		user.cpf = "17233612747";
		
		System.out.println("\n---Funcionário---");
		System.out.println("Matrícula:" + user.matricula);
		System.out.println("Nome: " + user.nome);
		System.out.println("CPF: " + user.cpf);
		
		Livro Livro1 = new Livro();
		
		Livro1.isbn = 12234;
		Livro1.nome = "Código da Vinci";
		Livro1.autor = "Dan Brown";
		Livro1.editora = "Arqueiro";
		
		System.out.println("\n ---Livro---");
		System.out.println("ISBN: " + Livro1.isbn);
		System.out.println("Nome: " + Livro1.nome);
		System.out.println("Autor: " + Livro1.autor);
		System.out.println("Editora: " + Livro1.editora);
		
		Produto Cloro = new Produto();
		
		Cloro.nomenclatura = "Veja";
		Cloro.id = 324567;
		Cloro.descricao = "Produto remove mancha e limpa demais.";
		Cloro.quantidade = 35;
		
		System.out.println("\n---Produto---");
		System.out.println("ID:" + Cloro.id);
		System.out.println("Nomeclatura:" + Cloro.nomenclatura);
		System.out.println("ID:" + Cloro.descricao);
		System.out.println("Quantidade:" + Cloro.quantidade);

		

	}

}
