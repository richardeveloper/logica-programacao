package condicional;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double preco, novoPreco = 0;
		
		System.out.println("Digite o preço do produto: ");
		preco = input.nextDouble();
		
		if (preco <= 50) {
			novoPreco = preco * 1.05f;
			System.out.println("Novo preço: R$ " + novoPreco);
		}
		else if (preco > 50 && preco <= 100) {
			novoPreco = preco * 1.10f;
			System.out.println("Novo preço: R$ " + novoPreco);
		}
		else if (preco > 100) {
			novoPreco = preco * 1.15f;
			System.out.println("Novo preço: R$ " + novoPreco);
		}
		
		if (novoPreco <= 80) {
			System.out.println("Produto com preço barato.");
		}
		else if (novoPreco > 80 && novoPreco <= 120) {
			System.out.println("Produto com preço normal.");
		}
		else if (novoPreco > 120 && novoPreco <= 200) {
			System.out.println("Produto com preço caro.");
		}
		else {
			System.out.println("Produto com preço muito caro.");
		}
		
		input.close();
	}
}
