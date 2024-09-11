/**
 *  O preço ao consumidor de um carro novo é a soma do custo de fábrica com a porcentagem do 
 *  distribuidor e dos impostos, ambos aplicados ao custo de fábrica. As porcentagens encontram-se 
 *  na tabela a seguir. Faça um programa que receba o custo de fábrica de um carro e mostre o preço 
 *  ao consumidor.
 *
 *  Custo de Fábrica:
 *  Até R$ 12.000,00 (5% do distribuidor e eisento de impostos)
 *  Entre R$ 12.000,00 e R$ 25.000,00 (10% do distribuidor e 15% de impostos)
 *  Acima de R$ 25.000,00 (15% do distribuidor e 20% de impostos) 
 */

package condicional;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double custo, preco;
		
		System.out.println("Digite o valor do custo de fábrica do carro: ");
		custo = input.nextDouble();
		
		if (custo <= 12000) {
			preco = custo + (custo * 0.05);
			System.out.println("Preço ao consumidor: R$ "+preco);
		}
		else if (custo > 12000 && custo <= 25000) {
			preco = custo + (custo * 0.1) + (custo * 0.15);
			System.out.println("Preço ao consumidor: R$ "+preco);
		}
		else {
			preco = custo + (custo * 0.15) + (custo * 0.2);
			System.out.println("Preço ao consumidor: R$ "+preco);
		}
		
		input.close();
	}
}
