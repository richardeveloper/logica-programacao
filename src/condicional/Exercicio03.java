package condicional;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Digite o primeiro número: ");
		n1 = input.nextInt();

		System.out.println("Digite o segundo número: ");
		n2 = input.nextInt();
		
		if (n1 > n2) {
			System.out.println(n2+" é o menor !");
		}
		else if (n2 > n1){
			System.out.println(n1+" é o menor !");
		}
		else {
			System.out.println("Os números são iguais !");
		}
		
		input.close();
	}
}
