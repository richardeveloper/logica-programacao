package br.com.estruturas.condicional;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double custo, preco;
		
		System.out.println("Digite o valor do custo de fábrica do carro: ");
		custo = input.nextDouble();
		
		if (custo <= 12000) {
			preco = custo + (custo * 0.05);
			System.out.println("Preço ao consumidor: R$ " + preco);
		}
		else if (custo > 12000 && custo <= 25000) {
			preco = custo + (custo * 0.1) + (custo * 0.15);
			System.out.println("Preço ao consumidor: R$ " + preco);
		}
		else {
			preco = custo + (custo * 0.15) + (custo * 0.2);
			System.out.println("Preço ao consumidor: R$ " + preco);
		}
		
		input.close();
	}
}
