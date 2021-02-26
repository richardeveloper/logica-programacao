//05. Faça um programa que receba o preço de um produto, calcule e mostre o novo preço do produto, sabendo-se que este recebeu um
//    desconto de 10%

package sequencial;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double preco, novoPreco;
		
		System.out.println("Digite o preço do produto (R$):");
		preco = input.nextDouble();
		
		novoPreco = preco - (preco*0.1);
		
		System.out.println("Novo preço do produto: R$ "+novoPreco);
		
		input.close();
	}
}
