//03. Fa�a um programa que receba dois n�meros, calcule e mostre a divis�o do primeiro pelo segundo. Sabe-se que o segundo n�mero 
//    n�o pode ser zero, portanto n�o � necess�rio se preocupar com valida��es.

package sequencial;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1, n2, div;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = input.nextInt();
		System.out.println("Digite o segundo n�mero (Diferente de zero): ");
		n2 = input.nextInt();
		
		div = n1/n2;
		
		System.out.println("Divis�o do primeiro n�mero pelo segundo: "+div);
		
		input.close();

	}
}
