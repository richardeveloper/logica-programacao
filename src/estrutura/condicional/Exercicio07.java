//07. Uma empresa decide dar um aumento de 30% aos funcionários com salários inferiores a R$ 500,00. Faça um programa que receba o 
//    salário do funcionário e mostre o valor do salário reajustado ou uma mensagem, caso ele não tenha direito ao aumento.

package estrutura.condicional;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salario;
		
		System.out.println("Digite o salário do funcionário: ");
		salario = input.nextDouble();
		
		if(salario < 500) {
			System.out.println("Salário reajustado: R$ "+(salario * 1.3));
		}
		else {
			System.out.println("Funcionário não tem direito ao reajuste.");
		}
		
		input.close();
		
	}
}
