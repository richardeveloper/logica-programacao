//05. Fa�a um programa que receba o pre�o de um produto, calcule e mostre o novo pre�o do produto, sabendo-se que este recebeu um
//    desconto de 10%

package sequencial;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double preco, novoPreco;
		
		System.out.println("Digite o pre�o do produto (R$):");
		preco = input.nextDouble();
		
		novoPreco = preco - (preco*0.1);
		
		System.out.println("Novo pre�o do produto: R$ "+novoPreco);
		
		input.close();
	}
}
