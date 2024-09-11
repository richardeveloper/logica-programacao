/**
 *  Faça um programa que receba dois números e execute as operaçõees listadas a seguir, de acordo 
 *  com a escolha do usuário.
 *  
 *  1. Média entre os números digitados
 *  2. Diferença do maior pelo menor
 *  3. Produto entre os números digitados
 *  4. Divisão do primeiro pelo segundo
 *  
 *  Se a opção digitada for inválida, mostre uma mensagem de erro e termine a execução do programa. 
 *  Lembre-se de que, na operação 4, o segundo número deve ser diferente de zero.
 */

package condicional;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		float n1, n2, operacao;
		int opcao;
		
		System.out.println("Digite o primeiro número: ");
		n1 = input.nextFloat();
		System.out.println("Digite o segundo número: ");
		n2 = input.nextFloat();
		
		System.out.println();
		
		System.out.println("DIGITE O N�MERO DA OPERAÇÃO DESEJADA:");
		System.out.println("1- Média entre os números digitados");
		System.out.println("2- Diferença do maior pelo menor");
		System.out.println("3- Produto entre os números digitados");
		System.out.println("4- Divisão do primeiro pelo segundo");
		opcao = input.nextInt();
		
		switch (opcao) {
			case 1:
				operacao = (n1 + n2)/2;
				System.out.println("Média: "+operacao);
				break;
			case 2:
				if(n1 > n2) {
					operacao = n1 - n2;
				}
				else {
					operacao = n2 - n1;
				}
				System.out.println("Subtração: "+operacao);
				break;
			case 3:
				operacao = n1 * n2;
				System.out.println("Produto: "+operacao);
				break;
			case 4:
				operacao = n1 / n2;
				System.out.println("Divisão: "+operacao);
				break;
			default:
				System.out.println("Op��o Inv�lida !");
				break;
		}
		
		input.close();
		
	}
}
