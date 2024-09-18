package br.com.estruturas.condicional;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int opcao;
		double valorInvestido;
		double rendimento = 0.0;
		double valorTotal = 0.0;
		String tipoInvestimento = "";

		System.out.println("Digite o valor do investimento: ");
		valorInvestido = input.nextDouble();

		System.out.println("Digite o tipo do investimento: ");
		System.out.println("1 - Poupança");
		System.out.println("2 - Fundos de Renda Fixa");
		opcao = input.nextInt();
		
		switch (opcao) {
			case 1:
				tipoInvestimento = "Poupança";
				rendimento = valorInvestido * (3 / 100.0);
				valorTotal = valorInvestido + rendimento;
				break;
			case 2:
				tipoInvestimento = "Fundos de Renda Fixa";
				rendimento = valorInvestido * (4 / 100.0);
				valorTotal = valorInvestido + rendimento;
				break;
			default:
		}

		System.out.println("Valor inicial: R$ " + valorInvestido);
		System.out.println("Tipo Investimento: " + tipoInvestimento);
		System.out.println("Rendimento: R$ " + rendimento);
		System.out.println("Valor total: R$ " + valorTotal);
		
		input.close();
	}
}
