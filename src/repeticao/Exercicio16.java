package repeticao;

import java.util.Scanner;

public class Exercicio16 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int opcao;
    int idade;
    int totalIdades;
    int quantidadeIdades = 0;

    double mediaIdades;

    do {
      System.out.println("Digite a idade: ");
      idade = input.nextInt();

      totalIdades =+ idade;
      quantidadeIdades++;

      System.out.println("Digite 0 para sair.");
      opcao = input.nextInt();
    } while (opcao != 0);

    mediaIdades = (double) totalIdades / quantidadeIdades;
    System.out.println("Média das idades: " + mediaIdades);

    input.close();
  }
}
