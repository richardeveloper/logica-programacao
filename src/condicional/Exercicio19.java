package condicional;

import java.util.Scanner;

public class Exercicio19 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double altura;
    String sexo;

    double pesoIdeal;

    System.out.println("Digite a altura: ");
    altura = input.nextDouble();

    System.out.println("Digite o sexo: ");
    System.out.println("F- Feminino");
    System.out.println("M- Masculino");
    sexo = input.next();

    if (sexo.equalsIgnoreCase("F")) {
      pesoIdeal = (62.1 * altura) -44.7;
    }
    else {
      pesoIdeal = (72.7 * altura) - 58;
    }

    System.out.println("O peso ideal para " + altura + " de altura é " + pesoIdeal + "kg");

    input.close();
  }
}
