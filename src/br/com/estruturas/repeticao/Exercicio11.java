package br.com.estruturas.repeticao;

import java.util.Scanner;

public class Exercicio11 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double valorCarro;

    System.out.println("Digite o valor do carro: ");
    valorCarro = input.nextDouble();

    for (int i = 6; i <= 60; i = i + 6) {
      System.out.println(i + " Parcelas");
      System.out.printf("Valor da Parcela: R$ %.2f %n", (valorCarro / i));
      double juros = (valorCarro * (i / 2) / 100);
      System.out.printf("Preço final: R$ %.2f %n", valorCarro + juros);
      System.out.println();
    }

    input.close();
  }
}
