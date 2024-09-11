/**
 *  Faça um programa que receba uma temperatura em Celsius, calcule e mostre essa temperatura em 
 *  Fahrenheit. Sabe-se que F = 180*(C + 32)/100.
 */

package sequencial;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double celsius, fahreheit;
		
		System.out.println("Digite uma temperatura (�C): ");
		celsius = input.nextDouble();
		
		fahreheit = 180 * (celsius + 32)/100;
		
		System.out.println("Temperatura em Fahrenheit: "+fahreheit+"�");
		
		input.close();
	}
}
