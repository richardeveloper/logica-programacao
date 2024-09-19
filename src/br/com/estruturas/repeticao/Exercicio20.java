package br.com.estruturas.repeticao;

import java.util.Scanner;

public class Exercicio20 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int opcao;

    double n1, n2, n3;
    double peso1, peso2, peso3;
    double media;

    do {
      System.out.println("Digite a opçẽo desejada: ");
      System.out.println("1- Média Aritmética");
      System.out.println("2- Média Ponderada");
      System.out.println("3- Sair");
      opcao = input.nextInt();

      System.out.println();

      switch (opcao) {
        case 1:
          System.out.println("Digite a primeira nota: ");
          n1 = input.nextDouble();

          System.out.println("Digite a segunda nota: ");
          n2 = input.nextDouble();

          media = (n1 + n2) / 2;

          System.out.printf("Média: %.1f %n", media);
          break;
        case 2:
          System.out.println("Digite a primeira nota: ");
          n1 = input.nextDouble();

          System.out.println("Digite o peso da primeira nota: ");
          peso1 = input.nextDouble();

          System.out.println("Digite a segunda nota: ");
          n2 = input.nextDouble();

          System.out.println("Digite o peso da segunda nota: ");
          peso2 = input.nextDouble();

          System.out.println("Digite a terceira nota: ");
          n3 = input.nextDouble();

          System.out.println("Digite o peso da terceira nota: ");
          peso3 = input.nextDouble();

          media = ((n1 * peso1) + (n2 * peso2) + (n3 * peso3)) / (peso1 + peso2 + peso3);

          System.out.printf("Média: %.1f %n", media);
          break;
        default:
          break;
      }
    } while (opcao != 3);

    input.close();
  }
}
