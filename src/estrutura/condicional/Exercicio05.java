//05. Fa�a um programa que receba dois n�meros e execute as opera��es listadas a seguir, de acordo com a escolha do usu�rio.
//    
//    1. M�dia entre os n�meros digitados
//    2. Diferen�a do maior pelo menor
//    3. Produto entre os n�meros digitados
//	  4. Divis�o do primeiro pelo segundo
//    
//    Se a op��o digitada for inv�lida, mostre uma mensagem de erro e termine a execu��o do programa. Lembre-se de que, na opera��o 
//    4, o segundo n�mero deve ser diferente de zero.


package estrutura.condicional;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		float n1, n2, operacao;
		int opcao;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = input.nextFloat();
		System.out.println("Digite o segundo n�mero: ");
		n2 = input.nextFloat();
		
		System.out.println();
		
		System.out.println("DIGITE O N�MERO DA OPERA��O DESEJADA:");
		System.out.println("1- M�dia entre os n�meros digitados");
		System.out.println("2- Diferen�a do maior pelo menor");
		System.out.println("3- Produto entre os n�meros digitados");
		System.out.println("4- Divis�o do primeiro pelo segundo");
		opcao = input.nextInt();
		
		switch (opcao) {
			case 1:
				operacao = (n1 + n2)/2;
				System.out.println("M�dia: "+operacao);
				break;
			case 2:
				if(n1 > n2) {
					operacao = n1 - n2;
				}
				else {
					operacao = n2 - n1;
				}
				System.out.println("Subtra��o: "+operacao);
				break;
			case 3:
				operacao = n1 * n2;
				System.out.println("Produto: "+operacao);
				break;
			case 4:
				operacao = n1 / n2;
				System.out.println("Divis�o: "+operacao);
				break;
			default:
				System.out.println("Op��o Inv�lida !");
				break;
		}
		
		input.close();
		
	}
}
