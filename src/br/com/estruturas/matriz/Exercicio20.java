package br.com.estruturas.matriz;

import java.util.Random;

public class Exercicio20 {
  public static void main(String[] args) {
    Random random = new Random();

    double[][] matriz = new double[5][5];

    double maiorElemento = 0.0;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = random.nextDouble() * 10.0;
      }
    }

    MatrizUtils.imprimirMatriz(matriz, "Matriz", "%.1f");

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (matriz[i][j] > maiorElemento) {
          maiorElemento = matriz[i][j];
        }
      }
    }

    System.out.println(maiorElemento);

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (i == j) {
          matriz[i][j] = matriz[i][j] * maiorElemento;
        }
      }
    }

    MatrizUtils.imprimirMatriz(matriz, "Matriz Resultante", "%.1f");
  }
}
