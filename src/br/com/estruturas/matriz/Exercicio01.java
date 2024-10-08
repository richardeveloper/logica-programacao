package br.com.estruturas.matriz;

import java.util.Random;

public class Exercicio01 {
  public static void main(String[] args) {
    Random random = new Random();

    int[][] matriz = new int[3][5];

    int quantidadeNumeros = 0;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = random.nextInt(100);
        if (matriz[i][j] >= 15 && matriz[i][j] <= 20) {
          quantidadeNumeros++;
        }
      }
    }

    MatrizUtils.imprimirMatriz(matriz, "Matriz");

    System.out.println();

    System.out.println("Números entre 15 e 20: " + quantidadeNumeros);
  }
}
