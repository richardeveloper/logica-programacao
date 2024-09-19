package br.com.estruturas.repeticao;

import java.util.Scanner;

public class Exercicio23 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int opcao;
    double salario;
    double novoSalario;
    double ferias;
    double decimoTerceiro;
    int mesesTrabalhados;

    do {
      System.out.println("Digite a opção desejada: ");
      System.out.println("1- Novo salário");
      System.out.println("2- Férias");
      System.out.println("3- Décimo Terceiro");
      System.out.println("4- Sair");
      opcao = input.nextInt();

      switch (opcao) {
        case 1:
          System.out.println("Digite o salário do funcionário: ");
          salario = input.nextDouble();

          if (salario < 210.0) {
            novoSalario = salario + (salario * 0.15);
          }
          else if (salario > 210.0 && salario <= 600) {
            novoSalario = salario + (salario * 0.1);
          }
          else {
            novoSalario = salario + (salario * 0.05);
          }

          System.out.printf("Novo salário do funcionário: R$ %.2f %n", novoSalario);
          break;
        case 2:
          System.out.println("Digite o salário do funcionário: ");
          salario = input.nextDouble();

          ferias = salario + (salario * 0.3);

          System.out.printf("Férias do funcionário: R$ %.2f %n", ferias);
          break;
        case 3:
          System.out.println("Digite o salário do funcionário: ");
          salario = input.nextDouble();

          do {
            System.out.println("Meses trabalhados no ano: ");
            mesesTrabalhados = input.nextInt();
          } while (mesesTrabalhados <= 0 || mesesTrabalhados > 12);

          decimoTerceiro = (salario * mesesTrabalhados) / 12;

          System.out.printf("Décimo terceiro salário do funcionário: R$ %.2f %n", decimoTerceiro);
          break;
        default:
          break;
      }
    } while (opcao != 4);

    input.close();
  }
}
