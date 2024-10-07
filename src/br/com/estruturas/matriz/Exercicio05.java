package br.com.estruturas.matriz;

import java.util.Random;

public class Exercicio05 {
  public static void main(String[] args) {
    Random random = new Random();

    double[][] vendas = new double[12][4];

    double totalVendasMes = 0.0, totalVendasSemana = 0.0, totalVendasLoja = 0.0;

    for (int i = 0; i < vendas.length; i++) {
      for (int j = 0; j < vendas[i].length; j++) {
        vendas[i][j] = random.nextDouble() * 1000.00;
      }
    }

    MatrizUtils.imprimirMatriz(vendas, "Vendas", "%.2f");

    for (int i = 0; i < vendas.length; i++) {
      imprimirMes(i);
      for (int j = 0; j < vendas[i].length; j++) {
        totalVendasMes += vendas[i][j];
        totalVendasLoja += vendas[i][j];
      }
      System.out.printf("Total de vendas: R$ %.2f %n", totalVendasMes);
      totalVendasMes = 0.0;
      System.out.println();
    }

    for (int i = 0; i < vendas[i].length; i++) {
      System.out.print("Total anual semana " + (i + 1) + ": ");
      for (int j = 0; j < vendas.length; j++) {
        totalVendasSemana += vendas[j][i];
      }
      System.out.printf("R$ %.2f %n", totalVendasSemana);
      totalVendasSemana = 0.0;
    }

    System.out.println();

    System.out.printf("Total de vendas da loja: R$ %.2f %n", totalVendasLoja);
  }

  private static void imprimirMes(int mes) {
    switch (mes) {
      case 0:
        System.out.println("Janeiro: ");
        break;
      case 1:
        System.out.println("Fevereiro: ");
        break;
      case 2:
        System.out.println("Março: ");
        break;
      case 3:
        System.out.println("Abril: ");
        break;
      case 4:
        System.out.println("Maio: ");
        break;
      case 5:
        System.out.println("Junho: ");
        break;
      case 6:
        System.out.println("Julho: ");
        break;
      case 7:
        System.out.println("Agosto: ");
        break;
      case 8:
        System.out.println("Setembro: ");
        break;
      case 9:
        System.out.println("Outubro: ");
        break;
      case 10:
        System.out.println("Novembro: ");
        break;
      case 11:
        System.out.println("Dezembro: ");
        break;
    }
  }
}
