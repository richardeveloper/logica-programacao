package br.com.estruturas.vetor;

import java.util.Random;

public class Exercicio16 {
  public static void main(String[] args) {
    Random random = new Random();

    String[] produtos = new String[5];
    double[] precos = new double[5];

    int qtdInferior = 0;
    double mediaPrecos = 0;
    int qtdSuperior = 0;

    for (int i = 0; i < produtos.length; i++) {
      produtos[i] = "Produto " + (i +1);
      precos[i] = random.nextDouble() * 200.00;
      System.out.printf("%s - R$ %.2f %n", produtos[i], precos[i]);
    }

    System.out.println();

    System.out.println("Nome dos produtos com preço entre R$ 50,00 e R$ 100,00: ");
    for (int i = 0; i < produtos.length; i++) {
      if (precos[i] < 50) {
        qtdInferior++;
      }
      else if (precos[i] >= 50 && precos[i] <= 100) {
        System.out.println(produtos[i]);
      }
      else {
        mediaPrecos += precos[i];
        qtdSuperior++;
      }
    }

    System.out.println("Quantidade de produtos com preço inferior a R$ 50,00: " + qtdInferior);
    System.out.printf("Média dos preços de produtos com preço superior a R$ 100,00: %.2f", mediaPrecos / qtdSuperior);
  }
}
