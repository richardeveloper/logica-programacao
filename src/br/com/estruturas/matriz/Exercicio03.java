package br.com.estruturas.matriz;

import java.util.Random;

public class Exercicio03 {
  public static void main(String[] args) {
    Random random = new Random();

    int[][] matriz = new int[6][3];

    int maiorElemento = 0;
    int linhaMaior = 0;
    int colunaMaior = 0;

    int menorElemento = Integer.MAX_VALUE;
    int linhaMenor = 0;
    int colunaMenor = 0;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = random.nextInt(100);
      }
    }

    MatrizUtils.imprimirMatriz(matriz, "Matriz");

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (matriz[i][j] > maiorElemento) {
          maiorElemento = matriz[i][j];
          linhaMaior = i;
          colunaMaior = j;
        }

        if (matriz[i][j] < menorElemento) {
          menorElemento = matriz[i][j];
          linhaMenor = i;
          colunaMenor = j;
        }
      }
    }

    System.out.println("Maior Elemento: " + maiorElemento);
    System.out.printf("Posição: [%d][%d] %n", linhaMaior, colunaMaior);

    System.out.println();

    System.out.println("Menor Elemento: " + menorElemento);
    System.out.printf("Posição: [%d][%d] %n", linhaMenor, colunaMenor);
  }
}
