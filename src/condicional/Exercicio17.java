package condicional;

import java.util.Scanner;

public class Exercicio17 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int senha = 4531;
    int senhaInformada;

    System.out.println("Digite sua senha: ");
    senhaInformada = input.nextInt();

    if (senhaInformada == senha) {
      System.out.println("Acesso permitido.");
    }
    else {
      System.out.println("Acesso negado.");
    }

    input.close();
  }
}
