package br.com.estruturas.condicional;

import java.util.Scanner;

public class Exercicio20 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int idade;

    System.out.println("Digite a idade do nadador: ");
    idade = input.nextInt();

    if (idade <= 7) {
      System.out.println("Categoria: Infatil");
    }
    else if (idade <= 10) {
      System.out.println("Categoria: Juvenil");
    }
    else if (idade <= 15) {
      System.out.println("Categoria: Adolescente");
    }
    else if (idade <= 30) {
      System.out.println("Categoria: Adulto");
    }
    else {
      System.out.println("Categoria: Sênior");
    }

    input.close();
  }
}
