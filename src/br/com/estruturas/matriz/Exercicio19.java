package br.com.estruturas.matriz;

import java.util.Random;

public class Exercicio19 {
  public static void main(String[] args) {
    Random random = new Random();

    int[][] matriz = new int[8][6];

    int media = 0;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = random.nextInt(100);
      }
    }

    MatrizUtils.imprimirMatriz(matriz, "Matriz");

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (i % 2 == 0) {
          media += matriz[i][j];
        }
      }
      if (i % 2 == 0) {
        System.out.println("Média linha " + i + ": " + media / matriz.length);
      }
      media = 0;
    }
  }
}
