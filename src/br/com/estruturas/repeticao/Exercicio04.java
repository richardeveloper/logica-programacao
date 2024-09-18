package br.com.estruturas.repeticao;

import java.util.Scanner;

public class Exercicio04 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int numero;

    System.out.println("Digite um número: ");
    numero = input.nextInt();

    System.out.println("Tabuada de " + numero + ": ");
    System.out.println();

    for (int i = 0; i <= 10; i++) {
      System.out.println(numero + " x " + i + " = " + numero * i);
    }

    input.close();
  }
}
