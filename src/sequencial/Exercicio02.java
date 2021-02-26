//02. Faça um programa que receba três números, calcule e mostre a multiplicação desses números.

package sequencial;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int n1, n2, n3, mult;
		
		System.out.println("Digite o primeiro número :");
		n1 = input.nextInt();
		System.out.println("Digite o segundo número :");
		n2 = input.nextInt();
		System.out.println("Digite o terceiro número :");
		n3 = input.nextInt();
		
		mult = n1 * n2 * n3;
		
		System.out.println("Multiplicação dos três números: "+mult);
		
		input.close();
	}
}
