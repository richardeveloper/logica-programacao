package br.com.estruturas.repeticao;

import java.util.Scanner;

public class Exercicio22 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int idade, totalAltura = 0;
    double altura, mediaAltura = 0;

    do {
      System.out.println("Para sair digite uma idade menor ou igual a zero.");
      System.out.println();

      System.out.println("Digite a idade da pessoa: ");
      idade = input.nextInt();

      if (idade > 0) {
        System.out.println("Digite a altura da pessoa: ");
        altura = input.nextDouble();

        if (idade > 50) {
          mediaAltura += altura;
          totalAltura++;
        }
      }
    } while (idade > 0);

    System.out.printf("Média das alturas de pessoas com mais de 50 anos: %.2fm", (mediaAltura / totalAltura));

    input.close();
  }
}
