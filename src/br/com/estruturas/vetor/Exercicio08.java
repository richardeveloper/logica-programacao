package br.com.estruturas.vetor;

import java.util.Random;

public class Exercicio08 {
  public static void main(String[] args) {
    Random random = new Random();

    final double mediaAprovacao = 7.0;

    String[] alunos = new String[7];
    double[] medias =  new double[7];

    String melhorAluno = "";
    double maiorMedia = 0;

    double notaExameFinal;

    for (int i = 0; i < alunos.length; i++) {
      alunos[i] = "Aluno " + (i + 1);
      medias[i] = random.nextDouble() * 10.00;

      System.out.printf("%s: %.1f %n", alunos[i], medias[i]);
    }

    System.out.println();

    for (int i = 0; i < alunos.length; i++) {
      if (medias[i] > maiorMedia) {
        maiorMedia = medias[i];
        melhorAluno = alunos[i];
      }

      if (medias[i] < mediaAprovacao) {
        notaExameFinal = 10 - medias[i];
        System.out.println(alunos[i] + " não antingiu a média necessária.");
        System.out.printf("Média: %.1f %n", medias[i]);
        System.out.printf("Nota para aprovação: %.1f %n", notaExameFinal);
        System.out.println();
      }
    }

    System.out.printf("Maior média da turma: %.1f %n", maiorMedia);
    System.out.println("Aluno: " +  melhorAluno);
  }
}
