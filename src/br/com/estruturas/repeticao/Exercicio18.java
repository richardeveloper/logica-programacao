package br.com.estruturas.repeticao;

import java.util.Scanner;

public class Exercicio18 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int opcao;
    int idade;
    String sexo;
    double salario;

    int maiorIdade = 0;
    int menorIdade = Integer.MAX_VALUE;
    int quantidadeMulheres = 0;
    int totalPessoas = 0;
    double mediaSalario = 0;

    String sexoMenorSalario = "";
    int idadeMenorSalario = 0;

    do {
      System.out.println("Digite a idade da pessoa: ");
      idade = input.nextInt();

      do {
        System.out.println("Digite o sexo da pessoa: ");
        System.out.println("F - Feminino");
        System.out.println("M - Masculino");
        sexo = input.next();
      } while (isSexoInvalido(sexo));

      System.out.println("Digite o salário da pessoa: ");
      salario = input.nextDouble();

      mediaSalario += salario;

      if (idade > maiorIdade) {
        maiorIdade = idade;
      }

      if (idade < menorIdade) {
        menorIdade = idade;
        idadeMenorSalario = idade;
        sexoMenorSalario = sexo;
      }

      if (sexo.equalsIgnoreCase("F") && salario <= 200) {
        quantidadeMulheres++;
      }

      totalPessoas++;

      System.out.println("Digite uma idade negativa para sair.");
      opcao = input.nextInt();
    } while (opcao >= 0);

    System.out.printf("Média dos salários: R$ %.2f %n", (mediaSalario / totalPessoas));
    System.out.println("Maior idade: " + maiorIdade);
    System.out.println("Menor idade: " + menorIdade);
    System.out.println("Mulheres que recebem menos de R$ 200,00: " + quantidadeMulheres);
    System.out.println("Idade da pessoa com menor salário: " + idadeMenorSalario);
    System.out.println("Sexo da pessoa com menor salário: " + sexoMenorSalario);



    input.close();
  }

  private static boolean isSexoInvalido(String sexo) {
    return !sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M");
  }
}
