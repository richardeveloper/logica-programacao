//04. Fa�a um programa que receba tr�s n�meros e mostre o maior.

package estrutura.condicional;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = input.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		n2 = input.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		n3 = input.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println(n1+" � o maior !");
		}
		else if(n2 > n1 && n2 > n3){
			System.out.println(n2+" � o maior !");
		}
		else {
			System.out.println(n3+" � o maior !");
		}
		
		input.close();
	}
}