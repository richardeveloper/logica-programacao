package br.com.estruturas.sequencial;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salarioMinimo, salarioFuncionario, quantidadeSalario;
		
		System.out.println("Digite o valor do salário minímo (R$): ");
		salarioMinimo = input.nextDouble();
		
		System.out.println("Digite o valor do salário do funcionário (R$): ");
		salarioFuncionario = input.nextDouble();

		quantidadeSalario = salarioFuncionario/salarioMinimo;
		
		System.out.printf("Quantidade de salários mínimos que o funcionário recebe: %.1f", quantidadeSalario);
		
		input.close();
	}
}
