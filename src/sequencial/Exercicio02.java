//02. Fa�a um programa que receba tr�s n�meros, calcule e mostre a multiplica��o desses n�meros.

package sequencial;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int n1, n2, n3, mult;
		
		System.out.println("Digite o primeiro n�mero :");
		n1 = input.nextInt();
		System.out.println("Digite o segundo n�mero :");
		n2 = input.nextInt();
		System.out.println("Digite o terceiro n�mero :");
		n3 = input.nextInt();
		
		mult = n1 * n2 * n3;
		
		System.out.println("Multiplica��o dos tr�s n�meros: "+mult);
		
		input.close();
	}
}
