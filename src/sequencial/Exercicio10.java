//10. Faça um programa que calcule e mostre a área de um quadrado. Sabe-se que A = lado * lado.

package sequencial;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int lado, area;
		
		System.out.println("Digite o valor de um dos lados: ");
		lado = input.nextInt();
		
		area = lado * lado;
		
		System.out.println("Área do quadrado: "+area);
		
		input.close();
	}
}
