//08. Fa�a um programa para calcular e mostrar o sal�rio reajustado de um funcion�rio. O percentual de aumento encontra-se na tabela a seguir.
//
//	  Sal�rio				Percentual de Aumento
//    At� R$ 300,00 		35%
//	  Acima de R$ 300,00 	15%

package estrutura.condicional;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salario;
		
		System.out.println("Digite o sal�rio do funcion�rio: ");
		salario = input.nextDouble();
		
		if(salario <= 300) {
			System.out.println("Sal�rio reajustado: R$ "+(salario * 1.35));
		}
		else {
			System.out.println("Sal�rio reajustado: "+(salario * 1.15));
		}
		
		input.close();

	}
}
