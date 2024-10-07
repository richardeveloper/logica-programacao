package br.com.estruturas.matriz;

import java.util.Random;

public class Exercicio03 {
  public static void main(String[] args) {
    Random random = new Random();

    int[][] matriz = new int[6][3];

    int maiorElemento = 0, maiorElementoLinha = 0, maiorElementoColuna = 0;
    int menorElemento = Integer.MAX_VALUE, menorElementoLinha = 0, menorElementoLinhaColuna = 0;

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
          maiorElementoLinha = i;
          maiorElementoColuna = j;
        }

        if (matriz[i][j] < menorElemento) {
          menorElemento = matriz[i][j];
          menorElementoLinha = i;
          menorElementoLinhaColuna = j;
        }
      }
    }

    System.out.println("Maior Elemento: " + maiorElemento);
    System.out.printf("Posição: [%d][%d] %n", maiorElementoLinha, maiorElementoColuna);

    System.out.println();

    System.out.println("Menor Elemento: " + menorElemento);
    System.out.printf("Posição: [%d][%d] %n", menorElementoLinha, menorElementoLinhaColuna);
  }
}
