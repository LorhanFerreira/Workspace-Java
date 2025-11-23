package controller;

import util.Teclado;

public class LP081_Questao01 {
 
 /*
  * 1) Desenvolver um programa que crie uma matriz 
  * com 5 linhas e 3 colunas. Pergunte ao usuário o 
  * conteúdo desta matriz e ao final exiba a matriz inteira.
  */

 public static void main(String[] args) {
  
  //Criando a matriz [linhas][colunas]
  int mat[][] = new int[5][3];
  
  for ( int lin = 0 ; lin < 5 ; lin ++ ) {
   for ( int col = 0 ; col < 3 ; col++ ) {
    mat[lin][col] = Teclado.lerInt("Mat["+ lin + "][" + col + "]: Número? ");
   }// fim do for col
  }// fim do for lin
  
  System.out.println("--- Exibindo a Matriz ---");
  for ( int lin = 0 ; lin < 5 ; lin ++ ) {
   for ( int col = 0 ; col < 3 ; col++ ) {
    System.out.print( mat[lin][col] + " ");
   }// fim do for col
   System.out.println();//pular linha
  }// fim do for lin
 }
}