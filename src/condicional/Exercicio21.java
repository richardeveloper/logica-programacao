package condicional;

import java.util.Scanner;

public class Exercicio21 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int codigo;

    System.out.println("Digite o código de origem do produto: ");
    codigo = input.nextInt();

    if (codigo == 1) {
      System.out.println("Procedência: Sul");
    }
    else if (codigo == 2) {
      System.out.println("Procedência: Norte");
    }
    else if (codigo == 3) {
      System.out.println("Procedência: Leste");
    }
    else if (codigo == 4) {
      System.out.println("Procedência: Oeste");
    }
    else if (codigo == 5 || codigo == 6) {
      System.out.println("Procedência: Nordeste");
    }
    else if (codigo == 7 || codigo == 8 || codigo == 9) {
      System.out.println("Procedência: Sudeste");
    }
    else if (codigo > 9 && codigo <= 20) {
      System.out.println("Procedência: Centro-Oeste");
    }
    else if (codigo > 20 && codigo <= 30) {
      System.out.println("Procedência: Nordeste");
    }

    input.close();
  }
}
