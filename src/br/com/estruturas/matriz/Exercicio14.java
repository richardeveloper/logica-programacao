package br.com.estruturas.matriz;

import java.util.Random;

public class Exercicio14 {
  public static void main(String[] args) {
    Random random = new Random();

    int[][] matriz = new int[2][3];

    int quantidadeForaIntervalo = 0;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = random.nextInt(30);
      }
    }

    MatrizUtils.imprimirMatriz(matriz, "Matriz");

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (matriz[i][j] < 5 || matriz[i][j] > 15) {
          quantidadeForaIntervalo++;
        }
      }
    }

    System.out.println("Quantidade de elementos fora do intervalo 5-15: " + quantidadeForaIntervalo);
  }
}
