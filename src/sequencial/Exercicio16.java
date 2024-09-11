/**
 *  Faça um programa que receba o valor dos catetos de um triângulo, calcule e mostre o valor da 
 *  hipotenusa.
 */

package sequencial;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double cateto1, cateto2, hipotenusa;
		
		System.out.println("Digite o valor do cateto maior: ");
		cateto1 = input.nextDouble();
		
		System.out.println("Digite o valor do cateto menor: ");
		cateto2 = input.nextDouble();
		
		hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		
		System.out.println("Valor da hipotenusa: "+hipotenusa);
		
		input.close();
	}
}
