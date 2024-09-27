package br.com.estruturas.vetor;

import java.util.Random;

public class Exercicio07 {
  public static void main(String[] args) {
    Random random = new Random();

    int[] numeros = new int[10];

    int numerosNegativos = 0;
    int somaPositivos = 0;

    for (int i = 0; i < numeros.length; i++) {
      int n1 = random.nextInt(100);
      int n2 = random.nextInt(100) * (-1);
      numeros[i] = n1 + n2;
      System.out.print(numeros[i] + " ");

      if (numeros[i] < 0) {
        numerosNegativos++;
      }
      else {
        somaPositivos += numeros[i];
      }
    }

    System.out.println();
    System.out.println("Quantidade de números negativos: " + numerosNegativos);
    System.out.println("Soma dos números postivos: " + somaPositivos);
  }
}
