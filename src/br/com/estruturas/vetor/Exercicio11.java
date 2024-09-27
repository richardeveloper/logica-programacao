package br.com.estruturas.vetor;

import java.util.Random;

public class Exercicio11 {
  public static void main(String[] args) {
    Random random = new Random();

    int[] vetor = new int[10];
    int[] vetorPares = new int[10];
    int[] vetorImpares = new int[10];

    System.out.print("VETOR NÚMEROS [ ");
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = random.nextInt(100);
      System.out.print(vetor[i]+ " ");
    }
    System.out.println("]");

    System.out.println();

    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] % 2 == 0) {
        vetorPares[i] = vetor[i];
      }
      else {
        vetorImpares[i] = vetor[i];
      }
    }

    System.out.print("VETOR NÚMEROS PARES [ ");
    for (int i = 0; i < vetorPares.length; i++) {
      if (vetorPares[i] != 0) {
        System.out.print(vetorPares[i] + " ");
      }
    }
    System.out.print("]");

    System.out.println();

    System.out.print("VETOR NÚMEROS IMPARES [ ");
    for (int i = 0; i < vetorImpares.length; i++) {
      if (vetorImpares[i] != 0) {
        System.out.print(vetorImpares[i]+ " ");
      }
    }
    System.out.print("]");
  }
}
