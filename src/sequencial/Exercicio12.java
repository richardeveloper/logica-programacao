//12. Fa�a um programa que receba o valor do sal�rio m�nimo e o valor do sal�rio de um funcion�rio, calcule e mostre a quantidade 
//    de sal�rios m�nimos que esse funcion�rio ganha.

package sequencial;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salMinimo, salFuncionario, qtdeSalario;
		
		System.out.println("Digite o valor do sal�rio min�mo (R$): ");
		salMinimo = input.nextDouble();
		System.out.println("Digite o valor do sal�rio do funcion�rio (R$): ");
		salFuncionario = input.nextDouble();
		
		qtdeSalario = salFuncionario/salMinimo;
		
		System.out.printf("Quantidade de sal�rios m�nimos que o funcion�rio recebe: %.1f",qtdeSalario);
		
		input.close();
	}
}
