package repeticao;

import java.util.Scanner;

public class Exercicio19 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String opcao;

    String acao;
    double precoCompra;
    double precoVenda;

    do {
      System.out.println("Digite o tipo da ação: ");
      acao = input.next();

      System.out.println("Digite o preço de compra da ação: ");
      precoCompra = input.nextDouble();

      System.out.println("Digite o preço de venda da ação: ");
      precoVenda = input.nextDouble();

      System.out.println("Ação: " + acao);
      System.out.println("Margem de lucro: " + (precoVenda - precoCompra));

      System.out.println("Digite F para sair.");
      opcao = input.next();
    } while (!opcao.equalsIgnoreCase("F"));

    input.close();
  }
}
