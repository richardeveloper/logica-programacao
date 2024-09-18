package condicional;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salario;
		
		System.out.println("Digite o salário do funcionário: ");
		salario = input.nextDouble();
		
		if (salario <= 300) {
			System.out.println("Salário reajustado: R$ " + (salario * 1.35));
		}
		else {
			System.out.println("Salário reajustado: " + (salario * 1.15));
		}
		
		input.close();
	}
}
