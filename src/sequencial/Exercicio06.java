//06. Um funcion�rio recebe um sal�rio fixo mais 4% de comiss�o sobre as vendas. Fa�a um programa que receba o sal�rio fixo de um
//	  funcion�rio e o valor de suas vendas, calcule e mostre a comiss�o e seu sal�rio final.

package sequencial;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salario, vendas, salarioFinal;
		
		System.out.println("Digite o sal�rio do funcion�rio (R$): ");
		salario = input.nextDouble();
		System.out.println("Digite o total de vendas (R$): ");
		vendas = input.nextDouble();
		
		salarioFinal = salario + (vendas * 0.04);
		
		System.out.println("Sal�rio Final: R$ "+salarioFinal);
		
		input.close();
	}
}
