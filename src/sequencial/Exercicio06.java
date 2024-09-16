package sequencial;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salario, vendas, salarioFinal;
		
		System.out.println("Digite o salário do funcionário (R$): ");
		salario = input.nextDouble();

		System.out.println("Digite o total de vendas (R$): ");
		vendas = input.nextDouble();
		
		salarioFinal = salario + (vendas * 0.04);
		
		System.out.println("Salário Final: R$ " + salarioFinal);
		
		input.close();
	}
}
