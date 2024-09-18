package br.com.estruturas.condicional;

import java.util.Scanner;

public class Exercicio18 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int idade;

    System.out.println("Digite sua idade: ");
    idade = input.nextInt();

    if (idade >= 18) {
      System.out.println("Pessoa maior de idade.");
    }
    else {
      System.out.println("Pessoa menor de idade.");
    }

    input.close();
  }
}
