package br.com.estruturas.repeticao;

import java.util.Scanner;

public class Exercicio03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int idade, totalPessoas = 0;

    int primeiraFaixa = 0, segundaFaixa = 0, terceiraFaixa = 0, quartaFaixa = 0, quintaFaixa = 0;

    double percPrimeiraFaixa, percUltimaFaixa;

    for (int i = 1; i < 8; i++) {
      System.out.println("Digite a idade da " + i + "ª pessoa: ");
      idade = input.nextInt();

      if (idade <= 15) {
        primeiraFaixa++;
      }
      else if (idade > 15 && idade <= 30) {
        segundaFaixa++;
      }
      else if (idade > 31 && idade <= 45) {
        terceiraFaixa++;
      }
      else if (idade > 45 && idade <= 60) {
        quartaFaixa++;
      }
      else {
        quintaFaixa++;
      }

      totalPessoas++;
    }

    percPrimeiraFaixa = ((double) primeiraFaixa / totalPessoas) * 100;
    percUltimaFaixa = ((double) quintaFaixa / totalPessoas) * 100;

    System.out.println("Total de pessoas: " + totalPessoas);
    System.out.println("Total primeira faixa: " + primeiraFaixa);
    System.out.println("Total segunda faixa: " + segundaFaixa);
    System.out.println("Total terceira faixa: " + terceiraFaixa);
    System.out.println("Total quarta faixa: " + quartaFaixa);
    System.out.println("Total quinta faixa: " + quintaFaixa);
    System.out.println("Percentual primeira faixa: " + percPrimeiraFaixa + "%");
    System.out.println("Percentual última faixa: " + percUltimaFaixa + "%");

    input.close();
  }
}
