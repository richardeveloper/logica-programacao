package br.com.estruturas.matriz;

import java.util.Random;

public class Exercicio21 {
  public static void main(String[] args) {
    Random random = new Random();

    int[][] matriz = new int[5][5];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = random.nextInt(100);
      }
    }

    MatrizUtils.imprimirMatriz(matriz, "Matriz");

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (i == j) {
          for (int k = 0; k < matriz[i].length; k++) {
            matriz[i][k] = matriz[i][k] * matriz[i][j];
          }
        }
      }
    }

    MatrizUtils.imprimirMatriz(matriz, "Matriz");
  }
}
