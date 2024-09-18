package repeticao;

import java.util.Scanner;

public class Exercicio14 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int idade, opiniao;

    int totalPessoas = 0;
    int mediaOtimo = 0;
    int quantidadeRegular = 0;
    double percBom = 0.0;

    for (int i = 1; i <= 15; i++) {
      System.out.println("Digite a idade da " + i + "ª pessoa: ");
      idade = input.nextInt();

      do {
        System.out.println("Digite a opinião da " + i + "ª pessoa: ");
        System.out.println("1 - Regular");
        System.out.println("2 - Bom");
        System.out.println("3 - Ótimo");

        opiniao = input.nextInt();
      } while (opiniao < 1 || opiniao > 3);

      if (opiniao == 1) {
        quantidadeRegular++;
      }

      if (opiniao == 2) {
        percBom++;
      }

      if (opiniao == 3) {
        mediaOtimo += idade;
      }

      totalPessoas++;
    }

    System.out.println("Média das idades da opção ótimo: " + (mediaOtimo / totalPessoas));
    System.out.println("Quantidade de opção regular: " + quantidadeRegular);
    System.out.printf("Porcentagem da opção bom: %.1f%%", (percBom/ totalPessoas) * 100);

    input.close();
  }
}
