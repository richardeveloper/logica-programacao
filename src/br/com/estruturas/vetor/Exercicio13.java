package br.com.estruturas.vetor;

import java.util.Random;

public class Exercicio13 {
  public static void main(String[] args) {
    Random random = new Random();

    String[] alunos = new String[8];
    double[] notas = new double[8];

    double mediaClasse = 0;
    int totalAlunos = 0;

    for (int i = 0; i < alunos.length; i++) {
      alunos[i] = "Aluno " + i;
      notas[i] = random.nextDouble() * 10;
    }

    System.out.println("Relatório de notas: ");
    for (int i = 0; i < alunos.length; i++) {
      for (int j = 0; j < notas.length; j++) {
        if (notas[i] > notas[j]) {
          String alunoAux = alunos[j];
          alunos[j] = alunos[i];
          alunos[i] = alunoAux;

          double notaAux = notas[j];
          notas[j] = notas[i];
          notas[i] = notaAux;
        }
      }
      mediaClasse += notas[i];
      totalAlunos++;
    }

    for (int i = 0; i < alunos.length; i++) {
      System.out.println("Aluno: " + alunos[i]);
      System.out.printf("Nota: %.1f %n", notas[i]);
    }

    System.out.printf("Média da classe: %.1f %n", (mediaClasse / totalAlunos));
  }
}
