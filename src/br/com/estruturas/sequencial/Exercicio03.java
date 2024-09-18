package br.com.estruturas.sequencial;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1, n2;
		double divisao;
		
		System.out.println("Digite o primeiro número: ");
		n1 = input.nextInt();
		
		System.out.println("Digite o segundo número (Diferente de zero): ");
		n2 = input.nextInt();
		
		divisao = (double) n1 / n2;
		
		System.out.println("Divisão do primeiro número pelo segundo: " + divisao);
		
		input.close();
	}
}
