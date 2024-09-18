package br.com.estruturas.repeticao;

import java.util.Scanner;

public class Exercicio13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int idade;
    double peso;

    int totalPessoas = 0;
    double mediaPesoPrimeiraFaixa = 0;
    double mediaPesoSegundaFaixa = 0;
    double mediaPesoTerceiraFaixa = 0;
    double mediaPesoQuartaFaixa = 0;

    for (int i = 1; i <= 15; i++) {
      System.out.println("Digite a idade da " + i + "ª pessoa: ");
      idade = input.nextInt();

      System.out.println("Digite o peso da " + i + "ª pessoa: ");
      peso = input.nextDouble();

      if (idade >= 1 && idade <= 10) {
        mediaPesoPrimeiraFaixa += peso;
      }
      else if (idade >= 11 && idade <= 20) {
        mediaPesoSegundaFaixa += peso;
      }
      else if (idade >= 21 && idade <= 30) {
        mediaPesoTerceiraFaixa += peso;
      }
      else {
        mediaPesoQuartaFaixa += peso;
      }

      totalPessoas++;
    }

    System.out.printf("Média de peso da primeira faixa: %.1fkg %n", (mediaPesoPrimeiraFaixa / totalPessoas));
    System.out.printf("Média de peso da segunda faixa: %.1fkg %n", (mediaPesoSegundaFaixa / totalPessoas));
    System.out.printf("Média de peso da terceira faixa: %.1fkg %n", (mediaPesoTerceiraFaixa / totalPessoas));
    System.out.printf("Média de peso da quarta faixa: %.1fkg %n", (mediaPesoQuartaFaixa / totalPessoas));

    input.close();
  }
}
