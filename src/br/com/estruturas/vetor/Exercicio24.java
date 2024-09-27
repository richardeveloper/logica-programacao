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

    imprimirVetor(vetor1, "Vetor 1");

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

    imprimirVetor(vetorResultante, "Vetor Resultante");
  }

  private static void imprimirVetor(int[] vetor, String nomeVetor) {
    System.out.print(nomeVetor + ": [ ");
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] != 0) {
        System.out.print(vetor[i] + " ");
      }
    }
    System.out.print("]");
    System.out.println();
  }

}
