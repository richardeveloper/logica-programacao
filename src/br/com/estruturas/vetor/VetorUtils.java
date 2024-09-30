package br.com.estruturas.vetor;

public class VetorUtils {

  public static void imprimirVetor(int[] vetor, String nomeVetor) {
    System.out.println();
    System.out.print(nomeVetor + ": [ ");
    for (int i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i] + " ");
    }
    System.out.print("]");
    System.out.println();
  }

  public static void imprimirVetor(Integer[] vetor, String nomeVetor) {
    System.out.println();
    System.out.print(nomeVetor + ": [ ");
    for (int i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i] + " ");
    }
    System.out.print("]");
    System.out.println();
  }

}
