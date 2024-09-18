package br.com.estruturas.condicional;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salario;
		
		System.out.println("Digite o salário do funcionário: ");
		salario = input.nextDouble();
		
		if (salario < 500) {
			System.out.println("Salário reajustado: R$ " + (salario * 1.3));
		}
		else {
			System.out.println("Funcionário não tem direito ao reajuste.");
		}
		
		input.close();
	}
}
