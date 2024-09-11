/**
 *  Faça um programa que receba o salário bruto de um funcionário e, usando a tabela a seguir, 
 *  calcule e mostre o valor a receber. Sabe-se que este é composto pelo salário bruto acrescido de 
 *  gratificação e descontado o imposto de 7% sobre o salário.
 */

package condicional;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double salario, gratificacao, novoSalario;
		double imposto = 0.07;
		
		System.out.println("Digite o salário do funcionário: ");
		salario = input.nextDouble();
		
		if (salario <= 350) {
			gratificacao = 100;
			novoSalario = salario + gratificacao - (salario * imposto);
		}
		else if (salario > 350 && salario < 600) {
			gratificacao = 75;
			novoSalario = salario + gratificacao - (salario * imposto);
		}
		else if (salario >= 600 && salario <= 900) {
			gratificacao = 50;
			novoSalario = salario + gratificacao - (salario * imposto);
		}
		else {
			gratificacao = 35;
			novoSalario = salario + gratificacao - (salario * imposto);
		}
		
		System.out.println("Novo salário: R$ " + novoSalario);
		
		input.close();
		
	}

}
