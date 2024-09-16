package condicional;

import java.util.Scanner;

public class Exercicio24 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double preco, novoPreco, valorAumento = 0.0, impostos;
    int categoria;
    String situacao;

    System.out.println("Digite o preço do produto: ");
    preco = input.nextDouble();

    System.out.println("Digite a categoria do produto: ");
    System.out.println("1 - Limpeza");
    System.out.println("2 - Alimentação");
    System.out.println("3 - Vestuário");
    categoria = input.nextInt();

    System.out.println("Digite a situação do produto: ");
    System.out.println("R - Necessita de refrigeração");
    System.out.println("N - Não necessita de refrigeração");
    situacao = input.next();

    if (preco <= 25) {
      switch (categoria) {
        case 1:
          valorAumento = 5 /100.0;
          break;
        case 2:
          valorAumento = 8 /100.0;
          break;
        case 3:
          valorAumento = 10 /100.0;
          break;
      }
    }
    else {
      switch (categoria) {
        case 1:
          valorAumento = 12 /100.0;
          break;
        case 2:
          valorAumento = 15 /100.0;
          break;
        case 3:
          valorAumento = 18 /100.0;
          break;
      }
    }

    if (categoria == 2 || situacao.equalsIgnoreCase("R")) {
      impostos = 5 / 100.0;
    }
    else {
      impostos = 8 / 100.0;
    }

    novoPreco = preco + (preco * valorAumento * impostos);

    System.out.println("Preço do produto: R$ " + preco);
    System.out.println("Aumento: " + valorAumento + "%");
    System.out.println("Impostos: " + impostos + "%");
    System.out.printf("Novo preço: R$ %.2f%n", novoPreco);

    if (novoPreco <= 50) {
      System.out.println("Classificação: Barato");
    }
    else if (novoPreco > 50 && novoPreco <= 120) {
      System.out.println("Classificação: Normal");
    }
    else {
      System.out.println("Classificação: Caro");
    }

    input.close();
  }
}
