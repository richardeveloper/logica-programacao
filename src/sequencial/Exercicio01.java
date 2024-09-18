package sequencial;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1, n2, subtracao;
		
		System.out.println("Digite o primeiro número: ");
		n1 = input.nextInt();

		System.out.println("Digite o segundo número :");
		n2 = input.nextInt();

		subtracao = n1 - n2;
		
		System.out.println("Subtração do primeiro pelo segundo: " + subtracao);
		
		input.close();
	}
}
