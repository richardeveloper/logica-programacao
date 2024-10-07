package br.com.estruturas.condicional;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int opcao;
		double n1, n2, operacao;

		System.out.println("Digite o primeiro número: ");
		n1 = input.nextDouble();

		System.out.println("Digite o segundo número: ");
		n2 = input.nextDouble();
		
		System.out.println();

		System.out.println("Digite a opção desejada:");
		System.out.println("1- Média entre os números digitados");
		System.out.println("2- Diferença do maior pelo menor");
		System.out.println("3- Produto entre os números digitados");
		System.out.println("4- Divisão do primeiro pelo segundo");
		opcao = input.nextInt();
		
		switch (opcao) {
			case 1:
				operacao = (n1 + n2) / 2;
				System.out.println("Média: " + operacao);
				break;
			case 2:
				if (n1 > n2) {
					operacao = n1 - n2;
				}
				else {
					operacao = n2 - n1;
				}
				System.out.println("Subtração: " + operacao);
				break;
			case 3:
				operacao = n1 * n2;
				System.out.println("Produto: " + operacao);
				break;
			case 4:
				operacao = n1 / n2;
				System.out.println("Divisão: " + operacao);
				break;
			default:
				System.out.println("Opção inválida.");
				break;
		}
		
		input.close();
		
	}
}
