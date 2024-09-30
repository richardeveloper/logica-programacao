package br.com.estruturas.matriz;

import java.util.Random;
import java.util.Scanner;

public class Exercicio09 {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int[][] matriz = new int[3][3];
    int numero;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        matriz[i][j] = random.nextInt(100);
      }
    }

    MatrizUtils.imprimirMatriz(matriz, "Matriz");

    System.out.println("Digite um número: ");
    numero = scanner.nextInt();

    System.out.println("Matriz resultante: ");
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        System.out.print(matriz[i][j] * numero + " ");
      }
      System.out.println();
    }
  }
}
