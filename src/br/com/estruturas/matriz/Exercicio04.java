package br.com.estruturas.matriz;

import java.util.Random;

public class Exercicio04 {
  public static void main(String[] args) {
    Random random = new Random();

    double[][] notas = new double[15][5];
    String[] alunos = new String[15];

    double media = 0.0;

    for (int i = 0; i < notas.length; i++) {
      alunos[i] = "Aluno " + (i + 1);
      for (int j = 0; j < notas[i].length; j++) {
        notas[i][j] = random.nextDouble() * 10.0;
      }
    }

    MatrizUtils.imprimirMatriz(notas, "Notas", "%.1f");

    for (int i = 0; i < alunos.length; i++) {
      System.out.println(alunos[i]);
      for (int j = 0; j < notas[i].length; j++) {
        media += notas[i][j];
      }
      media = media / notas[i].length;
      System.out.printf("Média: %.1f %n", media);
      if (media >= 7) {
        System.out.println("Situação: Aprovado");
      }
      else if (media >= 5) {
        System.out.println("Situação: Exame");
      }
      else {
        System.out.println("Situação: Reprovado");
      }

      System.out.println();
    }
  }
}
