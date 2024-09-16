package condicional;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float preco, novoPreco = 0;
		
		System.out.println("Digite o preço do produto: ");
		preco = input.nextFloat();
		
		if (preco <= 50) {
			novoPreco = preco * 1.05f;
			System.out.println("Novo preço: R$ "+novoPreco);
		}
		else if (preco > 50 && preco <= 100) {
			novoPreco = preco * 1.10f;
			System.out.println("Novo preço: R$ "+novoPreco);
		}
		else if (preco > 100) {
			novoPreco = preco * 1.15f;
			System.out.println("Novo pre�o: R$ "+novoPreco);
		}
		
		if (novoPreco <= 80) {
			System.out.println("Produto Barato");
		}
		else if (novoPreco > 80 && novoPreco <= 120) {
			System.out.println("Produto Normal");
		}
		else if (novoPreco > 120 && novoPreco <= 200) {
			System.out.println("Produto Caro");
		}
		else {
			System.out.println("Produto Muito Caro");
		}
		
		input.close();
	}
}
