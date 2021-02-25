//09. Um banco conceder� um cr�dito especial aos seus clientes, de acordo com o saldo m�dio no �ltimo ano. Fa�a um programa que 
//	  receba o saldo m�dio de um cliente e calcule o valor do cr�dito, de acordo com a tabela a seguir. Mostre o saldo m�dio e o 
//    valor do cr�dito.
//
//	  Saldo M�dio				Percentual
//    Acima de R$ 400,00 		30% do saldo m�dio
//	  R$ 400,00 ~ R$ 300,00 	25% do saldo m�dio
//    R$ 300,00 ~ R$ 200,00 	20% do saldo m�dio
//    At� R$ 200,00 			10% do saldo m�dio

package estrutura.condicional;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double saldo;
		
		System.out.println("Digite o valor do saldo m�dio: ");
		saldo = input.nextDouble();
		
		if(saldo > 400) {
			System.out.println("Saldo m�dio: R$ "+saldo);
			System.out.println("Cr�dito: R$ "+(saldo * 0.3));
		}
		else if(saldo <= 400 && saldo > 300) {
			System.out.println("Saldo m�dio: R$ "+saldo);
			System.out.println("Cr�dito: R$ "+(saldo * 0.25));
		}
		else if(saldo <= 300 && saldo > 200) {
			System.out.println("Saldo m�dio: R$ "+saldo);
			System.out.println("Cr�dito: R$ "+(saldo * 0.2));
		}
		else {
			System.out.println("Saldo m�dio: R$ "+saldo);
			System.out.println("Cr�dito: R$ "+(saldo * 0.1));
		}
		
		input.close();
	}
}
