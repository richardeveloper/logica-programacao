package repeticao;

import java.util.Scanner;

public class Exercicio01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n1, n2, n3, n4;

    for (int i = 1; i <= 5; i++) {
      System.out.println("Digite o primeiro número: ");
      n1 = input.nextInt();

      System.out.println("Digite o segundo número: ");
      n2 = input.nextInt();

      System.out.println("Digite o terceiro número: ");
      n3 = input.nextInt();

      System.out.println("Digite o quarto número: ");
      n4 = input.nextInt();

      System.out.println(i + "º GRUPO");
      System.out.println();

      System.out.println("ORDEM INSERIDA");
      System.out.println("Primeiro número: " + n1);
      System.out.println("Segundo número: " + n2);
      System.out.println("Terceiro número: " + n3);
      System.out.println("Quarto número: " + n4);
      System.out.println();

      int aux;

      if (n1 > n2 && n1 > n3 && n1 > n4) {
        aux = n4;
        n4 = n1;
        n1 = aux;
      }
      else if (n2 > n1 && n2 > n3 && n2 > n4) {
        aux = n4;
        n4 = n2;
        n2 = aux;
      }
      else if (n3 > n1 && n3 > n2 && n3 > n4) {
        aux = n4;
        n4 = n3;
        n3 = aux;
      }

      if (n2 < n1 && n2 < n3 && n1 < n4) {
        aux = n1;
        n1 = n2;
        n2 = aux;
      }
      else if (n3 < n1 && n3 < n2 && n3 < n4) {
        aux = n1;
        n1 = n3;
        n3 = aux;
      }
      else if (n4 < n1 && n4 < n2 && n2 < n3) {
        aux = n1;
        n1 = n4;
        n4 = aux;
      }

      if (n2 > n3) {
        aux = n3;
        n3 = n2;
        n2 = aux;
      }

      System.out.println("ORDEM CRESCENTE");
      System.out.println("Primeiro número: " + n1);
      System.out.println("Segundo número: " + n2);
      System.out.println("Terceiro número: " + n3);
      System.out.println("Quarto número: " + n4);

      System.out.println();

      System.out.println("ORDEM DECRESCENTE");
      System.out.println("Primeiro número: " + n4);
      System.out.println("Segundo número: " + n3);
      System.out.println("Terceiro número: " + n2);
      System.out.println("Quarto número: " + n1);

      System.out.println();
    }

    input.close();
  }
}
