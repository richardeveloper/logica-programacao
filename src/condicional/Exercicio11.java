//11. Fa�a um programa que receba o sal�rio atual de um funcion�rio e, usando a tabela a seguir, calcule e mostre o valor do aumento
//    e o novo sal�rio.

package condicional;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salario;
		
		System.out.println("Digite o sal�rio do funcion�rio: ");
		salario = input.nextDouble();
		
		if(salario <= 300) {
			System.out.println("Valor do aumento: R$ "+(salario * 0.15));
			System.out.println("Novo sal�rio: R$ "+(salario * 1.15));
		}
		else if(salario > 300 && salario < 600) {
			System.out.println("Valor do aumento: R$ "+(salario * 0.10));
			System.out.println("Novo sal�rio: R$ "+(salario * 1.10));
		}
		else if(salario >= 600 && salario <= 900) {
			System.out.println("Valor do aumento: R$ "+(salario * 0.05));
			System.out.println("Novo sal�rio: R$ "+(salario * 1.05));
		}
		else {
			System.out.println("Funcion�rio n�o tem direito ao aumento.");
		}
		
		input.close();
	}
}
