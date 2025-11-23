package controller;
import java.util.Scanner;

public class Teste {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int[] valores = new int[10];
        int i, numero, soma = 0;

        for (i = 0; i < 5; i++) {
            System.out.println("Informe um número:");
            numero = entrada.nextInt();
            valores[i] = numero;
        }

        for (i = 0; i < 5; i++) {
            soma += valores[i];
        }

        System.out.println(soma);
    }
}