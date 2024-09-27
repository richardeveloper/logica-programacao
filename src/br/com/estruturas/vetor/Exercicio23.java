package br.com.estruturas.vetor;

import java.util.Random;

public class Exercicio23 {
  public static void main(String[] args) {
    Random random = new Random();

    int[] vetor1 = new int[5];
    int[] vetor2 = new int[5];

    for (int i = 0; i < vetor1.length; i++) {
      vetor1[i] = random.nextInt(100);
      vetor2[i] = random.nextInt(100);
    }

    imprimirVetor(vetor1, "Vetor 1");
    imprimirVetor(vetor2, "Vetor 2");

    for (int i = 0; i < vetor2.length; i++) {
      System.out.printf("%d - %d = %d %n", vetor1[i], vetor2[i], (vetor1[i] - vetor2[i]));
    }
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
