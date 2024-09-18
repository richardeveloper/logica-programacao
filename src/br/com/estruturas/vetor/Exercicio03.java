package br.com.estruturas.vetor;

import java.util.Scanner;

public class Exercicio03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int opcao, codigoCliente, codigoProduto, qtdProduto;
    int[] codigos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] qtdProdutos = {10, 20, 5, 30, 7, 9, 12, 22, 19, 2};

    for (int i = 0; i < codigos.length; i++) {
      System.out.print("Produto #" + codigos[i] + ": " + qtdProdutos[i]);
      System.out.println();
    }

    System.out.println();

    do {
      System.out.println("Digite o código do cliente: ");
      codigoCliente = input.nextInt();

      System.out.println("Digite o código do produto: ");
      codigoProduto = input.nextInt();

      for (int i = 0; i < codigos.length; i++) {
        if (codigos[i] == codigoProduto) {
          System.out.println("Digite a quantidade do produto: ");
          qtdProduto = input.nextInt();

          if (qtdProdutos[codigoProduto - 1] >= qtdProduto) {
            qtdProdutos[codigoProduto - 1] = qtdProdutos[codigoProduto - 1] - qtdProduto;

            System.out.println("Pedido realizado com sucesso.");
            System.out.println();
          }
          else {
            System.out.println("O produto não possui estoque suficiente.");
            System.out.println();
            break;
          }
        }
      }

      for (int i = 0; i < codigos.length; i++) {
        System.out.print("Produto #" + codigos[i] + ": " + qtdProdutos[i]);
        System.out.println();
      }

      System.out.println();
      System.out.println("Digite 0 para sair.");
      opcao = input.nextInt();

    } while (opcao != 0);

    input.close();
  }
}
