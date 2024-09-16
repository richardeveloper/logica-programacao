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
