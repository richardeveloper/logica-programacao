//10. Fa�a um programa que calcule e mostre a �rea de um quadrado. Sabe-se que A = lado * lado.

package sequencial;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int lado, area;
		
		System.out.println("Digite o valor de um dos lados: ");
		lado = input.nextInt();
		
		area = lado * lado;
		
		System.out.println("�rea do quadrado: "+area);
		
		input.close();
	}
}
