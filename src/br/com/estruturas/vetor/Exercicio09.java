package br.com.estruturas.vetor;

import java.util.Random;

public class Exercicio09 {
  public static void main(String[] args) {
    Random random = new Random();

    String[] produtos = new String[10];
    int[] codigos = new int[10];
    double[] precos = new double[10];

    double percAumento;

    System.out.println("Tabela de preços antes do aumento: ");
    System.out.println();
    for (int i = 0; i < produtos.length; i++) {
      produtos[i] = "Produto " + (i + 1);
      codigos[i] = random.nextInt(100);
      precos[i] = random.nextDouble() * 1250.00;

      System.out.printf("%s - COD: %d - PREÇO: R$ %.2f %n", produtos[i], codigos[i], precos[i]);
    }

    System.out.println();

    System.out.println("Tabela de preços depois do aumento: ");
    System.out.println();
    for (int i = 0; i < produtos.length; i++) {
      if (codigos[i] % 2 == 0 && precos[i] > 1000.00) {
        percAumento = 0.20;
        precos[i] = precos[i] + (precos[i] * percAumento);
      }
      else if (codigos[i] % 2 == 0) {
        percAumento = 0.15;
        precos[i] = precos[i] + (precos[i] * percAumento);
      }
      else if (precos[i] > 1000.00) {
        percAumento = 0.10;
        precos[i] = precos[i] + (precos[i] * percAumento);
      }

      System.out.printf("%s - COD: %d - PREÇO: R$ %.2f %n", produtos[i], codigos[i], precos[i]);
    }
  }
}
