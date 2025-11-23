package controller;

public class Questao05 {

	public static void main(String[] args) {
		/*
		 * Fazer um algoritmo com do..while que exiba o valor da soma dos números pares
		 * que existem no intervalo de 0 a 50. 
		 */
		
		int cont = 0;
		
		do {
			if (cont % 2 ==0) {
				System.out.println(cont);
			}
			
			cont++;
			
		} while (cont<52);

	}

}
