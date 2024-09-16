package condicional;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salario;
		
		System.out.println("Digite o salário do funcionário: ");
		salario = input.nextDouble();
		
		if (salario <= 300) {
			System.out.println("Valor do aumento: R$ "+(salario * 0.15));
			System.out.println("Novo salário: R$ "+(salario * 1.15));
		}
		else if (salario > 300 && salario < 600) {
			System.out.println("Valor do aumento: R$ "+(salario * 0.10));
			System.out.println("Novo salário: R$ "+(salario * 1.10));
		}
		else if (salario >= 600 && salario <= 900) {
			System.out.println("Valor do aumento: R$ "+(salario * 0.05));
			System.out.println("Novo salário: R$ "+(salario * 1.05));
		}
		else {
			System.out.println("Funcionário não tem direito ao aumento.");
		}
		
		input.close();
	}
}
