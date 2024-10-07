package br.com.estruturas.matriz;

import br.com.estruturas.vetor.VetorUtils;
import java.util.Random;
import java.util.Scanner;

public class Exercicio12 {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner input = new Scanner(System.in);

    int codigo;
    boolean disciplina = false;

    String[] alunos = new String[8];
    int[] idades = new int[8];
    int[] codigoDisciplina = new int[5];
    int[][] quantidadeProvas = new int[5][8];

    int quantidadeMaisDuasProvas = 0;
    int quantidadeZeroProvas = 0;
    int quantidadeNenhumaProva = 0;

    for (int i = 0; i < quantidadeProvas.length; i++) {
      codigoDisciplina[i] = random.nextInt(100);
      for (int j = 0; j < quantidadeProvas[i].length; j++) {
        alunos[j] = "Aluno " + (j + 1);
        idades[j] = random.nextInt(20) + 10;
        quantidadeProvas[i][j] = random.nextInt(10);
      }
    }

    VetorUtils.imprimirVetor(alunos, "Alunos");
    VetorUtils.imprimirVetor(idades, "Idades");
    VetorUtils.imprimirVetor(codigoDisciplina, "Código disciplina");
    MatrizUtils.imprimirMatriz(quantidadeProvas, "Quantidade de provas");

    System.out.println("Digite o código da disciplina: ");
    codigo = input.nextInt();
    
    do {
      for (int i = 0; i < codigoDisciplina.length; i++) {
        if (codigoDisciplina[i] == codigo) {
          disciplina = true;
          break;
        }
      }

      if (!disciplina) {
        System.out.println("A disciplina informada não foi encontrada.");
        System.out.println();

        System.out.println("Digite o código da disciplina: ");
        codigo = input.nextInt();
      }
    }
    while (!disciplina);

    for (int i = 0; i < quantidadeProvas.length; i++) {
      for (int j = 0; j < quantidadeProvas[i].length; j++) {
        if (idades[j] >= 18 && idades[j] <= 25 && quantidadeProvas[i][j] > 2) {
          quantidadeMaisDuasProvas++;
        }

        if (quantidadeProvas[i][j] == 0) {
          quantidadeZeroProvas++;
        }

        if (quantidadeProvas[i][j] < 2) {
          System.out.println(alunos[j]);
          System.out.println("Código da disciplina: " + codigoDisciplina[i]);
          System.out.println("Quantidade de provas: " + quantidadeProvas[i][j]);
          System.out.println();
        }
      }
      if (quantidadeZeroProvas == quantidadeProvas[i].length) {
        quantidadeNenhumaProva++;
        quantidadeZeroProvas = 0;
      }
    }

    System.out.println("Quantidade de alunos entre 18 e 25 anos com mais de duas provas: " + quantidadeMaisDuasProvas);
    System.out.println("QUantidade de alunos que não fizeram prova em disciplina alguma: " + quantidadeNenhumaProva);
  }
}
