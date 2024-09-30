package br.com.estruturas.vetor;

import java.util.Random;

public class Exercicio25 {
  public static void main(String[] args) {
    Random random = new Random();

    int[] vetor1 = new int[15];
    int[] vetorResultante = new int[15];

    int maiorNumero = 0;

    for (int i = 0; i < vetor1.length; i++) {
      vetor1[i] = random.nextInt(100) + 1;
    }

    VetorUtils.imprimirVetor(vetor1, "Vetor 1");

    for (int i = 0; i < vetor1.length; i++) {
      if (vetor1[i] > maiorNumero) {
        maiorNumero = vetor1[i];
      }
    }

    for (int i = 0; i < vetorResultante.length; i++) {
      vetorResultante[i] = vetor1[i] / maiorNumero;
    }

    VetorUtils.imprimirVetor(vetorResultante, "Vetor Resultante");
  }
}
