//15. Jo�o recebeu seu sal�rio e precisa pagar duas contas atrasadas. Em raz�o do atraso, ele dever� pagar multa de 2% sobre cada 
//    conta. Fa�a um programa que calcule e mostre quanto restar� do sal�rio de Jo�o.

package sequencial;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salario, conta1, conta2, restante;
		
		System.out.println("Digite o sal�rio: ");
		salario = input.nextDouble();
		System.out.println("Digite o valor da primeira conta: ");
		conta1 = input.nextDouble();		
		System.out.println("Digite o valor da segunda conta: ");
		conta2 = input.nextDouble();
		
		restante = salario - (conta1 * 1.02 + conta2 * 1.02);
		
		System.out.printf("Restante do sal�rio: R$ %.2f",restante);
		
		input.close();
		
	}
}
