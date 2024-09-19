package br.com.estruturas.repeticao;

import java.util.Scanner;

public class Exercicio25 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int codigoCliente;
    int tipoInvestimento;
    String investimento = "";
    double valorIntestido = 0;
    double rendimento = 0;

    do {
      System.out.println("Digite o codigo do cliente igual a 0 para sair.");
      System.out.println();

      System.out.println("Digite o código do cliente: ");
      codigoCliente = input.nextInt();

      if (codigoCliente > 0) {
        do {
          System.out.println("Digite o tipo do investimento: ");
          System.out.println("1 - Poupança");
          System.out.println("2 - Poupança plus");
          System.out.println("3 - Fundos de renda fixa");
          tipoInvestimento = input.nextInt();
        } while (tipoInvestimento < 1 || tipoInvestimento > 3);

        System.out.println("Digite o valor do investimento: ");
        valorIntestido = input.nextDouble();

        switch (tipoInvestimento) {
          case 1:
            investimento = "Poupança";
            rendimento = valorIntestido * 0.015;
            break;
          case 2:
            investimento = "Poupança plus";
            rendimento = valorIntestido * 0.02;
            break;
          case 3:
            investimento = "Fundos de renda fixa";
            rendimento = valorIntestido * 0.04;
            break;
        }
      }

      System.out.println("Tipo de investimento: " + investimento);
      System.out.printf("Valor investido: R$ %.2f %n", valorIntestido);
      System.out.printf("Rendimento: R$ %.2f %n", rendimento);

    } while (codigoCliente != 0);

    input.close();
  }
}
