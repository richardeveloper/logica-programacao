package br.com.estruturas.vetor;

import java.util.Random;

public class Exercicio06 {
  public static void main(String[] args) {
    Random random = new Random();

    double[] vendas = new double[10];
    double[] comissao = new double[10];
    String[] vendedores = new String[10];

    double totalVendas = 0;

    double maiorVenda = 0;
    String vendedorMaiorVenda = "";

    double menorVenda = Double.POSITIVE_INFINITY;
    String vendedorMenorVenda = "";

    for (int i = 0; i < vendas.length; i++) {
      vendas[i] = random.nextDouble() * 1000.00;
      comissao[i] = random.nextDouble();
      vendedores[i] = "Vendedor " + (i + 1);
    }

    for (int i = 0; i < vendas.length; i++) {
      System.out.println(vendedores[i]);
      double valorAReceber = vendas[i] * comissao[i];
      System.out.printf("Valor vendido: R$ %.2f %n", vendas[i]);
      System.out.printf("Comissão: %.1f%% %n", comissao[i]);
      System.out.printf("Valor de comissão a receber: R$ %.2f %n%n", valorAReceber);
      totalVendas += vendas[i];

      if (vendas[i] > maiorVenda) {
        vendedorMaiorVenda = vendedores[i];
        maiorVenda = vendas[i];
      }

      if (vendas[i] < menorVenda) {
        vendedorMenorVenda = vendedores[i];
        menorVenda = vendas[i];
      }
    }

    System.out.printf("Total de vendas: R$ %.2f %n%n", totalVendas);

    System.out.printf("Maior venda: R$ %.2f %n", maiorVenda);
    System.out.println("Vendedor responsável: " + vendedorMaiorVenda);

    System.out.println();

    System.out.printf("Menor venda: R$ %.2f %n", menorVenda);
    System.out.println("Vendedor responsável: " + vendedorMenorVenda);
  }
}
