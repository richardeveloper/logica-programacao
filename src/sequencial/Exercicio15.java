package sequencial;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salario, conta1, conta2, restante;
		
		System.out.println("Digite o salário: ");
		salario = input.nextDouble();
		
		System.out.println("Digite o valor da primeira conta: ");
		conta1 = input.nextDouble();		
		
		System.out.println("Digite o valor da segunda conta: ");
		conta2 = input.nextDouble();
		
		restante = salario - (conta1 * 1.02 + conta2 * 1.02);
		
		System.out.printf("Restante do salário: R$ %.2f", restante);
		
		input.close();
	}
}
