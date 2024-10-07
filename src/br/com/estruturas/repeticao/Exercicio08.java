package br.com.estruturas.repeticao;

import java.util.Scanner;

public class Exercicio08 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int idade;
    double peso;
    double altura;

    String corOlhos, corCabelo;

    int totalPessoas = 0, quantidadeIdade = 0, quantidadeAltura = 0;
    int quantidadeOlhosAzuis = 0, quantidadeRuivas = 0;

    double mediaAltura = 0;

    for (int i = 1; i <= 6; i++) {
      System.out.println("Digite a idade da " + i + "ª pessoa: ");
      idade = input.nextInt();

      System.out.println("Digite o peso da " + i + "ª pessoa: ");
      peso = input.nextDouble();

      System.out.println("Digite a altura da " + i + "ª pessoa: ");
      altura = input.nextDouble();

      do {
        System.out.println("Digite a cor do cabelo da " + i + "ª pessoa: ");
        System.out.println("P - Preto");
        System.out.println("C - Castanho");
        System.out.println("L - Loiro");
        corCabelo = input.next();
      } while (isCorCabeloInvalida(corCabelo));

      do {
        System.out.println("Digite a cor dos olhos da " + i + "ª pessoa: ");
        System.out.println("A - Azul");
        System.out.println("P - Preto");
        System.out.println("V - Verde");
        System.out.println("C - Castanho");
        corOlhos = input.next();
      } while (isCorOlhoInvalida(corOlhos));

      if (idade > 50 && peso < 60) {
        quantidadeIdade++;
      }

      if (altura < 1.5) {
        quantidadeAltura++;
        mediaAltura += idade;
      }

      if (corOlhos.equalsIgnoreCase("A")) {
        quantidadeOlhosAzuis++;
      }

      if (corCabelo.equalsIgnoreCase("R") && !corOlhos.equalsIgnoreCase("A")) {
        quantidadeRuivas++;
      }

      totalPessoas++;
    }

    System.out.println("Pessoas com idade superior a 50 anos e peso menor que 60kg: " + quantidadeIdade);
    System.out.println("Média  das idades das pessoas com idade entre 10 e 20 anos: " + (mediaAltura / quantidadeAltura));
    System.out.println("Porcentagem de pessoas olhos azuis: " + (quantidadeRuivas / totalPessoas));
    System.out.println("Pessoas com cabelo ruivo e sem olhos azuis: " + quantidadeOlhosAzuis);

    input.close();
  }

  private static boolean isCorOlhoInvalida(String corOlhos) {
    return !corOlhos.equalsIgnoreCase("A")
      && !corOlhos.equalsIgnoreCase("V")
      && !corOlhos.equalsIgnoreCase("C")
      && !corOlhos.equalsIgnoreCase("P");
  }

  private static boolean isCorCabeloInvalida(String corCabelo) {
    return !corCabelo.equalsIgnoreCase("P")
      && !corCabelo.equalsIgnoreCase("C")
      && !corCabelo.equalsIgnoreCase("L");
  }
}
