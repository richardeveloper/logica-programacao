package condicional;

import java.util.Scanner;

public class Exercicio23 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int codigo, quantidade;
    double precoUnitario, totalNota, desconto;

    System.out.println("Digite o codigo do produto (1-40): ");
    codigo = input.nextInt();

    System.out.println("Digite a quantidade do produto: ");
    quantidade = input.nextInt();

    if (codigo >= 1 && codigo <= 10) {
      precoUnitario = 10.0;
    }
    else if (codigo >= 11 && codigo <= 20) {
      precoUnitario = 15.0;
    }
    else if (codigo >= 21 && codigo <= 30) {
      precoUnitario = 20.0;
    }
    else if (codigo >= 31 && codigo <= 40) {
      precoUnitario = 30.0;
    }
    else {
      System.out.println("O codigo informado não foi identificado.");
      return;
    }

    totalNota = precoUnitario * quantidade;

    if (totalNota <= 250) {
      desconto = totalNota * (5 /100.0);
    }
    else if (totalNota > 250 && totalNota <= 500) {
      desconto = totalNota * (10 /100.0);
    }
    else {
      desconto = totalNota * (15 /100.0);
    }

    System.out.println("Valor unitário do produto: R$ " + precoUnitario);
    System.out.println("Quantidade de itens: " + quantidade);
    System.out.println("Valor total da nota: R$ " + totalNota);
    System.out.println("Valor total do desconto: R$ " + desconto);
    System.out.println("Valor total: R$ " + (totalNota - desconto));

    input.close();
  }
}
