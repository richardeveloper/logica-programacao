//23. Fa�a um programa que receba a medida de dois �ngulos de um tri�ngulo, calcule e mostre a medida do terceiro �ngulo. Sabe-se 
//    que a soma dos �ngulos de um tri�ngulo � 180 graus.

package sequencial;

import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int angulo1, angulo2, angulo3;
		
		System.out.println("Digite o valor do primeiro �ngulo: ");
		angulo1 = input.nextInt();
		System.out.println("Digite o valor do primeiro �ngulo: ");
		angulo2 = input.nextInt();
	
		angulo3 = 180 - (angulo1 + angulo2);
		
		System.out.println("Valor do terceiro �ngulo: "+angulo3);
		
		input.close();
	}
}
