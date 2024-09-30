package br.com.estruturas.matriz;

import java.util.Random;

public class Exercicio07 {
  public static void main(String[] args) {
    Random random = new Random();

    int[][] matriz1 = new int[4][6];
    int[][] matriz2 = new int[6][4];

    for (int i = 0; i < matriz1.length; i++) {
      for (int j = 0; j < matriz1[0].length; j++) {
        matriz1[i][j] = random.nextInt(100);
        matriz2[j][i] = random.nextInt(100);
      }
    }

    MatrizUtils.imprimirMatriz(matriz1, "Matriz 1");
    MatrizUtils.imprimirMatriz(matriz2, "Matriz 2");

    for (int i = 0; i < matriz1.length; i++) {
      for (int j = 0; j < matriz1[0].length; j++) {
        System.out.printf("%d + %d = %d %n", matriz1[i][j], matriz2[j][i], (matriz1[i][j] + matriz2[j][i]));
      }
    }
  }
}
