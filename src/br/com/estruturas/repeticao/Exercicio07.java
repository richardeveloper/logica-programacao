package br.com.estruturas.repeticao;

import java.util.Scanner;

public class Exercicio07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int idade;
    double altura, peso;

    int quantidadeIdosos = 0, quantidadeMediaAltura = 0;
    double totalAltura = 0.0, totalPeso = 0, quantidadePeso = 0.0;

    for (int i = 1; i <= 8; i++) {
      System.out.println("Digite a idade da " + i + "ª pessoa: ");
      idade = input.nextInt();

      System.out.println("Digite a altura da " + i + "ª pessoa: ");
      altura = input.nextDouble();

      System.out.println("Digite o peso da " + i + "ª pessoa: ");
      peso = input.nextDouble();

      if (idade >= 50) {
        quantidadeIdosos++;
      }

      if (idade >= 10 && idade <= 20) {
        quantidadeMediaAltura++;
        totalAltura += altura;
      }

      if (peso <= 40) {
        quantidadePeso++;
        totalPeso += peso;
      }
    }

    System.out.println("Pessoas com mais de 50 anos: " + quantidadeIdosos);
    System.out.printf("Média das alturas de pessoas entre 10 e 20 anos: %.1f%n", (totalAltura / quantidadeMediaAltura));
    System.out.printf("Porcentagem das pessoas com peso menor que 40kg: %.1f%n", (totalPeso / quantidadePeso));

    input.close();
  }
}
