package br.com.estruturas.matriz;

import java.util.Random;

public class Exercicio13 {
  public static void main(String[] args) {
    Random random = new Random();

    int[][] matriz = new int[6][4];

    int maiorElemento = 0;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = random.nextInt(10);
      }
    }

    MatrizUtils.imprimirMatriz(matriz, "Matriz");

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (matriz[i][j] > maiorElemento) {
          maiorElemento = matriz[i][j];
        }
      }
      for (int k = 0; k < matriz[i].length; k++) {
        matriz[i][k] = matriz[i][k] * maiorElemento;
      }
      maiorElemento = 0;
    }

    MatrizUtils.imprimirMatriz(matriz, "Matriz");
  }
}
