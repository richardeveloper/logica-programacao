package br.com.estruturas.matriz;

import br.com.estruturas.vetor.VetorUtils;
import java.util.Random;

public class Exercicio11 {
  public static void main(String[] args) {
    Random random = new Random();

    int[] idades = new int[8];
    int[] codigoDisciplina = new int[5];
    int[][] quantidadeProvas = new int[5][8];

    for (int i = 0; i < quantidadeProvas.length; i++) {
      codigoDisciplina[i] = random.nextInt(100);
      for (int j = 0; j < quantidadeProvas[i].length; j++) {
        idades[j] = random.nextInt(20) + 10;
        quantidadeProvas[i][j] = random.nextInt(10);
      }
    }

    VetorUtils.imprimirVetor(idades, "Idades");
    VetorUtils.imprimirVetor(codigoDisciplina, "Código disciplina");
    MatrizUtils.imprimirMatriz(quantidadeProvas, "Quantidade de provas");
  }
}
