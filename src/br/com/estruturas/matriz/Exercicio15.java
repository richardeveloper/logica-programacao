package br.com.estruturas.matriz;

import java.util.Random;

public class Exercicio15 {
  public static void main(String[] args) {
    Random random = new Random();

    int[][] matriz = new int[12][23];

    int maiorElemento = 0;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = random.nextInt(1000);
      }
    }

    MatrizUtils.imprimirMatriz(matriz, "Matriz");

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (matriz[i][j] > maiorElemento) {
          maiorElemento = matriz[i][j];
        }
      }
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = matriz[i][j] / maiorElemento;
      }
    }

    MatrizUtils.imprimirMatriz(matriz, "Matriz");
  }
}
