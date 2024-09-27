package br.com.estruturas.vetor;

import java.util.Random;

public class Exercicio14 {
  public static void main(String[] args) {
    Random random = new Random();

    double[] primeiraProva = new double[8];
    double[] segundaProva = new double[8];
    double[] media = new double[8];

    int alunosAprovados = 0;
    int alunosExame = 0;
    int alunosReprovados = 0;

    double mediaClasse = 0;

    for (int i = 0; i < media.length; i++) {
      primeiraProva[i] = random.nextDouble() * 10;
      segundaProva[i] = random.nextDouble() * 10;
      media[i] = (primeiraProva[i] + segundaProva[i]) / 2;
      if (media[i] >= 6) {
        alunosAprovados++;
      }
      else if (media[i] >= 5) {
        alunosExame++;
      }
      else {
        alunosReprovados++;
      }

      mediaClasse += media[i];
    }

    System.out.println("Relatório da classe: ");
    System.out.printf("Média da classe: %.1f %n", mediaClasse / media.length);
    System.out.printf("Percentual de alunos aprovados: %.1f%% %n", (alunosAprovados / media.length) * 100.0);
    System.out.printf("Percentual de alunos de exame: %.1f%% %n", (alunosExame / media.length) * 100.0);
    System.out.printf("Percentual de alunos reprovados: %.1f%% %n", (alunosReprovados / media.length) * 100.0);
  }
}
