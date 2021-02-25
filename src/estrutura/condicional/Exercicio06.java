//06. Fa�a um programa que receba dois n�meros e execute uma das opera��es listadas a seguir, de acordo com a escolha do usu�rio. 
//    Se for digitada uma op��o inv�lida, mostre mensagem de erro e termine a execu��o do programa. As op��es s�o:
//    
//    1- O primeiro n�mero elevado ao segundo n�mero.
//    2- Raiz quadrada de cada um dos n�meros.
//    3- Raiz c�bica de cada um dos n�meros.

package estrutura.condicional;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double n1, n2;
		int opcao;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = input.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		n2 = input.nextDouble();
		
		System.out.println();
		
		System.out.println("DIGITE O N�MERO DA OPERA��O DESEJADA");
		System.out.println("1- O primeiro n�mero elevado ao segundo n�mero");
		System.out.println("2- Raiz quadrada de cada um dos n�meros");
		System.out.println("3- Raiz c�bica de cada um dos n�meros");
		opcao = input.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Primeiro n�mero elevado ao segundo n�mero: "+Math.pow(n1, n2));
			break;
		case 2:
			System.out.println("Raiz quadrada do primeiro n�mero: "+Math.sqrt(n1));
			System.out.println("Raiz quadrada do segundo n�mero: "+Math.sqrt(n2));
			break;
		case 3:
			System.out.println("Raiz quadrada do primeiro n�mero: "+Math.cbrt(n1));
			System.out.println("Raiz quadrada do segundo n�mero: "+Math.cbrt(n2));
			break;
		default:
			System.out.println("Op��o Inv�lida !");
			break;
		}
		
		input.close();
	}
}
