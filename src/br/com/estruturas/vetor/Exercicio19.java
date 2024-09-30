package br.com.estruturas.vetor;

import java.util.Random;

public class Exercicio19 {
  public static void main(String[] args) {
    Random random = new Random();

    int[] vetor1 = new int[10];
    int[] vetor2 = new int[10];
    int[] vetorResultante = new int[10];

    for (int i = 0; i < vetor1.length; i++) {
      vetor1[i] = random.nextInt(50);
      vetor2[i] = random.nextInt(50);
      vetorResultante[i] = vetor1[i] * vetor2[i];
    }

    VetorUtils.imprimirVetor(vetor1, "Vetor 1");
    VetorUtils.imprimirVetor(vetor2, "Vetor 2");
    VetorUtils.imprimirVetor(vetorResultante, "Vetor Resultante");
  }
}
