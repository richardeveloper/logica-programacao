package br.com.estruturas.sequencial;

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
		
		media = (double) (n1 * 2 + n2 * 3) / 5;
		
		System.out.println("Média Ponderada: " + media);
		
		input.close();
	}
}
