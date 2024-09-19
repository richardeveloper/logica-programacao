package br.com.estruturas.repeticao;

import java.util.Scanner;

public class Exercicio24 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int numero;
    int maiorNumero = 0;
    int menorNumero = Integer.MAX_VALUE;

    do {
      System.out.println("Digite 0 para sair.");
      System.out.println();

      System.out.println("Digite um número: ");
      numero = input.nextInt();

      if (numero < 0) {
        System.out.println("O número deve ser positivo ou 0 para sair.");
      }

      if (numero > 0) {
        if (numero > maiorNumero) {
          maiorNumero = numero;
        }

        if (numero < menorNumero) {
          menorNumero = numero;
        }
      }
    } while (numero != 0);

    System.out.println("Maior número digitado :" + maiorNumero);
    System.out.println("Menor número digitado :" + menorNumero);

    input.close();
  }
}
