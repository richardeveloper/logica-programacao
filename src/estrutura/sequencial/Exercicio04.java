//04. Faça um programa que receba duas notas, calcule e mostre a média ponderada dessas notas, considerando peso 2 para a primeira
//    e peso 3 para a segunda.

package estrutura.sequencial;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1, n2;
		double media;
		
		System.out.println("Digite a primeira nota: ");
		n1 = input.nextInt();
		System.out.println("Digite a segunda nota: ");
		n2 = input.nextInt();
		
		media = (n1*2 + n2 *3)/5;
		
		System.out.println("Média Ponderada: "+media);
		
		input.close();
	}
}
