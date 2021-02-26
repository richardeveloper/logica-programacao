//23. Faça um programa que receba a medida de dois ângulos de um triângulo, calcule e mostre a medida do terceiro ângulo. Sabe-se 
//    que a soma dos ângulos de um triângulo é 180 graus.

package sequencial;

import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int angulo1, angulo2, angulo3;
		
		System.out.println("Digite o valor do primeiro ângulo: ");
		angulo1 = input.nextInt();
		System.out.println("Digite o valor do primeiro ângulo: ");
		angulo2 = input.nextInt();
	
		angulo3 = 180 - (angulo1 + angulo2);
		
		System.out.println("Valor do terceiro ângulo: "+angulo3);
		
		input.close();
	}
}
