package br.com.estruturas.matriz;

import java.util.Random;

public class Exercicio18 {
  public static void main(String[] args) {
    Random random = new Random();

    double[][] matriz = new double[5][5];

    double somaDiagonalSecundaria = 0;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = random.nextDouble() * 100.00;
      }
    }

    MatrizUtils.imprimirMatriz(matriz, "Matriz", "%.1f");

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if ((i + j) == matriz[i].length - 1) {
          somaDiagonalSecundaria += matriz[i][j];
        }
      }
    }

    System.out.printf("Soma dos elementos da diagonal secundária: %.1f", somaDiagonalSecundaria);
  }
}
