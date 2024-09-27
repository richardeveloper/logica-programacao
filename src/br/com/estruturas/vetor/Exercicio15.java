package br.com.estruturas.vetor;

import java.util.Random;

public class Exercicio15 {
  public static void main(String[] args) {
    Random random = new Random();

    String[] clientes = new String[8];
    int[] dvds = new int[8];

    for (int i = 0; i < clientes.length; i++) {
      clientes[i] = "Cliente " + (i + 1);
      dvds[i] = random.nextInt(50);
    }

    for (int i = 0; i < dvds.length; i++) {
      System.out.println(clientes[i]);
      System.out.println("Locações em 2011: " + dvds[i]);

      if (dvds[i] >= 8) {
        System.out.println("Locações grátis: " + dvds[i] / dvds.length);
      }

      System.out.println();
    }
  }
}
