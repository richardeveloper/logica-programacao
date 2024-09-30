package br.com.estruturas.matriz;

import java.util.Random;

public class Exercicio02 {
  public static void main(String[] args) {
    Random random = new Random();

    int[][] matriz = new int[2][4];

    int quantidadeLinha = 0;

    int quantidadePares = 0;
    int mediaPares = 0;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = random.nextInt(100);
      }
    }

    MatrizUtils.imprimirMatriz(matriz, "Matriz");

    System.out.println("Números entre 12 e 20: ");
    for (int i = 0; i < matriz.length; i++) {
      System.out.print("Linha " + i + ": ");
      for (int j = 0; j < matriz[i].length; j++) {

        if (matriz[i][j] >= 12 && matriz[i][j] <= 20) {
          quantidadeLinha++;
        }

        if (matriz[i][j] % 2 == 0) {
          mediaPares += matriz[i][j];
          quantidadePares++;
        }
      }
      System.out.print(quantidadeLinha);
      System.out.println();
      quantidadeLinha = 0;
    }

    System.out.println();

    System.out.println("Média dos números pares: " + mediaPares / quantidadePares);
  }
}
