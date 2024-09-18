package br.com.estruturas.condicional;

import java.util.Scanner;

public class Exercicio25 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int horasExtras, horasAusencia;
    double tempoTrabalhado, premio;

    System.out.println("Digite a quantidade de horas extras: ");
    horasExtras = input.nextInt();

    System.out.println("Digite a quantidade de horas de falta: ");
    horasAusencia = input.nextInt();

    tempoTrabalhado = horasExtras - (((double) 2/3) * horasAusencia);

    if (tempoTrabalhado < 600) {
      premio = 500.00;
    }
    else if (tempoTrabalhado >= 600 && tempoTrabalhado < 1200) {
      premio = 400.00;
    }
    else if (tempoTrabalhado >= 1200 && tempoTrabalhado < 1800) {
      premio = 300.00;
    }
    else if (tempoTrabalhado >= 1800 && tempoTrabalhado < 2400) {
      premio = 200.00;
    }
    else {
      premio = 100.00;
    }

    System.out.println("Horas extras: " + horasExtras);
    System.out.println("Horas de ausência: " + horasAusencia);
    System.out.println("Valor do prêmio: R$ " + premio);

    input.close();
  }
}
