//07. Uma empresa decide dar um aumento de 30% aos funcion�rios com sal�rios inferiores a R$ 500,00. Fa�a um programa que receba o 
//    sal�rio do funcion�rio e mostre o valor do sal�rio reajustado ou uma mensagem, caso ele n�o tenha direito ao aumento.

package estrutura.condicional;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salario;
		
		System.out.println("Digite o sal�rio do funcion�rio: ");
		salario = input.nextDouble();
		
		if(salario < 500) {
			System.out.println("Sal�rio reajustado: R$ "+(salario * 1.3));
		}
		else {
			System.out.println("Funcion�rio n�o tem direito ao reajuste.");
		}
		
		input.close();
		
	}
}
