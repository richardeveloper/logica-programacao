package br.com.estruturas.matriz;

public class MatrizUtils {

  public static void imprimirMatriz(int[][] matriz, String nomeMatriz) {
    System.out.println();
    System.out.println(nomeMatriz + ": ");
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }

  public static void imprimirMatriz(double[][] matriz, String nomeMatriz, String regex) {
    System.out.println();
    System.out.println(nomeMatriz + ": ");
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.printf(regex + " ", matriz[i][j]);
      }
      System.out.println();
    }
    System.out.println();
  }

}
