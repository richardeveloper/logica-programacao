package br.com.estruturas.matriz;

import java.util.Random;

public class Exercicio08 {
  public static void main(String[] args) {
    Random random = new Random();

    int[][] matriz1 = new int[3][8];
    int[][] matriz2 = new int[3][8];
    int[][] matrizResultate1 = new int[3][8];
    int[][] matrizResultate2 = new int[3][8];

    for (int i = 0; i < matriz1.length; i++) {
      for (int j = 0; j < matriz1[0].length; j++) {
        matriz1[i][j] = random.nextInt(100);
        matriz2[i][j] = random.nextInt(100);
      }
    }

    MatrizUtils.imprimirMatriz(matriz1, "Matriz 1");
    MatrizUtils.imprimirMatriz(matriz2, "Matriz 2");

    for (int i = 0; i < matriz1.length; i++) {
      for (int j = 0; j < matriz1[0].length; j++) {
        matrizResultate1[i][j] = matriz1[i][j] + matriz2[i][j];
        matrizResultate2[i][j] = matriz1[i][j] - matriz2[i][j];
      }
    }

    MatrizUtils.imprimirMatriz(matrizResultate1, "Matriz Resultante 1");
    MatrizUtils.imprimirMatriz(matrizResultate2, "Matriz Resultante 2");
  }
}
