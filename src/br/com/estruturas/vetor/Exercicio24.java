package br.com.estruturas.vetor;

import java.util.Random;

public class Exercicio24 {
  public static void main(String[] args) {
    Random random = new Random();

    int[] vetor1 = new int[15];
    int[] vetorResultante = new int[15];

    for (int i = 0; i < vetor1.length; i++) {
      vetor1[i] = random.nextInt(100);
    }

    VetorUtils.imprimirVetor(vetor1, "Vetor 1");

    for (int i = 0; i < vetor1.length; i++) {
      int divisores = 0;

      for (int j = 1; j <= vetor1[i]; j++) {
        if (vetor1[i] % j == 0 ) {
          divisores++;
        }
      }

      if (divisores == 2) {
        vetorResultante[i] = vetor1[i];
      }
    }

    VetorUtils.imprimirVetor(vetorResultante, "Vetor Resultante");
  }
}
