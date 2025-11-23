package controller;

import util.Teclado;

public class Exemplo01 {
 
 /*
  * Elabore uma matriz 5x3 e pergunte ao usuário nomes de pessoas
  * para preencher a matriz.
  * Ao final, exiba todo o conteúdo da matriz.
  */
 public static void main(String[] args) {
  
  //Criando a matriz
  String matriz[][] = new String[5][3];
  
  for ( int linha = 0 ; linha < 5 ; linha ++ ) {
   for ( int col = 0 ; col < 3; col++ ) {
    matriz[linha][col] = Teclado.lerTexto("Matriz["+ linha + "][" + col + "]: Nome?");
   }// fim do for col
  }// fim do for linha
  
  System.out.println("---- Exibindo o conetúdo da matriz -----");
  for ( int linha = 0 ; linha < 5 ; linha ++ ) {
   for ( int col = 0 ; col < 3; col++ ) {
    System.out.println("[" + linha + "][" + col + "] : " +  matriz[linha][col]);
    //System.out.println(matriz[linha][col]);
   }// fim do for col
  }// fim do for linha
 }
}