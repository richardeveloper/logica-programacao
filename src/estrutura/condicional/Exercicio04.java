//04. Faça um programa que receba três números e mostre o maior.

package estrutura.condicional;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o primeiro número: ");
		n1 = input.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = input.nextInt();
		System.out.println("Digite o terceiro número: ");
		n3 = input.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println(n1+" é o maior !");
		}
		else if(n2 > n1 && n2 > n3){
			System.out.println(n2+" é o maior !");
		}
		else {
			System.out.println(n3+" é o maior !");
		}
		
		input.close();
	}
}