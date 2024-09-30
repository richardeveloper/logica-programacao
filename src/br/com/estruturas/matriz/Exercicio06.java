package br.com.estruturas.matriz;

import br.com.estruturas.vetor.VetorUtils;
import java.util.Random;

public class Exercicio06 {
  public static void main(String[] args) {
    Random random = new Random();

    int[][] matriz = new int[20][10];
    int[] soma = new int[10];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = random.nextInt(100);
      }
    }

    MatrizUtils.imprimirMatriz(matriz, "Matriz");

    for (int i = 0; i < matriz[i].length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        soma[i] += matriz[j][i];
      }
    }

    VetorUtils.imprimirVetor(soma, "Soma");
  }
}
