package br.com.estruturas.vetor;

import java.util.Scanner;

public class Exercicio12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] numeros = new int[5];

    int soma = 0;

    for (int i = 0; i < numeros.length; i++) {
      System.out.printf("Digite o %dº número: %n", (i + 1));
      numeros[i] = input.nextInt();
    }

    System.out.print("Os números digitados foram: ");
    for (int i = 0; i < numeros.length; i++) {
      if (i < numeros.length - 1) {
        System.out.print(numeros[i] + " + ");
        soma += numeros[i];
      }
      else {
        soma += numeros[i];
        System.out.print(numeros[i] + " = " + soma);
      }
    }

    input.close();
  }
}
