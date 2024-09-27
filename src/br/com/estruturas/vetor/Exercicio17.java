package br.com.estruturas.vetor;

import java.util.Random;

public class Exercicio17 {
  public static void main(String[] args) {
    Random random = new Random();

    int[] vetor1 = new int[10];
    int[] vetor2 = new int[10];
    int[] vetorResultante = new int[20];

    for (int i = 0; i < vetor1.length; i++) {
      vetor1[i] = random.nextInt(100);
      vetor2[i] = random.nextInt(100);
    }

    for (int i = 0; i < vetorResultante.length; i++) {
      if (i < vetor1.length) {
        vetorResultante[i] = vetor1[i];
      }
      else {
        vetorResultante[i] = vetor2[i - 10];
      }
    }

    for (int i = 0; i < vetorResultante.length; i++) {
      for (int j = 0; j < vetorResultante.length; j++) {
        if (vetorResultante[i] > vetorResultante[j]) {
          int aux = vetorResultante[i];
          vetorResultante[i] = vetorResultante[j];
          vetorResultante[j] = aux;
        }
      }
    }

    imprimirVetor(vetor1, "Vetor 1");
    imprimirVetor(vetor2, "Vetor 2");
    imprimirVetor(vetorResultante, "Vetor Resultante");
  }

  private static void imprimirVetor(int[] vetor, String nomeVetor) {
    System.out.print(nomeVetor + ": [ ");
    for (int i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i] + " ");
    }
    System.out.print("]");
    System.out.println();
  }
}
