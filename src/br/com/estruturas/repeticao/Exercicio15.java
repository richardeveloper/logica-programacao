package br.com.estruturas.repeticao;

import java.util.Scanner;

public class Exercicio15 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String sexo, opiniao;

    int totalPessoas = 0, quantidadeSim = 0, quantidadeNao = 0, mulheresSim = 0;
    double percHomensNao = 0;

    for (int i = 1; i <= 10; i++) {
      do {
        System.out.println("Digite o sexo da " + i + "ª pessoa: ");
        System.out.println("F - Feminino");
        System.out.println("M - Masculino");
        sexo = input.next();
      } while (isSexoInvalido(sexo));

      do {
        System.out.println("Digite a opinião da " + i + "ª pessoa: ");
        System.out.println("S - Gostei");
        System.out.println("N - Não Gostei");
        opiniao = input.next();
      } while (isOpiniaoInvalida(opiniao));

      if (opiniao.equalsIgnoreCase("S")) {
        quantidadeSim++;
      }
      else {
        quantidadeNao++;
      }

      if (sexo.equalsIgnoreCase("F") && opiniao.equalsIgnoreCase("S")) {
        mulheresSim++;
      }

      if (sexo.equalsIgnoreCase("M") && opiniao.equalsIgnoreCase("N")) {
        percHomensNao++;
      }

      totalPessoas++;
    }

    System.out.println("Pessoas que responderam sim: " + quantidadeSim);
    System.out.println("Pessoas que responderam não: " + quantidadeNao);
    System.out.println("Mulheres que responderam sim: " + mulheresSim);
    System.out.printf("Porcentagem dos homens que responderam não: %.1f%%", ((percHomensNao / totalPessoas) * 100.0));

    input.close();
  }

  private static boolean isOpiniaoInvalida(String opiniao) {
    return !opiniao.equalsIgnoreCase("S") && !opiniao.equalsIgnoreCase("N");
  }

  private static boolean isSexoInvalido(String sexo) {
    return !sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M");
  }
}
