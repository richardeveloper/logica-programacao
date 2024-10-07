package br.com.estruturas.matriz;

import java.util.Random;

public class Exercicio23 {
  public static void main(String[] args) {
    Random random = new Random();

    int[][] matriz = new int[3][4];

    int quantidadePares = 0, somaImpares = 0, mediaElementos = 0, totalElementos = 0;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = random.nextInt(100);
      }
    }

    MatrizUtils.imprimirMatriz(matriz, "Matriz");

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (matriz[i][j] % 2 == 0) {
          quantidadePares++;
        }
        else {
          somaImpares += matriz[i][j];
        }

        mediaElementos += matriz[i][j];
        totalElementos++;
      }
    }

    System.out.println("Quantidade de elementos pares: " + quantidadePares);
    System.out.println("Soma dos elementos ímpares: " + somaImpares);
    System.out.println("Média dos elementos: " + (mediaElementos / totalElementos));
  }
}
