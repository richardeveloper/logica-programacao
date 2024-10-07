package br.com.estruturas.matriz;

import java.util.Random;

public class Exercicio17 {
  public static void main(String[] args) {
    Random random = new Random();

    int[][] matriz = new int[10][10];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = random.nextInt(100);
      }
    }

    MatrizUtils.imprimirMatriz(matriz, "Matriz");

    System.out.println("Diagonal Principal: ");
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (i == j) {
          System.out.print(matriz[i][j] + " ");
        }
      }
    }
  }
}
