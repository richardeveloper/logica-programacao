package br.com.estruturas.vetor;

import java.util.Random;

public class Exercicio01 {
  public static void main(String[] args) {
    int[] numeros = new int[6];
    int qtdPares = 0, qtdImpares = 0;

    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = new Random().nextInt(100);
    }

    System.out.println();
    System.out.println("Números pares: " );
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] % 2 == 0) {
        qtdPares++;
        System.out.println(numeros[i]);
      }
    }
    System.out.println("Quantidade de número pares: " + qtdPares);
    System.out.println();

    System.out.println("Números impares: " );
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] % 2 != 0) {
        qtdImpares++;
        System.out.println(numeros[i]);
      }
    }
    System.out.println("Quantidade de número ímpares: " + qtdImpares);
  }
}
