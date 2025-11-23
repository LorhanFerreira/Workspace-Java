package controller;

import util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que calcule e apresente a quantidade de litros que um automóvel gastará em uma viagem. O
programa deve coletar as seguintes informações: Distância a percorrer na viagem, em quilômetros; qual é o
valor do consumo médio do automóvel, em quilômetros por litro.

		 */
double distancia, consumo, litro;

distancia = Teclado.lerDouble("Digite a distância a ser percorrida na viagem (Em km): ");
consumo = Teclado.lerDouble("Informe o consumo médio do seu carro (Em km por litro): ") ;
litro = distancia/consumo;
System.out.println("Você precisará de " + litro + " litros de combustível.");



	}

}
