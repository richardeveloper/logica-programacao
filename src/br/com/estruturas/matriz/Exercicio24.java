package br.com.estruturas.matriz;

import br.com.estruturas.vetor.VetorUtils;
import java.util.Random;

public class Exercicio24 {
  public static void main(String[] args) {
    Random random = new Random();

    int[][] matriz = new int[4][5];
    int[] vetorResultante = new int[5];

    int somaColuna = 0;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = random.nextInt(10);
      }
    }

    MatrizUtils.imprimirMatriz(matriz, "Matriz");

    for (int i = 0; i < matriz[0].length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        somaColuna += matriz[j][i];
      }
      if (somaColuna > 10) {
        vetorResultante[i] = somaColuna;
      }
      somaColuna = 0;
    }

    int elementos = 0;
    for (int i = 0; i < vetorResultante.length; i++) {
      if (vetorResultante[i] < 10) {
        elementos++;
      }
    }

    if (elementos == vetorResultante.length) {
      System.out.println("Não existem elementos no vetor com valor superior que 10.");
      return;
    }

    VetorUtils.imprimirVetor(vetorResultante, "Vetor Resultante");
  }
}
