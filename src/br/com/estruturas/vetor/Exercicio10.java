package br.com.estruturas.vetor;

import java.util.Random;

public class Exercicio10 {
  public static void main(String[] args) {
    Random random = new Random();

    int[] vetor1 = new int[10];
    int[] vetor2 = new int[5];

    int[] vetorResultante1 = new int[10];
    int[] vetorResultante2 = new int[10];

    for (int i = 0; i < vetor1.length; i++) {
      vetor1[i] = random.nextInt(100) + 1;
    }

    for (int i = 0; i < vetor2.length; i++) {
      vetor2[i] = random.nextInt(100) + 1;
    }

    VetorUtils.imprimirVetor(vetor1, "1");

    VetorUtils.imprimirVetor(vetor2, "2");

    for (int i = 0; i < vetor1.length; i++) {
      if (vetor1[i] % 2 == 0) {
        for (int j = 0; j < vetor2.length; j++) {
          vetorResultante1[i] += vetor1[i] + vetor2[j];
        }
      }
      else {
        for (int j = 0; j < vetor2.length; j++) {
          if (vetor1[i] % vetor2[j] == 0) {
            vetorResultante2[i]++;
          }
        }
      }
    }

    VetorUtils.imprimirVetor(vetorResultante1, "Vetor resultante 1");
    VetorUtils.imprimirVetor(vetorResultante2, "Vetor resultante 2");
  }
}
