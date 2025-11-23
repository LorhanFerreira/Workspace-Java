package controller;

import util.Teclado;

public class L53_Questao9 {

	public static void main(String[] args) {
		
		double quantidadeNotas, nota, soma = 0, media, cont = 1;
		quantidadeNotas = Teclado.lerDouble("Digite a quantidade de notas: ");
		
		while (cont <=quantidadeNotas) {
			nota = Teclado.lerDouble("Digite a nota " + cont + ":");
			soma+=nota;
			cont++;
		}
		media = soma /quantidadeNotas;
		System.out.println("A média aritmética das notas inseridadas é: " + media);
		
			}
			
		 
			
		
		

	}


