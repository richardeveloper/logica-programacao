package br.com.estruturas.matriz;

import java.util.Random;

public class Exercicio10 {
  public static void main(String[] args) {
    Random random = new Random();

    int[][] matriz = new int[5][5];

    int somaLinha4 = 0;
    int somaColuna2 = 0;
    int somaDiagonalPrincipal = 0;
    int somaDiagonalSecundaria = 0;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        matriz[i][j] = random.nextInt(100);
      }
    }

    MatrizUtils.imprimirMatriz(matriz, "Matriz");

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        if (i == 4) {
          somaLinha4 += matriz[i][j];
        }

        if (j == 2) {
          somaColuna2 += matriz[i][j];
        }

        if (i == j) {
          somaDiagonalPrincipal += matriz[i][j];
        }

        if (i + j == matriz.length - 1) {
          somaDiagonalSecundaria += matriz[i][j];
        }

      }
    }

    System.out.println("Soma elementos da linha 4: " + somaLinha4);
    System.out.println("Soma elementos da coluna 2: " + somaColuna2);
    System.out.println("Soma elementos da diagonal principal: " + somaDiagonalPrincipal);
    System.out.println("Soma elementos da diagonal secundária: " + somaDiagonalSecundaria);

  }
}
