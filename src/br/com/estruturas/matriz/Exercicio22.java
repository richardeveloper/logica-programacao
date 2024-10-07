package br.com.estruturas.matriz;

import java.util.Random;

public class Exercicio22 {
  public static void main(String[] args) {
    Random random = new Random();

    int[][] matriz = new int[6][10];
    int[][] matrizResultante = new int[7][10];

    int somaColuna = 0;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = random.nextInt(100);
      }
    }

    MatrizUtils.imprimirMatriz(matriz, "Matriz");

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matrizResultante[i][j] = matriz[i][j];
      }
    }

    for (int i = 0; i < matriz[0].length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        somaColuna += matriz[j][i];
      }
      matrizResultante[matrizResultante.length - 1][i] = somaColuna;
      somaColuna = 0;
    }

    MatrizUtils.imprimirMatriz(matrizResultante, "Matriz Resultante");
  }
}
