package br.com.estruturas.matriz;

import br.com.estruturas.vetor.VetorUtils;
import java.util.Random;

public class Exercicio16 {
  public static void main(String[] args) {
    Random random = new Random();

    int[][] matriz = new int[5][5];

    int[] vetor1 = new int[5];
    int[] vetor2 = new int[5];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = random.nextInt(1000);
      }
    }

    MatrizUtils.imprimirMatriz(matriz, "Matriz");

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        vetor1[j] += matriz[j][i];
        vetor2[j] += matriz[i][j];
      }
    }

    VetorUtils.imprimirVetor(vetor1, "Vetor 1");
    VetorUtils.imprimirVetor(vetor2, "Vetor 2");
  }
}
