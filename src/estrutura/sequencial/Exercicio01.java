//01. Fa�a um programa que receba dois n�meros, calcule e mostre a subtra��o do primeiro pelo segundo.

package estrutura.sequencial;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int n1, n2, sub;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = input.nextInt();
		System.out.println("Digite o segundo n�mero :");
		n2 = input.nextInt();
		
		sub = n1 - n2;
		
		System.out.println("Subtra��o do primeiro pelo segundo: "+sub);
		
		input.close();
	}
}
