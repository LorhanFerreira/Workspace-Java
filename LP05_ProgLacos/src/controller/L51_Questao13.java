package controller;

public class L51_Questao13 {

	public static void main(String[] args) {
		/*
		 * ) Desenvolver um programa que imprima a tabuada de 3 a 6.
		 * 3x0 a 3x10, 4x0 a 4x10, 5x0, 5x10, 6x0, 6x10.
		 */
		for (int i = 3; i <= 6; i++) {
            System.out.println("Tabuada do " + i + ":");

            // Iterar de 0 a 10 para cada número da tabuada
            for (int j = 0; j <= 10; j++) {
                // Calcular e imprimir o resultado da multiplicação
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            // Adicionar uma linha em branco para separar as tabuadas
            System.out.println();
        }
		
		
	}

}
