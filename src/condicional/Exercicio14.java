package condicional;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salario;
		
		System.out.println("Digite o salário do funcionário: ");
		salario = input.nextDouble();
		
		if (salario <= 300) {
			System.out.printf("Novo salário: R$ %.2f", (salario * 1.5));
		}
		else if (salario > 300 && salario <= 500) {
			System.out.printf("Novo salário: R$ %.2f", (salario * 1.4));
		}
		else if (salario > 500 && salario <= 700) {
			System.out.printf("Novo salário: R$ %.2f", (salario * 1.3));
		}
		else if (salario > 700 && salario <= 800) {
			System.out.printf("Novo salário: R$ %.2f", (salario * 1.2));
		}
		else if (salario > 800 && salario <= 1000) {
			System.out.printf("Novo salário: R$ %.2f", (salario * 1.1));
		}
		else {
			System.out.printf("Novo salário: R$ %.2f", (salario * 1.05));
		}
		
		input.close();
	}
}
