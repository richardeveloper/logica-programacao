package br.com.estruturas.vetor;

import java.util.Random;

public class Exercicio02 {
  public static void main(String[] args) {
    int[] numeros = new int[7];

    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = new Random().nextInt(100);
      System.out.print(numeros[i] + " ");
    }

    System.out.println();

    System.out.println("Quantidade de números múltiplos de 2:");
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] % 2 == 0) {
        System.out.print(numeros[i] + " ");
      }
    }
    System.out.println();

    System.out.println("Quantidade de números múltiplos de 3:");
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] % 3 == 0) {
        System.out.print(numeros[i] + " ");
      }
    }
    System.out.println();

    System.out.println("Quantidade de números múltiplos de 2 e 3:");
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] % 2 == 0 && numeros[i] % 3 == 0) {
        System.out.print(numeros[i] + " ");
      }
    }
  }
}
