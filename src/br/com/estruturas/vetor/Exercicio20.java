package br.com.estruturas.vetor;

import java.util.Random;

public class Exercicio20 {
  public static void main(String[] args) {
    Random random = new Random();

    int[] numeros = new int[10];

    for (int i = 0; i < numeros.length; i++) {
      if (random.nextInt(100) <= 50) {
        numeros[i] = random.nextInt(100);
      }
      else {
        numeros[i] = random.nextInt(100) * -1;
      }
    }

    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i] + " ");
    }

    System.out.println();

    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] > 0) {
        System.out.print(numeros[i] + " ");
      }
    }
  }
}
