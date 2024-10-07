package br.com.estruturas.vetor;

import java.util.Random;

public class Exercicio01 {
  public static void main(String[] args) {
    Random random = new Random();

    int[] numeros = new int[6];

    int quantidadePares = 0, quantidadeImpares = 0;

    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = random.nextInt(100);
    }

    System.out.println();
    System.out.println("Números pares: " );
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] % 2 == 0) {
        quantidadePares++;
        System.out.println(numeros[i]);
      }
    }
    System.out.println("Quantidade de número pares: " + quantidadePares);
    System.out.println();

    System.out.println("Números impares: " );
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] % 2 != 0) {
        quantidadeImpares++;
        System.out.println(numeros[i]);
      }
    }
    System.out.println("Quantidade de número ímpares: " + quantidadeImpares);
  }
}
