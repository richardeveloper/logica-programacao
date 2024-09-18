package br.com.estruturas.repeticao;

import java.util.Scanner;

public class Exercicio17 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int opcao;

    int quantidadePessoas;
    int totalPessoas = 0;

    int audienciaCanal4 = 0;
    int audienciaCanal5 = 0;
    int audienciaCanal7 = 0;
    int audienciaCanal12 = 0;

    double percCanal4;
    double percCanal5;
    double percCanal7;
    double percCanal12;

    do {
      do {
        System.out.println("Digite o canal: ");
        System.out.println("1 - Canal 4");
        System.out.println("2 - Canal 5");
        System.out.println("3 - Canal 7");
        System.out.println("4 - Canal 12");
        opcao = input.nextInt();
      } while (opcao < 1 || opcao > 4);

      System.out.println("Digite a quantidade pessoas assitindo: ");
      quantidadePessoas = input.nextInt();

      if (opcao == 1) {
        audienciaCanal4 += quantidadePessoas;
      }
      else if (opcao == 2) {
        audienciaCanal5 += quantidadePessoas;
      }
      else if (opcao == 3) {
        audienciaCanal7 += quantidadePessoas;
      }
      else {
        audienciaCanal12 += quantidadePessoas;
      }

      System.out.println("Digite 0 para sair.");
      opcao = input.nextInt();

    } while (opcao != 0);

    totalPessoas = audienciaCanal4 + audienciaCanal5 + audienciaCanal7 + audienciaCanal12;

    percCanal4 = ((double) audienciaCanal4 / totalPessoas) * 100;
    percCanal5 = ((double) audienciaCanal5 / totalPessoas) * 100;
    percCanal7 = ((double) audienciaCanal7 / totalPessoas) * 100;
    percCanal12 = ((double) audienciaCanal12 / totalPessoas) * 100;

    System.out.printf("Audiência Canal 4: %.1f%% %n", percCanal4);
    System.out.printf("Audiência Canal 5: %.1f%% %n", percCanal5);
    System.out.printf("Audiência Canal 7: %.1f%% %n", percCanal7);
    System.out.printf("Audiência Canal 12: %.1f%% %n", percCanal12);

    input.close();
  }
}
