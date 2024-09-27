package br.com.estruturas.vetor;

import java.util.Random;

public class Exercicio04 {
  public static void main(String[] args) {
    Random random = new Random();

    int[] numeros = new int[15];

    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = random.nextInt(50);
      System.out.print(numeros[i] + " ");
    }

    System.out.println();

    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] == 30) {
        System.out.println("Número: " + numeros[i]);
        System.out.println("Posição: " + i);
      }
    }
  }
}
