package br.com.estruturas.repeticao;

import java.util.Scanner;

public class Exercicio21 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int opcao;

    int votosCandidato1 = 0, votosCandidato2 = 0, votosCandidato3 = 0, votosCandidato4 = 0;
    int votosNulos = 0, votosEmBranco = 0, totalVotos = 0;

    double percVotosNulos, percVotosEmBranco;

    do {
      System.out.println("Digite a opção do candidato escolhido: ");
      System.out.println("1- Candidato 1");
      System.out.println("2- Candidato 2");
      System.out.println("3- Candidato 3");
      System.out.println("4- Candidato 4");
      System.out.println("5- Voto nulo");
      System.out.println("6- Voto em branco");
      System.out.println("0- Sair");

      opcao = input.nextInt();

      switch (opcao) {
        case 1:
          votosCandidato1++;
          break;
        case 2:
          votosCandidato2++;
          break;
        case 3:
          votosCandidato3++;
          break;
        case 4:
          votosCandidato4++;
          break;
        case 5:
          votosNulos++;
          break;
        case 6:
          votosEmBranco++;
          break;
      }

      totalVotos++;

    } while (opcao != 0);

    percVotosNulos = ((double) votosNulos / totalVotos) * 100;
    percVotosEmBranco = ((double) votosEmBranco / totalVotos) * 100;

    System.out.println("Total de Votos: " + totalVotos);
    System.out.println("Votos para o candidato 1: " + votosCandidato1);
    System.out.println("Votos para o candidato 2: " + votosCandidato2);
    System.out.println("Votos para o candidato 3: " + votosCandidato3);
    System.out.println("Votos para o candidato 4: " + votosCandidato4);
    System.out.println("Votos nulos: " + votosNulos);
    System.out.println("Votos em branco: " + votosEmBranco);
    System.out.printf("Porcentagem de votos nulos: %.1f%% %n", percVotosNulos);
    System.out.printf("Porcentagem de votos em branco: %.1f%% %n", percVotosEmBranco);

    input.close();
  }
}
