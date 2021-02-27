//12. Fa�a um programa que receba o sal�rio bruto de um funcion�rio e, usando a tabela a seguir, calcule e mostre o valor a receber.
//	  Sabe-se que este � composto pelo sal�rio bruto acrescido de gratifica��o e descontado o imposto de 7% sobre o sal�rio.

package condicional;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double salario, gratificacao, novoSalario;
		double imposto = 0.07;
		
		System.out.println("Digite o sal�rio do funcion�rio: ");
		salario = input.nextDouble();
		
		if(salario <= 350) {
			gratificacao = 100;
			novoSalario = salario + gratificacao - (salario * imposto);
			System.out.println("Novo sal�rio: R$ "+novoSalario);
		}
		else if(salario > 350 && salario < 600) {
			gratificacao = 75;
			novoSalario = salario + gratificacao - (salario * imposto);
			System.out.println("Novo sal�rio: R$ "+novoSalario);
		}
		else if(salario >= 600 && salario <= 900) {
			gratificacao = 50;
			novoSalario = salario + gratificacao - (salario * imposto);
			System.out.println("Novo sal�rio: R$ "+novoSalario);
		}
		else {
			gratificacao = 35;
			novoSalario = salario + gratificacao - (salario * imposto);
			System.out.println("Novo sal�rio: R$ "+novoSalario);
		}
		
		input.close();
		
	}

}
