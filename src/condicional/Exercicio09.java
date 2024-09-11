/**
 *  Um banco concederá um crédito especial aos seus clientes, de acordo com o saldo médio no último 
 *  ano. Faça um programa que receba o saldo médio de um cliente e calcule o valor do crédito, de 
 *  acordo com a tabela a seguir. Mostre o saldo médio e o valor do crédito.
 *  
 *  Saldo Médio:
 *  Acima de R$ 400,00 (30% do saldo médio)
 *  R$ 400,00 ~ R$ 300,00 (25% do saldo médio)
 *  R$ 300,00 ~ R$ 200,00 (20% do saldo médio)
 *  Até R$ 200,00 (10% do saldo médio)
 */

package condicional;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double saldo;
		
		System.out.println("Digite o valor do saldo médio: ");
		saldo = input.nextDouble();
		
		if (saldo > 400) {
			System.out.println("Saldo médio: R$ "+saldo);
			System.out.println("Crédito: R$ "+(saldo * 0.3));
		}
		else if (saldo <= 400 && saldo > 300) {
			System.out.println("Saldo médio: R$ "+saldo);
			System.out.println("Crédito: R$ "+(saldo * 0.25));
		}
		else if (saldo <= 300 && saldo > 200) {
			System.out.println("Saldo médio: R$ "+saldo);
			System.out.println("Crédito: R$ "+(saldo * 0.2));
		}
		else {
			System.out.println("Saldo médio: R$ "+saldo);
			System.out.println("Crédito: R$ "+(saldo * 0.1));
		}
		
		input.close();
	}
}
