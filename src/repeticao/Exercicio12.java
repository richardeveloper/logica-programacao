package repeticao;

import java.util.Scanner;

public class Exercicio12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int numero;
    int numerosPrimos = 0;

    for (int i = 1; i <= 10; i++) {
      System.out.println("Digite o " + i + "º numero: ");
      numero = input.nextInt();

      int divisores = 0;

      for (int j = 1; j <= numero; j++) {
        if (numero % j == 0) {
          divisores++;
        }
      }

      if (divisores == 2) {
        numerosPrimos++;
      }
    }

    System.out.println("Quantidade de números primos: " + numerosPrimos);

    input.close();
  }
}
