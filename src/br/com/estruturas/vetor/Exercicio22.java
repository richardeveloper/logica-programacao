package br.com.estruturas.vetor;

import java.util.Random;

public class Exercicio22 {
  public static void main(String[] args) {
    Random random = new Random();

    Integer[] vetor1 = new Integer[10];
    Integer[] vetor2 = new Integer[10];

    for (int i = 0; i < vetor1.length; i++) {
      if (random.nextInt(100) <= 50) {
        vetor1[i] = random.nextInt(100);
      }
      else {
        vetor1[i] = random.nextInt(100) * - 1;
      }
    }

    System.out.print("Vetor 1" + ": [ ");
    for (int i = 0; i < vetor1.length; i++) {
      System.out.print(vetor1[i] + " ");
    }
    System.out.print("]");

    System.out.println();

    System.out.print("Vetor 2: [ ");
    for (int i = 0; i < vetor2.length; i++) {
      if (vetor1[i] != null && vetor1[i] > 0) {
        vetor2[i] = vetor1[i];
        System.out.print(vetor2[i] + " ");
      }
    }
    System.out.print("]");
  }

}
