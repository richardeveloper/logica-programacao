/**
 *  Sabe-se que, para iluminar de maneira correta os cõmodos de uma casa, para cada m², deve-se usar 
 *  18 W de potência. Faça um programa que receba as duas dimensões de um cômodo (em metros), calcule 
 *  e mostre a sua área (em m2) e a pot�ncia de iluminação que deverá ser utilizada.
 */

package sequencial;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double lado1, lado2, area, potencia;
		
		System.out.println("Digite o valor da primeira dimensão: ");
		lado1 = input.nextDouble();
		
		System.out.println("Digite o valor da segunda dimensão: ");
		lado2 = input.nextDouble();
		
		area = lado1 * lado2;
		System.out.println("Dimensão do comôdo: "+area+" m²");
		
		potencia = area * 18;
		System.out.println("Potência de iluminação: "+potencia+" W");
		
		input.close();
	}
}
