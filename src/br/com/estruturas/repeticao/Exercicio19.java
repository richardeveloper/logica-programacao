package br.com.estruturas.repeticao;

import java.util.Scanner;

public class Exercicio19 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String opcao;

    String acao;
    double precoCompra;
    double precoVenda;
    double lucro;
    double totalLucroEmpresa = 0;
    int qtdLucroSuperior = 0;
    int qtdLucroInferior = 0;

    do {
      System.out.println("Digite o tipo da ação: ");
      acao = input.next();

      System.out.println("Digite o preço de compra da ação: ");
      precoCompra = input.nextDouble();

      System.out.println("Digite o preço de venda da ação: ");
      precoVenda = input.nextDouble();

      lucro = precoVenda - precoCompra;

      if (lucro > 1000) {
        qtdLucroSuperior++;
      }

      if (lucro < 200) {
        qtdLucroInferior++;
      }

      totalLucroEmpresa += lucro;

      System.out.println("Ação: " + acao);
      System.out.println("Margem de lucro: " + lucro);

      System.out.println("Digite F para sair.");
      opcao = input.next();
    } while (!opcao.equalsIgnoreCase("F"));

    System.out.println("Ações que lucraram mais de R$ 1000,00: " + qtdLucroSuperior);
    System.out.println("Ações que lucraram menos de R$ 200,00: " + qtdLucroInferior);
    System.out.printf("Lucro total da empresa: R$ %.2f", totalLucroEmpresa);

    input.close();
  }
}
