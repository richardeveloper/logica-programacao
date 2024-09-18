package br.com.estruturas.repeticao;

import java.util.Scanner;

public class Exercicio09 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int idade;
    double altura, peso;

    int totalPessoas = 0;
    double totalIdade = 0;
    int qtdPesoAltura = 0;
    int qtdIdadeAltura = 0;

    for (int i = 1; i <= 10; i++) {
      System.out.println("Digite a idade da " + i + "ª pessoa: ");
      idade = input.nextInt();

      System.out.println("Digite o peso da " + i + "ª pessoa: ");
      peso = input.nextInt();

      System.out.println("Digite a altura da " + i + "ª pessoa: ");
      altura = input.nextInt();

      if (peso > 90 && altura < 1.50) {
        qtdPesoAltura++;
      }

      if (altura > 1.90 && (idade >= 10 && idade <= 30)) {
        qtdIdadeAltura++;
      }

      totalPessoas++;
      totalIdade += idade;

      System.out.println(i + "ª Pessoa");
      System.out.println("Idade: " + idade + " anos");
      System.out.printf("Altura: %.2fm %n", altura);
      System.out.printf("Peso: %.1fkg %n", peso);
      System.out.println();
    }

    System.out.println("Média das idades de 10 pessoas: " + (totalIdade / totalPessoas) );
    System.out.println("Quantidade de pessoas com peso maior que 90kg e altura menor que 1,50m: " + qtdPesoAltura);
    System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos e altura maior que 1,90m: " + (qtdIdadeAltura /  totalPessoas) );

    input.close();
  }
}
