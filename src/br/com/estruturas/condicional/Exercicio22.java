package br.com.estruturas.condicional;

import java.util.Scanner;

public class Exercicio22 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int idade;
    double peso;

    System.out.println("Digite a idade: ");
    idade = input.nextInt();

    System.out.println("Digite o peso: ");
    peso = input.nextDouble();

    if (idade <= 20) {
      if (peso <= 60) {
        System.out.println("Grupo de risco: 9");
      }
      else if (peso > 60 && peso <= 90) {
        System.out.println("Grupo de risco: 8");
      }
      else {
        System.out.println("Grupo de risco: 7");
      }
    }
    else if (idade < 50) {
      if (peso <= 60) {
        System.out.println("Grupo de risco: 6");
      }
      else if (peso > 60 && peso <= 90) {
        System.out.println("Grupo de risco: 5");
      }
      else {
        System.out.println("Grupo de risco: 4");
      }
    }
    else {
      if (peso <= 60) {
        System.out.println("Grupo de risco: 3");
      }
      else if (peso > 60 && peso <= 90) {
        System.out.println("Grupo de risco: 2");
      }
      else {
        System.out.println("Grupo de risco: 1");
      }
    }

    input.close();
  }
}
