package br.com.estruturas.condicional;

import java.util.Scanner;

public class Exercicio16 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double preco, desconto, novoPreco;
    int codigo;

    System.out.println("Digite o preço do produto: ");
    preco = input.nextInt();

    System.out.println("Digite o código do produto:");
    codigo = input.nextInt();

    if (preco > 30 && preco <= 100) {
      desconto = preco *  (10 /100.0);
      novoPreco = preco - desconto;
    }
    else {
      desconto = preco * (15 / 100.0);
      novoPreco = preco - desconto;
    }

    System.out.println("Código do produto: " + codigo);
    System.out.println("Preço do produto: R$ " + preco);
    System.out.println("Desconto: R$ " + desconto);
    System.out.println("Preço final: R$ " + novoPreco);

    input.close();
  }
}
