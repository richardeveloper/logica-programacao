/**
 *  Faça um programa que receba o valor do salário mínimo e o valor do salário de um funcionário, 
 *  calcule e mostre a quantidade de salários mínimos que esse funcionário ganha.
 */

package sequencial;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salMinimo, salFuncionario, qtdeSalario;
		
		System.out.println("Digite o valor do salário minímo (R$): ");
		salMinimo = input.nextDouble();
		
		System.out.println("Digite o valor do salário do funcionário (R$): ");
		salFuncionario = input.nextDouble();
		
		qtdeSalario = salFuncionario/salMinimo;
		
		System.out.printf("Quantidade de salários mínimos que o funcionário recebe: %.1f",qtdeSalario);
		
		input.close();
	}
}
