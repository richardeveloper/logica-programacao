package br.com.estruturas.vetor;

import java.util.Random;

public class Exercicio18 {
  public static void main(String[] args) {
    Random random = new Random();

    int[] numeros = new int[15];

    int maiorNumero = 0;
    int posicaoMaiorNumero = 0;

    int menorNumero = Integer.MAX_VALUE;
    int posicaoMenorNumero = 0;

    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = random.nextInt(100);
    }

    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] > maiorNumero) {
        maiorNumero = numeros[i];
        posicaoMaiorNumero = i;
      }

      if (numeros[i] < menorNumero) {
        menorNumero = numeros[i];
        posicaoMenorNumero = i;
      }
    }

    VetorUtils.imprimirVetor(numeros, "Números");

    System.out.println("Maior número: " + maiorNumero);
    System.out.println("Posição do maior número: " + posicaoMaiorNumero);
    System.out.println();
    System.out.println("Menor numero: " + menorNumero);
    System.out.println("Posição do menor número: " + posicaoMenorNumero);

  }
}
