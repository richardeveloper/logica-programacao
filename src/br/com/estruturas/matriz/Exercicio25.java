package br.com.estruturas.matriz;

import br.com.estruturas.vetor.VetorUtils;
import java.util.Random;

public class Exercicio25 {
  public static void main(String[] args) {
    Random random = new Random();

    double[] precos = new double[10];
    int[][] armazem = new int[5][10];

    int quantidadeArmazem = 0, quantidadeTotal = 0;
    int maiorEstoque = 0, menorEstoque = Integer.MAX_VALUE;
    double maiorPreco = 0.0, precoArmazem = 0.0;


    for (int i = 0; i < armazem.length; i++) {
      for (int j = 0; j < armazem[i].length; j++) {
        precos[j] = random.nextDouble() * 100.00;
        armazem[i][j] = random.nextInt(50);
      }
    }

    VetorUtils.imprimirVetor(precos, "Preços", "%.2f");

    MatrizUtils.imprimirMatriz(armazem, "Armazém");

    for (int i = 0; i < armazem[0].length; i++) {
      for (int j = 0; j < armazem.length; j++) {

        quantidadeArmazem += armazem[j][i];
        quantidadeTotal += armazem[j][i];

        if (maiorEstoque < armazem[j][i]) {
          maiorEstoque = armazem[j][i];
          maiorPreco = precos[i];
        }

        if (menorEstoque > armazem[j][i]) {
          menorEstoque = armazem[j][i];
        }

      }
      System.out.print("Armazém " + (i + 1) + ": ");
      System.out.println();
      System.out.println("Quantidade de produtos: " + + quantidadeArmazem);
      System.out.printf("Preço Total: R$ %.2f %n%n", (quantidadeArmazem * precos[i]));

      quantidadeArmazem = 0;
    }

    System.out.println("Total de produtos em todos os armazéns: " + quantidadeTotal);
    System.out.printf("Preço do produto que possui maior estoque em um único armazém: R$ %.2f %n", maiorPreco);
    System.out.println("Menor estoque armazenado: " + menorEstoque);
  }
}
