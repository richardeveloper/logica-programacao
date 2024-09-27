package br.com.estruturas.vetor;

import java.util.Random;

public class Exercicio05 {
  public static void main(String[] args) {
    Random random = new Random();

    int[] matriculasLogica =  new int[15];
    int[] matriculasLinguagem =  new int[10];

    System.out.println("Mátriculas em lógica de programação: ");
    for (int i = 0; i < matriculasLogica.length; i++) {
      matriculasLogica[i] = random.nextInt(100);
      System.out.print(matriculasLogica[i] + " ");
    }

    System.out.println();

    System.out.println("Mátriculas em linguagem de programação: ");
    for (int i = 0; i < matriculasLinguagem.length; i++) {
      matriculasLinguagem[i] = random.nextInt(100);
      System.out.print(matriculasLinguagem[i] + " ");
    }

    System.out.println();

    System.out.println("Mátricula em ambas disciplinas: ");
    for (int i = 0; i < matriculasLogica.length; i++) {
      for (int j = 0; j < matriculasLinguagem.length; j++) {
        if (matriculasLogica[i] == matriculasLinguagem[j]) {
          System.out.println(matriculasLogica[i] + " ");
        }
      }
    }
  }
}
