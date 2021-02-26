//03. Faça um programa que receba dois números, calcule e mostre a divisão do primeiro pelo segundo. Sabe-se que o segundo número 
//    não pode ser zero, portanto não é necessário se preocupar com validações.

package sequencial;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1, n2, div;
		
		System.out.println("Digite o primeiro número: ");
		n1 = input.nextInt();
		System.out.println("Digite o segundo número (Diferente de zero): ");
		n2 = input.nextInt();
		
		div = n1/n2;
		
		System.out.println("Divisão do primeiro número pelo segundo: "+div);
		
		input.close();

	}
}
